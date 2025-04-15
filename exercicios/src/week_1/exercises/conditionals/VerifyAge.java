package week_1.exercises.conditionals;

import java.util.Scanner;

/*
 1. O que preciso fazer? -> Pedir ao usuario sua idade e dizer se ele é
    maior ou menor de idade (considerar 18 anos).
    saida esperada:
    Digite sua idade: 17
    Você é menor de idade.

 2. Que tipo de dados estou lidando? -> int e double
 3. Ferramentas que vamos usar no Java:
    Scanner para ler a entrada do usuário
    Variáveis do tipo double e boolean
    Operaçao condicional
    System.out.printf()ara formatar com 2 casa decimal

  4. Passos em pseudocódigo
    1- CriarScanner
    2- Exibir mensagem solicitando a idade
    3- Ler o valor digitado
    4- Operaçao condicional
    5- Exibir o resultado final das operacoes.
 */

public class VerifyAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.printf("You are %d years old, so you are an adult.%n", age);
        } else {
            System.out.printf("You are %d years old, so you are a minor.%n", age);
        }

        scanner.close();
    }
}