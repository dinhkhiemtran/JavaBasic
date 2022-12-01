package com.example.javabasic.collections.collection.set.sorted.navigable;

import java.util.*;

public class TreeSet implements NavigableSet {
    @Override
    public Object lower(Object o) {
        return null;
    }

    @Override
    public Object floor(Object o) {
        return null;
    }

    @Override
    public Object higher(Object o) {
        return null;
    }

    @Override
    public Object pollFirst() {
        return null;
    }

    @Override
    public Object pollLast() {
        return null;
    }

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

    @Override
    public NavigableSet descendingSet() {
        return null;
    }

    @Override
    public Iterator descendingIterator() {
        return null;
    }

    @Override
    public NavigableSet subSet(Object fromElement, boolean fromInclusive, Object toElement, boolean toInclusive) {
        return null;
    }

    @Override
    public NavigableSet headSet(Object toElement, boolean inclusive) {
        return null;
    }

    @Override
    public NavigableSet tailSet(Object fromElement, boolean inclusive) {
        return null;
    }

    @Override
    public Comparator comparator() {
        return null;
    }

    @Override
    public SortedSet subSet(Object fromElement, Object toElement) {
        return null;
    }

    @Override
    public SortedSet headSet(Object toElement) {
        return null;
    }

    @Override
    public SortedSet tailSet(Object fromElement) {
        return null;
    }

    @Override
    public Object first() {
        return null;
    }

    @Override
    public Object last() {
        return null;
    }

    @Override
    public String ceiling(Object o) {
        return null;
    }

    public <T> java.util.TreeSet<T> createTreeSet() {
        java.util.TreeSet<T> treeSet = new java.util.TreeSet<>();
        return treeSet;
    }

    public java.util.TreeSet<String> addElementsString() {
        java.util.TreeSet<String> treeSet = createTreeSet();
        treeSet.add("Java");
        treeSet.add("Javascript");
        treeSet.add("Python");
        treeSet.add("Go");
        treeSet.add("Php");
        return treeSet;
    }

    public java.util.TreeSet<Integer> addElementsInteger() {
        java.util.TreeSet<Integer> treeSet = createTreeSet();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(10);
        treeSet.add(9);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(1);
        return treeSet;
    }

