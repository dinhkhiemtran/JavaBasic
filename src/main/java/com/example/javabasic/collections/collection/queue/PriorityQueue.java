package com.example.javabasic.collections.collection.queue;

import java.util.*;

public class PriorityQueue implements Queue {

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
    public Object[] toArray(Object[] a) {
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
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
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

    private <T> java.util.PriorityQueue<T> createPriorityQueue() {
        java.util.PriorityQueue<T> priority = new java.util.PriorityQueue<>();
        return priority;
    }

    private <T> boolean isFull(java.util.PriorityQueue<T> priority) {
        return priority.size() >= CAPACITY;
    }

    private java.util.PriorityQueue<Integer> offerElementsInteger() {
        Scanner scanner = new Scanner(System.in);
        java.util.PriorityQueue<Integer> priorityQueue = createPriorityQueue();
        try {
            if (priorityQueue != null) {
                while (!isFull(priorityQueue)) {
                    System.out.print("Add elements(Integer): ");
                    Integer elements = scanner.nextInt();
                    boolean isSuccess = priorityQueue.offer(elements);
                    if (isSuccess) {
                        System.out.println("Element is offered successfully.");
                    }else {
                        System.out.println("Fail.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return priorityQueue;
    }

    public java.util.PriorityQueue<String> addElements() {
        Scanner scanner = new Scanner(System.in);
        java.util.PriorityQueue<String> priorityQueue = createPriorityQueue();
        try {
            if (priorityQueue != null) {
                while (!isFull(priorityQueue)) {
                    System.out.print("Add elements(String): ");
                    String element = scanner.next();
                    boolean isSuccess = priorityQueue.add(element);
                    if (isSuccess) {
                        System.out.println("Element is added successfully.");
                    }else {
                        System.out.println("Fail.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return priorityQueue;
    }

    public <T> T getHeadOfElement(java.util.PriorityQueue<T> priorityQueue) {
        T element = null;
        if (priorityQueue != null) {
            if (!priorityQueue.isEmpty()) {
                element = priorityQueue.peek();
            }
        }
        return element;
    }

    public java.util.PriorityQueue<String> removeAnElement(java.util.PriorityQueue<String> priorityQueue) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (priorityQueue != null) {
                if (!priorityQueue.isEmpty()) {
                    System.out.print("Input an element to remove(String): ");
                    String element = scanner.next();
                    if (priorityQueue.contains(element)) {
                        boolean isRemoved = priorityQueue.remove(element);
                        if (isRemoved) {
                            System.out.println("Element is removed successfully.");
                        } else {
                            System.out.println("Can not remove.");
                        }
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return priorityQueue;
    }

    public <T> java.util.PriorityQueue<T> pollAnElement(java.util.PriorityQueue<T> priorityQueue) {
        try {
            if (priorityQueue != null) {
                if (!priorityQueue.isEmpty()) {
                    T element = priorityQueue.poll();
                    System.out.println("Element is polled: " + element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return priorityQueue;
    }

    public <T> void print(java.util.PriorityQueue<T> priorityQueue) {
        if (priorityQueue != null) {
            System.out.print("Priority Queue: ");
            priorityQueue.forEach(elements -> System.out.print(elements + ", "));
        }
        System.out.println();
    }

    public <T> java.util.PriorityQueue<T> removeAllElements(java.util.PriorityQueue<T> priorityQueue) {
        if (priorityQueue != null) {
            priorityQueue.clear();
        }
        return priorityQueue;
    }

    private void loadPriorityQueueString() {
        java.util.PriorityQueue<String> priorityQueueString = addElements();
        print(priorityQueueString);
        System.out.println(getHeadOfElement(priorityQueueString));
        System.out.println(removeAnElement(priorityQueueString));
        System.out.println(removeAllElements(priorityQueueString));
    }

    private void loadPriorityQueueInteger() {
        java.util.PriorityQueue<Integer> priorityQueueInteger = offerElementsInteger();
        print(priorityQueueInteger);
        System.out.println(getHeadOfElement(priorityQueueInteger));
        System.out.println(pollAnElement(priorityQueueInteger));
        System.out.println(removeAllElements(priorityQueueInteger));
    }

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.loadPriorityQueueString();
        priorityQueue.loadPriorityQueueInteger();
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        int value = number1.compareTo(number2);
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        } else if (value < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}