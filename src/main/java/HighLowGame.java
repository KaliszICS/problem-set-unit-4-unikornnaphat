import java.util.Scanner;
import java.util.Random;

public class HighLowGame
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
		System.out.println("Welcome to the High Low Guessing Game.");
		System.out.print("Input a number of rounds to play: ");
        int rounds = scanner.nextInt();

        int score = 0;
        
        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRound " + i + ":");
            System.out.println("Please select High, Low or Even:");
            System.out.println("1. High (11 to 20)");
            System.out.println("2. Low (0 to 9)");
            System.out.println("3. Even(10)");
            int choice = scanner.nextInt();

            int number = random.nextInt(21);
            boolean isCorrect = false;

            if (choice == 1 && number >= 11 && number <= 20) {
                isCorrect = true;
            } else if (choice == 2 && number >= 0 && number <= 9) {
                isCorrect = true;
            } else if (choice == 3 && number == 10) {
                isCorrect = true;
            }

            if (isCorrect) {
                score++;
                System.out.println("The number was " + number + ", You were correct.");
            } else {
                System.out.println("The number was " + number + ". You were incorrect.");
            }
            System.out.println("Current Score: " + score);
	}
	
	 System.out.println("\nTotal Score: " + score);
        System.out.println("Congratulations you got " + score + " out of " + rounds + " rounds right!");

        if (score >= rounds / 2.0) {
            System.out.println("Great job! You got more than half the guesses right!");
        } else {
            System.out.println("Better luck next time!");
        }

        scanner.close();
    }
}
