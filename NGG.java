import java.util.Scanner;
import java.util.Random;

public class NGG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        
        int a = 10;
        int sco = 0;
        int rep;
        System.out.println("this is a Number Guessing Game!");

    do{
         int ran= r.nextInt(100) ;
         System.out.println("I have  a number between 0 to 100. Can you guess the number? you have 10 attempts ");
            
            for (int i = 1; i <= a; i++) {
                System.out.print("Attempt " + i + ": Enter your guess: ");
                int g = scanner.nextInt();

                if (g == ran) {
                    System.out.println("Congratulations! You guesse is correct .");
                    sco += a - i + 1;
                    break;
                } else if (g< ran) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (i == a) {
                    System.out.println(" attempts over. The correct number is: " + ran);
                }
            }

                  System.out.print("do you want to play again? (press 1 for 'yes' and 2 for no): ");
            rep=scanner.nextInt();;
        } while (rep==1);

        System.out.println("Game over. Your total score is: " + sco);
        scanner.close();
    }
}
