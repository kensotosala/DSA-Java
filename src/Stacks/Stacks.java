package Stacks;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        // stack = LIFO data structure. Last-In First-Out
        // stores objects into a sort of 'vertical tower'
        // push() to add to the top
        // pop() to remove from the top
        // peek()
        // empty()
        // search()

        // --- Uses for stacks ---
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)
        // Declare the Stack that can store Strings
        Stack<String> stack = new Stack<>();

        // Check if the stack is empty
        System.out.println("\nChecking if the Stack is empty: ");
        System.out.println(stack.empty());

        // Add games to the stack
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        // Check the top item on the Stack
        System.out.println("\nChecking the top item on the Stack");
        System.out.println(stack.peek());
        System.out.println(stack + "\n");

        // Search an item in the stack
        System.out.println("The postion fo the element is: " + stack.search("FFVII"));

        // Search for an item that don't exist
        System.out.println("The postion fo the element is: " + stack.search("Clash Royale"));

        // Check if the stack is empty again
        System.out.println("\nChecking if the Stack is empty: ");
        System.out.println(stack.empty());

        System.out.println(stack);

        // Remove the top item of the Stack
        stack.pop(); // Remove FFVII
        System.out.println(stack);

        stack.pop(); // Remove Borderlands
        System.out.println(stack);

        stack.pop(); // Remove DOOM
        System.out.println(stack);

        stack.pop(); // Remove Skyrim
        System.out.println(stack);

        // Store the value
        String myFavGame = stack.pop(); // Remove Minecraft
        System.out.println("My favorite game is " + myFavGame);

        // Print all of the objects of the Stack
        System.out.println(stack);
    }
}
