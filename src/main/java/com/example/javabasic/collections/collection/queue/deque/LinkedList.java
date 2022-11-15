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

    public Deque<String> createLinkedListString(){
        Deque<String> linkedList = new java.util.LinkedList<>();
        return linkedList;
    }

    public Deque<Integer> createLinkedListInteger(){
        Deque<Integer> linkedList = new java.util.LinkedList<>();
        return linkedList;
    }

    public Deque<String> addElementsToLinkedListString(){
        Deque<String> linkedList = createLinkedListString();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Cow");
        linkedList.add("Fox");
        linkedList.add("Bird");
        return linkedList;
    }

    public Deque<Integer> addElementsToLinkedListInteger(){
        Deque<Integer> linkedList = createLinkedListInteger();
        for(int i = 0 ; i <= 5; i++){
            linkedList.offer(i);
        }
        return linkedList;
    }

    public String accessLinkedListStringFirstElement(){
        Deque<String> linkedList = addElementsToLinkedListString();
        String element = "";
        try{
            element = linkedList.getFirst();
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + "Wrong type");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return element;
    }

    public Integer accessLinkedListIntegerFirstElement(){
        Deque<Integer> linkedList = addElementsToLinkedListInteger();
        Integer element =  0;
        try{
            element = linkedList.getFirst();
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + "Wrong type");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return element;
    }

    public String accessLinkedListStringLastElement(){
        Deque<String> linkedList = addElementsToLinkedListString();
        String element = "";
        try{
            element = linkedList.getLast();
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + "Wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return element;
    }

    public Integer accessLinkedListIntegerLastElement(){
        Deque<Integer> linkedList = addElementsToLinkedListInteger();
        Integer element =  0;
        try{
            element = linkedList.getLast();
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + "Wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return element;
    }

    public Deque<String> removeAnElementFromLinkedListString(){
        Scanner scanner = new Scanner(System.in);
        Deque<String> linkedList = addElementsToLinkedListString();
        try{
            System.out.print("Input an element to remove from linked list String: ");
            String element = scanner.next();
            boolean isSuccess = linkedList.remove(element);
            if(isSuccess){
                System.out.print("Element is removed successfully. ");
            }
        }catch (NoSuchElementException no){
            System.out.print("Exception: " + no.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return linkedList;
    }

    public Deque<Integer> removeAnElementFromLinkedListInteger(){
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> linkedList = addElementsToLinkedListInteger();
        try{
            System.out.print("Input an element to remove from linked list Integer: ");
            Integer pos = scanner.nextInt();
            boolean isSuccess = linkedList.remove(pos);
            if(isSuccess){
                System.out.print("Element is removed successfully. ");
            }
        }catch (NoSuchElementException no){
            System.out.print("Exception: " + no.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return linkedList;
    }

    public void load(){
        System.out.println(addElementsToLinkedListString());
        System.out.println(addElementsToLinkedListInteger());
        System.out.println("First element: " + accessLinkedListStringFirstElement());
        System.out.println("First element: " +accessLinkedListIntegerFirstElement());
        System.out.println("Last element: " +accessLinkedListStringLastElement());
        System.out.println("Last element: " +accessLinkedListIntegerLastElement());
        System.out.println(removeAnElementFromLinkedListString());
        System.out.println(removeAnElementFromLinkedListInteger());
    }

    public static void main(String[] args) {
        LinkedList deque = new LinkedList();
        deque.load();
    }
}
