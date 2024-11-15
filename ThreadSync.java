class Printer{
        synchronized void printing(char a){
            for(int i=0;i<10;i++){
                for(int j=0;j<i;j++){
                    System.out.print(a);
                }
                System.out.println();
            }
    }
}


class Star extends Thread{
    Printer p;
    Star(Printer p){
        this.p=p;
    }
    
    public void run(){
        p.printing('*');
    }
}

class Hash extends Thread{
    Printer p;
    Hash(Printer p){
        this.p=p;
    }
    
    public void run(){
        p.printing('#');
    }
}

public class ThreadSync {

    public static void main(String[] args) {
        Printer p = new Printer();

        Hash h = new Hash(p);
        Star s = new Star(p);

        s.start();
        h.start();
    }
}