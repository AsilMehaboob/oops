import java.io.*;
import java.util.Scanner;

public class DLL {
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
        }
    }

    Node head,tail=null;

    public void addnode(int data){
        Node newnode = new Node(data);

        if(head==null){
            head=tail=newnode;
            head.prev=null;
            tail.next=null;
        }
        else{
            head.prev=newnode;
            newnode.next=head;
            newnode.prev=null;
            head=newnode;
        }
    }

    public void deletenodebegin(){
        if(head==null&&tail==null){ 
            System.out.println("EMPTY");
        }
        else if(head==tail){
            head=tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }

    public void deleteend(){
        if(head==null&&tail==null){ 
            System.out.println("EMPTY");
        }
        else if(head==tail){
            head=tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
    }

    public void deleteitem(int data){
        if(head==null&&tail==null){
            System.out.println("EMPTY");
        }
        else{
            Node temp = head;
            while(temp!=null){
                if(temp.data==data){
                    if(temp.prev!=null){
                        temp.prev.next=temp.next;
                        
                    }
                    else{
                        head=head.next;
                        

                    }
                    if (temp.next != null) {
                        temp.next.prev = temp.prev;
                    } else {
                        tail = temp.prev;
                        tail.next=null;
                    }
                }
            
                temp=temp.next;
            }
        }
    }
    public void display(){
        Node current = head;
        if(head==null){
            System.out.println("Empty");
        }
        else{
            while(current!=null){
                System.out.print(current.data + "->");
                current=current.next;
            }
            System.out.print("NULL");
        }
    }

    
    public static void main(String[] args) {
        DLL dll = new DLL();
        Scanner scanner = new Scanner(System.in);
        int choice, data;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add node at the beginning");
            System.out.println("2. Delete node from the beginning");
            System.out.println("3. Delete node from the end");
            System.out.println("4. Delete specific item");
            System.out.println("5. Display list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to add at the beginning: ");
                    data = scanner.nextInt();
                    dll.addnode(data);
                    break;
                case 2:
                    dll.deletenodebegin();
                    break;
                case 3:
                    dll.deleteend();
                    break;
                case 4:
                    System.out.print("Enter the data to delete: ");
                    data = scanner.nextInt();
                    dll.deleteitem(data);
                    break;
                case 5:
                    dll.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
