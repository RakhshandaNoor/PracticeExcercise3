public class GeneratingExceptions {

    public static void main(String[] args) {


        try{
//            int a[]= new int[-2];
//            int b[]= new int [5];
//            b[9]= 45;
            int c[]= null;
            for(int i=0;i<=c.length;i++)
            System.out.println(c[i]);

        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(NegativeArraySizeException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
