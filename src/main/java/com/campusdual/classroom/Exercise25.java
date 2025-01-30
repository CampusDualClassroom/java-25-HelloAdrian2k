package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");
        return stack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()) System.out.println(stack.pop());   // pop devuelve el valor que se elimina
    }

    public static void main(String[] args) {
        System.out.println("PILA CREADA:\n");
        printAndEmptyStack(createStack());
    }
}
