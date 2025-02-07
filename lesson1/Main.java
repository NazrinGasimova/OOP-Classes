import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int check(Scanner scanner){
        int input;
        while(true){
            if(scanner.hasNextInt()){
                input= scanner.nextInt();
                if(input>=1 && input<=5){
                    return input;
                }else{
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                }
            }else{
                System.out.println("Invalid input. Please enter a number!");
            }
        }
    }
    public static void main(String[] args) {
        char[][] field=new char[5][5];
        int tr,tc;
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        tr=random.nextInt(5);
        tc=random.nextInt(5);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                field[i][j]='-';
            }
        }
        System.out.println("All set. Get ready to rumble!");
        while(true){
            System.out.print("Enter row: ");
            int r=check(scanner)-1;
            System.out.print("Enter column: ");
            int c=check(scanner)-1;
            if(r==tr && c==tc){
                field[r][c]='x';
                System.out.println("Last Version of Field: ");
                for(int i=0;i<5;i++){
                    for(int j=0;j<5;j++){
                        System.out.print(field[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("You have won!");
                break;
            }else{
                field[r][c]='*';
                System.out.println("Field: ");
                for(int i=0;i<5;i++){
                    for(int j=0;j<5;j++){
                        System.out.print(field[i][j]);
                    }
                    System.out.println();
                }
            }
        }
        scanner.close();
    }
}