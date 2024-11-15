public class Garbage{
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mem1;
        System.out.println("Total Memory: "+ r.totalMemory());
        mem1=r.freeMemory();
        System.out.println("Initial Free Memory: "+mem1);
        r.gc();
        mem1=r.freeMemory();
        System.out.println("Final Free Memory: "+mem1);
    }
}