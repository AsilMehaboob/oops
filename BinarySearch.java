import java.util.Scanner;

public class BinarySearch {

    static int search(int a[],int n,int target){
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]==target)
                return mid;
            else if(a[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();
        int n=search(a, 5, 3);

        if(n!=-1)
            System.out.println("Elemtn at"+n);
    }
}