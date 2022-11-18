package com.example.javabasic.collections.collection.queue.blockingqueue;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedListBlockingQueue implements BlockingQueue {

    private static final int CAPACITY = 5;

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

    public <T> BlockingQueue<T> createLinkedBlockingQueue(){
        BlockingQueue<T> blockingQueue = new LinkedBlockingQueue<>(CAPACITY);
        return blockingQueue;
    }

    public <T> boolean isFull(BlockingQueue<T> blockingQueue){
        return blockingQueue.size() >= CAPACITY;
    }

    public BlockingQueue<String> insertElementsToLinkedListBlockingQueueString(){
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<String> blockingQueue = createLinkedBlockingQueue();
        try{
            if(blockingQueue != null){
                while (!isFull(blockingQueue)){
                    System.out.print("Add element String to Linked List Blocking Queue: ");
                    String element = scanner.next();
                    blockingQueue.add(element);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Wrong type");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<Integer> insertElementsToLinkedListBlockingQueueInteger(){
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> integers = createLinkedBlockingQueue();
        try{
            if(integers != null){
                while (!isFull(integers)){
                    System.out.print("Add elements Integer to Linked List Blocking Queue: ");
                    Integer element = scanner.nextInt();
                    integers.offer(element);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + "Wrong type");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return integers;
    }

    public <T> void peekOfElementOfLinkedList(BlockingQueue<T> blockingQueue){
        System.out.print("Peek of element: " + blockingQueue.peek());
    }

    public <T> void iteratorLinkedListBlockingQueue(BlockingQueue<T> blockingQueue){
        Iterator<T> iterator = blockingQueue.iterator();
        System.out.println("Linked list blocking queue: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(",");
        }
        System.out.println();
    }

    public BlockingQueue<String> removeElementFromLinkedListBlockQueueString(){
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<String> blockingQueue = createLinkedBlockingQueue();
        try{
            if(blockingQueue != null){
                if (!blockingQueue.isEmpty()){
                    System.out.print("Input an element String that you want to remove: ");
                    String element = scanner.next();
                    blockingQueue.remove(element);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + "wrong type");
        }catch (Exception exception){
            System.out.print("Exception: " + exception.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<Integer> pollElementFromLinkedListBlockQueueInteger(){
        BlockingQueue<Integer> blockingQueue = createLinkedBlockingQueue();
        try{
            if(blockingQueue != null){
                if (!blockingQueue.isEmpty()){
                    blockingQueue.poll();
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + "wrong type");
        }catch (Exception exception){
            System.out.print("Exception: " + exception.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<String> putElementToArrayBlockingQueueString(){
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>(CAPACITY);
        try{
            while (!isFull(blockingQueue)){
                System.out.print("Put element: ");
                String element = scanner.next();
                blockingQueue.put(element);
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + inputMismatchException.getMessage());
        }
        catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<Integer> putElementToArrayBlockingQueueInteger(){
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(CAPACITY);
        try{
            while (!isFull(blockingQueue)){
                System.out.print("Put element: ");
                Integer element = scanner.nextInt();
                blockingQueue.put(element);
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + inputMismatchException.getMessage());
        }
        catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<String> takeElementFromArrayBlockingQueueString(){
        BlockingQueue<String> blockingQueue = insertElementsToLinkedListBlockingQueueString();
        try{
            if(blockingQueue != null){
                if(!blockingQueue.isEmpty()){
                    blockingQueue.take();
                }
            }
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<Integer> takeElementFromArrayBlockingQueueInteger(){
        BlockingQueue<Integer> blockingQueue = insertElementsToLinkedListBlockingQueueInteger();
        try{
            if(blockingQueue != null){
                if(!blockingQueue.isEmpty()){
                    blockingQueue.take();
                }
            }
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public void load(){
        iteratorLinkedListBlockingQueue(insertElementsToLinkedListBlockingQueueString());
        iteratorLinkedListBlockingQueue(insertElementsToLinkedListBlockingQueueInteger());
        peekOfElementOfLinkedList(insertElementsToLinkedListBlockingQueueString());
        peekOfElementOfLinkedList(insertElementsToLinkedListBlockingQueueInteger());
        removeElementFromLinkedListBlockQueueString();
        pollElementFromLinkedListBlockQueueInteger();
        putElementToArrayBlockingQueueString();
        putElementToArrayBlockingQueueInteger();
        takeElementFromArrayBlockingQueueString();
        takeElementFromArrayBlockingQueueInteger();
    }

    public static void main(String[] args) {
        LinkedListBlockingQueue blockingQueue = new LinkedListBlockingQueue();
        blockingQueue.load();
    }
}
