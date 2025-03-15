import java.util.Scanner;

interface Checking {
    boolean check(int x);
}
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        int condition,n;
        for (int i=0;i<t;i++) {
            condition=scanner.nextInt();
            n = scanner.nextInt();
            if(condition==1){
                if(Lambda.isOdd().check(n)) System.out.println("ODD");
                else System.out.println("EVEN");
            }
            else if(condition==2){
                if(Lambda.isPrime().check(n)) System.out.println("PRIME");
                else System.out.println("COMPOSITE");
            }
            else if(condition==3){
                if(Lambda.isPalindrome().check(n)) System.out.println("PALINDROME");
                else System.out.println("NOT PALINDROME");
            }
        }
        scanner.close();
    }
}