package LinkedList;

import java.util.LinkedList;

public class Exercise1 {

    // Create a Linked List: Write a Java program to create a singly linked list and implement methods to insert 
    // elements at the beginning, end, and specific positions within the list. Test your implementation by inserting 
    // different elements and printing the updated list.
    
    public static void main(String[] args) {
        
        // Create a Linked List
        LinkedList box = new LinkedList<>();
        
        // Insert elements at the beginning
        box.addFirst("1");
        box.addFirst("2");
        box.addFirst("4");
        box.addFirst("5");
        box.addFirst("6");
        
        // Insert elements at the end
        box.addLast("7");
        box.addLast("8");
        box.addLast("9");
        
        // Insert element at a specific position
        box.add(3, "3");
        
        // Print the list
        System.out.println("Linked List: " + box);

    }

}
