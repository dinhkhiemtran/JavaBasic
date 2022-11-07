package com.example.javabasic.collections.collection.list;

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
        }catch (InputMismatchException in){
            System.out.print("Input wrong type!");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return input;
    }

    private String changeElementInArrayList(){
        String result = "";
        try{
            List<String> list = initArrayList();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a position that you want to change: ");
            int pos = scanner.nextInt();
            System.out.print("Input an element that you want to change: ");
            String element = scanner.next();
            result = list.set(pos,element);
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Input wrong type!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    private String removeElement(){
        String removeElement = "";
        try{
            List<String> list = initArrayList();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a position that you want to remove: ");
            int pos = scanner.nextInt();
            removeElement = list.remove(pos);
        }catch (InputMismatchException in){
            System.out.println("Input wrong type!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return removeElement;
    }

    private boolean checkElementHasExist(){
        boolean isExist = false;
        try{
            List<String> list = initArrayList();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Element that you want to verify: ");
            String element = scanner.next();
            if(list.contains(element)){
                isExist = true;
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Input wrong type!");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return isExist;
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

    private String positionElement(){
        List<String> list = initArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Element that you want to show position: ");
        String element = scanner.next();
       if(list.indexOf(element) != -1){
           return "Position: " + list.indexOf(element);
       }
       return "Not Found";
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
