import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {

    static int partition(String str[],int first,int last){
        String pivot = str[last];
        int i=first-1;

        for(int j=first;j<last;j++){
            if(str[j].compareTo(pivot)<=0){
                i++;
                String temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }

        String temp=str[i+1];
        str[i+1]=str[last];
        str[last]=temp;

        return i+1;
    }

    static void sort(String str[],int first,int last){
        if(first<last){
        int index=partition(str, first, last);
        sort(str, first, index-1);
        sort(str, index+1, last);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = new String[5];
        
        System.out.println("Enter the Names: ");
        for(int i=0;i<5;i++){
            str[i]=sc.nextLine();
        }
        sort(str,0,4);
        System.out.println("Sorted Names are: ");
        for(int i=0;i<5;i++){
            System.out.println(str[i]);
        }

    }
}