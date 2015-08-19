package com.chyrta.Stack;

/**
 * Created by Dzmitry Chyrta on 19.08.15.
 */
public class Reverser {

    private String input;
    private String output;

    public Reverser(String in) {
        input = in;
    }

    public String doReverse() {
        int stackSize = input.length();
        StackX ourStack = new StackX(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            ourStack.push(ch);
        }

        output = "";
        while(!ourStack.isEmpty()) {
            char ch = ourStack.pop();
            output = output + ch;
        }

        return output;
    }

}
