import java.util.Scanner;

public class StudentMarks {
     int numOfStudents;
     int stuGrades[];

     String checkGrades(int numOfStudents, int[] stuGrades) {

         int i;
         String string="";
         try {
             for (i = 0; i < numOfStudents; i++) {
                 if (stuGrades[i] < 0 || stuGrades[i] > 100)
                     throw new Exception(" grade not in range " + stuGrades[i]);
             }
         }
         catch (Exception e){
             return(e.getMessage());
         }
             return null;

     }

    public static void main(String[] args) throws Exception {
         StudentMarks studentMarks= new StudentMarks();
        String str="";
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number of students");
        int numOfStudents= scanner.nextInt();
        int stuGrades[] = new int[numOfStudents];
        System.out.println("enter the grade");
        int i;
        for(i=0;i<numOfStudents;i++) {
            System.out.println("enter the grade of " + (i + 1));
            stuGrades[i] = scanner.nextInt();
        }
        str =studentMarks.checkGrades(numOfStudents, stuGrades);
        System.out.println(str);



        }

    }

