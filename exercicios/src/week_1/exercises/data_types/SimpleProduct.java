package week_1.exercises.data_types;

import java.util.Scanner;
/*
 1. O que preciso fazer? -> Calcular o produto simples de dois valores inteiros
 2. Que tipo de dados estou lidando? -> Int
 3. Ferramentas que vamos usar no Java:
    Scanner para ler a entrada do usuário
    Variáveis do tipo int
    Operações matemáticas
    System.out.println()
  4. Passos em pseudocódigo
    1- ImportarScanner
    2- CriarScanner
    2- Exibir mensagem solicitando os o primeiro numeros
    3- Ler o valor digitado
    4- Exibir mensagem solicitando os o segundo numeros
    5- Ler o valor digitado
    6- Aplicar uma fórmula para:
        prod = valor1 * valor2;
    7- Exibir o resultado final das operacoes.
 */

public class SimpleProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int prod = valor1 * valor2;

        System.out.println("Valor de PROD:" + prod );

        scanner.close();

    }
}
