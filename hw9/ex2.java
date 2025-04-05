public class ex2 {
    public static void main(String[] args) {
        try{
            int [] arr={3,4,0};
            System.out.println(arr[3]);
            System.out.println(arr[1]/arr[2]);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException. Check the index u wrote");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException. u can not use zero as a divisor");
        }
    }
}
