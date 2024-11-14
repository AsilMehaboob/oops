import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {
        FileInputStream fis =null;
        FileOutputStream fout = null;

        
            try {
                fis = new FileInputStream("output.txt");
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            String data="";
            int ch;

            try {
                while((ch=fis.read())!=-1){
                    data+=(char)ch;
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println(data);

        String str = "hello asil";
        try (FileWriter fw = new FileWriter("out.txt")) {
            for(int i=0;i<str.length()-1;i++){
                fw.write(str.charAt(i));
            }
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try{
            Scanner sc = new Scanner(System.in);
            fout = new FileOutputStream("output.txt");
            System.out.print("Enter data:");
            String input = sc.nextLine();
            byte b[]=input.getBytes();
            fout.write(b);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        
    }
}