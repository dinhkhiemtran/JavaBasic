package com.example.javabasic.collections.collection.set;

import java.util.*;

public class LinkedHashSet implements Set {

    private static final int CAPACITY = 2;

    private static final float loadFactor = 0.75f;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public <T> java.util.LinkedHashSet<T> createLinkedHashSet() {
        java.util.LinkedHashSet<T> linkedHashSet = new java.util.LinkedHashSet<>(CAPACITY, loadFactor);
        return linkedHashSet;
    }

    public <T> boolean isFull(java.util.LinkedHashSet<T> linkedHashSet) {
        return linkedHashSet.size() >= CAPACITY;
    }

    public java.util.LinkedHashSet<String> addElementsString() {
        Scanner scanner = new Scanner(System.in);
        java.util.LinkedHashSet<String> linkedHashSet = createLinkedHashSet();
        try {
            if (linkedHashSet != null) {
                while (!isFull(linkedHashSet)) {
                    System.out.print("Add elements(String): ");
                    String element = scanner.next();
                    boolean isSuccess = linkedHashSet.add(element);
                    if (isSuccess) {
                        System.out.println("Element is added successfully.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return linkedHashSet;
    }

    public java.util.LinkedHashSet<Integer> addElementsInteger() {
        Scanner scanner = new Scanner(System.in);
        java.util.LinkedHashSet<Integer> linkedHashSet = createLinkedHashSet();
        try {
            if (linkedHashSet != null) {
                while (!isFull(linkedHashSet)) {
                    System.out.print("Add elements(Integer): ");
                    Integer element = scanner.nextInt();
                    boolean isSuccess = linkedHashSet.add(element);
                    if (isSuccess) {
                        System.out.println("Element is added successfully.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return linkedHashSet;
    }

    public <T> void iterator(java.util.LinkedHashSet<T> linkedHashSet) {
        if (linkedHashSet != null) {
            Iterator<T> iterator = linkedHashSet.iterator();
            System.out.print("Linked Hash Set: ");
            while (iterator.hasNext()) {
                System.out.print(iterator.next());
                System.out.println(", ");
            }
        }
        System.out.println();
    }

    public java.util.LinkedHashSet<String> removeAnElementString(java.util.LinkedHashSet<String> linkedHashSet) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (linkedHashSet != null) {
                if (!linkedHashSet.isEmpty()) {
                    System.out.print("Input an element to remove: ");
                    String element = scanner.next();
                    if (linkedHashSet.contains(element)) {
                        boolean isRemoved = linkedHashSet.remove(element);
                        if (isRemoved) {
                            System.out.println("Element is removed successfully.");
                        } else {
                            System.out.println("Fail.");
                        }
                    } else {
                        System.out.println("Not Found.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Wrong type.");
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return linkedHashSet;
    }

    public java.util.LinkedHashSet<Integer> removeAnElementInteger(java.util.LinkedHashSet<Integer> linkedHashSet) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (linkedHashSet != null) {
                if (!linkedHashSet.isEmpty()) {
                    System.out.print("Input an element to remove: ");
                    Integer element = scanner.nextInt();
                    if (linkedHashSet.contains(element)) {
                        boolean isRemoved = linkedHashSet.remove(element);
                        if (isRemoved) {
                            System.out.println("Element is removed successfully.");
                        } else {
                            System.out.println("Fail.");
                        }
                    } else {
                        System.out.println("Not Found! ");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Wrong type.");
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return linkedHashSet;
    }

    public <T> java.util.LinkedHashSet<T> union(java.util.LinkedHashSet<T> set1, java.util.LinkedHashSet<T> set2) {
        if (set1 != null && set2 != null) {
            boolean isUnion = set1.addAll(set2);
            if (isUnion) {
                System.out.print("Union: ");
            } else {
                System.out.println("Non-Union.");
            }
        }
        return set1;
    }

    public <T> java.util.LinkedHashSet<T> intersection(java.util.LinkedHashSet<T> set1, java.util.LinkedHashSet<T> set2) {
        if (set1 != null && set2 != null) {
            boolean isIntersection = set1.retainAll(set2);
            if (isIntersection) {
                System.out.print("Intersection: ");
            } else {
                System.out.println("Non-Intersection.");
            }
        }
        return set1;
    }

    public <T> java.util.LinkedHashSet<T> difference(java.util.LinkedHashSet<T> set1, java.util.LinkedHashSet<T> set2) {
        if (set1 != null && set2 != null) {
            boolean isDifference = set1.removeAll(set2);
            if (isDifference) {
                System.out.print("Difference: ");
            } else {
                System.out.println("Non-Difference");
            }
        }
        return set1;
    }

    public <T> boolean subSet(java.util.LinkedHashSet<T> set1, java.util.LinkedHashSet<T> set2) {
        return set1.containsAll(set2);
    }

    public <T> void print(java.util.LinkedHashSet<T> linkedHashSet) {
        if (linkedHashSet != null) {
            System.out.print("Linked Hash Set: ");
            linkedHashSet.forEach(elements -> System.out.print(elements + ", "));
            System.out.println();
        }
    }

    public void loadLinkedHashSetString() {
        java.util.LinkedHashSet<String> set1 = addElementsString();
        print(set1);
        java.util.LinkedHashSet<String> set2 = addElementsString();
        print(set2);
        System.out.println(union(set1, set2));
        System.out.println(intersection(set1, set2));
        System.out.println(difference(set1, set2));
        System.out.println(subSet(set1, set2));
        System.out.println(removeAnElementString(set1));

    }

    public void loadLinkedHashSetInteger() {
        java.util.LinkedHashSet<Integer> set1 = addElementsInteger();
        print(set1);
        java.util.LinkedHashSet<Integer> set2 = addElementsInteger();
        print(set2);
        System.out.println(union(set1, set2));
        System.out.println(intersection(set1, set2));
        System.out.println(difference(set1, set2));
        System.out.println(subSet(set1, set2));
        System.out.println(removeAnElementInteger(set1));
    }

    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.loadLinkedHashSetString();
        linkedHashSet.loadLinkedHashSetInteger();
    }
}
