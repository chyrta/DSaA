package com.chyrta.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverserApp {

    public static void main(String[] args) throws IOException{

        String input, output;
        while (true) {
            System.out.println("Please, enter your string2reverse: ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;

            Reverser ourReverser = new Reverser(input);
            output = ourReverser.doReverse();
            System.out.println(output);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferReader = new BufferedReader(streamReader);
        String s = bufferReader.readLine();
        return s;
    }

}
