package block_1.exercises.conditionals.condSwitch;

/*
 1. O que preciso fazer? -> Ler nota e classificar a nota com a letra
    e exibir a letra correspondente da nota

 2. Que tipo de dados estou lidando? -> double, int

 3. Ferramentas que vamos usar no Java:
    Scanner para ler a entrada do usuário
    Variáveis do tipo double e int
    Operaçao com switch
    inf para verificar se a nota for menor que 5 a classificacao sera D
    System.out.println()

  4.Passos em pseudocódigo:
    Criar o Scanner
    entrar a nota (double)
    criar variave int para converter nota
    Usar switch para executar a lógica de classificacao
    Exibir ou resultado com System.out.println()
 */

import java.util.Scanner;

public class GradeClassificationSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota = scanner.nextDouble();

        int notaInt = (int) nota;

        if (notaInt < 5 || notaInt > 10) {
            System.out.println("Nota invalida");
        } else {
            switch (notaInt) {
                case 10, 9 -> System.out.println("Classificação: A ");
                case 8, 7 -> System.out.println("Classificação: B ");
                case 6, 5 -> System.out.println("Classificação: C ");
                default -> System.out.println("Classificação: D");
            }
        }
        scanner.close();
    }
}
