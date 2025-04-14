package week_1.exercises.data_types;

/*
 1. O que preciso fazer? -> Solicitar dois valores, criar as operacoes Soma, Subtração, Multiplicação, Divisão e Resto
    e exibi-las na mensagem final.
 2. Que tipo de dados estou lidando? -> double
 3. Ferramentas que vamos usar no Java:
    Scanner para ler a entrada do usuário
    Variáveis do tipo double
    Operações matemáticas
    System.out.printf()para formatar com 2 casa decimal

  4. Passos em pseudocódigo
    1- ImportarScanner
    2- CriarScanner
    2- Exibir mensagem solicitando os o primeiro numeros
    3- Ler o valor digitado
    4- Exibir mensagem solicitando os o segundo numeros
    5- Ler o valor digitado
    6- Aplicar uma fórmula para:
        Soma, Subtração, Multiplicação, Divisão e Resto
    7- Exibir o resultado final das operacoes.
 */

import java.util.Scanner;

public class Ex004_SomaDasOperacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double valor2 = scanner.nextDouble();

        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double multiplicacao = valor1 * valor2;
        double divisao = valor1 / valor2;
        double resto = valor1 % valor2;

        System.out.println("Resultado: \nSoma: " + soma + "\nSubtracao: " + subtracao +
                "\nMultiplicacao: " + multiplicacao + "\nDivisao: " + divisao + "\nResto: " + resto);

        scanner.close();
    }
}
