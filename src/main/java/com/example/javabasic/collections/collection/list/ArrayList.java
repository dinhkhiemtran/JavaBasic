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

    public List<String> initArrayList() {
        List<String> list = new java.util.ArrayList<>();
        list.add("Java");
        list.add("Javascript");
        list.add("Python");
        list.add("Go");
        list.add("Php");
        list.add("C#");
        return list;
    }

    public String accessElement(List<String> list) {
        Scanner scanner = new Scanner(System.in);
        String element = "";
        try {
            if (list != null) {
                if (!list.isEmpty()) {
                    System.out.print("Input a position to access to element: ");
                    Integer pos = scanner.nextInt();
                    element = list.get(pos);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return element;
    }

    private List<String> changeElementInArrayList(List<String> list) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (list != null) {
                if (!list.isEmpty()) {
                    System.out.print("Input a position to change an element: ");
                    int pos = scanner.nextInt();
                    System.out.print("Input an element to change: ");
                    String element = scanner.next();
                    list.set(pos, element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Input wrong type.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    private <T> List<T> removeElement(List<T> list) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (list != null) {
                if (!list.isEmpty()) {
                    System.out.print("Input a position to remove from list: ");
                    int pos = scanner.nextInt();
                    T element = list.remove(pos);
                    System.out.println("Element is removed: " + element);
                }
            }
        } catch (InputMismatchException in) {
            System.out.println("Input wrong type.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    private <T> boolean checkElementHasExist(List<T> list) {
        Scanner scanner = new Scanner(System.in);
        boolean isExist = false;
        try {
            if (list != null) {
                System.out.print("Input element to verify exist: ");
                String element = scanner.next();
                if (list.contains(element)) {
                    isExist = true;
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Input wrong type.");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return isExist;
    }

    private <T> int positionElement(List<T> list) {
        Scanner scanner = new Scanner(System.in);
        int pos = 0;
        try {
            if (list != null){
                if (!list.isEmpty()){
                    System.out.print("Input element to get a position: ");
                    String element = scanner.next();
                    if (list.indexOf(element) != -1) {
                       pos = list.indexOf(element);
                    }
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return pos;
    }

    public <T> void print(List<T> list){
        System.out.print("List: ");
        list.forEach(elements -> System.out.print(elements + ", "));
        System.out.println();
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

    private void load() {
        List<String> list = initArrayList();
        print(list);
        System.out.println(accessElement(list));
        System.out.println(changeElementInArrayList(list));
        System.out.println(removeElement(list));
        System.out.println("Check element has exist: " + checkElementHasExist(list));
        System.out.println("Position of element: " + positionElement(list));
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.load();
    }
}
