package block_1.exercises.loops.doWhile;

import java.util.Scanner;

public class CustomerServiceMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int response;

        // 🔁 Repeat the menu until the user chooses to exit (option 3)
        do {
            // 📋 Display the main menu options
            System.out.println("""
                    \uD83D\uDCDE Welcome to TeleSupport!
                    1\uFE0F\u20E3 Technical Support
                    2\uFE0F\u20E3 Billing
                    3\uFE0F\u20E3 Exit
                    """);

            // 📥 Read the user's response
            response = scanner.nextInt();

            // 🧠 Handle each menu option
            if (response == 1) {
                System.out.println("Transfer to Technical Support");
            } else if (response == 2) {
                System.out.println("Transfer to Billing");
            } else if (response == 3) {
                System.out.println("\uD83D\uDD12 Ending session... Thank you for contacting us!");
            } else {
                // ⚠️ If the user enters an invalid option
                System.out.println("\u274C Invalid option. Please try again.");
            }

        } while (response != 3); // 🔄 Keep looping unless the user chooses to exit

        // 🧹 Close the scanner to release resources
        scanner.close();
    }
}