package com.example.javabasic.readerwriter.writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class OutputStreamWriter extends Writer {

    private static final String PATH = "writer.txt";

    private static final String DATA = "This is a line of text inside the file.";

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }

    public void createOutputStreamWriter(){
        try{
            FileOutputStream file = new FileOutputStream(PATH);
            Writer writer = new java.io.OutputStreamWriter(file);
            writer.write(DATA);
            writer.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void getEncoding(){
        try{
            FileOutputStream file = new FileOutputStream(PATH);
            java.io.OutputStreamWriter output1 = new java.io.OutputStreamWriter(file);
            java.io.OutputStreamWriter output2 = new java.io.OutputStreamWriter(file, Charset.forName("UTF8"));
            // Returns the character encoding of the output stream
            System.out.println("Character encoding of output1: " + output1.getEncoding());
            System.out.println("Character encoding of output2: " + output2.getEncoding());
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void load(){
        createOutputStreamWriter();
        getEncoding();
    }

    public static void main(String[] args) {
        OutputStreamWriter writer = new OutputStreamWriter();
        writer.load();
    }
}
