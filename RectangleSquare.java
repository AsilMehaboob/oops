class Rectangle{
    int length;
    int breadth;

    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }

    public void area(){
        int area = length*breadth;
        System.out.println("Area of Rectangle: "+area);
    }

    public void perimeter(){
        int perimeter=2*(length+breadth);
        System.out.println("Perimeter of Rectangle: "+perimeter);
    }
}

class Square extends Rectangle{
    public Square(int side){
        super(side,side);
    }
    public void perimeter(){
        int perimeter = 4*breadth;
        System.out.println("Perimeter of Square is: "+perimeter);
    }
    public void area(){
        int area = length*breadth;
        System.out.println("Area of Square: "+area);
    }
}


public class RectangleSquare {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 7);
        Square s = new Square(5);

        r.perimeter();
        r.area();
        s.perimeter();
        s.area();
    }
}
