import java.util.Scanner;

public class Stack {

    int top=-1;
    int size;
    int[] stack;;
    public Stack(int size){
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
    void display(){
        if(top==-1){
            System.out.println("Stack Underflow: ");
        }
        else{
        for(int i=0;i<=top;i++){
            
            System.out.print(stack[i]+"\t");
        }
    }
    }
     int peak(){
        return stack[top];
     }


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Stack Size: ");
        int n = sc.nextInt();

        Stack st = new Stack(n);

        

        while(true){
            System.out.println("1.Push 2.Pop 3.Peak 4.Display");
            System.out.print("Enter Choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Data to be inserted:");
                    int data = sc.nextInt();
                    st.push(data);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    int peaked=st.peak();
                    System.out.println("Top is: "+peaked);
                    break;
                case 4:
                    st.display();
                    break;
                default:
                    
                    return;
            }
        }
     }
}
