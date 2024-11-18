import java.io.FileWriter;
import java.util.Scanner;

public class StackFile {

    int top=-1;
    int stack[];
    int size;

    public StackFile(int size){
        this.size=size;
        this.stack=new int[size];
    }

    void push(int data){
        if(top==size-1)
            System.out.println("Stack Overflow");
        else{
            top++;
            stack[top]=data;
        }
    }
    void pop(){
        if(top==-1)
            System.out.println("Stack Underflow");
        else{
            int data=stack[top];
            System.out.println("Deleted item is: "+data);
            top--;
        }
    }
    void display() throws Exception{
        if(top==-1){
            System.out.println("Stack Underflow: ");
        }
        else{
        
        FileWriter fw = new FileWriter("outpu.txt");
        for(int i=0;i<=top;i++){
            
            System.out.print(stack[i]+"\t");
            fw.write(stack[i]+"\t");
        }
        fw.close();
    }
    
    }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        StackFile stack = new StackFile(size);


        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Push
                    System.out.print("Enter element to push: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                case 2: // Pop
                    stack.pop();
                    break;
                case 3: // Display
                    stack.display();
                    break;
                case 4: // Exit
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
