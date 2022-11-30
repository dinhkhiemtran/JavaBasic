package com.example.javabasic.collections.collection.set;

import java.util.*;

public class HashSet implements Set {

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

    public <T> java.util.HashSet<T> createHashSet() {
        java.util.HashSet<T> set = new java.util.HashSet<>(CAPACITY, loadFactor);
        return set;
    }

    public <T> boolean isFull(java.util.HashSet<T> set) {
        return set.size() >= CAPACITY;
    }

    public java.util.HashSet<String> addElementsString() {
        Scanner scanner = new Scanner(System.in);
        java.util.HashSet<String> hashSet = createHashSet();
        try {
            if (hashSet != null) {
                while (!isFull(hashSet)) {
                    System.out.print("Add elements(String): ");
                    String element = scanner.next();
                    hashSet.add(element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Wrong type input.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return hashSet;
    }

    public java.util.HashSet<Integer> addElementsInteger() {
        Scanner scanner = new Scanner(System.in);
        java.util.HashSet<Integer> hashSet = createHashSet();
        try {
            if (hashSet != null) {
                while (!isFull(hashSet)) {
                    System.out.print("Add elements(Integer): ");
                    Integer element = scanner.nextInt();
                    hashSet.add(element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return hashSet;
    }

    public java.util.HashSet<String> removeAnElementSpecifiedString(java.util.HashSet<String> hashSet) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (hashSet != null) {
                if (!hashSet.isEmpty()) {
                    System.out.print("Input an element(String) to remove: ");
                    String element = scanner.next();
                    if (hashSet.contains(element)) {
                        boolean isSuccess = hashSet.remove(element);
                        if (isSuccess) {
                            System.out.println("Element is removed successfully.");
                        } else {
                            System.out.println("Fail.");
                        }
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return hashSet;
    }

    public java.util.HashSet<Integer> removeAnElementSpecifiedInteger(java.util.HashSet<Integer> hashSet) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (hashSet != null) {
                if (!hashSet.isEmpty()) {
                    System.out.println("Input an element(Integer) to remove: ");
                    Integer element = scanner.nextInt();
                    if (hashSet.contains(element)) {
                        boolean isSuccess = hashSet.remove(element);
                        if (isSuccess) {
                            System.out.println("Element is removed successfully.");
                        } else {
                            System.out.println("Fail.");
                        }
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return hashSet;
    }

    public <T> java.util.HashSet<T> unionSet(java.util.HashSet<T> set1, java.util.HashSet<T> set2) {
        try {
            if (set1 != null && set2 != null) {
                boolean isSuccess = set1.addAll(set2);
                if (isSuccess) {
                    System.out.print("Union: ");
                } else {
                    System.out.println("Fail.");
                }
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return set1;
    }

    public <T> java.util.HashSet<T> intersectionSet(java.util.HashSet<T> set1, java.util.HashSet<T> set2) {
        try {
            if (set1 != null && set2 != null) {
                boolean isSuccess = set1.retainAll(set2);
                if (isSuccess) {
                    System.out.print("Intersection: ");
                } else {
                    System.out.println("Fail.");
                }
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return set1;
    }

    public <T> java.util.HashSet<T> differenceSet(java.util.HashSet<T> set1, java.util.HashSet<T> set2) {
        try {
            if (set1 != null && set2 != null) {
                boolean isSuccess = set2.removeAll(set1);
                if (isSuccess) {
                    System.out.print("Difference: ");
                } else {
                    System.out.println("Fail.");
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return set1;
    }

    public <T> boolean subSet(java.util.HashSet<T> set1, java.util.HashSet<T> set2) {
        boolean isExist = false;
        if (set1 != null && set2 != null) {
            isExist = set1.containsAll(set2);
        }
        return isExist;
    }

    public <T>java.util.HashSet<T> removeAllElements(java.util.HashSet<T> hashSet){
        if (hashSet != null){
            hashSet.clear();
        }
        return hashSet;
    }

    public <T> void print(java.util.HashSet<T> hashSet) {
        try {
            if (hashSet != null) {
                System.out.print("Set: ");
                hashSet.forEach(elements -> System.out.print(elements + ", "));
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        System.out.println();
    }

    public void load() {
        java.util.HashSet<String> set1String = addElementsString();
        print(set1String);
        java.util.HashSet<String> set2String = addElementsString();
        print(set2String);
        System.out.println(subSet(set1String, set2String));
        System.out.println(unionSet(set1String, set2String));
        System.out.println(intersectionSet(set1String, set2String));
        System.out.println(differenceSet(set1String, set2String));
        java.util.HashSet<Integer> set1Integer = addElementsInteger();
        print(set1Integer);
        java.util.HashSet<Integer> set2Integer = addElementsInteger();
        print(set2Integer);
        System.out.println(subSet(set1Integer, set2Integer));
        System.out.println(unionSet(set1Integer, set2Integer));
        System.out.println(intersectionSet(set1Integer, set2Integer));
        System.out.println(differenceSet(set1Integer, set2Integer));
        System.out.println(removeAnElementSpecifiedString(set1String));
        System.out.println(removeAnElementSpecifiedString(set2String));
        System.out.println(removeAnElementSpecifiedInteger(set1Integer));
        System.out.println(removeAnElementSpecifiedInteger(set2Integer));
        System.out.println(removeAllElements(set1String));
        System.out.println(removeAllElements(set2String));
        System.out.println(removeAllElements(set1Integer));
        System.out.println(removeAllElements(set2Integer));
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.load();
    }
}
