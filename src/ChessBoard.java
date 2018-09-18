import java.util.Scanner;

public class ChessBoard {

    public static void main(String[] args) {

        String white="WW|BB|";
        String black="BB|WW|";
        int i,j, size;
        System.out.println("enter the size of chess board");
        Scanner scanner= new Scanner(System.in);
        size=scanner.nextInt();

        for(i=0;i<size;i++){
            System.out.println();
           for(j=0;j<size/2;j++){
                if(i%2==0){
                    System.out.printf("%s",white);
                }
                else
                    System.out.printf("%s",black);
           }
        }

    }
}
