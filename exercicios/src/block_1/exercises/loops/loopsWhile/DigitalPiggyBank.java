package block_1.exercises.loops.loopsWhile;

import java.util.Scanner;

public class DigitalPiggyBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;

        System.out.println("What is your saving goal? ");
        double goal = scanner.nextDouble();

        if (goal <= 0) {
            System.out.println("❌ Invalid goal. Enter a positive value.");
            return; // interrompe o programa
        }

        while (balance < goal) {
            System.out.println("Enter an amount to deposit:");
            double deposit = scanner.nextDouble();

            if (deposit <= 0) {
                System.out.println("❌ Invalid deposit. Enter a positive amount.");
                continue;
            }

            balance += deposit;
            System.out.printf("Current balance: R$ %.2f%n", balance);
        }

        System.out.printf("🎉 Goal reached! You saved: R$ %.2f%n", balance);
        scanner.close();
    }
}

