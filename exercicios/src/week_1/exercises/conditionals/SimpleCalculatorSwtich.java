package week_1.exercises.conditionals;

import java.util.Scanner;

/*
 1. O que preciso fazer? -> Receber dois números e uma operação ( +, -, *, /)
    e calcular o resultado conforme a operação escolhida.

 2. Que tipo de dados estou lidando? -> double e char

 3. Ferramentas que vamos usar no Java:
    Scanner para ler a entrada do usuário
    Variáveis do tipo double e char
    Operaçao if/else, switch
    System.out.printf() para formatar com 2 casa decimal

  4.Passos em pseudocódigo:
    Criar oScanner
    Ler os dois números (double)
    Ler a operação (char)
    Usar switch para executar a operação
    Exibir ou resultado comSystem.out.printf()
    Tratar operação inválida (padrão)
 */
public class SimpleCalculatorSwtich {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double primeiroNUmero = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();
        System.out.println("Digite a operação (+ - * /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = primeiroNUmero + segundoNumero;
                System.out.printf("Resultado soma: %.2f%n", resultado);
            case '-':
                resultado = primeiroNUmero - segundoNumero;
                System.out.printf("Resultado subtracao: %.2f%n", resultado);
            case '*':
                resultado = primeiroNUmero * segundoNumero;
                System.out.printf("Resultado multiplicacao: %.2f%n", resultado);
            case '/':
                if (segundoNumero != 0) {
                    resultado = primeiroNUmero / segundoNumero;
                    System.out.printf("Resultado: %.2f%n", resultado);
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;

            default:
                System.out.println("Operação inválida.");
        }
        scanner.close();
    }
}
