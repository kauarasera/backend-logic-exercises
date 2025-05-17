package block_1.exercises.conditionals.condSwitch;

import java.util.Scanner;

public class IntergalacticVotingSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many beings will vote?");
        int numberOfBeings = scanner.nextInt();

        for (int i = 1; i <= numberOfBeings; i++) {

            System.out.print("Being " + i + "\nEnter your age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                System.out.println("❌ You are not allowed to vote.");
            } else {
                System.out.println("""
                        Choose your vote:
                        1 - Planet Earth 🌍
                        2 - Planet Mars 🔴
                        3 - Planet Jupiter 🟠
                        """);
                int vote = scanner.nextInt();

                switch (vote) {
                    case 1 -> {
                        System.out.println("✅ Vote registered for Planet Earth 🌍");
                    }
                    case 2 -> {
                        System.out.println("✅ Vote registered for Planet Mars 🔴");
                    }
                    case 3 -> {
                        System.out.println("✅ Vote registered for Planet Jupiter 🟠");
                    }
                    default -> System.out.println("❌ Invalid voting option.");
                }
            }
        }

        scanner.close();
    }
}