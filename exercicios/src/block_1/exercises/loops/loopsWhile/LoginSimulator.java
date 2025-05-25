package block_1.exercises.loops.loopsWhile;

import java.util.Scanner;

/**
 * 🔐 Exercise: Login Simulator with Limited Attempts
 * --------------------------------------------------
 * 🧩 Scenario:
 * You're building a login system that checks if a user-entered password matches the correct one.
 * The user has at most 3 attempts to get the password right.
 *
 * 🎯 Rules:
 * - The system asks for the password.
 * - The correct password is "1234".
 * - If the password is incorrect, show:
 *     ❌ Incorrect password. Try again.
 * - After 3 failed attempts, show:
 *     🔒 System locked. Please contact support.
 * - If the password is correct, show:
 *     ✅ Access granted
 *
 * 🧠 Concepts practiced:
 * - `do..while` loop
 * - Input handling with `Scanner`
 * - Conditional logic with `if`, `else`
 * - Counting attempts
 * - Message customization with emojis (Unicode)
 *
 * ⚠️ Constraints:
 * - No use of arrays or methods
 * - Use only basic structures: String, int, boolean, `do..while`, `.trim()`, `.equals()`
 *
 * 📍 Author: Kauã Rasera
 */

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
