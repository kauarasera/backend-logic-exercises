package block_1.exercises.conditionals.condSwitch;

import java.util.Scanner;

/*
 1. O que preciso fazer? -> Criar um programa que mostre 3 opcoes:
    1 - Cadastrar usuário
    2 - Deletar usuário
    3 - Atualizar usuário
    O Usuario digita o numero da opcao e o programa deve exibir uma mensagem
    correspondendo a acao escolhida. Se for digitado errado exibir uma mensagem invalida

 2. Que tipo de dados estou lidando? -> int

 3. Ferramentas que vamos usar no Java:
    Scanner para ler a entrada do usuário
    Variáveis do tipo int
    Operaçao com switch
    default para opcao invalida
    System.out.println()

  4.Passos em pseudocódigo:
    Criar o Scanner
    entrada com as opcoes do menu
    Usar switch para executar a lógica de classificacao
    Exibir ou resultado com System.out.println()
 */

public class OptionMenuSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Escolha uma opção:
                
                1 - Cadastrar usuário
                2 - Deletar usuário
                3 - Atualizar usuário
                """);

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("Cadastrando o usuário");
            case 2 -> System.out.println("Deletando o usuário");
            case 3 -> System.out.println("Atualizando usuário");
            default -> System.out.println("Opcao invalida");
        }

        scanner.close();
    }
}
