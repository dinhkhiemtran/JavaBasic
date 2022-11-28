package com.example.javabasic.iostreams.output;

import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream extends OutputStream {

    private static final String PATH = "text.txt";

    private static final String DATA = "Hello World";

    @Override
    public void write(int b) throws IOException {

    }

    public void createAFileOutputStream() {
        try {
            java.io.FileOutputStream output = new java.io.FileOutputStream(PATH);
            byte[] array = DATA.getBytes();
            output.write(array);
            output.close();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void flushFileOutputStream() {
        try {
            java.io.FileOutputStream output = new java.io.FileOutputStream("flush.txt");
            output.write(DATA.getBytes());
            // Using the flush() method
            output.flush();
            output.close();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void load() {
        createAFileOutputStream();
        flushFileOutputStream();
    }

    public static void main(String[] args) {
        FileOutputStream fileOutputStream = new FileOutputStream();
        fileOutputStream.load();
    }
}
