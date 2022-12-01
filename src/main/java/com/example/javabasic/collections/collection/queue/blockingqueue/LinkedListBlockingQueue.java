package com.example.javabasic.collections.collection.queue.blockingqueue;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedListBlockingQueue implements BlockingQueue {

    private static final int CAPACITY = 8;

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
    public void put(Object o) throws InterruptedException {

    }

    @Override
    public boolean offer(Object o, long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public Object take() throws InterruptedException {
        return null;
    }

    @Override
    public Object poll(long timeout, TimeUnit unit) throws InterruptedException {
        return null;
    }

    @Override
    public int remainingCapacity() {
        return 0;
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
    public int drainTo(Collection c) {
        return 0;
    }

    @Override
    public int drainTo(Collection c, int maxElements) {
        return 0;
    }

    public <T> BlockingQueue<T> createLinkedBlockingQueue() {
        BlockingQueue<T> blockingQueue = new LinkedBlockingQueue<>(CAPACITY);
        return blockingQueue;
    }

    public <T> boolean isFull(BlockingQueue<T> blockingQueue) {
        return blockingQueue.size() >= CAPACITY;
    }

    public BlockingQueue<String> addElements() {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<String> blockingQueue = createLinkedBlockingQueue();
        try {
            if (blockingQueue != null) {
                while (!isFull(blockingQueue)) {
                    System.out.print("Add elements(String): ");
                    String element = scanner.next();
                    boolean isSuccess = blockingQueue.add(element);
                    if (isSuccess){
                        System.out.println("Element is added successfully.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<Integer> offerElements() {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> integers = createLinkedBlockingQueue();
        try {
            if (integers != null) {
                while (!isFull(integers)) {
                    System.out.print("Add elements(Integer): ");
                    Integer element = scanner.nextInt();
                    boolean isSuccess = integers.offer(element);
                    if (isSuccess){
                        System.out.println("Element is offered successfully.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return integers;
    }

    public <T> T peekAnElement(BlockingQueue<T> blockingQueue) {
        T element = null;
        try {
            if (blockingQueue != null) {
                if (!blockingQueue.isEmpty()) {
                    element = blockingQueue.peek();
                    System.out.print("Peek: ");
                }
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return element;
    }

    public <T> void iterator(BlockingQueue<T> blockingQueue) {
        if (blockingQueue != null) {
            Iterator<T> iterator = blockingQueue.iterator();
            System.out.print("Linked list blocking queue: ");
            while (iterator.hasNext()) {
                System.out.print(iterator.next());
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public BlockingQueue<String> removeAnElementSpecifiedString(BlockingQueue<String> blockingQueue) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (blockingQueue != null) {
                if (!blockingQueue.isEmpty()) {
                    System.out.print("Input an element(String) to remove: ");
                    String element = scanner.next();
                    if (blockingQueue.contains(element)) {
                        boolean isRemoved = blockingQueue.remove(element);
                        if (isRemoved) {
                            System.out.println("Element is removed successfully.");
                        } else {
                            System.out.println("Fail.");
                        }
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.print("Exception: " + exception.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<Integer> pollAnElementInteger(BlockingQueue<Integer> blockingQueue) {
        try {
            if (blockingQueue != null) {
                if (!blockingQueue.isEmpty()) {
                    Integer element = blockingQueue.poll();
                    System.out.println("Element is polled: " + element);
                }
            }
        } catch (Exception exception) {
            System.out.print("Exception: " + exception.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<String> putElementsString() {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>(CAPACITY);
        try {
            while (!isFull(blockingQueue)) {
                System.out.print("Put element(String): ");
                String element = scanner.next();
                blockingQueue.put(element);
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + inputMismatchException.getMessage());
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<Integer> putElementsInteger() {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(CAPACITY);
        try {
            while (!isFull(blockingQueue)) {
                System.out.print("Put elements(Integer): ");
                Integer element = scanner.nextInt();
                blockingQueue.put(element);
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public <T> BlockingQueue<T> takeAnElement(BlockingQueue<T> blockingQueue) {
        try {
            if (blockingQueue != null) {
                if (!blockingQueue.isEmpty()) {
                    T element = blockingQueue.take();
                    System.out.println("Element is token: " + element);
                }
            }
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public <T> BlockingQueue<T> removeAllElements(BlockingQueue<T> blockingQueue) {
        try {
            if (blockingQueue != null) {
                if (!blockingQueue.isEmpty()) {
                    blockingQueue.clear();
                }
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return blockingQueue;
    }

    public void loadBlockingQueueString() {
        BlockingQueue<String> blockingQueueString = addElements();
        BlockingQueue<String> blockingQueuePutString = putElementsString();
        iterator(blockingQueueString);
        iterator(blockingQueuePutString);
        System.out.println(peekAnElement(blockingQueueString));
        System.out.println(peekAnElement(blockingQueuePutString));
        System.out.println(removeAnElementSpecifiedString(blockingQueueString));
        System.out.println(takeAnElement(blockingQueueString));
        System.out.println(removeAllElements(blockingQueueString));
        System.out.println(removeAllElements(blockingQueuePutString));
    }

    public void loadBlockingQueueInteger() {
        BlockingQueue<Integer> blockingQueueInteger = offerElements();
        BlockingQueue<Integer> blockingQueuePutInteger = putElementsInteger();
        iterator(blockingQueueInteger);
        iterator(blockingQueuePutInteger);
        System.out.println(peekAnElement(blockingQueueInteger));
        System.out.println(peekAnElement(blockingQueuePutInteger));
        System.out.println(pollAnElementInteger(blockingQueueInteger));
        System.out.println(takeAnElement(blockingQueueInteger));
        System.out.println(removeAllElements(blockingQueueInteger));
        System.out.println(removeAllElements(blockingQueuePutInteger));
    }

    public static void main(String[] args) {
        LinkedListBlockingQueue blockingQueue = new LinkedListBlockingQueue();
        blockingQueue.loadBlockingQueueString();
        blockingQueue.loadBlockingQueueInteger();
    }
}
