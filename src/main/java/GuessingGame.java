import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // TODO: Prompt the user with a welcome message
        Scanner sc = new Scanner(System.in);
        int guess;
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        Random rand = new Random();
        int setNum = rand.nextInt(100) + 1;
        // TODO: Use a do...while loop to read guesses until correct
        boolean run = true;
        do {
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();
            if (guess == setNum)
            {
                System.out.println("You got it!");
                run = false;
            }
            else if (guess < setNum)
            {
                System.out.println("Too low!  Try again.");
                run = true;
            }
            else
            {
                System.out.println("Too high!  Try again.");
                run = true;
            }
        } while (run);
        // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
        // TODO: Use Scanner for input
    }
}
