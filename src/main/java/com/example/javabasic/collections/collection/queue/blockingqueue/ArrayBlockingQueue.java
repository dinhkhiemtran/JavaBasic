package com.example.javabasic.collections.collection.queue.blockingqueue;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueue implements BlockingQueue {

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

    public BlockingQueue<String> createArrayBlockingQueueString(){
        BlockingQueue<String> blockingQueue = new java.util.concurrent.ArrayBlockingQueue<>(CAPACITY);
        return blockingQueue;
    }

    public BlockingQueue<Integer> createArrayBlockingQueueInteger(){
        BlockingQueue<Integer> integers = new java.util.concurrent.ArrayBlockingQueue<>(CAPACITY);
        return integers;
    }

    public <T> boolean isFull(BlockingQueue<T> blockingQueue){
        return blockingQueue.size() >= CAPACITY;
    }

    public BlockingQueue<String> addElementToArrayBlockingQueueString(){
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<String> blockingQueue = createArrayBlockingQueueString();
        try{
            while (!isFull(blockingQueue)){
                System.out.print("Add element using string: ");
                String element = scanner.next();
                blockingQueue.add(element);
            }
        }catch (InputMismatchException in){
            System.out.println("Exception: " + "Wrong type");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<Integer> addElementToArrayBlockingQueueInteger(){
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> blockingQueue = createArrayBlockingQueueInteger();
        try{
            while (!isFull(blockingQueue)){
                System.out.print("Add element using numeric: ");
                Integer element = scanner.nextInt();
                blockingQueue.offer(element);
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public String accessPeekOfElementIntoArrayBlockingString(){
        BlockingQueue<String> blockingQueue = addElementToArrayBlockingQueueString();
        String element = "";
        try{
            if(blockingQueue != null){
                if (!blockingQueue.isEmpty()){
                    element = blockingQueue.peek();
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return element;
    }

    public Integer accessPeekOfElementIntoArrayBlockingInteger(){
        BlockingQueue<Integer> blockingQueue = addElementToArrayBlockingQueueInteger();
        Integer element = 0;
        try{
            if(blockingQueue != null){
                if (!blockingQueue.isEmpty()){
                    element = blockingQueue.peek();
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return element;
    }

    public <T> void iteratorArrayBlockingQueue(BlockingQueue<T> blockingQueue){
        Iterator<T> iterator = blockingQueue.iterator();
        System.out.print("Array blocking queue: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(",");
        }
        System.out.println();
    }

    public <T> BlockingQueue<T> removeAnElement(BlockingQueue<T> blockingQueue){
        try{
            if(blockingQueue != null){
                if(!blockingQueue.isEmpty()){
                    blockingQueue.remove();
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + inputMismatchException.getMessage());
        }
        catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return blockingQueue;
    }

    public BlockingQueue<String> putElementToArrayBlockingQueueString(){
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<String> blockingQueue = new java.util.concurrent.ArrayBlockingQueue<>(CAPACITY);
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
        BlockingQueue<Integer> blockingQueue = new java.util.concurrent.ArrayBlockingQueue<>(CAPACITY);
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
        BlockingQueue<String> blockingQueue = addElementToArrayBlockingQueueString();
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
        BlockingQueue<Integer> blockingQueue = addElementToArrayBlockingQueueInteger();
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
        System.out.println(addElementToArrayBlockingQueueString());
        System.out.println(addElementToArrayBlockingQueueInteger());
        iteratorArrayBlockingQueue(addElementToArrayBlockingQueueString());
        iteratorArrayBlockingQueue(addElementToArrayBlockingQueueInteger());
        System.out.println("Peek element of ArrayBlockingQueue String: " + accessPeekOfElementIntoArrayBlockingString());
        System.out.println("Peek element of ArrayBlockingQueue Integer: " + accessPeekOfElementIntoArrayBlockingInteger());
        System.out.println("Element is removed: " + removeAnElement(addElementToArrayBlockingQueueString()));
        System.out.println("Element is removed: " + removeAnElement(addElementToArrayBlockingQueueInteger()));
        System.out.println(putElementToArrayBlockingQueueString());
        System.out.println(putElementToArrayBlockingQueueInteger());
        System.out.println("Element is token: " + takeElementFromArrayBlockingQueueString());
        System.out.println("Element is token: " + takeElementFromArrayBlockingQueueInteger());
    }

    public static void main(String[] args) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue();
        arrayBlockingQueue.load();
    }
}
