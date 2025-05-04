package block_1.exercises.data_types;

import java.util.Scanner;

/*
Cadastro de CNH com Verificação
Crie um programa quecp pergunte ao usuário:

Nome (String)
Idade (int)
Altura (duplo)
Se tem CNH (responder com "sim" ou "não")

*/

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Já possui CNH? " + "(sim/nao)");
        String cnh = scanner.nextLine();

        scanner.close();

        if (idade < 18) {
            System.out.println("Ops! Voce ainda nao pode dirigir legalmente");
        }

        System.out.println("Suas informacoes: " + nome + ", " + idade
                + " anos, " + altura + "m " + "Possui CNH: " + cnh);
    }

}
