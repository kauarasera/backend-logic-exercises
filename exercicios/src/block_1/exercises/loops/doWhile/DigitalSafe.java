package block_1.exercises.loops.doWhile;

import java.util.Scanner;
/**
 * 🧪 Exercise: Digital Safe Access Validator
 * -----------------------------------------
 * 🧠 Scenario:
 * You are implementing the logic for a digital vault that requires a secure PIN to unlock.
 * The correct PIN is "4321". The user has a maximum of 5 attempts before the vault locks itself.
 *
 * 🎯 Rules:
 * - Ask for the PIN up to 5 times
 * - If the PIN is correct, show ✅ Access granted
 * - If the PIN is incorrect:
 *    → show ❌ Invalid PIN and how many attempts are left
 * - On the 5th failed attempt, show 🔒 Vault blocked
 *
 * ✅ Concepts practiced:
 * - do..while loop
 * - Input validation with Scanner
 * - Counting attempts with int
 * - Emoji feedback using Unicode
 *
 * 📍 Author: Kauã Rasera
 */

public class DigitalSafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pinCorrect;
        int attempts = 0;

        do {
            System.out.println("Enter your access PIN: ");
            pinCorrect = scanner.nextLine().trim();

            if (pinCorrect.equals("4321")) {
                System.out.println("✅ Access granted. Welcome!\n");
            } else {
                attempts++;

                if (attempts < 5) {
                    int attemptsLeft = 5 - attempts;
                    System.out.println("❌ Invalid PIN. Attempts left: " + attemptsLeft);
                }

                if (attempts == 5) {
                    System.out.println("\uD83D\uDD12 Vault blocked due to multiple failed attempts.\n");
                }
            }
        } while (!pinCorrect.equals("4321") && attempts < 5);

        scanner.close();
    }
}
