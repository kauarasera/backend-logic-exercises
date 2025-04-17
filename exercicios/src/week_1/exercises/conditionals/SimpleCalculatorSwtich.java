package week_1.exercises.conditionals;

import java.util.Scanner;

/*
 1. O que preciso fazer? -> Receber dois números e uma operação ( +, -, *, /)
    e calcular o resultado conforme a operação escolhida.


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
public class SimpleCalculatorSwtich {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double primeiroNUmero = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        double segundoNumero = scanner.nextInt();
        System.out.println("Digite a operação (+ - * /): ");
        char operacao = scanner.findInLine();

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = primeiroNUmero + segundoNumero;
                System.out.printf("Resultado: %.2f%n", resultado);
            case '-':
                resultado = primeiroNUmero - segundoNumero;
                System.out.printf("Resultado: %.2f%n", resultado);
            case '*':
                resultado = primeiroNUmero * segundoNumero;
                System.out.printf("Resultado: %.2f%n", resultado);
            case '/':
                if (resultado != 0) {
                    resultado = primeiroNUmero / segundoNumero;
                    System.out.printf("Resultado: %.2f%n", resultado);
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;

            default:
                System.out.println("Operação inválida.");
        }
    }
}
