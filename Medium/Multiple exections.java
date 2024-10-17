public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int result = 10 / 0;
            
       
            int[] arr = new int[3];
            arr[5] = 10;
            
            // NullPointerException
            String str = null;
            str.length();
            
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
        }
    }
}
