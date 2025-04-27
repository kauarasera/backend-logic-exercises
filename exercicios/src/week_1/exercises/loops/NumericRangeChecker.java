package week_1.exercises.loops;

import java.util.Scanner;

public class NumericRangeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number to set the limit: ");
        int number = scanner.nextInt();

        System.out.println("""
                Choose an option:
                1 - Show numbers between 10 and 20
                2 - Show numbers less than 50
                3 - Show numbers between 100 and 200
                """);

        int option = scanner.nextInt();

        switch (option) {
            case 1 -> {
                for (int i = 1; i <= number; i++) {
                    if (i >= 10 && i <= 20) {
                        System.out.println(i);
                    }
                }
            }
            case 2 -> {
                for (int i = 1; i <= number; i++) {
                    if (i >= 1 && i <= 50) {
                        System.out.println(i);
                    }
                }
            }
            case 3 -> {
                for (int i = 1; i <= number; i++) {
                    if (i >= 100 && i <= 200) {
                        System.out.println(i);
                    }
                }
            }
            default -> System.out.println("❌ Invalid option.");
        }

        scanner.close();
    }
}
