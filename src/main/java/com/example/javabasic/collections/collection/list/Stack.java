package com.example.javabasic.collections.collection.list;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Stack extends Vector {

    public java.util.Stack<String> createStack(){
        java.util.Stack<String> stack = new java.util.Stack<>();
        return stack;
    }

    public java.util.Stack<String> pushElement(){
        java.util.Stack<String> stack = createStack();
        stack.push("Java");
        stack.push("Javascript");
        stack.push("Python");
        stack.push("Go");
        stack.push("Php");
        return stack;
    }

    public String popAnElementFormStack(){
        java.util.Stack<String> stack = pushElement();
        String element = "";
        if(!stack.isEmpty()){
            element = stack.pop();
        }
        return element;
    }

    public String peekAnElement(){
        java.util.Stack<String> stack = pushElement();
        String element = "";
        if(!stack.isEmpty()){
            element = stack.peek();
        }
        return element;
    }

    public String searchPositionOfAStack(){
        Scanner scanner = new Scanner(System.in);
        java.util.Stack<String> stack = pushElement();
        int pos = 0;
        try{
            if(!stack.isEmpty()){
                System.out.print("Input element that you want to search a position: ");
                String element = scanner.next();
                pos = stack.search(element);
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println(inputMismatchException.getMessage());
        }
        catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return "Position: " + pos;
    }

    public void popElementsFromStack(){
        try{
            java.util.Stack<String> stack = pushElement();
            while (!stack.isEmpty()){
               String elements = stack.pop();
               System.out.println("Pop: " + elements);
            }
            System.out.println(stack);
        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public void load(){
        popElementsFromStack();
        System.out.println(searchPositionOfAStack());
        System.out.println(popAnElementFormStack());
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.load();
    }
}
