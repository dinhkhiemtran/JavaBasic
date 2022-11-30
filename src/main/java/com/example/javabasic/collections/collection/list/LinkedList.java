package com.example.javabasic.collections.collection.list;

import java.util.*;

public class LinkedList implements List {
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

    public List<String> createLinkedList() {
        List<String> linkedList = new java.util.LinkedList<>();
        return linkedList;
    }

    public List<String> addElements() {
        List<String> linkedList = createLinkedList();
        linkedList.add("Java");
        linkedList.add("Javascript");
        linkedList.add("Python");
        linkedList.add("Go");
        linkedList.add("C#");
        return linkedList;
    }

    public String accessAnElement(List<String> linkedList) {
        Scanner scanner = new Scanner(System.in);
        String element = "";
        try {
            if (linkedList != null) {
                if (!linkedList.isEmpty()) {
                    System.out.print("Input a position to access to an element: ");
                    int pos = scanner.nextInt();
                    element = linkedList.get(pos);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Input wrong type.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return element;
    }

    public List<String> changeAnElement(List<String> linkedList) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (linkedList != null) {
                if (!linkedList.isEmpty()) {
                    System.out.print("Input a position of element to change: ");
                    int pos = scanner.nextInt();
                    System.out.print("Input an element to change: ");
                    String element = scanner.next();
                    linkedList.set(pos, element);
                }
            }
        } catch (InputMismatchException in) {
            System.out.println("Input wrong type.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return linkedList;
    }

    public List<String> removeAnElement(List<String> linkedList) {
        Scanner scanner = new Scanner(System.in);
        String element = "";
        try {
            if (linkedList != null) {
                if (!linkedList.isEmpty()) {
                    System.out.print("Input a position of element to remove from the list: ");
                    int pos = scanner.nextInt();
                    element = linkedList.remove(pos);
                    System.out.println("Element is removed: " + element);
                }
            }
        } catch (InputMismatchException in) {
            System.out.print("Input wrong type.");
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return linkedList;
    }

    public List<String> removeAllElements(List<String> linkedList) {
        if (linkedList != null) {
            if (!linkedList.isEmpty()) {
                linkedList.clear();
            } else {
                System.out.println("Empty.");
            }
        }
        return linkedList;
    }

    private <T> void print(List<T> linkedList) {
        try {
            if (linkedList != null) {
                Iterator<T> iterator = linkedList.iterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next());
                    System.out.print(", ");
                }
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        System.out.println();
    }

    private void load() {
        List<String> linkedList = addElements();
        print(linkedList);
        System.out.println(accessAnElement(linkedList));
        System.out.println(changeAnElement(linkedList));
        System.out.println(removeAnElement(linkedList));
        System.out.println(removeAllElements(linkedList));
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.load();
    }
}
