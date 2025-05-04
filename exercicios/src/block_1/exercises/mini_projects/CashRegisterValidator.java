package block_1.exercises.mini_projects;

import java.util.Scanner;

/*
 1. O que preciso fazer? — > Ler informações de 3 produtos:
    Quantidade (int)
    Valor unitário (double)
    Calcular o total a pagar
    Validar que a quantidade e o valor são maiores que zero (if/else)
        Se algum valor inválido for digitado (≤ 0), mostrar a mensagem: Erro: quantidade e valor devem ser maiores que zero.
    Se tudo estiver ok exibir mensagem com o total pagar
 2. Que tipo de dados estou lidando? — > String,int, double, if/else
 3. Ferramentas que vamos usar no Java:
    Scanner para ler a entrada do usuário
    Variáveis do tipo int e double
    Operações matemáticas
    condicionais if/else
    System.out.printf()
 4. Passos em pseudocódigo
    1- ImportarScanner
    2- CriarScanner
    2- Exibir mensagem solicitando o nome item1 (repetir o processo para o item2 e item3)
    3- Ler o valor digitado
    4- Exibir mensagem solicitando a quantidade item1 (repetir o processo para o item2 e item3)
    5- Ler o valor digitado
    6- Exibir mensagem solicitando o valor unitario item1 (repetir o processo para o item2 e item3)
    7- Aplicar uma fórmula para:
        valor total = (qtd1 * valor1) + (qtd2 * valor2) + (qtd3 * valor3)
    8- Se (valor <= zero )
        exibir (Erro: quantidade e valor devem ser maiores que zero)
       Se nao
        exibir (VALOR TOTAL: R$ <valor>)
    7- Exibir o resultado final das operacoes com formatacoes corretas
*/
public class CashRegisterValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade do item 1: ");
        int qtd1 = scanner.nextInt();
        System.out.print("Valor do item 1: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Quantidade do item 2: ");
        int qtd2 = scanner.nextInt();
        System.out.print("Valor do item 2: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Quantidade do item 3: ");
        int qtd3 = scanner.nextInt();
        System.out.print("Valor do item 3: ");
        double valor3 = scanner.nextDouble();

        double total = (qtd1 * valor1) + (qtd2 * valor2) + (qtd3 * valor3);

        if (valor1 <= 0 || valor2 <= 0 || valor3 <= 0)
            System.out.println("Erro: quantidade e valor devem ser maiores que zero.");
        else if (qtd1 <= 0 || qtd2 <= 0 || qtd3 <= 0) {
            System.out.println("Erro: quantidade e valor devem ser maiores que zero.");
        } else
            System.out.printf("VALOR TOTAL: R$ %.2f%n", total);

        scanner.close();
    }
}