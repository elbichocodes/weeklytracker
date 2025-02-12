import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        // Define variables
        int bet;
        int payout;
        boolean playAgain = true;
        String[] spinning = {"⭐", "🍋", "🍒", "🍉", "🍌"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************");
        System.out.println("    Welcome User   ");
        System.out.println("*******************");
        System.out.println("THE JAVA SLOT MACHINE ⭐🍋🍒🍉🍌");

        // Ask to begin game (only once at the start)
        System.out.print("To Begin.....press (Y/N): ");
        String beginGame = scanner.nextLine().toUpperCase();

        while (!beginGame.equals("Y") && !beginGame.equals("N")) {
            System.out.print("Invalid input. Please enter (Y/N): ");
            beginGame = scanner.nextLine().toUpperCase();
        }

        if (beginGame.equals("N")) {
            System.out.println("Thank you for Playing! Goodbye.");
            return; // Exit game immediately
        }

        while (playAgain) {
            int balance = 100; // Reset balance when replaying

            // Main game loop
            while (balance > 0) {
                System.out.println("Your Current Balance: $" + balance);
                System.out.print("Please place your bet: $");

                // Validate bet input
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid bet amount.");
                    scanner.next(); // Consume invalid input
                }
                bet = scanner.nextInt();
                scanner.nextLine(); // Consume leftover newline

                if (bet < 0 || bet > balance) {
                    System.out.println("Invalid bet. Cannot be negative or more than balance.");
                    continue;
                }

                System.out.println("Bet Received... Spinning...");
                String[] result = spinSlot(spinning);

                System.out.println("***************");
                System.out.println(result[0] + " | " + result[1] + " | " + result[2]);
                System.out.println("***************");

                payout = calculatePayout(bet, result);
                balance += payout;

                if (payout > 0) {
                    System.out.println("You won: $" + payout);
                } else {
                    System.out.println("You have lost....");
                    balance -= bet;
                }
            }

            // If balance is 0, ask to reload
            System.out.println("You are out of balance!");
            System.out.print("Do you want to play again with a new balance? (Y/N): ");

            String choice = scanner.nextLine().toUpperCase();

            while (!choice.equals("Y") && !choice.equals("N")) {
                System.out.print("Invalid input. Please enter (Y/N): ");
                choice = scanner.nextLine().toUpperCase();
            }

            if (choice.equals("N")) {
                playAgain = false;
                System.out.println("Thank you for Playing! Goodbye.");
            }
        }

        scanner.close();
    }

    // Method to generate slot spin results
    static String[] spinSlot(String[] spinning) {
        Random random = new Random();
        String[] result = new String[3];

        for (int i = 0; i < 3; i++) {
            result[i] = spinning[random.nextInt(spinning.length)];
        }
        return result;
    }

    // Method to calculate payout
    static int calculatePayout(int bet, String[] result) {
        if (result[0].equals(result[1]) && result[1].equals(result[2])) {
            System.out.println("JACKPOT! 🎉 You hit three " + result[0] + "s!");
            return switch (result[0]) {
                case "⭐" -> bet * 20;
                case "🍉" -> bet * 15;
                case "🍒" -> bet * 10;
                case "🍋" -> bet * 5;
                case "🍌" -> bet * 2;
                default -> 0;
            };
        }
        return 0; // Lost
    }
}
