import java.util.Scanner;

/**
 * 🧪 FINAL CHALLENGE — Phase 2: `do..while`
 * ========================================
 * 💳 Scenario: ATM Machine Access Validator
 * ----------------------------------------
 * You are developing the access interface for a digital ATM (cash machine).
 * A user must first enter the correct card PIN before proceeding to options.
 * After authentication, the system shows a menu:
 *
 *  1️⃣  Check balance
 *  2️⃣  Withdraw money
 *  3️⃣  Exit
 *
 * 🎯 Rules:
 * - User must input a 4-digit PIN.
 * - If the PIN is incorrect, allow a maximum of 3 attempts.
 * - If PIN is correct, show the 3-option menu.
 * - If option is invalid, display:
 *     ❌ Invalid option. Try again.
 * - If option 3 is selected, system exits with:
 *     🔒 Session ended. Please remove your card.
 *
 * ⚙️ Concepts reviewed:
 * - do..while loop to enforce one guaranteed PIN attempt
 * - Nested `do..while` to keep the menu looping
 * - Counter for login attempts
 * - String validation with `.equals()` and `.trim()`
 *
 * ⚠️ Restrictions:
 * - Use only: `do..while`, `String`, `int`, `.trim()`, `.equals()`, `.equalsIgnoreCase()`, `System.out.println()`, and `Scanner`
 *
 * 📍 Author: Kauã Rasera
 */

public class CashMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPin = "1234";
        String enteredPin;
        String option = "";
        int attempts = 0;
        boolean isValid = false;

        System.out.println("\uD83D\uDC64 Please enter your name:");
        String name = scanner.nextLine().trim();

        if (!name.isBlank()) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
        }

        // 🔐 Authentication phase
        do {
            System.out.println("\uD83D\uDD10 Enter your 4-digit PIN:");
            enteredPin = scanner.nextLine().trim();

            if (enteredPin.equals(correctPin)) {
                System.out.println("\u2705 Access granted. Welcome, " + name + "!\n");
                isValid = true;
                break;
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("\u274C Invalid PIN. Attempts left: " + (3 - attempts));
                } else {
                    System.out.println("\uD83D\uDD12 Session ended. Please remove your card.\n");
                }
            }

        } while (!enteredPin.equals(correctPin) && attempts < 3);

        // 🧭 Menu loop if login was successful
        if (isValid) {
            do {
                System.out.println("1\uFE0F\u20E3 Check balance");
                System.out.println("2\uFE0F\u20E3 Withdraw money");
                System.out.println("3\uFE0F\u20E3 Exit");
                System.out.print("\uD83D\uDD10 What would you like to do? ");

                option = scanner.nextLine().trim();

                switch (option) {
                    case "1":
                        System.out.println("\uD83D\uDCB3 Your balance is: $1,000\n");
                        break;
                    case "2":
                        System.out.println("\uD83C\uDF10 Withdrawal completed.\n");
                        break;
                    case "3":
                        System.out.println("\uD83D\uDD12 Session ended. Please remove your card.\n");
                        break;
                    default:
                        System.out.println("\u274C Invalid option. Try again.\n");
                }

            } while (!option.equals("3"));
        }

        scanner.close();
    }
}