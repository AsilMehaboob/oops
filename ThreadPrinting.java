import java.util.Scanner;

class ThreadPrinting{

    String str;
    
    class Print extends Thread{

        String str;
        Print(String str){
            this.str=str;
        }
        public void run(){ 
            if(str.compareTo("Hello World")<0){
                for(int i=0;i<100;i++) {
                    System.out.println(str);
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
        }
            else{
                System.out.println(str);
            }
    }
    }
    class Read extends Thread{
        public void run(){
            ThreadPrinting tp = new ThreadPrinting();
            
            
            System.out.print("Enter the String: ");
            Scanner sc = new Scanner(System.in);
            str=sc.nextLine();
            Print p = tp.new Print(str);
            p.start();

        }
    }

    public static void main(String[] args) {

        ThreadPrinting tp = new ThreadPrinting();
        String str="Hello World";
        Print p = tp.new Print(str);
        Read r = tp.new Read();

        p.start();
        r.start();


    }

}