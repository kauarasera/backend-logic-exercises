package block_1.exercises.loops;

import java.util.Scanner;

public class LoginSimulator {
    public static void main(String[] args) {
        Scanner sccanner = new Scanner(System.in);

        String passwordCorrect;
        int attempts = 0;

        do {
            System.out.println("\uD83D\uDD11 Enter your password:");
            passwordCorrect = sccanner.nextLine().trim();

            if (passwordCorrect.equals("1234")) {
                System.out.println("✅ Access granted");
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("❌ Incorrect password. Try again.");
                }
                if (attempts == 3) {
                    System.out.println("🔒 System locked. Please contact support.");
                }
            }

        } while (!passwordCorrect.equalsIgnoreCase("1234") && attempts < 3);

        sccanner.close();
    }
}
