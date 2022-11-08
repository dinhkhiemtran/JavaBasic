package com.example.javabasic.collections.collection.list;

import java.util.*;

public class Vector implements List {
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

    public List<String> createVector(){
        List<String> vector = new java.util.Vector<>();
        return vector;
    }

    public List<String> addElementToVector(){
        List<String> vector = createVector();
        vector.add("Java");
        vector.add("Javascript");
        vector.add("Python");
        vector.add("Php");
        vector.add("Go");
        return vector;
    }

    public void insertElementToVector(){
        List<String> vector = addElementToVector();
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Input a position that you want to insert: ");
            int pos = scanner.nextInt();
            System.out.print("Input an element that you want to insert: ");
            String element = scanner.next();
            vector.add(pos,element);
            printVector(vector);
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Wrong Type");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getElement(){
        List<String> vector = addElementToVector();
        Scanner scanner = new Scanner(System.in);
        String element = "";
        try{
            System.out.print("Input a position that you want to access: ");
            int pos = scanner.nextInt();
            element = vector.get(pos);
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return element;
    }

    public String removeElement(){
        List<String> vector = addElementToVector();
        Scanner scanner = new Scanner(System.in);
        String element = "";
        try {
            if(vector != null){
                if(!vector.isEmpty()){
                    System.out.print("Input a position that you want to remove: ");
                    int pos = scanner.nextInt();
                    element = vector.remove(pos);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception: " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return element;
    }

    public void removeAllElement(){
        List<String> vector = addElementToVector();
        if(vector != null){
            if(!vector.isEmpty()){
                vector.clear();
            }
        }
    }

    public void iteratorElements(){
        List<String> vector = addElementToVector();
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(",");
        }
        System.out.println();
    }

    private String changeElement(){
        Scanner scanner = new Scanner(System.in);
        List<String> vector = addElementToVector();
        String result = "";
        try{
            System.out.print("Input a position that you want to change: ");
            int pos = scanner.nextInt();
            System.out.print("Input an element that you want to change into: ");
            String element = scanner.next();
            if(vector != null){
                if(!vector.isEmpty()){
                    result = vector.set(pos,element);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.print("Exception " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.print("Exception " + ex.getMessage());
        }
        printVector(vector);
        return result;
    }

    public void printVector(List<String> vector){
        System.out.print("Vector: ");
        for(String str : vector){
            System.out.print(str);
            System.out.print(",");
        }
        System.out.println();
    }

    public void load(){
        insertElementToVector();
        changeElement();
        System.out.println(getElement());
        removeElement();
        removeAllElement();
        iteratorElements();
    }

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.load();
    }
}
