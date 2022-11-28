package com.example.javabasic.iostreams.output;

import java.io.*;
import java.io.FileOutputStream;

public class ObjectOutputStream extends OutputStream {

    private static final String PATH = "file.txt";

    private static final int DATA1 = 5;

    private static final String DATA2 = "Hello World";

    @Override
    public void write(int b) throws IOException {

    }

    public void createAnObjectOutputStream(){
        try{
            FileOutputStream inputStream = new FileOutputStream(PATH);
            java.io.ObjectOutputStream outputStream = new java.io.ObjectOutputStream(inputStream);
            outputStream.writeInt(DATA1);
            outputStream.writeObject(DATA2);
            outputStream.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void createAnObjectOfDog(){
        // Creates an object of Dog class
        Dog dog = new Dog("Tyson", "Labrador");

        try {
            FileOutputStream file = new FileOutputStream(PATH);

            // Creates an ObjectOutputStream
            java.io.ObjectOutputStream output = new java.io.ObjectOutputStream(file);

            // Writes objects to the output stream
            output.writeObject(dog);

            FileInputStream fileStream = new FileInputStream("file.txt");

            // Creates an ObjectInputStream
            ObjectInputStream input = new ObjectInputStream(fileStream);

            // Reads the objects
            Dog newDog = (Dog) input.readObject();

            System.out.println("Dog Name: " + newDog.name);
            System.out.println("Dog Breed: " + newDog.breed);

            output.close();
            input.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getStackTrace());
        }
    }

    public void load(){
        createAnObjectOutputStream();
        createAnObjectOfDog();
    }

    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream();
        objectOutputStream.load();
    }
}

