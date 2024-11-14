abstract class Marks{
    abstract void getPercentage();
}

class A extends Marks{
    int a,b,c;
    public A(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void getPercentage(){
        double result=((a+b+c)/30.0)*100;
        System.out.println(result+"% is for A");
    }
}

class B extends Marks{
    int a,b,c,d;
    public B(int a,int b,int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    void getPercentage(){
        double result=((a+b+c+d)/40.0)*100;
        System.out.println(result+"% is for B");
    }
}

public class MarkInherit{
    public static void main(String args[]){
        A a =new A(5,6,7);
        B b = new B(5,6,7,8);

        a.getPercentage();
        b.getPercentage();
    }
}