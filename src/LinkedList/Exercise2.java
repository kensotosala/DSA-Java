package LinkedList;

import java.util.LinkedList;

public class Exercise2 {

    // Reverse a Linked List: Implement a method that reverses a given linked list. 
    // You can do this iteratively or recursively. Write a Java program to create a 
    // linked list, reverse it, and print the reversed list.
    
    public static void main(String[] args) {
        // Create a Linked List
        LinkedList<Integer> box = new LinkedList<>();
        // Add items
        box.add(1);
        box.add(2);
        box.add(3);
        box.add(4);
        box.add(5);

        // List without modifications
        System.out.println(box);

        // Call the function
        reverseList(box);

        // Print the list
        System.out.println(box);

    }

    // Define the function
    public static void reverseList(LinkedList<Integer> box) {
        int size = box.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = box.get(i);
            box.set(i, box.get(size - 1 - i));
            box.set(size - 1 - i, temp);
        }
    }

}
