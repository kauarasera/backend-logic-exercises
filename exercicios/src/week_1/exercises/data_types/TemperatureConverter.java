package week_1.exercises.data_types;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celcius: ");
        double temperatura = scanner.nextDouble();

        double F = (temperatura * 9 / 5) + 32;

        System.out.printf("Voce informou %.1fºC que é equivalem a %.1f°F ", temperatura, F);

        scanner.close();

    }
}
