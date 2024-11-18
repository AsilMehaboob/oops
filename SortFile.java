import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SortFile {

    static int[] num=new int[5];
    public static void main(String[] args) {
        System.out.println("Enter a String of Numbers:");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try{
            FileWriter fw = new FileWriter("string.txt");

            fw.write(str);

            fw.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }


        try{
            BufferedReader br = new BufferedReader(new FileReader("string.txt")); 

            String readstr=br.readLine();

            StringTokenizer st = new StringTokenizer(readstr);
            int i=0;
            
            while(st.hasMoreTokens()){
                
                int token=Integer.parseInt(st.nextToken());
                num[i]=token;
                
                System.out.println(num[i]);
                i++;
            }

            Arrays.sort(num);
            System.out.println("Sorted:");
            for(int j=0;j<=i;j++){
                System.out.print(num[j]+"\t");
            }

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    
    }
}
