package block_1.exercises.mini_projects;

import java.util.Scanner;

/**
 * 🧪 Exercise: Secure Access Authenticator
 * -----------------------------------------
 * 🔐 Real Scenario:
 * You work at a cybersecurity startup that builds authentication layers for enterprise systems.
 * One of the tools you're developing is a secure terminal validator that simulates
 * the logic behind user access to sensitive internal systems.
 * <p>
 * 🎯 Rules:
 * - The operator inputs the name of the employee trying to access the system.
 * - Each employee must pass 3 validations:
 * 1. Is the device trusted (previously registered)?
 * 2. Is two-factor authentication (2FA) successfully completed?
 * 3. Has the user agreed to the updated security policy?
 * - If any of the answers is "n", access is denied.
 * - If all answers are "y", access is granted.
 * - After each authentication, the system asks:
 * "Do you want to validate another user? (y/n)"
 * - If the answer is "n", the system prints:
 * "🛑 Secure access module shutting down."
 * <p>
 * 🧠 Real Use Case:
 * This simulation could apply to onboarding validation systems used by
 * startups like Auth0, Okta, HashiCorp, or internal tools at Google.
 * <p>
 * 📌 Concepts reinforced:
 * - Reusable boolean validation loop
 * - String flow control
 * - Simulated authentication logic
 * - Terminal interaction modeled after security flows
 * <p>
 * ⚠️ Challenge Constraints:
 * - No arrays, no methods, no object creation.
 * - Use only: String, int, boolean, if, while, .trim(), .equalsIgnoreCase()
 * <p>
 * 📍 Author: Kauã Rasera
 */


public class SecureAccessAuthenticator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isClosed = false;

        while (!isClosed) {
            int step = 1;
            boolean isDenied = false;
            String prompt = "";

            System.out.println("Enter name of the employee: ");
            String employee = scanner.nextLine().trim();

            if (!employee.isBlank()) {
                employee = employee.substring(0, 1).toUpperCase() + employee.substring(1);
            }

            while (step <= 3) {
                if (step == 1) prompt = "1. Is the device trusted (previously registered)? (y/n)";
                if (step == 2) prompt = "2. Is two-factor authentication (2FA) successfully completed? (y/n)";
                if (step == 3) prompt = "3. Has the user agreed to the updated security policy? (y/n)";

                System.out.println(prompt);
                String answers = scanner.nextLine().trim();

                if (!answers.equalsIgnoreCase("y") && !answers.equalsIgnoreCase("n")) {
                    System.out.println("❌ Invalid input.");
                    continue;
                }

                if (answers.equalsIgnoreCase("n")) {
                    System.out.println("⛔ Access rejected for " + employee + ". You must pass by 3 validations");
                    isDenied = true;
                    break;
                }
                step++;
            }

            /*Ultima verificacao caso tenha passado
            pelas 3 etapas de validacoes para mandar mensagem de aprovacao*/
            if (!isDenied) {
                System.out.println("✅ Transaction approved for " + employee + ".");
            }

            System.out.println("Do you want to validate another user? (y/n)");
            String response = scanner.nextLine().trim();

            if (response.equalsIgnoreCase("n")) {
                System.out.println("\uD83D\uDED1 Secure access module shutting down.");
                isClosed = true;
            }

        }
        scanner.close();

    }
}
