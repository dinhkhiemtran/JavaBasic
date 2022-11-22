package com.example.javabasic.array;

public class MultidimensionalArray {

   public int[][] create2DArray(){
       int[][] array = {
               {1,2,3},
               {4,5,6},
               {7,8,9}
       };
       return array;
   }

   public String[][] create2DArrayString(){
       String[][] array = {
               {"Java","Javascript","Python"},
               {"C#","C++","C"},
               {"Go","PhP","Ruby"}
       };
       return array;
   }

   public void lengthOfRow(){
       int[][] array = create2DArray();
       System.out.println("Length of row 1: " + array[0].length);
       System.out.println("Length of row 2: " + array[1].length);
       System.out.println("Length of row 3: " + array[2].length);
   }

   public void printAllElementsOf2dArrayUsingLoop(){
       int[][] array = create2DArray();
       for(int i = 0 ; i < array.length; i++){
           for(int j = 0 ; j < array[i].length; j++){
               System.out.print(array[i][j]);
               System.out.print(",");
           }
       }
       System.out.println();
   }

    public void printAllElementsOf2dStringArrayUsingForEach() {
        String[][] array = create2DArrayString();
        for(String[] innerArray : array){
            for(String data : innerArray){
                System.out.print(data);
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public int[][] copy2dArraysUsingLoop(){
       int[][] array = create2DArray();
       int[][] copyArray = new int[array.length][];
       for(int i = 0 ; i < copyArray.length; i++){
           copyArray[i] = new int[array[i].length];
           for (int j = 0; j < copyArray[i].length; ++j) {
               copyArray[i][j] = array[i][j];
           }
       }
       return copyArray;
    }

    private void load(){
        lengthOfRow();
        printAllElementsOf2dArrayUsingLoop();
        printAllElementsOf2dStringArrayUsingForEach();
    }

    public static void main(String[] args) {
        MultidimensionalArray multidimensionalArray = new MultidimensionalArray();
        multidimensionalArray.load();
    }
}
