package com.example.javabasic.collections.collection.list;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Stack extends Vector {

    public <T> java.util.Stack<T> createAStack() {
        java.util.Stack<T> stack = new java.util.Stack<>();
        return stack;
    }

    public java.util.Stack<String> pushElements() {
        java.util.Stack<String> stack = createAStack();
        stack.push("Java");
        stack.push("Javascript");
        stack.push("Python");
        stack.push("Go");
        stack.push("Php");
        return stack;
    }

    public <T> java.util.Stack<T> popAnElement(java.util.Stack<T> stack) {
        try {
            if (stack != null) {
                if (!stack.isEmpty()) {
                    String element = (String) stack.pop();
                    System.out.println("Element is popped: " + element);
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return stack;
    }

    public <T> java.util.Stack<T> popAllElements(java.util.Stack<T> stack) {
        try {
            if (stack != null) {
                while (!stack.isEmpty()) {
                    String element = (String) stack.pop();
                    System.out.println("Element is popped: " + element);
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return stack;
    }

    public <T> String peekAnElement(java.util.Stack<T> stack) {
        String element = "";
        try {
            if (stack != null) {
                if (!stack.isEmpty()) {
                    element = (String) stack.peek();
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return element;
    }

    public <T> int searchAnElement(java.util.Stack<T> stack) {
        Scanner scanner = new Scanner(System.in);
        int pos = 0;
        try {
            if (stack != null) {
                if (!stack.isEmpty()) {
                    System.out.print("Input an element to search a position: ");
                    String element = scanner.next();
                    pos = stack.search(element);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return pos;
    }

    public <T> void print(java.util.Stack<T> stack){
        System.out.print("Stack: ");
        stack.forEach(elements -> System.out.print(elements + ", "));
        System.out.println();
    }

    public void load() {
        java.util.Stack<String> stack = pushElements();
        print(stack);
        System.out.println(peekAnElement(stack));
        System.out.println(searchAnElement(stack));
        System.out.println(popAnElement(stack));
        System.out.println(popAllElements(stack));
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.load();
    }
}
