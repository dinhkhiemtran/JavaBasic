package com.example.javabasic.readerwriter.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriter extends Writer {

    private static final String DATA = "This is the data in the output file";

    private static final String PATH = "output.txt";

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {

    }

    @Override
    public void flush() throws IOException {
            // Creates a FileWriter
            FileWriter file = new FileWriter(" flush.txt");

            // Creates a BufferedWriter
            java.io.BufferedWriter output = new java.io.BufferedWriter(file);

            // Writes data to the file
            output.write(DATA);

            // Flushes data to the destination
            output.flush();
            System.out.println("Data is flushed to the file.");

            output.close();
        }


    @Override
    public void close() throws IOException {

    }

    public void createBufferWriter(){
        try {
            // Creates a FileWriter
            java.io.FileWriter file = new FileWriter(PATH);

            // Creates a BufferedWriter
            java.io.BufferedWriter output = new java.io.BufferedWriter(file);

            // Writes the string to the file
            output.write(DATA);

            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void load() throws IOException {
        createBufferWriter();
        flush();
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter();
        writer.load();
    }
}
