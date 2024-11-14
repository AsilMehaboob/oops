import java.util.Scanner;

class Employee{
    String name;
    int age;


    void printage()
    {
        System.out.println("Age: "+age);
    }
}

class Officer extends Employee{
    String specialization;
}

class Manager extends Officer{
    String department;
}

public class Inheritance {
    public static void main(String[] args) {
        Manager mg = new Manager();

        mg.name="Asil";
        mg.age=19;
        mg.specialization="Specialization";
        mg.department="Dept";
        System.out.println(mg.name+" "+mg.specialization);
        mg.printage();
    }    
}
