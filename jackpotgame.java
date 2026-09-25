import java.util.Random;
import java.util.Scanner;

public class jackpotgame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int level;
        int maxNumber;
        int attempts = 10;

        System.out.println("===== JACKPOT GUESSING GAME =====");
        System.out.println("Choose your level:");
        System.out.println("1. Easy   (1-15)");
        System.out.println("2. Medium (1-30)");
        System.out.println("3. Hard   (1-100)");
        System.out.print("Enter level: ");
        level = sc.nextInt();

        if (level == 1) {
            maxNumber = 15;
        } else if (level == 2) {
            maxNumber = 30;
        } else if (level == 3) {
            maxNumber = 100;
        } else {
            System.out.println("Invalid level!");
            sc.close();
            return;
        }
        int jackpot = random.nextInt(maxNumber) + 1;

        System.out.println("\nGuess the jackpot number between 1 and " + maxNumber);
        System.out.println("You have " + attempts + " attempts.");

        for (int i = 1; i <= attempts; i++) {

            System.out.print("\nAttempt " + i + "/" + attempts);
            System.out.print("\nEnter your guess: ");
            int guess = sc.nextInt();

            if (guess == jackpot) {
                System.out.println("🎉 Congratulations!");
                System.out.println("You guessed the jackpot number!");
                System.out.println("You won in " + i + " attempt(s).");
                sc.close();
                return;
            } 
            else if (guess < jackpot) {
                System.out.println("Hint: The jackpot number is GREATER than " + guess);
            } 
            else {
                System.out.println("Hint: The jackpot number is SMALLER than " + guess);
            }
        }

        System.out.println("\nchal bhag yaha se ! You used all 10 attempts.");
        System.out.println("The jackpot number was: " + jackpot);

        sc.close();
    }
}
