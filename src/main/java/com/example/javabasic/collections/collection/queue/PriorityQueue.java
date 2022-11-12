package com.example.javabasic.collections.collection.queue;

import java.util.*;

public class PriorityQueue implements Queue {
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

    private Queue<String> createPriorityQueue(){
        Queue<String> priority = new java.util.PriorityQueue<>();
        return priority;
    }


    private Queue<Integer> offerElementToPriorityQueueInt(){
        Queue<Integer> priority = new java.util.PriorityQueue<>();
        for(int i = 0 ; i <= 10 ; i++){
            priority.offer(i);
        }
        return priority;
    }

    public Queue<String> addElementPriorityQueueStr(){
        Queue<String> priority = createPriorityQueue();
       try{
           priority.add("Java");
           priority.add("Javascript");
           priority.add("Python");
           priority.add("Go");
           priority.add("Php");
       }catch (InputMismatchException inputMismatchException){
           System.out.print("Exception: " + inputMismatchException.getMessage());
       }catch (Exception ex){
           System.out.println(ex.getMessage());
       }
       return priority;
    }

    public String getAHeadOfElementInPriorityQueueStr(){
        Queue<String> priority = addElementPriorityQueueStr();
        return priority.peek();
    }

    public int getAHeadOfElementInPriorityQueueInt(){
        Queue<Integer> priority = offerElementToPriorityQueueInt();
        return priority.peek();
    }

    public boolean removeElementInPriorityQueueStr(){
        Queue<String> priority = addElementPriorityQueueStr();
        Scanner scanner = new Scanner(System.in);
        boolean isRemoved = false;
        try{
            System.out.print("Input a position that you want to remove: ");
            String element = scanner.next();
            isRemoved = priority.remove(element);
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.print("Exception " + ex.getMessage());
        }
        iteratorPriorityQueueStr(priority);
        return isRemoved;
    }

    public int pollElementInPriorityQueueInt(){
        Queue<Integer> priority = offerElementToPriorityQueueInt();
        int element = 0;
        try{
            element = priority.poll();
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        forEachPriorityQueueInt(priority);
        return element;
    }

    private void iteratorPriorityQueueStr(Queue<String> priority){
         Iterator<String> iterator = priority.iterator();
        System.out.print("Priority: ");
         while (iterator.hasNext()){
             System.out.print(iterator.hasNext());
             System.out.print(",");
         }
        System.out.println();
    }

    private Queue<Integer> customPriorityQueue(){
        Queue<Integer> custom = new java.util.PriorityQueue<>(new CustomComparator());
        custom.add(5);
        custom.add(2);
        custom.add(3);
        custom.add(1);
        custom.add(9);
        custom.add(7);
        custom.add(6);
        return custom;
    }

    private void forEachPriorityQueueInt(Queue<Integer> priority){
        System.out.println("Priority Queue: ");
        for(Integer index : priority){
            System.out.print(index);
            System.out.print(",");
        }
        System.out.println();
    }

    private void load(){
        System.out.print( getAHeadOfElementInPriorityQueueStr());
        System.out.print(getAHeadOfElementInPriorityQueueInt());
        System.out.print( removeElementInPriorityQueueStr());
        System.out.print(pollElementInPriorityQueueInt());
        System.out.print( customPriorityQueue());
    }

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.load();
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        int value =  number1.compareTo(number2);
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}