import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter Integers with one space gap");
        String s = sc.nextLine();

        StringTokenizer st = new StringTokenizer(s);

        while(st.hasMoreTokens()){
            String temp=st.nextToken();
            int num=Integer.parseInt(temp);
            System.out.print(num);
            sum=sum+num;
        }
        System.out.println("Sum is: "+sum);
    }
}
