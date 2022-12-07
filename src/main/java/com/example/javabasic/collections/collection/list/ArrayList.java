package com.example.javabasic.collections.collection.list;

import java.util.*;

public class ArrayList implements List {

    private static int CAPACITY = 2;

    private static Scanner scanner = new Scanner(System.in);

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

    public <T>java.util.ArrayList<T> createArrayList(){
        java.util.ArrayList<T> arrayList = new java.util.ArrayList<>(CAPACITY);
        return arrayList;
    }

    public <T> boolean isFull(java.util.ArrayList<T> arrayList){
        return arrayList.size() == CAPACITY;
    }

    public java.util.ArrayList<String> addElements() {
        java.util.ArrayList<String> list = createArrayList();
        try{
            if (list != null){
                while (!isFull(list)){
                    System.out.print("Add elements(String): ");
                    String element = scanner.next();
                    boolean isSuccess = list.add(element);
                    if (isSuccess){
                        System.out.println(element + " is added successfully.");
                    }else {
                        System.out.println("Fail.");
                    }
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return list;
    }

    public void accessElement(List<String> list) {
        String element = "";
        try {
            if (list != null) {
                if (!list.isEmpty()) {
                    System.out.print("Input a position to access to element: ");
                    Integer pos = scanner.nextInt();
                    element = list.get(pos);
                    System.out.println(element + " has been accessed.");
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    private List<String> changeElementInArrayList(List<String> list) {
        try {
            if (list != null) {
                if (!list.isEmpty()) {
                    System.out.print("Input a position to change an element: ");
                    int pos = scanner.nextInt();
                    System.out.print("Input an element to change: ");
                    String element = scanner.next();
                    String result = list.set(pos, element);
                    System.out.println(result + "has been changed.");
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

    private <T> int positionOfElement(List<T> list) {
        Scanner scanner = new Scanner(System.in);
        int pos = 0;
        try {
            if (list != null) {
                if (!list.isEmpty()) {
                    System.out.print("Input element to get a position: ");
                    String element = scanner.next();
                    if (list.indexOf(element) != -1) {
                        pos = list.indexOf(element);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return pos;
    }

    public <T> void print(List<T> list) {
        System.out.print("List: ");
        list.forEach(elements -> System.out.print(elements + ", "));
        System.out.println();
    }

    private void load() {
        List<String> list = addElements();
        print(list);
        accessElement(list);
        System.out.println(changeElementInArrayList(list));
        System.out.println(removeElement(list));
        System.out.println("Check element has exist: " + checkElementHasExist(list));
        System.out.println("Position of element: " + positionOfElement(list));
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.load();
    }
}
