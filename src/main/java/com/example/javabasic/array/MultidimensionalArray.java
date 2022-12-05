package com.example.javabasic.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultidimensionalArray {

    public int[][] createAMatrixInt2D(){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = null;
        try{
            System.out.print("Input a length of a row: ");
            int row = scanner.nextInt();
            System.out.print("Input a length of a column: ");
            int col = scanner.nextInt();
            matrix = new int[row][col];
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return matrix;
    }

    public String[][] createAMatrixString2D(){
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = null;
        try{
            System.out.print("Input a length of a row: ");
            int row = scanner.nextInt();
            System.out.print("Input a length of a column: ");
            int col = scanner.nextInt();
            matrix = new String[row][col];
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return matrix;
    }

    public int[][] addElementsInt(){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = createAMatrixInt2D();
        try{
            for (int row = 0 ; row < matrix.length; row++){
                for (int col = 0; col < matrix[row].length; col++){
                    System.out.print("Row[" + row +"] Column["+ col +"](Int): ");
                    matrix[row][col] = scanner.nextInt();
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return matrix;
    }

    public String[][] addElementsString(){
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = createAMatrixString2D();
        try{
            for (int row = 0 ; row < matrix.length; row++){
                for (int col = 0 ; col < matrix[row].length; col++){
                    System.out.print("Row[" + row +"] Column["+ col +"](String): ");
                    matrix[row][col] = scanner.next();
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return matrix;
    }

    public void printArray(String[][] matrix){
        if (matrix != null){
            System.out.println("Matrix string: ");
            for (String[] str : matrix){
                for (String data : str){
                    System.out.print(data + ", ");
                }
                System.out.println();
            }
        }
    }

    public void print(int[][] matrix){
        if (matrix != null){
            System.out.println("Matrix int: ");
            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + ", ");
                }
                System.out.println();
            }
        }
    }

    public void loadMatrixInt(){
        int[][] matrix = addElementsInt();
        print(matrix);
    }

    public void loadMatrixString(){
        String[][] matrix = addElementsString();
        printArray(matrix);
    }

    public static void main(String[] args) {
        MultidimensionalArray multidimensionalArray = new MultidimensionalArray();
        multidimensionalArray.loadMatrixInt();
        multidimensionalArray.loadMatrixString();
    }
}
