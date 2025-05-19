package block_1.exercises.mini_projects;

import java.util.Scanner;

/**
 * 🧪 FINAL CHALLENGE — Phase 1: `while`
 * =====================================
 * 🚧 Scenario: Secure Delivery Access Control
 * ------------------------------------------
 * You work at a logistics startup that manages automated access to smart lockers
 * for last-mile delivery drivers. Your task is to simulate the validation system
 * that grants or denies access based on strict delivery rules.
 * <p>
 * 📦 Real Context:
 * A delivery driver arrives at a smart locker. The system must validate 3 key steps
 * before granting access to the locker:
 * <p>
 * 1. Has a delivery code been scanned successfully?
 * 2. Is the driver's ID verified with facial recognition?
 * 3. Is the delivery time window still valid?
 * <p>
 * 🎯 Rules:
 * - The system asks for the driver's name.
 * - For each validation step, ask the operator to input `(y/n)`.
 * - If **any** step returns "n", the access is denied.
 * - If **all** steps are "y", the locker is unlocked and the package is delivered.
 * - After each attempt, the system asks:
 * ➤ `"Process another delivery? (y/n)"`
 * - If the answer is `"n"`, end the system with:
 * ➤ `"🛑 Delivery access system shutting down."`
 * <p>
 * ⚙️ Concepts reviewed:
 * - Nested while loops
 * - Resetting validation state between deliveries
 * - Boolean control flow
 * - Step-by-step user feedback
 * <p>
 * ⚠️ Restrictions:
 * - No arrays or methods
 * - Use only: `while`, `String`, `boolean`, `int`, `.trim()`, `.equalsIgnoreCase()`
 * <p>
 * 📍 Author: Kauã Rasera
 */

public class DeliveryAccessValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isClosed = false;

        System.out.println("*** Welcome Smarth Locker ***");


        while (!isClosed) {
            int step = 1;
            boolean isBlocked = false;
            String prompt = "";

            System.out.println("Enter driver's name: ");
            String name = scanner.nextLine().trim();

            if (!name.isBlank()) {
                name = name.substring(0, 1).toUpperCase() + name.substring(1);
            }

            while (step <= 3) {
                if (step == 1) prompt = " 1. Has a delivery code been scanned successfully? (y/n)";
                if (step == 2) prompt = "2. Is the driver's ID verified with facial recognition? (y/n)";
                if (step == 3) prompt = "3. Is the delivery time window still valid? (y/n)";

                System.out.println(prompt);
                String answer = scanner.nextLine().trim();

                if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                    System.out.println("❌ Input invalid");
                    continue;
                }

                if (answer.equalsIgnoreCase("n")) {
                    System.out.println("🔒 Access denied " + name);
                    isBlocked = true;
                    break;
                }

                step++;
            }

            if (!isBlocked) {
                System.out.println("✅ Access granted, collect your package " + name);
            }

            System.out.println("➤ Process another delivery? (y/n)");
            String response = scanner.nextLine().trim();

            if (response.equalsIgnoreCase("n")) {
                System.out.println("\uD83D\uDED1 Delivery access system shutting down.");
                isClosed = true;
            }
        }
        scanner.close();

    }
}