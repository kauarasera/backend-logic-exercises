package block_1.exercises.mini_projects;

import java.util.Scanner;

public class DetectorDeAliens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a quantidade de serem para analisar? ");
        int qtdSeres = scanner.nextInt();

        System.out.println("""
                Escolha uma opção de detecção:
                1 - Detectar alienígenas com mais de 2 olhos
                2 - Detectar alienígenas com idade menor que 5 ou maior que 120
                3 - Detectar alienígenas com apenas 1 olho
                """);
        int option = scanner.nextInt();

        for (int i = 1; i <= qtdSeres; i++) {
            System.out.println("Qual a idade do ser? ");
            int idade = scanner.nextInt();

            System.out.println("Quantidade de olhos do ser? ");
            int qtdOlhos = scanner.nextInt();


            switch (option) {
                case 1 -> {
                    if (qtdOlhos > 2) {
                        System.out.println("Ser " + i + "\uD83D\uDC7D Alienígena detectado!");
                    } else {
                        System.out.println("Ser " + i + " \uD83E\uDDD1 Humano normal.");
                    }
                }
                case 2 -> {
                    if (idade <= 5 || idade >= 120) {
                        System.out.println("Ser " + i + " \uD83D\uDC7D Alienígena detectado!");
                    } else {
                        System.out.println("Ser " + i + " \uD83E\uDDD1 Humano normal.");
                    }
                }
                case 3 -> {
                    if (qtdOlhos == 1) {
                        System.out.println("Ser " + i + "\uD83D\uDC7D Alienígena detectado!");
                    } else {
                        System.out.println("Ser " + i + "\uD83E\uDDD1 Humano normal.");
                    }
                }
                default -> System.out.println("❌ Opção inválida. Por favor, escolha 1, 2 ou 3.");
            }
        }
    }
}

