package week_1.exercises.data_types;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Informe o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.printf("Você trabalhou %d horas. Com o valor de €%.2f/hora. Seu salário será de €%.2f%n",
                horasTrabalhadas, valorHora, salario);

        scanner.close();

    }
}
