// Task-1 Number game
import java.util.Scanner;
import java.util.Random;

public class Main {
    // Defining max attempts
    private static final int maxAttempt = 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random play = new Random();
        boolean playchance;
        String username;

        System.out.println("Welcome to Number game!!");
        System.out.print("Enter your name: ");
        username = sc.nextLine();

        do {
            int systemguess = play.nextInt(100); // Correctly generates a number between 1 and 100
            int attempt = 0;
            boolean correctguess = false;

            System.out.println("I am your partner in this gaming journey,....\n ");
            System.out.println("RULES: \n I have selected a number between 1 and 100. Try to guess it. \n If you guessed the correct number within 7 attempts, you win; else you lose");

            System.out.println();
            System.out.println("ALL THE BEST " + username + "\n<<Have fun playing with me!!>>");

            while (attempt < maxAttempt && !correctguess) {
                System.out.print("Enter your guess: ");
                int userguess = sc.nextInt();
                attempt++;

                // Checking winning or losing conditions
                if (userguess < 1 || userguess > 100) {
                    System.out.println("Invalid number chosen!!! \n Please enter a number between 1 and 100");
                    System.out.println();
                    attempt--; // Don't count this as a valid attempt
                } else if (userguess > systemguess) {
                    System.out.println("Your choice is too high!!, Please try again " + username);
                    System.out.println();
                } else if (userguess < systemguess) {
                    System.out.println("Your choice is too low!!, Please try again " + username);
                    System.out.println();
                } else {
                    correctguess = true;
                    System.out.println("Congratulations!! " + username + ", you guessed the correct number");
                }

                if (attempt == maxAttempt && !correctguess) {
                    System.out.println("Sorry!! You used all your attempts to play...<<The number was " + systemguess + " >>");
                    System.out.println("Better luck next time " + username);
                }
            }

            // Calculating score based on attempts remaining
            int currentScore = (maxAttempt - attempt + 1) * 10; // Example scoring: 10 points for each remaining attempt
            if (correctguess) {
                System.out.println("Your score: " + currentScore);
            } else {
                System.out.println("Your score: 0");
            }

            // Asking for another play
            System.out.print("It's fun playing with you " + username + ", do you want to play again with me (Type yes or no)?? : ");
            String response = sc.next();
            playchance = response.equalsIgnoreCase("yes");
            System.out.println();
        } while (playchance);

        System.out.println("Thanks for playing with me!! " + username + "\nTo play again, click on run...\nGoodbye!!");
        sc.close();
    }
}
