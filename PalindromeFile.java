import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PalindromeFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String of Numbers: ");
        String str = sc.nextLine();
        FileWriter fw = new FileWriter("output.txt");
        StringTokenizer st =new StringTokenizer(str);
        int rem;
        
        while(st.hasMoreTokens()){
            
            int token = Integer.parseInt(st.nextToken());
            int temp=token;
            int rev=0;
            while(token!=0){
                
                rem=token%10;
                rev=(rev*10)+rem;
                token=token/10;
            }
                if(rev==temp){
                    fw.write(temp+"\n");
                }
            
        }
        fw.close();



        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
        String line;
        while((line=br.readLine())!=null){
            int num = Integer.parseInt(line);
            int temp=num;
            int sum=0;

            while(num!=0){
                sum=sum+(num%10);
                num=num/10;
            }
                System.out.println("Sum of "+temp+" is "+sum);
            
        }
    }
}