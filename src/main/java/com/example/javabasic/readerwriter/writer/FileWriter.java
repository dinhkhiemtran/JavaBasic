package com.example.javabasic.readerwriter.writer;

import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class FileWriter extends Writer {

    private static final String PATH = "fileWriter.txt";

    private static final String DATA = "NOOOOOOOOOOOOOOOOOOOOOOOOOOOO O NOOOOOOOOOOOOOOOOOOOO";

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }

    public void createFileWriter(){
        try{
            java.io.FileWriter file = new java.io.FileWriter(PATH);
            file.write(DATA);
            file.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void getEncoding(){
        try{
            java.io.FileWriter file1 = new java.io.FileWriter(PATH);
            java.io.FileWriter file2 = new java.io.FileWriter(PATH, Charset.forName("UTF8"));
            // Returns the character encoding of the reader
            System.out.println("Character encoding of output1: " + file1.getEncoding());
            System.out.println("Character encoding of output2: " + file2.getEncoding());

            // Closes the reader
            file1.close();
            file2.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void load(){
        createFileWriter();
        getEncoding();
    }

    public static void main(String[] args) {
        FileWriter writer = new FileWriter();
        writer.load();
    }
}
