package com.example.javabasic.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

   @Mock
    Array array = new Array();

    @Test
    void addArrayInt() {
        int[] arrayExpect = {0,1,2,3,4,5,6,7,8,9};
        int[] arrayActual = array.addArrayInt();
        Assert.assertArrayEquals(arrayExpect,arrayActual);
    }

    @Test
    void addArrayString() {
        String[] arrayStringExpect = {"Java", "Javascript", "Python", "Go", "C#"};
        String[] arrayStringActual = array.addArrayString();
        Assert.assertArrayEquals(arrayStringExpect,arrayStringActual);
    }

    @Test
    void lengthOfArrayInt() {
        int lengthOfArrayIntExpect = 10;
        int lengthOfArrayIntActual = array.lengthOfArrayInt();
        Assert.assertEquals(lengthOfArrayIntExpect, lengthOfArrayIntActual);
    }

    @Test
    void lengthOfArrayString() {
        int lengthOfStringArrayExpect = 5;
        int lengthOfStringArrayActual = array.lengthOfArrayString();
        Assert.assertEquals(lengthOfStringArrayExpect,lengthOfStringArrayActual);
    }
}