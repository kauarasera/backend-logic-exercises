package block_1.exercises.loops.loopsFor;

import java.util.Scanner;

public class MultipleValidatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Multiples Checker with Menu ====");
        System.out.print("Enter your number to check: ");
        int number = scanner.nextInt();

        System.out.println("""
                Choose a option:
                1 - Show even numbers
                2 - Show multiples of 3
                3 - Show odd numbers
                """);
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("Show even numbers from: " + number);
                for (int i = 1; i <= number; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
            case 2 -> {
                System.out.println(" Show multiples numbers of 3 from: " + number);
                for (int i = 1; i <= number; i++) {
                    if (i % 3 == 0) {
                        System.out.println(i);
                     }
                }
            }
            case 3 -> {
                System.out.println(" Show odd numbers up to:  " + number);
                for (int i = 1; i <= number; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }
            default -> System.out.println("❌ Invalid option.");
        }
        scanner.close();
    }
}
