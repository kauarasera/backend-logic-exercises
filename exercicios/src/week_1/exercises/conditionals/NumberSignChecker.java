package week_1.exercises.conditionals;

/*
 1. O que preciso fazer? Ler um número inteiro do usuário e informar se
    ele é positivo, negativo ou zero.
    saida esperada:
    Digite um número: -5
    O número é negativo.

 2. Que tipo de dados estou lidando? -> int
 3. Ferramentas que vamos usar no Java:
    Scanner para ler a entrada do usuário
    Variáveis do tipo double
    Operaçao condicional
    System.out.printf()

  4. Passos em pseudocódigo
    1- CriarScanner
    2- Exibir mensagem solicitando a idade
    3- Ler o valor digitado
    4- Operaçao condicional
    5- Exibir o resultado final das operacoes.
 */

import java.util.Scanner;

public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.printf("Number %d is negative.%n", number);
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.printf("Number %d is positive.%n", number);
        }

        scanner.close();
    }
}
