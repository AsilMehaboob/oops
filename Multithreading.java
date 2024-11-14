import java.util.Random;

class RandomNumber extends Thread {
        public void run(){
            for(int i=0;i<10;i++){
                Random rd = new Random();
                int num=rd.nextInt(1,10);

                if((num%2)==0){
                    Square sq = new Square(num);
                    sq.start();
                }
                else{
                    Cube cb = new Cube(num);
                    cb.start();
                }

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
}
class Square extends Thread{

    int num;
    Square(int num){
        this.num=num;
    }

    public void run(){
        System.out.println(num + " | " + (num*num));
    }
}


class Cube extends Thread{

    int num;
    Cube(int num){
        this.num=num;
    }

    public void run(){
        System.out.println(num + " | " + (num*num*num));
    }
}


public class Multithreading {
    public static void main(String[] args) {
        RandomNumber rn = new RandomNumber();

        rn.start();
    }
}