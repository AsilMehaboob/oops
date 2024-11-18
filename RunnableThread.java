class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Hello This Is Runnable!");
    }
}


public class RunnableThread {

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();

        Thread t1 = new Thread(r);

        t1.start();
    }
}