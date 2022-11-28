package com.example.javabasic.iostreams.input;

import java.io.IOException;
import java.io.InputStream;

public class FileInputStream extends InputStream {

    private static final String PATH = "text.txt";

    @Override
    public int read() throws IOException {
        return 0;
    }

    public void readFileInputStream(){
        java.io.FileInputStream input;
        try{
            input = new java.io.FileInputStream(PATH);
            System.out.print("Data in the file: ");
            int i = input.read();
            while (i != -1){
                System.out.print((char)i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getStackTrace());
        }
        System.out.println();
    }

    public void getAvailableFileInputStream(){
        InputStream file;
        try{
            file = new java.io.FileInputStream(PATH);
            System.out.println("Available: " + file.available());
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getStackTrace());
        }
    }

    public void skipFileInputStream(){
        InputStream file;
        try {
            file = new java.io.FileInputStream(PATH);
            file.skip(6);
            System.out.print("File skip: ");
            int i = file.read();
            while (i != -1){
                System.out.print((char)i);
                i = file.read();
            }
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
        System.out.println();
    }

    public void load(){
       readFileInputStream();
       getAvailableFileInputStream();
       skipFileInputStream();
    }

    public static void main(String[] args) {
        FileInputStream fileInputStream = new FileInputStream();
        fileInputStream.load();
    }
}
