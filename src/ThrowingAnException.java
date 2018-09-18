public class ThrowingAnException {

    public static void main(String[] args) {
        try {
            throw new CustomException(" exception throwing from main");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("you were there");
        }
    }
}