    public java.util.TreeSet<String> removeAnElementString(java.util.TreeSet<String> treeSet) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (treeSet != null) {
                if (!treeSet.isEmpty()) {
                    System.out.print("Input an element(String) to remove: ");
                    String element = scanner.next();
                    if (treeSet.contains(element)) {
                        boolean isSuccess = treeSet.remove(element);
                        if (isSuccess) {
                            System.out.println("Element is removed successfully.");
                        } else {
                            System.out.println("Fail.");
                        }
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Wrong type");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return treeSet;
    }

    public java.util.TreeSet<Integer> removeAnElementInteger(java.util.TreeSet<Integer> treeSet) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (treeSet != null) {
                if (!treeSet.isEmpty()) {
                    System.out.print("Input an element(Integer) to remove");
                    Integer element = scanner.nextInt();
                    if (treeSet.contains(element)) {
                        boolean isSuccess = treeSet.remove(element);
                        if (isSuccess) {
                            System.out.println("Element is removed successfully.");
                        }
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Wrong type");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return treeSet;
    }

    public java.util.TreeSet<String> getHeadSetString(java.util.TreeSet<String> treeSet) {
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<String> results = new java.util.TreeSet<>();
        try {
            if (treeSet != null) {
                if (!treeSet.isEmpty()) {
                    System.out.print("Input an element(String) to get head set: ");
                    String element = scanner.next();
                    if (treeSet.contains(element)) {
                        results = (java.util.TreeSet<String>) treeSet.headSet(element);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + inputMismatchException.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return results;
    }

    public java.util.TreeSet<Integer> getHeadSetInteger(java.util.TreeSet<Integer> treeSet) {
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<Integer> results = new java.util.TreeSet<>();
        try {
            if (treeSet != null) {
                if (!treeSet.isEmpty()) {
                    System.out.print("Input an element(Integer) to get head set: ");
                    Integer element = scanner.nextInt();
                    if (treeSet.contains(element)) {
                        results = (java.util.TreeSet<Integer>) treeSet.headSet(element);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + inputMismatchException.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return results;
    }

    public java.util.TreeSet<String> getTailSetString(java.util.TreeSet<String> treeSet) {
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<String> results = new java.util.TreeSet<>();
        try {
            if (treeSet != null) {
                if (!treeSet.isEmpty()) {
                    System.out.print("Input an element(String) to get tail set: ");
                    String element = scanner.next();
                    if (treeSet.contains(element)) {
                        results = (java.util.TreeSet<String>) treeSet.tailSet(element);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return results;
    }

    public java.util.TreeSet<Integer> getTailSetInteger(java.util.TreeSet<Integer> treeSet) {
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<Integer> results = new java.util.TreeSet<>();
        try {
            if (treeSet != null) {
                if (!treeSet.isEmpty()) {
                    System.out.print("Input an element that you want to get tail set: ");
                    Integer element = scanner.nextInt();
                    if (treeSet.contains(element)) {
                        results = (java.util.TreeSet<Integer>) treeSet.tailSet(element);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return results;
    }

    public java.util.TreeSet<String> getSubSetString(java.util.TreeSet<String> treeSet) {
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<String> results = new java.util.TreeSet<>();
        try {
            if (treeSet != null) {
                if (!treeSet.isEmpty()) {
                    System.out.print("Input an element start String: ");
                    String element1 = scanner.next();
                    System.out.print("Input an element end String: ");
                    String element2 = scanner.next();
                    if (treeSet.contains(element1) && treeSet.contains(element2)) {
                        results = (java.util.TreeSet<String>) treeSet.subSet(element1, true, element2, true);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return results;
    }

    public java.util.TreeSet<Integer> getSubSetInteger(java.util.TreeSet<Integer> treeSet) {
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<Integer> results = new java.util.TreeSet<>();
        try {
            if (treeSet != null) {
                if (!treeSet.isEmpty()) {
                    System.out.print("Input an element start Integer: ");
                    Integer element1 = scanner.nextInt();
                    System.out.print("Input an element end Integer: ");
                    Integer element2 = scanner.nextInt();
                    if (treeSet.contains(element1) && treeSet.contains(element2)) {
                        results = (java.util.TreeSet<Integer>) treeSet.subSet(element1, true, element2, true);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return results;
    }

    public <T> T getFirstElement(java.util.TreeSet<T> treeSet) {
        T element = null;
        if (treeSet != null) {
            if (!treeSet.isEmpty()) {
                element = treeSet.first();
                System.out.print("A first element: ");
            }
        }
        return element;
    }

    public <T> T getLastElement(java.util.TreeSet<T> treeSet) {
        T element = null;
        if (treeSet != null) {
            if (!treeSet.isEmpty()) {
                element = treeSet.last();
                System.out.print("A last element: ");
            }
        }
        return element;
    }

    public <T> java.util.TreeSet<T> pollFirstElement(java.util.TreeSet<T> treeSet) {
        if (treeSet != null) {
            if (!treeSet.isEmpty()) {
                T element = treeSet.pollFirst();
                System.out.println("First element is polled: " + element);
            }
        }
        return treeSet;
    }

    public <T> java.util.TreeSet<T> pollLastElement(java.util.TreeSet<T> treeSet) {
        if (treeSet != null) {
            if (!treeSet.isEmpty()) {
                T element = treeSet.pollLast();
                System.out.println("Last element is polled: " + element);
            }
        }
        return treeSet;
    }

    public <T> java.util.TreeSet<T> union(java.util.TreeSet<T> set1, java.util.TreeSet<T> set2) {
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

    public <T> java.util.TreeSet<T> intersection(java.util.TreeSet<T> set1, java.util.TreeSet<T> set2) {
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

    public <T> java.util.TreeSet<T> difference(java.util.TreeSet<T> set1, java.util.TreeSet<T> set2) {
        if (set1 != null && set2 != null) {
            boolean isDifference = set1.removeAll(set2);
            if (isDifference) {
                System.out.print("Difference: ");
            } else {
                System.out.println("Non-Difference.");
            }
        }
        return set1;
    }

    public <T> boolean subSet(java.util.TreeSet<T> set1, java.util.TreeSet<T> set2) {
        return set1.containsAll(set2);
    }

    public java.util.TreeSet<String> addElementsToOriginSetString() {
        java.util.TreeSet<String> origin = new java.util.TreeSet<>();
        origin.add("SpringBoot");
        origin.add("WPF");
        origin.add("Laravel");
        origin.add("Rails");
        origin.add("Express");
        origin.add("Java");
        return origin;
    }

    public java.util.TreeSet<Integer> addElementsToOriginSetInteger() {
        java.util.TreeSet<Integer> origin = new java.util.TreeSet<>();
        for (int i = 10; i <= 20; i++) {
            origin.add(i);
        }
        return origin;
    }

    public <T> java.util.TreeSet<T> removeAllElements(java.util.TreeSet<T> treeSet) {
        if (treeSet != null) {
            if (!treeSet.isEmpty()) {
                treeSet.clear();
            }
        }
        return treeSet;
    }

    public <T> void print(java.util.TreeSet<T> treeSet) {
        if (treeSet != null) {
            System.out.print("Tree set: ");
            treeSet.forEach(elements -> System.out.print(elements + ", "));
            System.out.println();
        }
    }

    public void loadTreeSetString() {
        java.util.TreeSet<String> treeSet1 = addElementsString();
        print(treeSet1);
        java.util.TreeSet<String>  treeSet2 = addElementsToOriginSetString();
        print(treeSet2);
        System.out.println(getFirstElement(treeSet1));
        System.out.println(getFirstElement(treeSet2));
        System.out.println(getLastElement(treeSet1));
        System.out.println(getLastElement(treeSet2));
        System.out.println(getHeadSetString(treeSet1));
        System.out.println(getHeadSetString(treeSet2));
        System.out.println(getTailSetString(treeSet1));
        System.out.println(getTailSetString(treeSet2));
        System.out.println(getSubSetString(treeSet1));
        System.out.println(getSubSetString(treeSet2));
        System.out.println(pollFirstElement(treeSet1));
        System.out.println(pollFirstElement(treeSet2));
        System.out.println(pollLastElement(treeSet1));
        System.out.println(pollLastElement(treeSet2));
        System.out.println(removeAnElementString(treeSet1));
        System.out.println(removeAnElementString(treeSet2));
        System.out.println(union(treeSet1,treeSet2));
        System.out.println(difference(treeSet1,treeSet2));
        System.out.println(intersection(treeSet1,treeSet2));
        System.out.println(subSet(treeSet1,treeSet2));
        System.out.println(removeAllElements(treeSet1));
        System.out.println(removeAllElements(treeSet2));
    }

    public void loadTreeSetInteger() {
        java.util.TreeSet<Integer> treeSet1 = addElementsInteger();
        print(treeSet1);
        java.util.TreeSet<Integer>  treeSet2 = addElementsToOriginSetInteger();
        print(treeSet2);
        System.out.println(getFirstElement(treeSet1));
        System.out.println(getFirstElement(treeSet2));
        System.out.println(getLastElement(treeSet1));
        System.out.println(getLastElement(treeSet2));
        System.out.println(getHeadSetInteger(treeSet1));
        System.out.println(getHeadSetInteger(treeSet2));
        System.out.println(getTailSetInteger(treeSet1));
        System.out.println(getTailSetInteger(treeSet2));
        System.out.println(getSubSetInteger(treeSet1));
        System.out.println(getSubSetInteger(treeSet2));
        System.out.println(pollFirstElement(treeSet1));
        System.out.println(pollFirstElement(treeSet2));
        System.out.println(pollLastElement(treeSet1));
        System.out.println(pollLastElement(treeSet2));
        System.out.println(removeAnElementInteger(treeSet1));
        System.out.println(removeAnElementInteger(treeSet2));
        System.out.println(union(treeSet1,treeSet2));
        System.out.println(difference(treeSet1,treeSet2));
        System.out.println(intersection(treeSet1,treeSet2));
        System.out.println(subSet(treeSet1,treeSet2));
        System.out.println(removeAllElements(treeSet1));
        System.out.println(removeAllElements(treeSet2));
    }

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.loadTreeSetString();
        treeSet.loadTreeSetInteger();
    }
}
