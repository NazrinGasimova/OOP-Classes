public class ex3 {
    public static void recursiveMethod() {
        recursiveMethod();
    }
    public static void main(String[] args) {
        try {
            recursiveMethod();
        }
        catch (StackOverflowError e) {
            System.out.println("OOPS! Stack overflow error!");
        }
    }
}