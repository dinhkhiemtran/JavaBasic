package com.example.javabasic.iostreams.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStream extends OutputStream {

    private static final String PATH = " buffer.txt";

    private static final String DATA = "Hello World";

    private static final String PATH1 = "flushBuffer.txt";

    @Override
    public void write(int b) throws IOException {

    }

    public void createABufferedOutputStream(){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(PATH);
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(fileOutputStream);
            byte[] array = DATA.getBytes();
            bufferedOutputStream.write(array);
            bufferedOutputStream.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void flushBufferedOutStream(){
        try {
            FileOutputStream file = new FileOutputStream(PATH);
            java.io.BufferedOutputStream buffer = new java.io.BufferedOutputStream(file);
            buffer.write(DATA.getBytes());
            buffer.flush();
            buffer.close();
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getStackTrace());
        }
    }

    public void load(){
        createABufferedOutputStream();
        flushBufferedOutStream();
    }

    public static void main(String[] args) {
        BufferedOutputStream buffer = new BufferedOutputStream();
        buffer.load();
    }
}
