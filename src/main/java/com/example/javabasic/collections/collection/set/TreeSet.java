package com.example.javabasic.collections.collection.set;

import java.util.*;

public class TreeSet implements NavigableSet {
    @Override
    public Object lower(Object o) {
        return null;
    }

    @Override
    public Object floor(Object o) {
        return null;
    }



    @Override
    public Object higher(Object o) {
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

    @Override
    public NavigableSet descendingSet() {
        return null;
    }

    @Override
    public Iterator descendingIterator() {
        return null;
    }

    @Override
    public NavigableSet subSet(Object fromElement, boolean fromInclusive, Object toElement, boolean toInclusive) {
        return null;
    }

    @Override
    public NavigableSet headSet(Object toElement, boolean inclusive) {
        return null;
    }

    @Override
    public NavigableSet tailSet(Object fromElement, boolean inclusive) {
        return null;
    }

    @Override
    public Comparator comparator() {
        return null;
    }

    @Override
    public SortedSet subSet(Object fromElement, Object toElement) {
        return null;
    }

    @Override
    public SortedSet headSet(Object toElement) {
        return null;
    }

    @Override
    public SortedSet tailSet(Object fromElement) {
        return null;
    }

    @Override
    public Object first() {
        return null;
    }

    @Override
    public Object last() {
        return null;
    }

    @Override
    public String ceiling(Object o) {
        return null;
    }

    public <T> java.util.TreeSet<T> createTreeSet(){
        java.util.TreeSet<T> treeSet = new java.util.TreeSet<>();
        return treeSet;
    }

    public java.util.TreeSet<String> addElementToTreeSetString(){
        java.util.TreeSet<String> treeSet = createTreeSet();
            treeSet.add("Java");
            treeSet.add("Javascript");
            treeSet.add("Python");
            treeSet.add("Go");
            treeSet.add("Php");
            return treeSet;
    }

    public java.util.TreeSet<Integer> addElementToTreeSetInteger(){
        java.util.TreeSet<Integer> treeSet = createTreeSet();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(10);
        treeSet.add(9);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(1);
        return treeSet;
    }

    public java.util.TreeSet<String> removeElementFromTreeSetString(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<String> treeSet = addElementToTreeSetString();
        try{
            accessTreeSetElements(treeSet);
            System.out.print("Input element that you want to remove from tree set String: ");
            String element = scanner.next();
            treeSet.remove(element);
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Wrong type");
        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        return treeSet;
    }

    public <T> void accessTreeSetElements(java.util.TreeSet<T> treeSet){
        Iterator<T> iterator = treeSet.iterator();
        System.out.print("Tree Set: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(",");
        }
        System.out.println();
    }

    public java.util.TreeSet<Integer> removeElementFromTreeSetInteger(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<Integer> treeSet = addElementToTreeSetInteger();
        try{
            accessTreeSetElements(treeSet);
            System.out.print("Input element that you want to remove from tree set Integer: ");
            Integer element = scanner.nextInt();
            treeSet.remove(element);
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Wrong type");
        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        return treeSet;
    }

    public java.util.TreeSet<String> getHeadSetFromTreeSetString(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<String> treeSet = addElementToTreeSetString();
        java.util.TreeSet<String> results = new java.util.TreeSet<>();
        try{
            if(treeSet != null){
                if (!treeSet.isEmpty()){
                    accessTreeSetElements(treeSet);
                    System.out.print("Input an element that you want to get head set: ");
                    String element = scanner.next();
                    results = (java.util.TreeSet<String>) treeSet.headSet(element);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + inputMismatchException.getMessage());
        }
        catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return results;
    }

    public java.util.TreeSet<Integer> getHeadSetFromTreeSetInteger(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<Integer> treeSet = addElementToTreeSetInteger();
        java.util.TreeSet<Integer> results = new java.util.TreeSet<>();
        try{
            if(treeSet != null){
                if (!treeSet.isEmpty()){
                    accessTreeSetElements(treeSet);
                    System.out.print("Input an element that you want to get head set: ");
                    Integer element = scanner.nextInt();
                    results = (java.util.TreeSet<Integer>) treeSet.headSet(element);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + inputMismatchException.getMessage());
        }
        catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return results;
    }

    public java.util.TreeSet<String> getTailSetString(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<String> treeSet = addElementToTreeSetString();
        java.util.TreeSet<String> results = new java.util.TreeSet<>();
        try{
            if (treeSet != null){
                if (!treeSet.isEmpty()){
                    accessTreeSetElements(treeSet);
                    System.out.print("Input an element that you want to get tail set: ");
                    String element = scanner.next();
                    results = (java.util.TreeSet<String>) treeSet.tailSet(element);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getMessage());
        }
        return results;
    }

    public java.util.TreeSet<Integer> getTailSetInteger(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<Integer> treeSet = addElementToTreeSetInteger();
        java.util.TreeSet<Integer> results = new java.util.TreeSet<>();
        try{
            if (treeSet != null){
                if (!treeSet.isEmpty()){
                    accessTreeSetElements(treeSet);
                    System.out.print("Input an element that you want to get tail set: ");
                    Integer element = scanner.nextInt();
                    results = (java.util.TreeSet<Integer>) treeSet.tailSet(element);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getMessage());
        }
        return results;
    }

    public java.util.TreeSet<String> getSubSetString(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<String> treeSet = addElementToTreeSetString();
        java.util.TreeSet<String> results = new java.util.TreeSet<>();
        try{
            if (treeSet != null){
                if (!treeSet.isEmpty()){
                    accessTreeSetElements(treeSet);
                    System.out.print("Input an element start String: ");
                    String element1 = scanner.next();
                    System.out.print("Input an element end String: ");
                    String element2 = scanner.next();
                    results = (java.util.TreeSet<String>) treeSet.subSet(element1,true,element2,true);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        return results;
    }

    public java.util.TreeSet<Integer> getSubSetInteger(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeSet<Integer> treeSet = addElementToTreeSetInteger();
        java.util.TreeSet<Integer> results = new java.util.TreeSet<>();
        try{
            if (treeSet != null){
                if (!treeSet.isEmpty()){
                    accessTreeSetElements(treeSet);
                    System.out.print("Input an element start Integer: ");
                    Integer element1 = scanner.nextInt();
                    System.out.print("Input an element end Integer: ");
                    Integer element2 = scanner.nextInt();
                    results = (java.util.TreeSet<Integer>) treeSet.subSet(element1,true, element2,true);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        return results;
    }

    public <T> T getFirstElement(java.util.TreeSet<T> treeSet){
        return treeSet.first();
    }

    public <T> T getLastElement(java.util.TreeSet<T> treeSet){
        return treeSet.last();
    }

    public <T> T removeFirstElement(java.util.TreeSet<T> treeSet){
        return treeSet.pollFirst();
    }

    public <T> T removeLastElement(java.util.TreeSet<T> treeSet){
        return treeSet.pollLast();
    }

    public <T>java.util.TreeSet<T> unionTreeSet(java.util.TreeSet<T> set1, java.util.TreeSet<T> set2){
        set1.addAll(set2);
        return set1;
    }

    public <T>java.util.TreeSet<T> intersectionTreeSet(java.util.TreeSet<T> set1, java.util.TreeSet<T> set2){
        set1.retainAll(set2);
        return set1;
    }

    public <T>java.util.TreeSet<T> differenceTreeSet(java.util.TreeSet<T> set1, java.util.TreeSet<T> set2){
        set1.removeAll(set2);
        return set1;
    }

    public <T> boolean subSet(java.util.TreeSet<T> set1, java.util.TreeSet<T> set2){
        return set1.containsAll(set2);
    }

    public java.util.TreeSet<String> addElementToOriginSetString(){
        java.util.TreeSet<String> origin = new java.util.TreeSet<>();
        origin.add("SpringBoot");
        origin.add("WPF");
        origin.add("Laravel");
        origin.add("Rails");
        origin.add("Express");
        origin.add("Java");
        return origin;
    }

    public java.util.TreeSet<Integer> addElementToOriginSetInteger(){
        java.util.TreeSet<Integer> origin = new java.util.TreeSet<>();
        for (int i = 10 ; i <= 20 ; i++){
            origin.add(i);
        }
        return origin;
    }

    public <T>java.util.TreeSet<T> removeAll(java.util.TreeSet<T> treeSet){
        treeSet.clear();
        return treeSet;
    }

    public void load(){
        System.out.println(addElementToTreeSetString());
        System.out.println(addElementToTreeSetInteger());
        accessTreeSetElements(addElementToTreeSetInteger());
        accessTreeSetElements(addElementToTreeSetString());
        System.out.println("First element: " + getFirstElement(addElementToTreeSetString()));
        System.out.println("First element: " + getFirstElement(addElementToTreeSetInteger()));
        System.out.println("Last element: " + getLastElement(addElementToTreeSetString()));
        System.out.println("Last element: " + getLastElement(addElementToTreeSetInteger()));
        System.out.println("First element is removed : " + removeFirstElement(addElementToTreeSetString()));
        System.out.println("First element is removed : " + removeFirstElement(addElementToTreeSetInteger()));
        System.out.println("Last element is removed : " + removeLastElement(addElementToTreeSetString()));
        System.out.println("Last element is removed : " + removeLastElement(addElementToTreeSetInteger()));
        System.out.println("Head Set: " + getHeadSetFromTreeSetString());
        System.out.println("Head Set: " + getHeadSetFromTreeSetInteger());
        System.out.println("Tail Set: " + getTailSetString());
        System.out.println("Tail Set: " + getTailSetInteger());
        System.out.println("Sub Set: " + getSubSetString());
        System.out.println("Sub Set: " + getSubSetInteger());
        System.out.println("Union: " + unionTreeSet(addElementToOriginSetString(), addElementToTreeSetString()));
        System.out.println("Union: " + unionTreeSet(addElementToOriginSetInteger(), addElementToTreeSetInteger()));
        System.out.println("Intersection: " + intersectionTreeSet(addElementToOriginSetString(), addElementToTreeSetString()));
        System.out.println("Intersection: " + intersectionTreeSet(addElementToOriginSetInteger(), addElementToTreeSetInteger()));
        System.out.println("Difference: " + differenceTreeSet(addElementToOriginSetString(), addElementToTreeSetString()));
        System.out.println("Difference: " + differenceTreeSet(addElementToOriginSetInteger(), addElementToTreeSetInteger()));
        System.out.println("Sub Set: " + subSet(addElementToOriginSetString(), addElementToTreeSetString()));
        System.out.println("Sub Set: " + subSet(addElementToOriginSetInteger(), addElementToTreeSetInteger()));
        System.out.println(removeElementFromTreeSetInteger());
        System.out.println(removeElementFromTreeSetString());
        System.out.println(removeAll(addElementToTreeSetString()));
        System.out.println(removeAll(addElementToTreeSetInteger()));
    }

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.load();
    }
}
