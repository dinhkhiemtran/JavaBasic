package com.example.javabasic.readerwriter.reader;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

public class FileReader extends Reader {

    private static final String PATH = " buffer.txt";

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }

    public void createFileReader(){
        try{
            char[] array = new char[100];
            java.io.FileReader file = new java.io.FileReader(PATH);
            file.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);
            file.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void getEncoding(){
        try {
            // Creates a FileReader with default encoding
            java.io.FileReader input1 = new java.io.FileReader("text.txt");

            // Creates a FileReader specifying the encoding
            java.io.FileReader input2 = new java.io.FileReader("text.txt", Charset.forName("UTF8"));

            // Returns the character encoding of the file reader
            System.out.println("Character encoding of input1: " + input1.getEncoding());
            System.out.println("Character encoding of input2: " + input2.getEncoding());

            // Closes the reader
            input1.close();
            input2.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }

    public void load(){
        createFileReader();
        getEncoding();
    }

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.load();
    }
}
