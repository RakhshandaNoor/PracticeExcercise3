public class Consecutive7Num {

    boolean checkConsecutive(int[] numb){
        int i;
        int start= numb[0];
        for(i=1;i<numb.length;i++){
            if(Math.abs(numb[i]-start)!=i) {

                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {


    }
}
