package week_1.exercises.mini_projects;

import java.util.Scanner;

public class CoffeeOrderValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name? ");
        String name = scanner.nextLine().toLowerCase();

        System.out.println("Choose your coffee size (small, medium, large):");
        String coffeSize = scanner.nextLine().toLowerCase();

        System.out.println("Choose your payment method (cash, card, Pix):");
        String payment = scanner.nextLine().toLowerCase();

        boolean isCoffeeSizeValid = false;
        boolean isPaymentValid = false;

        if (name.isBlank()) {
            System.out.println("Name can't be empty.");
        } else {
            switch (coffeSize) {
                case "small":
                case "medium":
                case "large":
                    isCoffeeSizeValid = true;
                    break;
                default:
                    System.out.println("❌ Coffe size not accepted. Choose small, medium, large" + coffeSize);
                    break;
            }

            switch (payment) {
                case "cash":
                case "card":
                case "pix":
                    isPaymentValid = true;
                    break;
                default:
                    System.out.println("❌ Payment method  not accepted. Choose other payment method." + payment);
                    break;
            }

            if (isCoffeeSizeValid && isPaymentValid) {
                System.out.println("✅ Pedido realizado com sucesso!\n" +
                        "Cliente: " + name + "\nCoffe: " + coffeSize + "Payment: " + payment);
            }

        }

        scanner.close();
    }
}