package block_1.exercises.data_types;

import java.util.Scanner;

/*
 1. O que preciso fazer? -> Calcular a media
 2. Que tipo de dados estou lidando? ->
 3. Ferramentas que vamos usar no Java:
    Scanner para ler a entrada do usuário
    Variáveis do tipo double
    Operações matemáticas
    System.out.printf()
 4. Passos em pseudocódigo
    1- ImportarScanner
    2- CriarScanner
    2- Exibir mensagem solicitando os o primeiro numeros
    3- Ler o valor digitado
    4- Exibir mensagem solicitando os o segundo numeros
    5- Ler o valor digitado
    6- Aplicar uma fórmula para:
        media = (valor1 + valor2 + valor3) / N
    7- Exibir o resultado final das operacoes.
*/
public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        double media = (valor1 + valor2)/2;

        System.out.println("Sua media é: " + media);

        scanner.close();

    }
}
