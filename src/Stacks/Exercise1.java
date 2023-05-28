package Stacks;

import java.util.Scanner;
import java.util.Stack;

// Reverse String: Implement a program that takes a string as input and uses a stack to 
// reverse the order of characters in the string. For example, if the input is "Hello", 
// the program should output "olleH".

public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare the Stack that can store Strings
        Stack<String> stack = new Stack<>();

        // Enter the string
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        // Reverse the String
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        stack.push(reversed);

        // Print the Stack
        System.out.println(stack);

    }
}
