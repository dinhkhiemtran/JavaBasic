package com.example.javabasic.readerwriter.writer;

import java.io.IOException;
import java.io.Writer;

public class StringWriter extends Writer {

    private static final String DATA = "This is the text in the string.";

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }

    public java.io.StringWriter createStringWriter(){
        java.io.StringWriter writer = null;
        try{
            writer = new java.io.StringWriter();
            writer.write(DATA);
            System.out.println("Data in the StringWriter: " + writer);
            writer.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
        return writer;
    }
    
    public void accessDataFromStringBuffer(){
        try{
            java.io.StringWriter writer = createStringWriter();
            // Returns the string buffer
            StringBuffer stringBuffer = writer.getBuffer();
            System.out.println("StringBuffer: " + stringBuffer);

            // Returns the string buffer in string form
            String string = writer.toString();
            System.out.println("String: " + string);

            writer.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void load(){
        createStringWriter();
        accessDataFromStringBuffer();
    }

    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        writer.load();
    }
}
