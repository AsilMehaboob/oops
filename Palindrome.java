import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");

        String str = sc.nextLine();
        char r;
        String rev="";
        int l=str.length();
        for(int i = l-1;i>=0;i--)
        {
            r=str.charAt(i);
            rev= rev +r;
        }

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}