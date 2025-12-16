import java.util.Random;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int r = rnd.nextInt(100); 
        int attempts = 0; 

        System.out.println("I have chosen a number between 0 and 99. Try to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            int g = input.nextInt();
            attempts++;

            if (g == r) {
                System.out.println("Yes! You guessed it in " + attempts + " tries.");
                break;
            } else if (g > r) {
                System.out.println("Lower!");
            } else {
                System.out.println("Higher!");
            }
        }

        input.close();
    }
}
