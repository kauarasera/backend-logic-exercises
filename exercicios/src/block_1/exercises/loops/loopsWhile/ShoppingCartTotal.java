package block_1.exercises.loops.loopsWhile;

import java.util.Scanner;

public class ShoppingCartTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cartTotal = 0;

        while (cartTotal < 100) {
            System.out.println("Enter the price of the item:");
            double itemPrice = scanner.nextDouble();

            if (itemPrice <= 0) {
                System.out.println("❌ Invalid value. Please enter a positive amount.");
                continue;
            }

            cartTotal += itemPrice;
        }

        System.out.printf("🛒 Purchase completed. Total spent: R$ %.2f%n", cartTotal);
        scanner.close();
    }
}