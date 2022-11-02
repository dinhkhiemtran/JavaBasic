package com.example.javabasic.array;

public class Array {

    public static int[] initArrayInt(){
        int[] array = new int[10];
        return array;
    }

    public static String[] intArrayString(){
        String[] array = new String[5];
        return array;
    }

    public static int[] addArrayInt(){
        int[] array = initArrayInt();
        for(int i = 1; i < array.length ; i++){
            array[i] = i;
        }
        return array;
    }

    public static String[] addArrayString(){
        String[] array = intArrayString();
        array[0] = "Java";
        array[1] = "Javascript";
        array[2] = "Python";
        array[3] = "Go";
        array[4] = "C#";
        return array;
    }

    public static void printArrayInt(){
        int[] array = addArrayInt();
        System.out.print("Array Int: ");
        for(Integer index : array){
            System.out.print(index);
            System.out.print(",");
        }
        System.out.println();
    }

    public static void printArrayString(){
        String[] array = addArrayString();
        System.out.print("Array String: ");
        for(int i = 0 ; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print(",");
        }
        System.out.println();
    }

    public static int lengthOfArrayInt(){
        int[] array = addArrayInt();
        return array.length;
    }

    public static int lengthOfArrayString(){
        String[] array = addArrayString();
        return array.length;
    }

    public static void load(){
        int lengthOfArrayInt = lengthOfArrayInt();
        int lengthOfArrayString = lengthOfArrayString();
        printArrayInt();
        printArrayString();
        System.out.println("Length of Array Int: " + lengthOfArrayInt);
        System.out.println("Length of Array Int: " + lengthOfArrayString);
    }

    public static void main(String[] args) {
        load();
    }
}
