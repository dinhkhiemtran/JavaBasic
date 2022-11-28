package com.example.javabasic.iostreams.input;

import com.example.javabasic.iostreams.output.Dog;
import com.example.javabasic.iostreams.output.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ObjectInputStream extends InputStream {

    private static final String PATH ="file.txt";

    private static final String PATH1 = "dog.txt";

    @Override
    public int read() throws IOException {
        return 0;
    }

    public void createAnObjectInputStream(){
        try{
            FileInputStream fileInputStream = new FileInputStream(PATH);
            java.io.ObjectInputStream inputStream = new java.io.ObjectInputStream(fileInputStream);
            //Using the readInt() method
            System.out.println("Integer data :" + inputStream.readInt());

            // Using the readObject() method
            System.out.println("String data: " + inputStream.readObject());

            inputStream.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void readObjectDog(){
        try{
            FileInputStream fileInputStream = new FileInputStream(PATH1);

            java.io.ObjectInputStream inputStream = new java.io.ObjectInputStream(fileInputStream);

            Dog newDog = (Dog) inputStream.readObject();
            System.out.println("Dog Name: " + newDog.getName());
            System.out.println("Dog Breed: " + newDog.getBreed());
            inputStream.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public void load(){
        createAnObjectInputStream();
        readObjectDog();
    }

    public static void main(String[] args) {
       ObjectInputStream objectInputStream = new ObjectInputStream();
       objectInputStream.load();
    }
}
