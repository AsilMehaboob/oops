interface Salary{
    void salary();
}

class Normal implements Salary{
                                
    int salary;

    public Normal(int salary){
        this.salary=salary;
    }

    public void salary(){
        System.out.println("Salary is "+salary);
    }
}

class Bonus implements Salary{

    int salary,bonus;

    public Bonus(int salary,int bonus){
        this.salary=salary;
        this.bonus=bonus;
    }

    public void salary(){
        System.out.println("Salary is "+(salary+bonus));
    }
}

class CreditLimitException extends Exception{
    public CreditLimitException(String msg){
        super(msg);
    }
}

class Account{
    int credit;
    public Account(int credit){
        this.credit=credit;
    }

    public void Withdraw(int amount) throws CreditLimitException{
        if(amount>credit)
            throw new CreditLimitException("Not Possible for Withdrawl");
        else
            System.out.println("Withdrawl Possible");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Normal n = new Normal(10000);
        Bonus b = new Bonus(10000,2000);

        b.salary();
        n.salary();

        Account a = new Account(100000);
        try{
            a.Withdraw(5000000);
        }
        catch(CreditLimitException e){
            System.out.println(e.getMessage());
        }
    }
}