package Stacks;

import java.util.Stack;

public class Exercise2 {
    
    // 2. Write a Java program to sort the elements of a given stack in ascending
    // order.

    public static void main(String[] args) {
        // Define the Stack
        Stack<Integer> numbers = new Stack<>();

        // Push elementos to the Stack
        numbers.push(105);
        numbers.push(57);
        numbers.push(162);
        numbers.push(65);
        numbers.push(132);
        numbers.push(108);

        // Stack before sorting
        System.out.println("Stack before sorting: " + numbers);

        // Call the method to sort
        sortNumbers(numbers);

        // Stack after sorting
        System.out.println("Stack after sorting: " + numbers);

    }

    // Method to sort
    // Receive Stack numbers as an argument
    public static void sortNumbers(Stack<Integer> numbers) {
        // Define a tempt stack
        Stack<Integer> tempStack = new Stack<>();

        // While that stop when numbers is full
        while (!numbers.isEmpty()) {
            int temp = numbers.pop(); // Store the top value temporally

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                numbers.push(tempStack.pop());
            }

            // Push the value to tempStack
            tempStack.push(temp);
        }

        // Copy the sorted elements back to the original stack
        while (!tempStack.isEmpty()) {
            numbers.push(tempStack.pop());
        }
    }

}
