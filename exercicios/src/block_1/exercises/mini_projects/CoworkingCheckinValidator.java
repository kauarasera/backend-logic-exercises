package block_1.exercises.mini_projects;

/**
 * 🧪 Exercise: Coworking Check-in Validator
 * -----------------------------------------
 * 🏢 Real Scenario:
 * This system simulates a check-in validation used by a startup
 * that manages coworking spaces for freelancers.
 *
 * 🎯 Rules:
 * - Each visitor must go through 3 validation questions:
 *   1. Payment confirmed in the app?
 *   2. Has valid photo ID?
 *   3. Has accepted the digital conduct agreement?
 * - If the visitor answers "n" to any question, access is blocked.
 * - If all answers are "y", the visitor is granted access with a welcome message.
 * - After each visitor, the system asks:
 *     "Do you want to register another check-in? (y/n)"
 * - If "n", the system shuts down with the message:
 *     "🛑 End of check-ins. Validation system closing."
 *
 * ⚙️ Simulated real-world usage:
 * This type of system could be used on tablets in modern coworking spaces
 * like WeWork, Spaces, or Google Campus.
 *
 * 📌 Concepts reinforced:
 * - Boolean-controlled loops
 * - Reset of state on each iteration
 * - Conditional validation
 * - Clear and professional terminal messages
 *
 * ⚠️ Challenge Constraints:
 * - No arrays, no methods, no classes beyond main.
 * - Only use: String, int, boolean, if, while, .trim(), .equalsIgnoreCase()
 *
 * 📍 Author: Kauã Rasera
 */

import java.util.Scanner;

public class CoworkingCheckinValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSystemClosed = false;

        while (!isSystemClosed) {
            int step = 1;
            boolean isBlocked = false;
            String prompt = "";

            System.out.println("Enter visitor's name:");
            String visitorName = scanner.nextLine().trim();

            while (step <= 3) {
                if (step == 1) prompt = "Payment confirmed in the app? (y/n)";
                if (step == 2) prompt = "Valid photo ID in hand? (y/n)";
                if (step == 3) prompt = "Conduct terms accepted? (y/n)";

                System.out.println(prompt);
                String answer = scanner.nextLine().trim();

                if (answer.equalsIgnoreCase("n")) {
                    System.out.println("⛔ Visitor " + visitorName + " blocked at step " + step + ".");
                    isBlocked = true;
                    break;
                }

                step++;
            }

            if (!isBlocked) {
                System.out.println("✅ Welcome, " + visitorName + "! Access granted to the coworking space.");
            }

            System.out.println("Do you want to register another check-in? (y/n)");
            String response = scanner.nextLine().trim();

            if (response.equalsIgnoreCase("n")) {
                System.out.println("🛑 End of check-ins. Validation system closing.");
                isSystemClosed = true;
            }
        }

        scanner.close();
    }
}