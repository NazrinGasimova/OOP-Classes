public class ex2 {
    public static void main(String[] args) {
        int[] arr = {12 ,4 ,0 ,48};
        try {
            int ans=arr[1]/arr[2];
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException. u can not use zero as a divisor");
        }
    }
}