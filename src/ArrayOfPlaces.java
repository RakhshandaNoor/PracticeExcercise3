import java.util.Scanner;

public class ArrayOfPlaces {

    String[] removeVowelsFromPlaces(String[] names, int length){
        String[]  namesWOVowels= new String[length];
        int i,j;
        for(i=0;i<names.length;i++){
            namesWOVowels[i]= names[i].replaceAll("[aeiou]","");
        }
        return namesWOVowels;
    }

    public static void main(String[] args) {
        ArrayOfPlaces arrayOfPlaces = new ArrayOfPlaces();
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number of places");
        int n=  scanner.nextInt();
        scanner.nextLine();
        String[] names= new String[n];
        System.out.println("enter the places");
        for(int i=0;i<n;i++)
        names[i]= scanner.nextLine();

        String[] ret= arrayOfPlaces.removeVowelsFromPlaces(names,n);
        for(int i=0;i<n;i++)
        System.out.println(ret[i]);


    }
}
