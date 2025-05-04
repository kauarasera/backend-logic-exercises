package block_1.exercises.loops.loopsWhile;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "";

        while (!password.equals("aBcD321*")) {
            System.out.println("Enter yor password: ");
            password = scanner.nextLine();
        }

        System.out.println("✅ Senha correta!");

        scanner.close();
    }
}
