package block_1.exercises.mini_projects;

import java.util.Scanner;

public class RobotDiagnosticSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = "";
        String validation;
        boolean isReprovado = false;

        System.out.println("Enter with robot ID: ");
        int robot = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Starting security diagnostic...");

        while (robot <= 3) {
            if (robot == 1) message = "Bateria acima de 70%? (y/n)";
            if (robot == 2) message = "Conexões internas OK? (y/n)";
            if (robot == 3) message = "Firmware atualizado? (y/n)";

            System.out.println(message + ".");
            validation = scanner.nextLine().trim();

            if (validation.equals("n")) {
                System.out.println("🔒 Access denied at checkpoint " + validation + ".");
                isReprovado = true;
                break;
            }

            robot++;
        }
        if (!isReprovado) {
            System.out.println("\uD83D\uDE80 All codes authenticated. Launch authorized!");
        }
    }
}
