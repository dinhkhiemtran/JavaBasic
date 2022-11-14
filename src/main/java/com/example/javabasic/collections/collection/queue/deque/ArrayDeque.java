package com.example.javabasic.collections.collection.queue.deque;

import java.util.*;

public class ArrayDeque implements Deque {
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

    public Deque<String> createArrayDequeString(){
        Deque<String> arrayDeque = new java.util.ArrayDeque<>();
        return arrayDeque;
    }

    public Deque<Integer> createArrayDequeInteger(){
        Deque<Integer> arrayDeque = new java.util.ArrayDeque<>();
        return arrayDeque;
    }

    public Deque<String> addElementToArrayDequeString(){
        Deque<String> arrayDeque = createArrayDequeString();
        arrayDeque.add("Java");
        arrayDeque.add("Javascript");
        arrayDeque.add("Python");
        arrayDeque.add("Php");
        arrayDeque.add("Go");
        return arrayDeque;
    }

    public Deque<Integer> addElementToArrayDequeInteger(){
        Deque<Integer> arrayDeque = createArrayDequeInteger();
        for(int i = 0 ; i <= 10 ; i++){
            arrayDeque.offer(i);
        }
        return arrayDeque;
    }

    public Deque<String> addFirstElementToArrayDequeString(){
        Deque<String> arrayDeque = addElementToArrayDequeString();
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Input an element that is string type to add to head of array deque: ");
            String element = scanner.next();
            arrayDeque.addFirst(element);
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Wrong Type");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return arrayDeque;
    }

    public Deque<Integer> addFirstElementToArrayDequeInteger(){
        Deque<Integer> deque = addElementToArrayDequeInteger();
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Input an element that is number type to add to first element of array deque: ");
            Integer element = scanner.nextInt();
            deque.offerFirst(element);
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return deque;
    }

    public Deque<String> addLastElementToArrayDequeString(){
        Deque<String> deque = addElementToArrayDequeString();
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Input an element that is string to add to last element of array deque: ");
            String element = scanner.next();
            deque.addLast(element);
        }catch (InputMismatchException in){
            System.out.print("Wrong type " + in.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return deque;
    }

    public Deque<Integer> addLastElementToArrayDequeInteger(){
        Deque<Integer> deque = addElementToArrayDequeInteger();
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Input an element that is string to add to last element of array deque: ");
            Integer element = scanner.nextInt();
            deque.offerLast(element);
        }catch (InputMismatchException in){
            System.out.print("Wrong type " + in.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return deque;
    }

    public String getHeadElementOfArrayDequeString(){
        Deque<String> deque = addFirstElementToArrayDequeString();
        String element = "";
        try {
            element = deque.getFirst();
        }catch (NoSuchElementException ex){
            System.out.print("Empty");
        }
        return element;
    }

    public Integer getHeadElementOfArrayDequeInteger(){
        Deque<Integer> deque = addFirstElementToArrayDequeInteger();
        Integer element = 0;
        try{
            if(deque != null){
                element = deque.getFirst();
            }
        }catch (NoSuchElementException noSuchElementException){
            System.out.print("Empty! ");
        }
        catch (Exception e){
            System.out.print("Exception: " + e.getMessage());
        }
        return element;
    }

    public String getLastElementOfArrayDequeString(){
        Deque<String> deque = addLastElementToArrayDequeString();
        String element = "";
        try{
            element = deque.getLast();
        }catch (NoSuchElementException no){
            System.out.print("Empty! ");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return element;
    }

    public Integer getLastElementOfArrayDequeInteger(){
        Deque<Integer> deque = addLastElementToArrayDequeInteger();
        Integer element = 0;
        try{
            element = deque.getLast();
        }catch (NoSuchElementException no){
            System.out.println("Empty! ");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return element;
    }

    public Deque<String> removeAnElementSpecifiedOfArrayDequeString(){
        Deque<String> deque = addElementToArrayDequeString();
        Scanner scanner = new Scanner(System.in);
        boolean isSuccess;
        try{
            System.out.print("Input a position of element into array de queue string that you want to remove: ");
            int pos = scanner.nextInt();
            isSuccess = deque.remove(pos);
            if (isSuccess){
                System.out.println("An Element is removed successful!");
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Wrong type: " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return deque;
    }

    public Deque<Integer> removeAnElementSpecifiedOfArrayDequeInteger(){
        Deque<Integer> deque = addElementToArrayDequeInteger();
        Scanner scanner = new Scanner(System.in);
        boolean isSuccess;
        try{
            System.out.print("Input position of element in array deque integer that you want to remove: ");
            int pos = scanner.nextInt();
            isSuccess = deque.remove(pos);
            if(isSuccess){
                System.out.print("Element is removed from array deque integer!");
            }
        }catch (InputMismatchException in){
            System.out.print("Wrong type: " + in.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return deque;
    }

    public Deque<String> pollAnElementSpecifiedOfArrayDequeString(){
        Deque<String> deque = addElementToArrayDequeString();
        try{
            deque.poll();
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Wrong type: " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return deque;
    }

    public Deque<String> pollAnElementSpecifiedOfArrayDequeInteger(){
        Deque<String> deque = addElementToArrayDequeString();
        try{
            deque.poll();
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Wrong type: " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return deque;
    }

    public Deque<String> removeFirstElementFromArrayDequeString(){
        Deque<String> deque = addFirstElementToArrayDequeString();
        try {
            System.out.print("First element is removed: " + deque.removeFirst());
        }catch (NoSuchElementException no){
            System.out.print("Empty!");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return deque;
    }

    public Deque<Integer> removeFirstElementFromArrayDequeInteger(){
        Deque<Integer> deque = addFirstElementToArrayDequeInteger();
        try {
            System.out.print("First element is removed: " + deque.pollFirst());
        }catch (NoSuchElementException no){
            System.out.print("Empty!");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return deque;
    }

    public Deque<String> removeLastElementFromArrayDequeString(){
        Deque<String> deque = addLastElementToArrayDequeString();
        try{
            System.out.print("Last element is removed from array deque: " + deque.removeLast());
        }catch (NoSuchElementException no){
            System.out.print("Empty!");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return deque;
    }

    public Deque<Integer> removeLastElementFromArrayDequeInteger(){
        Deque<Integer> deque = addLastElementToArrayDequeInteger();
        try{
            System.out.print("Last element is removed from array deque: " + deque.pollLast());
        }catch (NoSuchElementException no){
            System.out.print("Empty!");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return deque;
    }

    public Deque<String> removeAllElementsFromArrayDequeString(){
        Deque<String> deque = addElementToArrayDequeString();
        if(deque != null){
            if(!deque.isEmpty()){
                deque.clear();
            }else {
                System.out.println("Empty! ");
            }
        }
        return deque;
    }

    public Deque<Integer> removeAllElementsFromArrayDequeInteger(){
        Deque<Integer> deque = addElementToArrayDequeInteger();
        if(deque != null){
            if(!deque.isEmpty()){
                deque.clear();
            }else {
                System.out.println("Empty! ");
            }
        }
        return deque;
    }

    public void printUsingForEach(Deque<String> deque){
        System.out.print("Deque: ");
       for(String str : deque){
           System.out.print(str);
           System.out.print(",");
       }
        System.out.println();
    }

    public void printUsingIterator(Deque<Integer> deque){
        Iterator<Integer> iterator = deque.iterator();
        System.out.print("Deque: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(",");
        }
        System.out.println();
    }

    private void load(){
        System.out.print(addFirstElementToArrayDequeString());
    }

    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque();
        deque.load();
    }
}
