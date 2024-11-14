class MyException extends Exception{
    public MyException(String s)
        {
            super(s);
        }
}
public class ExceptionHandling {
    static void testfunction()
    {
        try{
            System.out.println("i will no throw an exception");
            throw new MyException("This is an Exception");
        }
        catch(MyException e){
            System.out.println("Caught Exception: "+e);
        }
    }

    static void test2() throws MyException{
        System.out.println("Throws Exception");
        throw new MyException("Another Exception");
    }
        public static void main(String[] args) {
        testfunction();
        
        try {
            test2();
        } catch (MyException e) {
            System.out.println("Caught Exception from test2: " + e);
        }
    }
}  