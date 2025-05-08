package block_1.exercises.loops.loopsWhile;

import java.util.Scanner;

public class RocketLauncherList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stage = 0;
        boolean isAborted = false;

        System.out.println("How many stages does the rocket have?");
        int qtdStage = scanner.nextInt();


        while (qtdStage >= stage) {
            System.out.println("Stage " + stage + " approved? (y/n)");
            scanner.nextLine();

            String response = scanner.nextLine().toLowerCase();

            if (response.equals("n")) {
                System.out.println("❌ Launch aborted! Stage " + stage + " not approved,");
                isAborted = true;
                break;
            }

            stage++;
        }
        if (!isAborted) {
            System.out.println("🚀 Rocket successfully launched!");
        }

        scanner.close();
    }
}
