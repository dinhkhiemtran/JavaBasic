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
        Set<T> set = new java.util.HashSet<>(CAPACITY, loadFactor);
        return (java.util.HashSet<T>) set;
    }

    public <T> boolean isFull(java.util.HashSet<T> set) {
        return set.size() >= CAPACITY;
    }

    public java.util.HashSet<String> insertElementToHashSetString() {
        Scanner scanner = new Scanner(System.in);
        java.util.HashSet<String> hashSet = createHashSet();
        try {
            if (hashSet != null) {
                while (!isFull(hashSet)) {
                    System.out.print("Insert element String to Hash Set: ");
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

    public java.util.HashSet<Integer> insertElementToHashSetInteger() {
        Scanner scanner = new Scanner(System.in);
        java.util.HashSet<Integer> hashSet = createHashSet();
        try {
            if (hashSet != null) {
                while (!isFull(hashSet)) {
                    System.out.print("Input element integer to hash set: ");
                    Integer element = scanner.nextInt();
                    hashSet.add(element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return hashSet;
    }

    public java.util.HashSet<String> removeElementFromHashSetString() {
        Scanner scanner = new Scanner(System.in);
        java.util.HashSet<String> hashSet = createHashSet();
        try {
            if (hashSet != null) {
                if (!hashSet.isEmpty()) {
                    System.out.print("Input element that you want to remove from hash set string: ");
                    String element = scanner.next();
                    hashSet.remove(element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Input Wrong type");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return hashSet;
    }

    public java.util.HashSet<Integer> removeElementFromHashSetInteger() {
        Scanner scanner = new Scanner(System.in);
        java.util.HashSet<Integer> hashSet = createHashSet();
        try {
            if (hashSet != null) {
                if (!hashSet.isEmpty()) {
                    System.out.print("Input element that you want to remove from hash set integer: ");
                    Integer element = scanner.nextInt();
                    hashSet.remove(element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Input Wrong type");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return hashSet;
    }

    public java.util.HashSet<String> createHashSetOriginString() {
        java.util.HashSet<String> origin = new java.util.HashSet<>();
        origin.add("Java");
        origin.add("Javascript");
        origin.add("Php");
        origin.add("Golang");
        origin.add("C#");
        return origin;
    }

    public java.util.HashSet<Integer> createHashSetOriginInteger() {
        java.util.HashSet<Integer> hashSet = new java.util.HashSet<>();
        for (int i = 0; i <= 10; i++) {
            hashSet.add(i);
        }
        return hashSet;
    }

    public <T> java.util.HashSet<T> unionSet(java.util.HashSet<T> set1, java.util.HashSet<T> set2) {
        set2.addAll(set1);
        return set2;
    }

    public <T> java.util.HashSet<T> intersectionSet(java.util.HashSet<T> set1, java.util.HashSet<T> set2) {
        set1.retainAll(set2);
        return set1;
    }

    public <T> java.util.HashSet<T> differenceSet(java.util.HashSet<T> set1, java.util.HashSet<T> set2) {
        set1.removeAll(set2);
        return set1;
    }

    public <T> boolean subSet(java.util.HashSet<T> set1, java.util.HashSet<T> set2) {
        return set2.containsAll(set1);
    }

    public void load() {
        System.out.println(insertElementToHashSetString());
        System.out.println(insertElementToHashSetInteger());
        System.out.println(unionSet(insertElementToHashSetString(), createHashSetOriginString()));
        System.out.println(unionSet(insertElementToHashSetInteger(), createHashSetOriginInteger()));
        System.out.println(intersectionSet(insertElementToHashSetString(), createHashSetOriginString()));
        System.out.println(intersectionSet(insertElementToHashSetInteger(), createHashSetOriginInteger()));
        System.out.println(differenceSet(insertElementToHashSetString(), createHashSetOriginString()));
        System.out.println(subSet(insertElementToHashSetString(), createHashSetOriginString()));
        System.out.println(subSet(insertElementToHashSetInteger(), createHashSetOriginInteger()));
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.load();
    }
}
