package block_1.exercises.arrays;

import java.util.Locale;

/**
 * 🌡️ TEMPERATURA SEMANAL
 * -----------------------
 * Você está desenvolvendo um sistema simples para um laboratório meteorológico.
 * Seu objetivo é analisar as temperaturas médias registradas durante uma semana.
 *
 * 🎯 Regras:
 * 1. Crie um array com 7 posições para representar as temperaturas dos dias da semana.
 * 2. Preencha esse array com valores de temperatura (double), simulando os dados.
 * 3. Calcule e mostre:
 *    ✅ A temperatura média da semana
 *    ✅ A maior temperatura registrada
 *    ✅ A menor temperatura registrada
 *
 * 🧰 Ferramentas que você deve usar:
 * - `double[]`
 * - `for` loop
 * - Variáveis auxiliares (ex: `soma`, `maior`, `menor`)
 *
 * ⚠️ Dica:
 * - Inicie `maior` e `menor` com o primeiro valor do array.
 * - A soma pode começar em 0 e ir acumulando.
 *
 * 📍 Autor: Kauã Rasera
 */

public class WeeklyTemperatureAnalysis {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Para garantir ponto decimal nas médias

        // 1️⃣ Criar o array com 7 temperaturas simuladas (em graus Celsius)
        double[] temperatures = {21.5, 23.0, 19.8, 25.2, 20.0, 22.3, 18.9};

        // 2️⃣ Criar variáveis auxiliares
        double sum = 0;
        double max = temperatures[0];
        double min = temperatures[0];

        // 3️⃣ Usar um loop for para percorrer o array
        for (int i = 0; i < temperatures.length; i++) {
            double temp = temperatures[i];

            // 🔄 Acumular a soma das temperaturas
            sum += temp;

            // 🔍 Verificar maior temperatura
            if (temp > max) {
                max = temp;
            }

            // 🔍 Verificar menor temperatura
            if (temp < min) {
                min = temp;
            }
        }

        // 4️⃣ Calcular a média
        double average = sum / temperatures.length;

        // 5️⃣ Exibir os resultados
        System.out.println("\uD83D\uDCCA  Weekly Temperature Report:");
        System.out.println("\uD83C\uDF21\uFE0F Average: " + average + " °C");
        System.out.println("\uD83D\uDD25 Highest: " + max + " °C");
        System.out.println("❄\u2744\uFE0F Lowest: " + min + " °C");
    }
}
