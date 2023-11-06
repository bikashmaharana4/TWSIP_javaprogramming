import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int attempts = 0;
        boolean hasGuessed = false;

        System.out.println("Welcome to the Number Guessing Game! Guess a number between 1 and 100.");

        while (!hasGuessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                hasGuessed = true;
                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts!");
            } else if (guess < secretNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        scanner.close();
    }
}
