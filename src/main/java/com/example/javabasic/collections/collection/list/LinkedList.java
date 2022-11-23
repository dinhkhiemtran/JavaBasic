package com.example.javabasic.collections.collection.list;

import java.util.*;

public class LinkedList implements List {
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
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
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
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public List<String> createLinkedList(){
        List<String> linkedList = new java.util.LinkedList<>();
        return linkedList;
    }

    public List<String> addElementsToLinkedList(){
        List<String> linkedList = createLinkedList();
        linkedList.add("Java");
        linkedList.add("Javascript");
        linkedList.add("Python");
        linkedList.add("Go");
        linkedList.add("C#");
        return linkedList;
    }

    public String accessElementInLinkedList(){
        Scanner scanner = new Scanner(System.in);
        List<String> linkedList = addElementsToLinkedList();
        String element = "";
        try{
            System.out.print("Input a position that you want to access: ");
            int pos = scanner.nextInt();
            if(linkedList != null){
                if(!linkedList.isEmpty()){
                    element = linkedList.get(pos);
                }else {
                    return "Empty!";
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Input wrong Type ");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        print(linkedList);
        return element;
    }

    public String changeElementsOfALinkedList(){
        Scanner scanner = new Scanner(System.in);
        List<String> linkedList = addElementsToLinkedList();
        String result = "";
        try{
            System.out.print("Input a position that you want to change: ");
            int pos = scanner.nextInt();
            System.out.print("Input an element that you want to change into: ");
            String element = scanner.next();
            if(linkedList != null){
                if(!linkedList.isEmpty()){
                    result = linkedList.set(pos,element);
                }else {
                    return "Empty!";
                }
            }
        }catch (InputMismatchException in){
            System.out.println("Wrong Type ");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        print(linkedList);
        return result;
    }

    public String removeElementFromALinkedList(){
        Scanner scanner = new Scanner(System.in);
        List<String> linkedList = addElementsToLinkedList();
        String element = "";
        try{
            System.out.print("Input a position that you want to remove: ");
            int pos = scanner.nextInt();
            if(linkedList != null){
                if(!linkedList.isEmpty()){
                    element = linkedList.remove(pos);
                }else {
                    return "Empty.";
                }
            }
        }catch (InputMismatchException in){
            System.out.print("Input wrong Type");
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
        print(linkedList);
        return element;
    }

    public void removeAllElementFromLinkedList(){
        List<String> linkedList = addElementsToLinkedList();
        if(linkedList != null){
            if(!linkedList.isEmpty()){
                linkedList.clear();
            }else {
                System.out.println("Empty.");
            }
        }
        print(linkedList);
    }

    private void print(List<String> linkedList){
        System.out.print("Linked List: ");
        for(String str : linkedList){
            System.out.print(str);
            System.out.print(",");
        }
        System.out.println();
    }

    private void load(){
        System.out.println(accessElementInLinkedList());
        System.out.print(changeElementsOfALinkedList());
        System.out.println(removeElementFromALinkedList());
        removeAllElementFromLinkedList();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.load();
    }
}
