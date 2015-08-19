package com.chyrta.Stack;

public class StackApp {

    public static void main(String[] args) {

        // Standard stack
        Stack freshStack = new Stack(10);
        freshStack.push(20);
        freshStack.push(40);
        freshStack.push(60);
        freshStack.push(80);

        while (!freshStack.isEmpty()) {
            long value = freshStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.print("");
    }

}
