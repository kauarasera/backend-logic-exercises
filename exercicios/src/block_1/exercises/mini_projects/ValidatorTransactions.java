package block_1.exercises.mini_projects;

import java.util.Scanner;

/**
 * 🧪 Exercise: Payment Transaction Validator
 * ------------------------------------------
 * 💳 Real Scenario:
 * You work at a fintech startup that processes peer-to-peer digital payments.
 * Before a transaction can be confirmed, the system must validate critical checks
 * to ensure the operation is safe and consistent with user account policies.
 *
 * 🎯 Rules:
 * - The operator types the name of the payer (user sending the money).
 * - The transaction passes through 3 required validations:
 *   1. Is the account balance sufficient for this transaction?
 *   2. Is the user's identity verified (KYC)?
 *   3. Is the destination account within an allowed region?
 * - If any answer is "n", the transaction is rejected with a warning.
 * - If all validations are "y", the transaction is approved and confirmed.
 * - After each transaction, the system asks:
 *     "Do you want to validate another transaction? (y/n)"
 * - If the answer is "n", the system ends with:
 *     "🛑 Payment system shutting down. No further transactions will be processed."
 *
 * 🏦 Use Case:
 * This validator could run behind a simple admin terminal in a payments startup
 * like PicPay, Nubank, Wise, or Revolut.
 *
 * 📌 Concepts reinforced:
 * - Step-by-step validation logic with booleans
 * - Stateful loop with controlled exit
 * - Dynamic prompts per validation step
 * - User feedback aligned with critical actions (approve/reject)
 *
 * ⚠️ Challenge Constraints:
 * - No use of arrays, lists, methods or objects.
 * - Only use: String, int, boolean, if, while, .trim(), .equalsIgnoreCase()
 *
 * 📍 Author: Kauã Rasera
 */


public class ValidatorTransactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isClosed = false;

        while (!isClosed) {
            int step = 1;
            boolean isRejected = false;
            String prompt = "";

            System.out.println("Enter name of the payer:");
            String payerName = scanner.nextLine().trim();

            if (!payerName.isBlank()) {
                payerName = payerName.substring(0, 1).toUpperCase() + payerName.substring(1);
            }

            while (step <= 3) {
                if (step == 1) prompt = "1. Is the account balance sufficient for this transaction? (y/n)";
                if (step == 2) prompt = "2. Is the user's identity verified (KYC)? (y/n)";
                if (step ==  3) prompt = "3. Is the destination account within an allowed region? (y/n)";

                System.out.println(prompt);
                String answer = scanner.nextLine().trim();

                if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                    System.out.println("❌ Invalid input.");
                    continue;
                }

                if (answer.equalsIgnoreCase("n")) {
                    System.out.println("⛔ Transaction rejected for " + payerName + " Please verify user eligibility.");
                    isRejected = true;
                    break;
                }

                step++;
            }

            if (!isRejected) {
                System.out.println("✅ Transaction approved for " + payerName + ".");
            }

            System.out.println("Do you want to validate another transaction? (y/n)");
            String response = scanner.nextLine().trim();

            if (response.equalsIgnoreCase("n")) {
                System.out.println("\uD83D\uDED1 Payment system shutting down. No further transactions will be processed.");
                isClosed = true;
            }
        }
        scanner.close();
    }
}
