package block_1.exercises.loops.loopsFor;

import java.util.Scanner;

public class DivisibleCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the limit number for your counter: ");
        int loops = scanner.nextInt();

        System.out.println("""
                Choose an option:
                1 - Show numbers divisible by 2 and 3
                2 - Show numbers divisible only by 2
                3 - Show numbers divisible only by 3
                """);
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> {
                for (int i = 1; i <= loops; i++) {
                    if (i % 2 == 0 && i % 3 == 0) {
                        System.out.println(i);
                    }
                }
            }
            case 2 -> {
                for (int i = 1; i <= loops; i++) {
                    if (i % 2 == 0 && i % 3 != 0) {
                        System.out.println(i);
                    }
                }
            }
            case 3 -> {
                for (int i = 1; i <= loops; i++) {
                    if (i % 3 == 0 && i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }
            default -> System.out.println("❌ Invalid Option");
        }

        scanner.close();
    }
}