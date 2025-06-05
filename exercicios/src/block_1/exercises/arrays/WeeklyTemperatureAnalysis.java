package block_1.exercises.arrays;

import java.util.Locale;

/**
 * 🌡️ WEEKLY TEMPERATURE ANALYSIS
 * -------------------------------
 * You are developing a simple system for a meteorological lab.
 * Your goal is to analyze the average temperatures recorded during a week.
 *
 * 🎯 Rules:
 * 1. Create an array with 7 positions to represent the week's daily temperatures.
 * 2. Fill this array with temperature values (double), simulating the data.
 * 3. Calculate and display:
 *    ✅ The average temperature of the week
 *    ✅ The highest temperature recorded
 *    ✅ The lowest temperature recorded
 *
 * 🧰 Tools you must use:
 * - `double[]`
 * - `for` loop
 * - Auxiliary variables (e.g., `sum`, `highest`, `lowest`)
 *
 * ⚠️ Tip:
 * - Initialize `highest` and `lowest` with the first element of the array.
 * - Start the `sum` at 0 and accumulate each value.
 *
 * 📍 Author: Kauã Rasera
 */

public class WeeklyTemperatureAnalysis {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Para garantir ponto decimal nas médias

        // 1️- Criar o array com 7 temperaturas simuladas (em graus Celsius)
        double[] temperatures = {21.5, 23.0, 19.8, 25.2, 20.0, 22.3, 18.9};

        // 2️- Criar variáveis auxiliares
        double sum = 0;
        double max = temperatures[0];
        double min = temperatures[0];

        // 3️- Usar um loop for para percorrer o array
        for (int i = 0; i < temperatures.length; i++) {
            double temp = temperatures[i];

            // Acumular a soma das temperaturas
            sum += temp;

            // Verificar maior temperatura
            if (temp > max) {
                max = temp;
            }

            // Verificar menor temperatura
            if (temp < min) {
                min = temp;
            }
        }

        // 4️- Calcular a média
        double average = sum / temperatures.length;

        // 5- Exibir os resultados
        System.out.println("\uD83D\uDCCA  Weekly Temperature Report:");
        System.out.println("\uD83C\uDF21\uFE0F Average: " + average + " °C");
        System.out.println("\uD83D\uDD25 Highest: " + max + " °C");
        System.out.println("❄\u2744\uFE0F Lowest: " + min + " °C");
    }
}
