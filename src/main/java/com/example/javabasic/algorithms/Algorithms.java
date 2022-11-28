package com.example.javabasic.algorithms;

import java.util.*;

public class Algorithms {

    private static final int CAPACITY = 5;

    public List<String> createAListString() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Javascript");
        arrayList.add("Python");
        arrayList.add("Php");
        arrayList.add("Go");
        return arrayList;
    }

    public List<Integer> createAListIntegerOrigin(){
        List<Integer> list = new ArrayList<>();
        for (int i = 10 ; i <= 20; i++){
            list.add(i);
        }
        return list;
    }

    public <T> boolean isFull(List<T> list) {
        return list.size() >= CAPACITY;
    }

    public List<Integer> createAListInteger() {
        List<Integer> arrayList = new ArrayList<>(CAPACITY);
        Scanner scanner = new Scanner(System.in);
        try {
            if (arrayList != null) {
                while (!isFull(arrayList)) {
                    System.out.print("Input numbers(Integer): ");
                    Integer element = scanner.nextInt();
                    arrayList.add(element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return arrayList;
    }

    public List<Integer> sortAListInteger(List<Integer> list) {
        try {
            printList(list);
            Collections.sort(list);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return list;
    }

    public List<String> sortAListString(List<String> list) {
        try {
            printList(list);
            Collections.sort(list);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return list;
    }

    public <T> List<T> shuffleAList(List<T> list) {
        try {
            printList(list);
            Collections.shuffle(list);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return list;
    }

    public <T> List<T> reverseList(List<T> list) {
        try {
            printList(list);
            Collections.reverse(list);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return list;
    }

    public List<Integer> fillListInteger(List<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (list != null) {
                System.out.print("Input a number to fill in a list: ");
                Integer element = scanner.nextInt();
                Collections.fill(list, element);
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return list;
    }

    public <T> List<T> swapElement(List<T> list) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (list != null) {
                if (!list.isEmpty()) {
                    printList(list);
                    System.out.print("Input a position of element1 to swap: ");
                    Integer element1 = scanner.nextInt();
                    System.out.print("Input a position to element2 to swap: ");
                    Integer element2 = scanner.nextInt();
                    if (list.contains(element1) && list.contains(element2)) {
                        Collections.swap(list, element1, element2);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + inputMismatchException.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return list;
    }

    public int binarySearchElementInListString(List<String> list) {
        Scanner scanner = new Scanner(System.in);
        int pos = 0;
        try {
            if (list != null) {
                if (!list.isEmpty()) {
                    System.out.print("Search list string: ");
                    String element = scanner.next();
                    if (list.contains(element)) {
                        pos = Collections.binarySearch(list, element);
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

    public int binarySearchElementInListInteger(List<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        int pos = 0;
        try {
            if (list != null) {
                if (!list.isEmpty()) {
                    printList(list);
                    System.out.print("Search list integer: ");
                    Integer element = scanner.nextInt();
                    if (list.contains(element)) {
                        pos = Collections.binarySearch(list, element);
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

    public <T> int frequencyOfElements(List<T> list) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        try {
            if (list != null) {
                if (!list.isEmpty()) {
                    System.out.print("Input element to count of the number of times: ");
                    Integer element = scanner.nextInt();
                    if (list.contains(element)) {
                        count = Collections.frequency(list, element);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return count;
    }

    public <T> boolean  checkTwoCollectionsContainSomeCommonElement(List<T> list1, List<T> list2){
        boolean disJoint = false;
        try {
            if (list1 != null && list2 != null){
                if (!list1.isEmpty() && !list2.isEmpty()){
                    disJoint = Collections.disjoint(list1,list2);
                }
            }
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getMessage());
        }
        return disJoint;
    }

    public int getMinimumOfList(List<Integer> list){
        int min = 0;
        try {
            if (list != null){
                if (!list.isEmpty()){
                    min = Collections.min(list);
                }
            }
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getMessage());
        }
        return min;
    }

    public int getMaximumOfList(List<Integer> list){
        int max = 0;
        try{
            if (list != null){
                if (!list.isEmpty()){
                    max = Collections.max(list);
                }
            }
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getMessage());
        }
        return max;
    }

    private <T> void printList(List<T> list) {
        System.out.print("List: ");
        list.forEach(elements -> System.out.print(elements + ","));
        System.out.println();
    }

    public void load() {
        List<String> listString = createAListString();
        List<Integer> listInteger = createAListInteger();
        System.out.println("Sorted" + sortAListInteger(listInteger));
        System.out.println("Sorted: " + sortAListString(listString));
        System.out.println("Shuffle: " + shuffleAList(listString));
        System.out.println("Shuffle: " + shuffleAList(listInteger));
        System.out.println("Reverse: " + reverseList(listString));
        System.out.println("Reverse: " + reverseList(listInteger));
      /*  System.out.println("Filled: " + fillListInteger(listInteger));*/
        System.out.println("Swap: " + swapElement(listString));
        System.out.println("Swap: " + swapElement(listInteger));
        System.out.println("Search position: " + binarySearchElementInListString(listString));
        System.out.println("Search position: " + binarySearchElementInListInteger(listInteger));
        System.out.println(frequencyOfElements(listInteger));
        System.out.println("DisJoint: " + checkTwoCollectionsContainSomeCommonElement(listInteger, createAListIntegerOrigin()));
        System.out.println("Min: " + getMinimumOfList(listInteger));
        System.out.println("Max: " + getMaximumOfList(listInteger));
    }

    public static void main(String[] args) {
        Algorithms algorithms = new Algorithms();
        algorithms.load();
    }

}
