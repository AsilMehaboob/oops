import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PalindromeFile {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input);
        FileWriter fw = new FileWriter("palindrome.txt");
        while(st.hasMoreTokens()){
            int token = Integer.parseInt(st.nextToken());
            int rev=0,rem;
            int num=token;
            while(token!=0){
                rem=token%10;
                rev=rev*10+rem;
                token=token/10;
            }
            if(rev==num){
                fw.write(num+"\n");
            }

            
        }

        fw.close();


        BufferedReader br = new BufferedReader(new FileReader("palindrome.txt"));

        String line;

        while((line=br.readLine())!=null){
            int num = Integer.parseInt(line);
            int sum=0;
            int temp=num;

            while(num!=0){
                sum=sum+(num%10);
                num=num/10;
            }
                System.out.println("Sum of " +temp + " is "+sum);
            }

        }
    
}
