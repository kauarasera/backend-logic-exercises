package block_1.exercises.data_types;

import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.print("Enter your fixed salary: ");
        double fixedSalary = scanner.nextDouble();

        System.out.print("Enter the total sales made this month: ");
        double totalSales = scanner.nextDouble();

        double finalSalary = (totalSales * 15 / 100) + fixedSalary;

        System.out.printf("Employee: %s%nTotal salary = $ %.2f%n", name, finalSalary);

        scanner.close();
    }
}
