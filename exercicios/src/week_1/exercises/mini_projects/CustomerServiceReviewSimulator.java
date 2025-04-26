package week_1.exercises.mini_projects;

import java.util.Scanner;

public class CustomerServiceReviewSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().toLowerCase();

        System.out.println("""
                ====CUSTOMER SERVICE REVIEW====
                ⭐⭐⭐⭐⭐ Excellent service!
                ⭐⭐⭐⭐ Very good!
                ⭐⭐⭐ Good but there's room for improvement.
                ⭐⭐ Service below expectations.
                ⭐ Poor service.
                """);
        System.out.print("Enter your quantity star: ");
        int qtdStar = scanner.nextInt();

        boolean isValidStar = false;
        String feedback = "";

        if (name.isBlank()) {
            System.out.println("Name cannot be empty: ");
        } else {
            switch (qtdStar) {
                case 5 -> {
                    feedback = "Excellent service!";
                    isValidStar = true;
                }
                case 4 -> {
                    feedback = "Very good!";
                    isValidStar = true;
                }
                case 3 -> {
                    feedback = "Good but there's room for improvement.";
                    isValidStar = true;
                }
                case 2 -> {
                    feedback = "Service below expectations.";
                    isValidStar = true;
                }
                case 1 -> {
                    feedback = "Poor service.";
                    isValidStar = true;
                }
                default -> System.out.println("❌ Invalid qtdStar. Please enter a number from 1 to 5.");
            }
            if (isValidStar) {
                System.out.println("Client: " + name + "\nFeedback: " + qtdStar + "\n" + feedback);
            }
        }
    }
}