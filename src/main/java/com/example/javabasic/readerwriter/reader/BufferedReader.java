package com.example.javabasic.readerwriter.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReader extends Reader {

    private static final String PATH = "output.txt";

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }

    public void createBufferedReader(){
        // Creates an array of character
        char[] array = new char[100];
        try {
            // Creates a FileReader
            java.io.FileReader file = new FileReader(PATH);

            // Creates a BufferedReader
            java.io.BufferedReader input = new java.io.BufferedReader(file);

            // Reads characters
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);

            // Closes the reader
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }

    public void skip(){
        // Creates an array of characters
        char[] array = new char[100];

        try {
            // Suppose, the input.txt file contains the following text
            // This is a line of text inside the file.
            FileReader file = new FileReader(PATH);

            // Creates a BufferedReader
            java.io.BufferedReader input = new java.io.BufferedReader(file);

            // Skips the 5 characters
            input.skip(5);

            // Reads the characters
            input.read(array);

            System.out.println("Data after skipping 5 characters:");
            System.out.println(array);

            // closes the reader
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void load(){
       createBufferedReader();
       skip();
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader();
        reader.load();
    }
}
