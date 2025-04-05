
public class ex4 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[Integer.MAX_VALUE];

        } catch (OutOfMemoryError e) {
            System.out.println(e.getMessage()+" ! Hey u used all of the memory !");
        }
    }
}