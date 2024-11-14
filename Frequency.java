import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter the String: ");
        String str=sc.nextLine();
        System.err.print("Enter the Character: ");
        char c=sc.next().charAt(0);

        int num=0;

        for(int i=0;i<str.length();i++)
        {
            if(c==str.charAt(i))
                {
                    num++;
                }
        }

        System.out.println(num + " is the Frequency");

    }
}
