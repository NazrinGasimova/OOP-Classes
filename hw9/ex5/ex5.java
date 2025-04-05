import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
            if (input == 47) {
                throw new InvalidInputException("47 can not be used! try another one,bro !");
            }

        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("NUMBER!");
        }
        scanner.close();
    }
}
