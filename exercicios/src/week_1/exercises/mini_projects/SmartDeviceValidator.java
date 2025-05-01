package week_1.exercises.mini_projects;

import java.util.Scanner;

public class SmartDeviceValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many devices will be analyzed?");
        int numberOfDevices = scanner.nextInt();

        System.out.println("Choose the protocol accepted by the network:\n" +
                "1 - Protocol version 3 (most secure 🚀)\n" +
                "2 - Protocol version 2 or higher\n" +
                "3 - Any protocol, but devices manufactured after 2020");
        int option = scanner.nextInt();

        for (int i = 1; i <= numberOfDevices; i++) {
            System.out.println("Device " + i + ":");
            System.out.println("Year of manufacture?");
            int manufactureYear = scanner.nextInt();

            System.out.println("Protocol version?");
            int protocolVersion = scanner.nextInt();

            switch (option) {
                case 1: {
                    if (protocolVersion == 3) {
                        System.out.println("✅ Device " + i + " approved for connection!");
                    } else {
                        System.out.println("❌ Device " + i + " rejected for connection!");
                    }
                    break;
                }
                case 2: {
                    if (protocolVersion >= 2) {
                        System.out.println("✅ Device " + i + " approved for connection!");
                    } else {
                        System.out.println("❌ Device " + i + " rejected for connection!");
                    }
                    break;
                }
                case 3: {
                    if (manufactureYear > 2020) {
                        System.out.println("✅ Device " + i + " approved for connection!");
                    } else {
                        System.out.println("❌ Device " + i + " rejected for connection!");
                    }
                    break;
                }
                default:
                    System.out.println("❌ Invalid option! Choose a valid option.");
                    break;
            }
        }
        scanner.close();
    }
}
