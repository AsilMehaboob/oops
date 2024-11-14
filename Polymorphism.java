abstract class Shape{
    abstract void number();
}


class Rectangle extends Shape{
    void number(){
        System.out.println("4");
    }
}
class Triangle extends Shape{
    void number(){
        System.out.println("3");
    }
}
class Hexagon extends Shape{
    void number(){
        System.out.println("6");
    }
}


public class Polymorphism{
    public static void main(String[] args) {
        Shape a = new Rectangle();
        Shape b = new Triangle();
        Shape c = new Hexagon();

        a.number();
        b.number();
        c.number();
    }
}