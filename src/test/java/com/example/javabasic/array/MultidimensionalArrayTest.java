package com.example.javabasic.array;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MultidimensionalArrayTest {

    @Mock
    MultidimensionalArray multidimensionalArray;

    @BeforeEach
    void setUp() {
        multidimensionalArray = new MultidimensionalArray();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void create2DArray() {
        int[][] arrayExpect = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arrayActual = multidimensionalArray.create2DArray();
        assertArrayEquals(arrayExpect,arrayActual);
    }

    @Test
    void create2DStringArray() {
        String[][] arrayExpect = {
                {"Java","Javascript","Python"},
                {"C#","C++","C"},
                {"Go","PhP","Ruby"}
        };
        String[][] arrayActual = multidimensionalArray.create2DStringArray();
        assertArrayEquals(arrayExpect,arrayActual);
    }

    @Test
    void lengthOfRow() {
        int[][] array = multidimensionalArray.create2DArray();
        String strExpect1 = "Length of row 1: 3";
        String strExpect2 = "Length of row 2: 3";
        String strExpect3 = "Length of row 3: 3";
        assertEquals(strExpect1, "Length of row 1: " + array[0].length);
        assertEquals(strExpect2, "Length of row 2: " + array[1].length);
        assertEquals(strExpect3, "Length of row 3: " + array[2].length);
    }

    @Test
    void printAllElementsOf2dArrayUsingLoop() {
        int[][] array = multidimensionalArray.create2DArray();
        for(int i = 0 ; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                System.out.print(array[i][j]);
                System.out.print(",");
            }
        }
        System.out.println();
    }

    @Test
    void printAllElementsOf2dStringArrayUsingForEach() {
        String[][] array = multidimensionalArray.create2DStringArray();
        for(String[] innerArray : array){
            for(String data : innerArray){
                System.out.print(data);
                System.out.print(",");
            }
        }
        System.out.println();
    }

    @Test
    void copy2dArraysUsingLoopTest(){
        int[][] arrayExpect = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arrayActual = multidimensionalArray.copy2dArraysUsingLoop();
        assertArrayEquals(arrayExpect,arrayActual);
    }
}