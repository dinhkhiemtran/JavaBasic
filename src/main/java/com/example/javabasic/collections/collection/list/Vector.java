package com.example.javabasic.collections.collection.list;

import java.util.*;
import java.util.Stack;

public class Vector implements List {

    private static final int CAPACITY = 8;

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
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
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

    public <T> java.util.Vector<T> createVector() {
        java.util.Vector<T> vector = new java.util.Vector<>(CAPACITY);
        return vector;
    }

    public <T> boolean isFull(java.util.Vector<T> vector) {
        return vector.size() >= CAPACITY;
    }

    public java.util.Vector<String> addElements() {
        Scanner scanner = new Scanner(System.in);
        java.util.Vector<String> vector = createVector();
        try {
            if (vector != null) {
                while (!isFull(vector)) {
                    System.out.print("Add elements: ");
                    String element = scanner.next();
                    boolean isSuccess = vector.add(element);
                    if (isSuccess) {
                        System.out.println("Element is added successfully.");
                    }else {
                        System.out.println("Fail.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return vector;
    }


    public java.util.Vector<String> insertAnElement(java.util.Vector<String> vector) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (vector != null) {
                if (!vector.isEmpty()) {
                    System.out.print("Input a position to insert an element: ");
                    int pos = scanner.nextInt();
                    System.out.print("Input an element to insert: ");
                    String element = scanner.next();
                    vector.add(pos, element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Input wrong type.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return vector;
    }

    public String getAnElement(java.util.Vector<String> vector) {
        Scanner scanner = new Scanner(System.in);
        String element = "";
        try {
            if (vector != null) {
                if (!vector.isEmpty()) {
                    System.out.print("Input a position to get an element: ");
                    int pos = scanner.nextInt();
                    element = vector.get(pos);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return element;
    }

    public java.util.Vector<String> removeAnElement(java.util.Vector<String> vector) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (vector != null) {
                if (!vector.isEmpty()) {
                    System.out.print("Input a position that you want to remove: ");
                    int pos = scanner.nextInt();
                    String element = vector.remove(pos);
                    System.out.print("Element is removed: " + element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return vector;
    }

    public <T> java.util.Vector<T> removeAllElements(java.util.Vector<T> vector) {
        if (vector != null) {
            if (!vector.isEmpty()) {
                vector.clear();
                System.out.println("Elements are removed successfully.");
            }
        }
        return vector;
    }

    public <T> void iterator(java.util.Vector<T> vector) {
        if (vector != null) {
            Iterator<T> iterator = vector.iterator();
            System.out.print("Vector: ");
            while (iterator.hasNext()) {
                System.out.print(iterator.next());
                System.out.print(", ");
            }
            System.out.println();
        }
    }

    private java.util.Vector<String> changeAnElement(java.util.Vector<String> vector) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (vector != null) {
                if (!vector.isEmpty()) {
                    System.out.print("Input a position of element to change:  ");
                    int pos = scanner.nextInt();
                    System.out.print("Input an element to change: ");
                    String element = scanner.next();
                    String result = vector.set(pos, element);
                    System.out.println("Element is changed: " + result);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.print("Exception " + ex.getMessage());
        }
        return vector;
    }

    public void load() {
        java.util.Vector<String> vector = addElements();
        iterator(vector);
        System.out.println(insertAnElement(vector));
        System.out.println(changeAnElement(vector));
        System.out.println(getAnElement(vector));
        System.out.println(removeAnElement(vector));
        System.out.println(removeAllElements(vector));
    }

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.load();
    }
}
