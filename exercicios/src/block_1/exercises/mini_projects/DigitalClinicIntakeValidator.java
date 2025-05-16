package block_1.exercises.mini_projects;

import java.util.Scanner;

/**
 * 🧪 Exercise: Digital Clinic Intake Validator
 * --------------------------------------------
 * 🏥 Real Scenario:
 * You work for a health-tech startup that created a smart terminal system for patient
 * intake at a digital clinic. Each patient must pass 3 triage validations before being
 * forwarded to a medical professional.
 *
 * 🎯 Rules:
 * - The operator enters the patient's full name.
 * - The patient must pass the following validations:
 *   1. Has a valid appointment registered in the system?
 *   2. Symptoms have been pre-submitted online?
 *   3. Emergency contact information updated?
 * - If the patient answers "n" to any of the steps, the check-in is denied.
 * - If all answers are "y", the system confirms check-in and calls the patient in.
 * - After each triage, the system asks:
 *     "Do you want to process another patient? (y/n)"
 * - If the answer is "n", the program ends with:
 *     "🛑 Intake system shutting down. End of triage operations."
 *
 * ⚙️ Realistic Context:
 * This solution could be used at the front desk of modern digital clinics, urgent care units,
 * or by mobile attendants with tablets.
 *
 * 📌 Concepts reinforced:
 * - Boolean flag control for session loop
 * - Step-based validation flow
 * - String comparison and input sanitization
 * - User feedback in a real-world process
 *
 * ⚠️ Challenge Constraints:
 * - No arrays, no methods, no object creation.
 * - Only use: String, int, boolean, if, while, .trim(), .equalsIgnoreCase()
 *
 * 📍 Author: Kauã Rasera
 */

public class DigitalClinicIntakeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isClosed = false;

        while (!isClosed) {
            int step = 1;
            boolean isAppointmentDenied = false;
            String prompt = "";

            System.out.println("Enter your full name: ");
            String patientName = scanner.nextLine().trim();

            if (!patientName.isBlank()) {
                patientName = patientName.substring(0, 1).toUpperCase() + patientName.substring(1);
            }

            while (step <= 3) {
                if (step == 1) prompt = "Has a valid appointment registered in the system? (y/n)";
                if (step == 2) prompt = "Symptoms have been pre-submitted online? (y/n)";
                if (step == 3) prompt = "Emergency contact information updated? (y/n)";

                System.out.println(prompt);
                String answer = scanner.nextLine().trim();

                if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                    System.out.println("❌ Invalid input.");
                    continue;
                }

                if (answer.equalsIgnoreCase("n")) {
                    System.out.println("⛔ Check-in denied. Please verify your answers.");
                    isAppointmentDenied = true;
                    break;
                }

                step++;
            }

            if (!isAppointmentDenied) {
                System.out.println("✅ Confirmed check-in for patient " + patientName + ". Activating patient...");
            }

            System.out.println("Do you want to process another patient? (y/n)");
            String response = scanner.nextLine().trim();

            if (response.equalsIgnoreCase("n")) {
                System.out.println("🛑 Intake system shutting down. End of triage operations.");
                isClosed = true;
            }
        }

        scanner.close();
    }
}