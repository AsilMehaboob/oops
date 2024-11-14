class Printer{
    synchronized void print(char ch){
        for(int i=0;i<10;i++)
            {
            for(int j=0;j<i;j++){
                System.out.print(ch);
            }
            System.out.println();
            }

    }
}

class Star extends Thread{
    Printer print;
    Star(Printer p){
        print=p;
    }
    public void run(){
        print.print('*');
    }
}

class Hash extends Thread{
    Printer print;
    Hash(Printer p){
        print=p;
    }
    public void run(){
        print.print('#');
    }
}


public class ThreadSync {

    public static void main(String[] args) {
        Printer pr=new Printer();

        Hash h= new Hash(pr);
        Star s = new Star(pr);

        s.start();
        h.start();
    }
}