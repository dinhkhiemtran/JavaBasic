package com.example.javabasic.collections.collection.queue.blockingqueue;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueue implements BlockingQueue {

    private static final int CAPACITY = 4;

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

    public <T> BlockingQueue<T> createArrayBlockingQueue() {
        BlockingQueue<T> blockingQueue = new java.util.concurrent.ArrayBlockingQueue<>(CAPACITY);
        return blockingQueue;
    }

    public <T> boolean isFull(BlockingQueue<T> blockingQueue) {
        return blockingQueue.size() >= CAPACITY;
    }

    public BlockingQueue<String> addElementsString() {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<String> blockingQueue = createArrayBlockingQueue();
        try {
            while (!isFull(blockingQueue)) {
                System.out.print("Add elements(String): ");
                String element = scanner.next();
                blockingQueue.add(element);
            }
        } catch (InputMismatchException in) {
            System.out.println("Exception: " + "Wrong type");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<Integer> addElementsInteger() {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> blockingQueue = createArrayBlockingQueue();
        try {
            while (!isFull(blockingQueue)) {
                System.out.print("Add elements(Integer): ");
                Integer element = scanner.nextInt();
                blockingQueue.offer(element);
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + inputMismatchException.getMessage());
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public <T> T accessAPeekElement(BlockingQueue<T> blockingQueue) {
        T element = null;
        try {
            if (blockingQueue != null) {
                if (!blockingQueue.isEmpty()) {
                    element = blockingQueue.peek();
                    System.out.print("Peek: ");
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return element;
    }

    public <T> void print(BlockingQueue<T> blockingQueue) {
        try {
            if (blockingQueue != null) {
                Iterator<T> iterator = blockingQueue.iterator();
                System.out.print("Blocking Queue");
                while (iterator.hasNext()) {
                    System.out.print(iterator.next());
                    System.out.print(", ");
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        System.out.println();
    }

    public <T> BlockingQueue<T> removeAnElement(BlockingQueue<T> blockingQueue) {
        try {
            if (blockingQueue != null) {
                if (!blockingQueue.isEmpty()) {
                    T element = blockingQueue.remove();
                    System.out.println("An Element is removed: " + element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + inputMismatchException.getMessage());
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<String> putAnElementString() {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue blockingQueue = new java.util.concurrent.ArrayBlockingQueue<>(CAPACITY);
        try {
            if (blockingQueue != null) {
                while (!isFull(blockingQueue)) {
                    System.out.print("Put element(String): ");
                    String element = scanner.next();
                    blockingQueue.put(element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + inputMismatchException.getMessage());
        } catch (Exception ex) {
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<Integer> putAnElementInteger() {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> blockingQueue = new java.util.concurrent.ArrayBlockingQueue<>(CAPACITY);
        try {
            while (!isFull(blockingQueue)) {
                System.out.print("Put element: ");
                Integer element = scanner.nextInt();
                blockingQueue.put(element);
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.print("Exception: " + inputMismatchException.getMessage());
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
                    System.out.println("An Element is token: " + element);
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
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public void load() {
        BlockingQueue<String> blockingQueueString = addElementsString();
        BlockingQueue<Integer> blockingQueueInteger = addElementsInteger();
        BlockingQueue<String> blockingQueuePutString = putAnElementString();
        BlockingQueue<Integer> blockingQueuePutInteger = putAnElementInteger();
        print(blockingQueueString);
        print(blockingQueueInteger);
        print(blockingQueuePutString);
        print(blockingQueuePutInteger);
        System.out.println(accessAPeekElement(blockingQueueString));
        System.out.println(accessAPeekElement(blockingQueueInteger));
        System.out.println(accessAPeekElement(blockingQueuePutString));
        System.out.println(accessAPeekElement(blockingQueuePutInteger));
        System.out.println(removeAnElement(blockingQueueString));
        System.out.println(removeAnElement(blockingQueueInteger));
        System.out.println(removeAnElement(blockingQueuePutString));
        System.out.println(removeAnElement(blockingQueuePutInteger));
        System.out.println(takeAnElement(blockingQueueString));
        System.out.println(takeAnElement(blockingQueueInteger));
        System.out.println(takeAnElement(blockingQueuePutString));
        System.out.println(takeAnElement(blockingQueuePutInteger));
        System.out.println(removeAllElements(blockingQueueString));
        System.out.println(removeAllElements(blockingQueueInteger));
        System.out.println(removeAllElements(blockingQueuePutString));
        System.out.println(removeAllElements(blockingQueuePutInteger));
    }

    public static void main(String[] args) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue();
        arrayBlockingQueue.load();
    }
}
