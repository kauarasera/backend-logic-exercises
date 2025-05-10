package block_1.exercises.mini_projects;

import java.util.Scanner;

public class AccessValidatorSecurity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkPoint = 1 ;
        boolean isAborted = false;

        System.out.println("what's your name?");
        String guestName = scanner.nextLine().toLowerCase();

        System.out.println("How much checkpoints?");
        int qtdCheckpoint = scanner.nextInt();
        scanner.nextLine();

        while (checkPoint <= qtdCheckpoint) {

            System.out.println("Checkpoint " + checkPoint + " passed? (y/n)");
            String passed = scanner.nextLine().toLowerCase();

            if (passed.equals("n")) {
                System.out.println("\uD83D\uDD12 Access denied at checkpoint" + checkPoint + ".");
                isAborted = true;
                break;
            }

            checkPoint++;
        }

        if (!isAborted) {
            System.out.println("✅ Access granted to " + guestName + ", welcome!");
        }

        scanner.close();
    }
}
