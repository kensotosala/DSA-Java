package LinkedList;

import java.util.LinkedList;

public class Exercise3 {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Node<Integer>> box = new LinkedList<>();

        // Add items
        box.add(new Node<>(10));
        box.add(new Node<>(20));
        box.add(new Node<>(30));
        box.add(new Node<>(40));
        box.add(new Node<>(50));

        // Linked List Loop
        box.getLast().next = box.get(2);

        // Call the Method
        boolean hasLoop = detectLoop(box);

        // Print
        System.out.println("Has Loop: " + hasLoop);
        System.out.println(box);
    }

    // Create a detection method
    private static boolean detectLoop(LinkedList<Node<Integer>> box) {
        // Node references
        Node<Integer> slow = box.getFirst();
        Node<Integer> fast = box.getFirst();

        // While loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Node class representing the nodes of the linked list
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
        
        // Convert this code data to string
        @Override
        public String toString() {
            return data.toString();
        }
    }
}
