package com.example.javabasic.iostreams.input;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayInputStream extends InputStream {

    private static final byte[] array = {84,104,105,115,32,105,115,32,97,32,108,105,110,101,32,111,102,32,116,101,120,116,32,105,110,115,105,100,101,32,116,104,101,32,115,116,114,105,110,103,46};

    @Override
    public int read() throws IOException {
        return 0;
    }

    public void createAByteArrayInputStream(){
        try {
            java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(array);
            System.out.print("The bytes read from the input stream: ");
            for (int i = 0 ; i < array.length; i++){
                // Reads the bytes
                int data = inputStream.read();
                System.out.print((char)data);
            }
            inputStream.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void getAvailable(){
        try{
            java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(array);
            System.out.println("Available bytes at the beginning: " + inputStream.available());
            // Reads 2 bytes from the input stream
            inputStream.read();
            inputStream.read();

            // Returns the available number of bytes
            System.out.println("Available bytes at the end: " + inputStream.available());

            inputStream.close();
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getStackTrace());
        }
    }

    public void skipByteArrayInputStream(){
        try{
            java.io.ByteArrayInputStream input = new java.io.ByteArrayInputStream(array);

            // Using the skip() method
            input.skip(2);
            System.out.print("Input stream after skipping 2 bytes: ");

            int data = input.read();
            while (data != -1) {
                System.out.print(data + ", ");
                data = input.read();
            }

            // close() method
            input.close();
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getStackTrace());
        }
    }

    public void load(){
        createAByteArrayInputStream();
        getAvailable();
        skipByteArrayInputStream();
    }

    public static void main(String[] args) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
        byteArrayInputStream.load();
    }
}
