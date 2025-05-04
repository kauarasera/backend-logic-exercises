package block_1.exercises.conditionals.condSwitch;

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

        // Entrada dos números
        System.out.print("Enter the first number: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double numero2 = scanner.nextDouble();

        // Entrada da operação desejada
        System.out.print("Choose the operation (+, -, *, /): ");
        char operador = scanner.next().charAt(0);  // pega apenas o primeiro caractere

        double resultado;

        // Lógica de decisão usando switch
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.printf("Result: %.2f%n", resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.printf("Result: %.2f%n", resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.printf("Result: %.2f%n", resultado);
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.printf("Result: %.2f%n", resultado);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose one of: +, -, *, /");
        }

        scanner.close();
    }
}
