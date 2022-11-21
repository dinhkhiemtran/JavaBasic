package com.example.javabasic.collections.collection.set;

import java.util.*;

public class LinkedHashSet implements Set {

    private static final int CAPACITY = 2;

    private static final float loadFactor = 0.75f;

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
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
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

    public <T> java.util.LinkedHashSet<T> createLinkedHashSet(){
        java.util.LinkedHashSet<T> linkedHashSet = new java.util.LinkedHashSet<>(CAPACITY, loadFactor);
        return linkedHashSet;
    }

    public <T> boolean isFull(java.util.LinkedHashSet<T> linkedHashSet){
        return linkedHashSet.size() >= CAPACITY;
    }

    public java.util.LinkedHashSet<String> addElementsToLinkedHashSetOriginString(){
        java.util.LinkedHashSet<String> origin = new java.util.LinkedHashSet<>();
        origin.add("Java");
        origin.add("Go");
        origin.add("Php");
        origin.add("C#");
        origin.add("C++");
        origin.add("C");
        return origin;
    }

    public java.util.LinkedHashSet<Integer> addElementsToLinkedHashSetOriginInteger(){
        java.util.LinkedHashSet<Integer> origin = new java.util.LinkedHashSet<>();
        for(int i = 10; i <= 20; i++){
            origin.add(i);
        }
        return origin;
    }

    public java.util.LinkedHashSet<String> insertElementsToLinkedHashSetString(){
        Scanner scanner = new Scanner(System.in);
        java.util.LinkedHashSet<String> linkedHashSet = createLinkedHashSet();
        try{
            if(linkedHashSet != null){
                while (!isFull(linkedHashSet)){
                    System.out.print("Insert element to linked hash set string: ");
                    String element = scanner.next();
                    linkedHashSet.add(element);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + "Wrong type.");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return linkedHashSet;
    }

    public java.util.LinkedHashSet<Integer> insertElementsToLinkedHashSetInteger(){
        Scanner scanner = new Scanner(System.in);
        java.util.LinkedHashSet<Integer> linkedHashSet = createLinkedHashSet();
        try{
            if(linkedHashSet != null){
                while (!isFull(linkedHashSet)){
                    System.out.print("Insert element to linked hash set integer: ");
                    Integer element = scanner.nextInt();
                    linkedHashSet.add(element);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + "Wrong type.");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return linkedHashSet;
    }

    public <T> void accessLinkedHashSetElements(java.util.LinkedHashSet<T> linkedHashSet){
        Iterator<T> iterator = linkedHashSet.iterator();
        System.out.print("Linked Hash Set: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(",");
        }
        System.out.println();
    }

    public java.util.LinkedHashSet<String> removeElementFromLinkedHashSetString(){
        Scanner scanner = new Scanner(System.in);
        java.util.LinkedHashSet<String> linkedHashSet = insertElementsToLinkedHashSetString();
        try{
            if(linkedHashSet != null){
                if(!linkedHashSet.isEmpty()){
                    System.out.print("Input an element that you want to remove: ");
                    String element = scanner.next();
                    if(linkedHashSet.contains(element)){
                        linkedHashSet.remove(element);
                    }else {
                        System.out.println("Not Found! ");
                    }
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + "Wrong type.");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return linkedHashSet;
    }

    public java.util.LinkedHashSet<Integer> removeElementFromLinkedHashSetInteger(){
        Scanner scanner = new Scanner(System.in);
        java.util.LinkedHashSet<Integer> linkedHashSet = insertElementsToLinkedHashSetInteger();
        try{
            if(linkedHashSet != null){
                if(!linkedHashSet.isEmpty()){
                    System.out.print("Input an element that you want to remove: ");
                    Integer element = scanner.nextInt();
                    if(linkedHashSet.contains(element)){
                        linkedHashSet.remove(element);
                    }else {
                        System.out.println("Not Found! ");
                    }
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + "Wrong type.");
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return linkedHashSet;
    }

    public <T> java.util.LinkedHashSet<T> unionLinkedHashSet(java.util.LinkedHashSet<T> set1, java.util.LinkedHashSet<T> set2){
        set1.addAll(set2);
        return set1;
    }

    public <T>java.util.LinkedHashSet<T> intersectionLinkedHashSet(java.util.LinkedHashSet<T> set1, java.util.LinkedHashSet<T> set2){
        set1.retainAll(set2);
        return set1;
    }

    public <T>java.util.LinkedHashSet<T> differenceLinkedHashSet(java.util.LinkedHashSet<T> set1, java.util.LinkedHashSet<T> set2){
        set1.removeAll(set2);
        return set1;
    }

    public <T> boolean subSetLinkedHashSet(java.util.LinkedHashSet<T> set1, java.util.LinkedHashSet<T> set2){
        return set1.containsAll(set2);
    }

    private void load(){
        System.out.println(insertElementsToLinkedHashSetString());
        System.out.println(insertElementsToLinkedHashSetInteger());
        System.out.println(removeElementFromLinkedHashSetString());
        System.out.println(removeElementFromLinkedHashSetInteger());
        accessLinkedHashSetElements(addElementsToLinkedHashSetOriginString());
        accessLinkedHashSetElements(addElementsToLinkedHashSetOriginInteger());
        System.out.println("Union: " + unionLinkedHashSet(addElementsToLinkedHashSetOriginString(), insertElementsToLinkedHashSetString()));
        System.out.println("Union: " + unionLinkedHashSet(addElementsToLinkedHashSetOriginInteger(), insertElementsToLinkedHashSetInteger()));
        System.out.println("Intersection: " + intersectionLinkedHashSet(addElementsToLinkedHashSetOriginString(), insertElementsToLinkedHashSetString()));
        System.out.println("Intersection: " + intersectionLinkedHashSet(addElementsToLinkedHashSetOriginInteger(), insertElementsToLinkedHashSetInteger()));
        System.out.println("Difference: " + differenceLinkedHashSet(addElementsToLinkedHashSetOriginString(), insertElementsToLinkedHashSetString()));
        System.out.println("Difference: " + differenceLinkedHashSet(addElementsToLinkedHashSetOriginInteger(), insertElementsToLinkedHashSetInteger()));
        System.out.println(subSetLinkedHashSet(addElementsToLinkedHashSetOriginString(), insertElementsToLinkedHashSetString()));
        System.out.println(subSetLinkedHashSet(addElementsToLinkedHashSetOriginInteger(), insertElementsToLinkedHashSetInteger()));
    }

    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.load();
    }
}
