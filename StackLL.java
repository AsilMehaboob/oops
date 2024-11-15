import java.util.Scanner;

// Node class for the linked list
class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node in the stack

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class implemented using a linked list
class StackUsingLinkedList {
    private Node top; // Top of the stack

    // Constructor
    public StackUsingLinkedList() {
        this.top = null; // Initially, the stack is empty
    }

    // Push operation: Add an element to the top of the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top; // Point the new node's next to the current top
        top = newNode; // Update the top to the new node
        System.out.println("Pushed: " + value);
    }

    // Pop operation: Remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow: Cannot pop from an empty stack");
        }
        int poppedValue = top.data; // Get the value at the top
        top = top.next; // Move the top to the next node
        return poppedValue;
    }

    // Peek operation: Return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty: Cannot peek");
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        System.out.print("Stack elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class to implement the menu
public class StackLL {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check if Empty");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter value to push: ");
                        int value = scanner.nextInt();
                        stack.push(value);
                        break;
                    case 2:
                        int poppedValue = stack.pop();
                        System.out.println("Popped: " + poppedValue);
                        break;
                    case 3:
                        System.out.println("Peek: " + stack.peek());
                        break;
                    case 4:
                        stack.display();
                        break;
                    case 5:
                        System.out.println("Is stack empty? " + stack.isEmpty());
                        break;
                    case 6:
                        System.out.println("Exiting program...");
                        scanner.close();
                        return; // Exit the program
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
