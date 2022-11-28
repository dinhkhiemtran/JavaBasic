package com.example.javabasic.iostreams.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream extends InputStream {

    private static final String PATH = " buffer.txt";

    @Override
    public int read() throws IOException {
        return 0;
    }

    public void createABufferedInputStream() {
        try {
            FileInputStream file = new FileInputStream(PATH);
            if (file != null) {
                java.io.BufferedInputStream buffer = new java.io.BufferedInputStream(file);
                int i = buffer.read();
                while (i != -1) {
                    System.out.print((char) i);
                    i = buffer.read();
                }
                buffer.close();
            }else {
                System.out.println("Null");
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void load() {
        createABufferedInputStream();
    }

    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream();
        bufferedInputStream.load();
    }
}
