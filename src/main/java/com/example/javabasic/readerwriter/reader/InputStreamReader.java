package com.example.javabasic.readerwriter.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

public class InputStreamReader extends Reader {

    private static final String PATH = "text.txt";

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }

    public void createInputStreamReader(){
        try{
            // Creates an array of character
            char[] array = new char[100];
            FileInputStream file = new FileInputStream(PATH);
            java.io.InputStreamReader reader = new java.io.InputStreamReader(file);
            reader.read(array);
            System.out.println("Data in the stream:");
            System.out.println(array);

            // Closes the reader
            reader.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void getEncoding(){
        try{
            FileInputStream file = new FileInputStream("writer.txt");
            java.io.InputStreamReader reader1 = new java.io.InputStreamReader(file);
            // Creates an InputStreamReader specifying the encoding
            java.io.InputStreamReader reader2 = new java.io.InputStreamReader(file, Charset.forName("UTF8"));

            // Returns the character encoding of the input stream
            System.out.println("Character encoding of reader1: " + reader1.getEncoding());
            System.out.println("Character encoding of reader2: " + reader2.getEncoding());

            // Closes the reader
            reader1.close();
            reader2.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void load(){
        createInputStreamReader();
        getEncoding();
    }

    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader();
        reader.load();
    }
}
