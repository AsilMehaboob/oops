import java.util.Scanner;

public class BinarySearch {
    static int Search(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        int mid;

        while(left<=right){
            mid=(left+right)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER SIZE OF THE ARRAY: ");
        int size=sc.nextInt();
        System.out.println("ENTER TARGET: ");
        int target=sc.nextInt();

        int arr[] =new int[size];

        System.out.println("ENTER THE ARRAY: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int result=Search(arr, target);

        if(result != -1){
            System.out.println("ELEMENT FOUND AT: "+(result+1));
        }
        else{
            System.out.println("NOT FOUND");
        }
    }
    }
