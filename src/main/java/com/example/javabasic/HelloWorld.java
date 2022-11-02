package com.example.javabasic;

public class HelloWorld {

    private static final String GREETING = "Hello World";

    private void getGreeting(){
        System.out.println(GREETING);
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.getGreeting();
    }
}
