import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        Random rand=new Random();
        int a=rand.nextInt(101);
        System.out.print("Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        int[] numbers=new int[101];
        int i=0;
        while(true){
            System.out.print("Enter a number: ");
            int n=scanner.nextInt();
            numbers[i++]=n;
            if(n<a){
                System.out.println("Your number is too small. Please, try again.");
            }else if(n>a){
                System.out.println("Your number is too big. Please, try again.");
            }else{
                System.out.printf("Congratulations, %s!\n",name);
                break;
            }
        }
        System.out.printf("Numbers that entered by %s (in a sorted way): ",name);
        int[] sortednumbers = Arrays.copyOf(numbers, i);
        Arrays.sort(sortednumbers);
        for (int j = i-1;j>=0;j--) System.out.print(sortednumbers[j]+" ");
    }
}