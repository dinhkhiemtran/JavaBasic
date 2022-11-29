package com.example.javabasic.readerwriter.reader;

import java.io.IOException;
import java.io.Reader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StringReader extends Reader {

    private static final String DATA= "This is the text read from StringReader.";

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }

    public Reader createStringReader(){
        java.io.StringReader reader = null;
        char[] array = new char[100];
        try{
            // Create a StringReader
             reader = new java.io.StringReader(DATA);

            //Use the read method
            reader.read(array);
            System.out.println("Data read from the string:");
            System.out.println(array);

            reader.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
        return reader;
    }

    public void skip(){
        Scanner scanner = new Scanner(System.in);
        try{
            char[] array = new char[100];
            java.io.StringReader reader = new java.io.StringReader(DATA);
            if (reader != null){
                System.out.print("Input a number to skip: ");
                int number = scanner.nextInt();
                reader.skip(number);
                reader.read(array);
                System.out.printf("Data after skipping %s characters: ", number);
                System.out.println(array);

                reader.close();
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getStackTrace());
        }
    }

    public void load(){
        createStringReader();
        skip();
    }

    public static void main(String[] args) {
        StringReader reader = new StringReader();
        reader.load();
    }
}
