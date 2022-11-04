package com.example.javabasic.collections.collection;

import java.util.*;

public class ArrayList implements List {


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

    public List<String> initArrayList(){
        List<String> list = new java.util.ArrayList<>();
        list.add("Java");
        list.add("Javascript");
        list.add("Python");
        list.add("Go");
        list.add("Php");
        list.add("C#");
        return list;
    }

    private String accessElementInArrayList(){
        String input = "";
        try{
            List<String> list = initArrayList();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input an element that you want to access: ");
            int element = scanner.nextInt();
            input = list.get(element);
            return input;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return input;
    }

    private String changeElementInArrayList(){
        List<String> list = initArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a position that you want to change: ");
        int pos = scanner.nextInt();
        System.out.print("Input an element that you want to change: ");
        String element = scanner.next();
        return list.set(pos,element);
    }

    private String removeElement(){
        List<String> list = initArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a position that you want to remove: ");
        int pos = scanner.nextInt();
        return list.remove(pos);
    }

    private boolean checkElementHasExist(){
        List<String> list = initArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Element that you want to verify: ");
        String element = scanner.next();
        return list.contains(element) ? true : false;
    }

    private void sortElement(){
        List<String> list = initArrayList();
        list.sort(Comparator.naturalOrder());
        for(String element : list){
            System.out.print(element);
            System.out.print(",");
        }
        System.out.println();
    }

    private int positionElement(){
        List<String> list = initArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Element that you want to show position: ");
        String element = scanner.next();
        return list.indexOf(element);
    }


    @Override
    public void clear() {
        List<String> list = initArrayList();
        list.clear();
    }

    @Override
    public int size() {
        List<String> list = initArrayList();
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        List<String> list = initArrayList();
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    private void load(){
        System.out.println(accessElementInArrayList());
        System.out.println(changeElementInArrayList());
        System.out.println( removeElement());
        System.out.println(checkElementHasExist());
        sortElement();
        System.out.println(positionElement());
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.load();
    }
}
