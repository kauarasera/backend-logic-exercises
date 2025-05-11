package block_1.exercises.mini_projects;

import java.util.Scanner;

public class SpaceAuthorizationCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String issue = "";
        int checkpoint = 1;
        String answer = "";
        boolean isAborted = false;

        System.out.println("Enter the name of the ship: ");
        String nameShip = scanner.nextLine().trim();

        if (!nameShip.isBlank()) {
            nameShip = nameShip.substring(0, 1).toLowerCase() + nameShip.substring(1);
        }

        System.out.println("Starting security checkpoint...");

        while (checkpoint <= 4) {
            if (checkpoint == 1) issue = "The protocols are updated from the ship " + nameShip +
                    ", passed at this checkpoint (y/n)?";
            else if (checkpoint == 2) issue = "Scanner clearance confirmed for ship " + nameShip +
                    ", passed at this checkpoint (y/n)?";
            else if (checkpoint == 3) issue = "Pilot authorization confirmed for ship " + nameShip +
                    ", passed at this checkpoint (y/n)?";
            else if (checkpoint == 4) issue = "Pilot of the ship " + nameShip + ", passed at this checkpoint (y/n)?";

            System.out.println(issue + ".");
            answer = scanner.nextLine().trim();


            if (answer.equals("n")) {
                System.out.println("🔒 Access denied at checkpoint " + checkpoint + ".");
                isAborted = true;
                break;
            }

            checkpoint++;

        }

        if (!isAborted) {
            System.out.println("\uD83D\uDE80 All codes authenticated. Launch authorized!");
        }
        scanner.close();

    }
}