package LinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // LinkedList = stores Nodes in 2 parts (data + address)
        // Nodes are in non-consecutive memory location
        // Elements are linked using pointers
        // Singly Linked List || Doubly Linked List
        // Advantages
        // 1. Dynamic Data Structure (allocates needed memory while running)
        // 2. Insertion and Deletion of Nodes is easy. O(1)
        // 3. No/Low memory waste
        // Create a Linked List
        LinkedList<String> linkedList = new LinkedList<String>();

        // Add Items
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // Delete Items
        // linkedList.pop(); // Removes and return the the first element
        
        // Add Items V2
        linkedList.offer("1");
        linkedList.offer("2");
        linkedList.offer("3");
        linkedList.offer("5");

        // Remove the head of our list
        // linkedList.poll();
        // Add 4 between 3 and 5
        linkedList.add(3, "4");

        // Remove a node
        linkedList.remove("4");

        // Search in the Linked List
        // System.out.println(linkedList.indexOf("2"));
        // Peek the head
        // System.out.println(linkedList.peekFirst());
        // Peek the tail
        // System.out.println(linkedList.peekLast());
        // Add the head
        linkedList.addFirst("0");

        // Add the tail
        linkedList.addLast("6");

        System.out.println(linkedList);

        // Remove the first node and store it
        String first = linkedList.removeFirst();
        System.out.println(first);

        // Remove the first node and store it
        String last = linkedList.removeLast();
        System.out.println(last);
    }

}
