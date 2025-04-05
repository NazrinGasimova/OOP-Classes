
public class ex1 {
    public static void main(String[] args) {
        try {
            int[] arr = {3, 4, 0};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException. Check the index u wrote");
        }
    }
}