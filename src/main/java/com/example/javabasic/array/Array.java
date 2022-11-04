package com.example.javabasic.array;

public class Array {

    public  int[] addArrayInt(){
        int[] array =  new int[10];
        for(int i = 1; i < array.length ; i++){
            array[i] = i;
        }
        return array;
    }

    public  String[] addArrayString(){
        String[] array = new String[5];
        array[0] = "Java";
        array[1] = "Javascript";
        array[2] = "Python";
        array[3] = "Go";
        array[4] = "C#";
        return array;
    }

    public  void printArrayInt(){
        int[] array = addArrayInt();
        System.out.print("Array Int: ");
        for(Integer index : array){
            System.out.print(index);
            System.out.print(",");
        }
        System.out.println();
    }

    public  void printArrayString(){
        String[] array = addArrayString();
        System.out.print("Array String: ");
        for(int i = 0 ; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print(",");
        }
        System.out.println();
    }

    public  int lengthOfArrayInt(){
        int[] array = addArrayInt();
        return array.length;
    }

    public  int lengthOfArrayString(){
        String[] array = addArrayString();
        return array.length;
    }

    private int[] copyArrays(){
        int[] array = addArrayInt();
        int[] arrayCopy = array;
        return arrayCopy;
    }

    private int[] usingLoopToCopyArrays(){
        int[] array = addArrayInt();
        int[] arrayCopy = new int[10];
        for(int i = 0 ; i < array.length; i++){
            array[i] = arrayCopy[i];
        }
        return arrayCopy;
    }
}
