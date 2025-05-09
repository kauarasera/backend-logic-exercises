package block_1.exercises.loops.loopsWhile;

import java.util.Scanner;

public class MonitorCenterRobotic {
    public static void main(String[] args) {
        //Block 1 -> Find out how many bots are being scanned
        Scanner scanner = new Scanner(System.in);

        int robot = 1;
        boolean isAborted = false;

        System.out.println("How many robots should be checked?");
        int qtdRobots = scanner.nextInt();
        scanner.nextLine();

        //Block 2 -> Check which robot is operational or not.
        while (robot <= qtdRobots) {
            System.out.println("Is robot " + robot + " operational? (y/n)");
            String operational = scanner.nextLine();

        /*Block 3 ->If any robot is not operational, I interrupt the verification
        and inform on the screen "aborting the mission".
         */
            if (operational.equals("n")) {
                System.out.println("❌ Mission aborted. Robot " + robot + " is not operational.");
                isAborted = true;
                break;
            }

        //Block 4 -> After all verification, increment this operational robot
            robot++;

        }

        // Block 4 -> if all robots are operational, print a success message

        if (!isAborted) {
            System.out.println("\uD83E\uDD16 All robots operational. Mission started!\n");
        }

        scanner.close();
    }
}