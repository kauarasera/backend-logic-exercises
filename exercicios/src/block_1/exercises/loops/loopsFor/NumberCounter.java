package block_1.exercises.loops.loopsFor;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the loop count: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(n);
        }
    }
}
