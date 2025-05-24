package block_1.exercises.loops.doWhile;
/**
 🧾 Desafio: Menu de Boas-vindas
Crie um sistema com menu que mostre:
1 - Ver produtos
2 - Realizar pedido
3 - Encerrar sistema

O sistema deve repetir o menu até que o usuário digite 3.
Sempre que o usuário digitar uma opção, o sistema mostra uma mensagem específica para ela.
Se digitar uma opção inválida, mostrar "❌ Opção inválida".
 */
import java.util.Scanner;

public class WelcomeMenuSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int response; // 🔢 Stores user's menu option

        // 🟢 Start the menu loop (will always run at least once)
        do {
            // 📋 Display the interactive menu
            System.out.println("\n\uD83D\uDCE6 Welcome to the system! What would you like to do?");
            System.out.println("\u0031\uFE0F\u20E3 View products");
            System.out.println("\u0032\uFE0F\u20E3 Place an order");
            System.out.println("\u0033\uFE0F\u20E3 Exit the system");
            System.out.print("\uD83D\uDC49 Enter your choice: ");

            response = scanner.nextInt(); // 🧠 Capture user's option

            // 🧭 Decision structure based on selected option
            if (response == 1) {
                System.out.println("\uD83D\uDED9\uFE0F Showing available products...");
            } else if (response == 2) {
                System.out.println("\uD83D\uDCDD Creating a new order...");
            } else if (response == 3) {
                System.out.println("\uD83D\uDD12 Shutting down the system. See you next time!");
            } else {
                System.out.println("\u274C Invalid option. Please try again.");
            }

        } while (response != 3); // 🔁 Continue loop until option 3 is selected

        scanner.close(); // 🧹 Clean up scanner resource
    }
}