package com.example.javabasic.collections.collection.queue.deque;

import java.util.*;

public class ArrayDeque implements Deque {

    private static final int CAPACITY = 10;

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

    public <T> java.util.ArrayDeque<T> createArrayDeque() {
        java.util.ArrayDeque<T> arrayDeque = new java.util.ArrayDeque<>(CAPACITY);
        return arrayDeque;
    }

    public <T> boolean isFull(java.util.ArrayDeque<T> arrayDeque) {
        return arrayDeque.size() == CAPACITY;
    }

    public java.util.ArrayDeque<String> addElementsString() {
        Scanner scanner = new Scanner(System.in);
        java.util.ArrayDeque<String> arrayDeque = createArrayDeque();
        try {
            if (arrayDeque != null) {
                while (!isFull(arrayDeque)) {
                    System.out.print("Add elements(String): ");
                    String element = scanner.next();
                    boolean isSuccess = arrayDeque.add(element);
                    if (isSuccess) {
                        System.out.println("Element is added successfully.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return arrayDeque;
    }

    public java.util.ArrayDeque<Integer> offerElementsInteger() {
        Scanner scanner = new Scanner(System.in);
        java.util.ArrayDeque<Integer> arrayDeque = createArrayDeque();
        try {
            if (arrayDeque != null) {
                while (!isFull(arrayDeque)) {
                    System.out.print("Offer elements(Integer): ");
                    Integer element = scanner.nextInt();
                    boolean isSuccess = arrayDeque.offer(element);
                    if (isSuccess) {
                        System.out.println("Element is offered successfully.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return arrayDeque;
    }

    public Deque<String> addFirstElement(java.util.ArrayDeque<String> arrayDeque) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (arrayDeque != null) {
                removeFirstElement(arrayDeque);
                if (!isFull(arrayDeque)) {
                    System.out.print("Add an element(String) to a head of an array deque: ");
                    String element = scanner.next();
                    arrayDeque.addFirst(element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Input wrong type.");
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return arrayDeque;
    }

    public <T> java.util.ArrayDeque<T> removeFirstElement(java.util.ArrayDeque<T> arrayDeque) {
        try {
            if (arrayDeque != null) {
                if (!arrayDeque.isEmpty()) {
                    T element = arrayDeque.removeFirst();
                    System.out.println("The first Element is removed: " + element);
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return arrayDeque;
    }

    public Deque<Integer> offerFirstElement(java.util.ArrayDeque<Integer> arrayDeque) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (arrayDeque != null) {
                pollFirstElement(arrayDeque);
                if (!isFull(arrayDeque)) {
                    System.out.print("Offer an element(Integer) to a head of an array deque: ");
                    Integer element = scanner.nextInt();
                    boolean isSuccess = arrayDeque.offerFirst(element);
                    if (isSuccess) {
                        System.out.println("Element is offered to a head of an array deque successfully");
                    } else {
                        System.out.println("Fail.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + inputMismatchException.getMessage());
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return arrayDeque;
    }

    public <T> java.util.ArrayDeque<T> pollFirstElement(java.util.ArrayDeque<T> arrayDeque) {
        try {
            if (arrayDeque != null) {
                if (!arrayDeque.isEmpty()) {
                    T element = arrayDeque.pollFirst();
                    System.out.println("Element is removed: " + element);
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return arrayDeque;
    }

    public Deque<String> addLastElement(java.util.ArrayDeque<String> arrayDeque) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (arrayDeque != null) {
                removeLastElement(arrayDeque);
                if (!isFull(arrayDeque)) {
                    System.out.print("Add an element(String) to a last of an array deque: ");
                    String element = scanner.next();
                    arrayDeque.addLast(element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return arrayDeque;
    }

    public <T> java.util.ArrayDeque<T> removeLastElement(java.util.ArrayDeque<T> arrayDeque) {
        try {
            if (arrayDeque != null) {
                if (!arrayDeque.isEmpty()) {
                    T element = arrayDeque.removeFirst();
                    System.out.print("A element is removed: " + element);
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return arrayDeque;
    }

    public Deque<Integer> offerLastElement(java.util.ArrayDeque<Integer> arrayDeque) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (arrayDeque != null) {
                pollLastElement(arrayDeque);
                if (!isFull(arrayDeque)) {
                    System.out.print("Offer an element to a last of a array deque: ");
                    Integer element = scanner.nextInt();
                    boolean isSuccess = arrayDeque.offer(element);
                    if (isSuccess) {
                        System.out.println("Element is offed to a last of a array deque successfully.");
                    } else {
                        System.out.println("Fail.");
                    }
                }
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return arrayDeque;
    }

    public <T> java.util.ArrayDeque<T> pollLastElement(java.util.ArrayDeque<T> arrayDeque) {
        try {
            if (arrayDeque != null) {
                if (!arrayDeque.isEmpty()) {
                    T element = arrayDeque.pollLast();
                    System.out.println("A last Element is polled: " + element);
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return arrayDeque;
    }


    public <T> T getFirstElement(java.util.ArrayDeque<T> arrayDeque) {
        T element = null;
        if (arrayDeque != null) {
            if (!arrayDeque.isEmpty()) {
                element = arrayDeque.getFirst();
            }
        }
        return element;
    }

    public <T> T getLastElement(java.util.ArrayDeque<T> arrayDeque) {
        T element = null;
        if (arrayDeque != null) {
            if (!arrayDeque.isEmpty()) {
                element = arrayDeque.getLast();
            }
        }
        return element;
    }

    public Deque<String> removeAnElementSpecifiedString(java.util.ArrayDeque<String> arrayDeque) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (arrayDeque != null) {
                if (!arrayDeque.isEmpty()) {
                    System.out.print("Input an element(String) to remove: ");
                    String element = scanner.next();
                    if (arrayDeque.contains(element)) {
                        boolean isRemoved = arrayDeque.remove(element);
                        if (isRemoved) {
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
        return arrayDeque;
    }

    public Deque<Integer> removeAnElementSpecifiedInteger(java.util.ArrayDeque<Integer> arrayDeque) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (arrayDeque != null) {
                if (!arrayDeque.isEmpty()) {
                    System.out.println("Input an element(Integer) to remove: ");
                    Integer element = scanner.nextInt();
                    if (arrayDeque.contains(element)) {
                        boolean isRemoved = arrayDeque.remove(element);
                        if (isRemoved) {
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
        return arrayDeque;
    }

    public <T> java.util.ArrayDeque<T> pollAnElement(java.util.ArrayDeque<T> arrayDeque) {
        if (arrayDeque != null) {
            if (!arrayDeque.isEmpty()) {
                T element = arrayDeque.poll();
                System.out.println("Element is polled: " + element);
            }
        }
        return arrayDeque;
    }

    public <T> java.util.ArrayDeque<T> removeAnElement(java.util.ArrayDeque<T> arrayDeque) {
        if (arrayDeque != null) {
            if (!arrayDeque.isEmpty()) {
                T element = arrayDeque.remove();
                System.out.println("Element is removed: " + element);
            }
        }
        return arrayDeque;
    }

    public <T> java.util.ArrayDeque<T> removeAllElements(java.util.ArrayDeque<T> arrayDeque) {
        if (arrayDeque != null) {
            if (!arrayDeque.isEmpty()) {
                arrayDeque.clear();
            }
        }
        return arrayDeque;
    }

    public <T> void print(java.util.ArrayDeque<T> arrayDeque) {
        if (arrayDeque != null) {
            System.out.print("ArrayDeque: ");
            arrayDeque.forEach(elements -> System.out.print(elements + ", "));
            System.out.println();
        }
    }

    private void loadArrayDequeString() {
        java.util.ArrayDeque<String> arrayDequeString = addElementsString();
        print(arrayDequeString);
        System.out.println(addFirstElement(arrayDequeString));
        System.out.println(addLastElement(arrayDequeString));
        System.out.println(getFirstElement(arrayDequeString));
        System.out.println(getLastElement(arrayDequeString));
        System.out.println(removeAnElementSpecifiedString(arrayDequeString));
        System.out.println(pollAnElement(arrayDequeString));
        System.out.println(removeAnElement(arrayDequeString));
        System.out.println(removeAllElements(arrayDequeString));
    }

    private void loadArrayDequeInteger() {
        java.util.ArrayDeque<Integer> arrayDequeInteger = offerElementsInteger();
        print(arrayDequeInteger);
        System.out.println(offerFirstElement(arrayDequeInteger));
        System.out.println(offerLastElement(arrayDequeInteger));
        System.out.println(getFirstElement(arrayDequeInteger));
        System.out.println(getLastElement(arrayDequeInteger));
        System.out.println(removeAnElementSpecifiedInteger(arrayDequeInteger));
        System.out.println(pollAnElement(arrayDequeInteger));
        System.out.println(removeAnElement(arrayDequeInteger));
        System.out.println(removeAllElements(arrayDequeInteger));
    }

    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque();
        deque.loadArrayDequeString();
        deque.loadArrayDequeInteger();
    }
}
