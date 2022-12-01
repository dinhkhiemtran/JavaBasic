package com.example.javabasic.collections.collection.queue.deque;

import java.util.*;

public class LinkedList implements Deque {
    @Override
    public void addFirst(Object o) {

    }

    @Override
    public void addLast(Object o) {

    }

    @Override
    public boolean offerFirst(Object o) {
        return false;
    }

    @Override
    public boolean offerLast(Object o) {
        return false;
    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public Object removeLast() {
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
    public Object getFirst() {
        return null;
    }

    @Override
    public Object getLast() {
        return null;
    }

    @Override
    public Object peekFirst() {
        return null;
    }

    @Override
    public Object peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

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
    public void push(Object o) {

    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
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
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public Iterator descendingIterator() {
        return null;
    }

    public <T> java.util.LinkedList<T> createLinkedList() {
        java.util.LinkedList<T> linkedList = new java.util.LinkedList<>();
        return linkedList;
    }

    public java.util.LinkedList<String> addElementsToLinkedListString() {
        java.util.LinkedList<String> linkedList = createLinkedList();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Cow");
        linkedList.add("Fox");
        linkedList.add("Bird");
        return linkedList;
    }

    public java.util.LinkedList<Integer> addElementsToLinkedListInteger() {
        java.util.LinkedList<Integer> linkedList = createLinkedList();
        for (int i = 0; i <= 5; i++) {
            linkedList.offer(i);
        }
        return linkedList;
    }

    public <T> T accessAFirstElement(java.util.LinkedList<T> linkedList) {
        T element = null;
        try {
            if (linkedList != null) {
                if (!linkedList.isEmpty()) {
                    element = linkedList.getFirst();
                }
                System.out.print("A first element: ");
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return element;
    }


    public <T> T accessALastElement(java.util.LinkedList<T> linkedList) {
        T element = null;
        try {
            if (linkedList != null) {
                if (!linkedList.isEmpty()) {
                    element = linkedList.getLast();
                }
                System.out.print("A last element: ");
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return element;
    }

    public java.util.LinkedList<String> removeAnElementSpecifiedString(java.util.LinkedList<String> linkedList) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (linkedList != null) {
                if (!linkedList.isEmpty()) {
                    System.out.print("Input an element(String) to remove: ");
                    String element = scanner.next();
                    if (linkedList.contains(element)) {
                        boolean isSuccess = linkedList.remove(element);
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
        return linkedList;
    }

    public java.util.LinkedList<Integer> removeAnElementSpecifiedInteger(java.util.LinkedList<Integer> linkedList) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (linkedList != null) {
                if (!linkedList.isEmpty()) {
                    System.out.print("Input  an element(Integer) to remove: ");
                    Integer element = scanner.nextInt();
                    if (linkedList.contains(element)) {
                        boolean isSuccess = linkedList.remove(element);
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
        return linkedList;
    }

    public <T> java.util.LinkedList<T> removeAllElements(java.util.LinkedList<T> linkedList) {
        if (linkedList != null) {
            if (!linkedList.isEmpty()) {
                linkedList.clear();
            }
        }
        return linkedList;
    }

    public <T> void print(java.util.LinkedList<T> linkedList) {
        if (linkedList != null) {
            System.out.print("Linked List: ");
            linkedList.forEach(elements -> System.out.print(elements + ", "));
            System.out.println();
        }
    }

    public void loadLinkedListString() {
        java.util.LinkedList<String> linkedListString = addElementsToLinkedListString();
        print(linkedListString);
        System.out.println(accessAFirstElement(linkedListString));
        System.out.println(accessALastElement(linkedListString));
        System.out.println(removeAnElementSpecifiedString(linkedListString));
        System.out.println(removeAllElements(linkedListString));
    }

    public void loadLinkedListInteger() {
        java.util.LinkedList<Integer> linkedListInteger = addElementsToLinkedListInteger();
        print(linkedListInteger);
        System.out.println(accessAFirstElement(linkedListInteger));
        System.out.println(accessALastElement(linkedListInteger));
        System.out.println(removeAnElementSpecifiedInteger(linkedListInteger));
        System.out.println(removeAllElements(linkedListInteger));
    }

    public static void main(String[] args) {
        LinkedList deque = new LinkedList();
        deque.loadLinkedListString();
        deque.loadLinkedListInteger();
    }
}
