package com.example.javabasic.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {

    private static Scanner scanner = new Scanner(System.in);

    private int CAPACITY;

    private int[] array;

    public int[] createAnArrayInt(){
        Scanner scanner = new Scanner(System.in);
        this.array = null;
        try{
            System.out.print("Input a capacity: ");
            this.CAPACITY = scanner.nextInt();
            array = new int[CAPACITY];
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return array;
    }

    public String[] createAnArrayString(){
        Scanner scanner = new Scanner(System.in);
        String[] array = null;
        try{
            System.out.print("Input a capacity: ");
            int capacity = scanner.nextInt();
            array = new String[capacity];
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return array;
    }

    public int[] addElementsInt(){
        Scanner scanner = new Scanner(System.in);
        int[] array = createAnArrayInt();
        try{
            for (int i = 0 ; i < array.length; i++){
                System.out.print("Add elements(int): ");
                int elements = scanner.nextInt();
                array[i] = elements;
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return array;
    }

    public String[] addElementsString(){
        Scanner scanner = new Scanner(System.in);
        String[] array = createAnArrayString();
        try{
            for (int i = 0 ; i < array.length; i++){
                System.out.print("Add elements(String): ");
                String elements = scanner.next();
                array[i] = elements;
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return array;
    }

    public void print(int[] array){
        if (array != null){
            System.out.print("Array: ");
            for (int i = 0 ; i < array.length; i++){
                System.out.print(array[i]);
                System.out.print(", ");
            }
            System.out.println();
        }
    }

    public void printArray(String[] array){
        if (array != null){
            System.out.print("Array: ");
            for (String str : array){
                System.out.print(str + ", ");
            }
            System.out.println();
        }
    }

    public void loadArrayInt(){
        int[] array = addElementsInt();
        print(array);
    }
    public void loadArrayString(){
        String[] array = addElementsString();
        printArray(array);
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.loadArrayInt();
        array.loadArrayString();
    }
}
