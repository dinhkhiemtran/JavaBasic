package com.example.javabasic.collections.collection;

import com.example.javabasic.collections.collection.list.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    @Mock
    ArrayList list;

    List<String> arrayList;

    @BeforeEach
    void setUp() {
        list = new ArrayList();
        arrayList = Arrays.asList("Java", "Javascript", "Python", "Go", "Php", "C#");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initArrayListTest(){
        List<String> listExpect = arrayList;
        List<String> listActual = list.initArrayList();
        assertLinesMatch(listExpect,listActual);
    }
}