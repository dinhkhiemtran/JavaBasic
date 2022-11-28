package com.example.javabasic.iostreams.output;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteArrayOutputStream extends OutputStream {

    private static final String DATA = "This is a line of text inside the string.";

    @Override
    public void write(int b) throws IOException {

    }

    public OutputStream createsAByteArrayOutputStream(){
        OutputStream outputStream = new java.io.ByteArrayOutputStream();
        return outputStream;
    }

    public void writeByteArrayOutputStream(){
        try{
            OutputStream output = createsAByteArrayOutputStream();
            byte[] array = DATA.getBytes();
            output.write(array);
            String streamData = output.toString();
            System.out.print("Output stream: " + streamData);
            output.close();
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getStackTrace());
        }
        System.out.println();
    }

    public void accessDataFromByteArrayOutputStream(){
        try{
            java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();

            // Writes data to the output stream
            outputStream.write(DATA.getBytes());

            // Returns an array of bytes
            byte[] array = outputStream.toByteArray();
            for (int i = 0 ; i < array.length; i++){
                System.out.print(array[i]);
                System.out.print(",");
            }

            // Returns a string
            String stringData = outputStream.toString();
            System.out.println("\nData using toString(): " + stringData);

            outputStream.close();
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public void load(){
        writeByteArrayOutputStream();
        accessDataFromByteArrayOutputStream();
    }

    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.load();
    }
}
