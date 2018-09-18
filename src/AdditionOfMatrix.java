import java.util.Scanner;

public class AdditionOfMatrix {
    int row;
    int col;
    int arr[][];

     int[][] calculateSum(int row, int col, int A[][], int B[][]){
        int i, j;
        int[][] sum= new int[row][col];

        for(i=0;i<row;i++) {
            for (j = 0; j < col; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;

    }

    public static void main(String[] args) {

        int row, col,i,j;
        AdditionOfMatrix additionOfMatrix= new AdditionOfMatrix();
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number of rows");
        row= scanner.nextInt();
        System.out.println("enter the number of cols");
        col= scanner.nextInt();
        int A[][]= new int[row][col];
        int B[][]= new int[row][col];
        int C[][]= new int[row][col];
        System.out.println("enter the array A");
        for(i=0;i<row;i++)
            for(j=0;j<col;j++)
            {
             A[i][j] = scanner.nextInt();
            }

        System.out.println("enter the array B");
        for(i=0;i<row;i++)
            for(j=0;j<col;j++)
            {
                B[i][j]= scanner.nextInt();
            }
            C = additionOfMatrix.calculateSum(row, col, A, B);
        System.out.println("the array C is");
        for(i=0;i<row;i++) {
            System.out.println();
            for (j = 0; j < col; j++) {
                System.out.print(C[i][j]+ " ");
            }
        }

    }

}
