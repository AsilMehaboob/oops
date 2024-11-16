import java.util.Scanner;;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cols for M1:");
        int c1 = sc.nextInt();
        System.out.println("Enter Rows for M1:");
        int r1 = sc.nextInt();
        System.out.println("Enter Cols for M2:");
        int c2 = sc.nextInt();
        System.out.println("Enter Rows for M2:");
        int r2 = sc.nextInt();

        if(c1==r2){
            int a[][] = new int[r1][c1];
            int b[][] = new int[r2][c2];
            int c[][] = new int[r1][c2];

            System.out.println("Enter the elements of First Matrix");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }

            System.out.println("Enter the elements of Second Matrix");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }

            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    for(int k=0;k<c1;k++)
                    {
                        c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                    }
                }
            }


            System.out.println("Resultant Matrix");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(c[i][j]+"\t");
                }
                System.out.println();
            }            
        }
        else
        {
            System.out.println("Not Possible");
        }
    }
}