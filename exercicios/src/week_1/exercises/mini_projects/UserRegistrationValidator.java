package week_1.exercises.mini_projects;

import java.util.Scanner;

/*
 1. O que preciso fazer? — >
 criar uma aplicação Java simples de console que:
    Pergunte o nome, a idade e o país do usuário.
    Utilize condicionais (if-else) e um switch para validar as informações inseridas.
    Utilize algum méto-do interno (como String.isBlank() ou String.length()) para validação adicional.

 Regras para validação (especificações do exercício):
    Nome não pode estar vazio ou só espaços (String.isBlank()).
    Idade deve ser um número inteiro válido maior ou igual a 18.
    País (digitado pelo usuário) será validado com switch para aceitar somente:
        "brasil", "canada", "portugal" (minúsculo mesmo).
    Se alguma dessas validações falhar, deve mostrar claramente o erro e pedir ao usuário para tentar novamente.

 2. Que tipo de dados estou lidando? — > String,int
 3. Ferramentas que vamos usar no Java:
    Scanner para ler a entrada do usuário
    Variáveis do tipo int e double
    Operações matemáticas
    condicionais if/else, switch
    chamar metodos do java
    System.out.printf()


 4. Passos em pseudocódigo
    1- CriarScanner

    2- Exibir mensagem solicitando o nome
    3- Ler o valor digitado
    4- Exibir mensagem solicitando idade
    5- Ler o valor digitado
    6- Exibir mensagem solicitando pais

    7- criar condicional if/else (string.isBlank, idade = 18)
        7.1 criar switch para aceitar somente "brasil", "canada", "portugal" (minúsculo mesmo).
       Se algumas das validacoes falhar, o usuario tenta novamente

    8- Exibir o resultado final das condicoes com formatacoes corretas
*/
public class UserRegistrationValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your country (brasil, canada, portugal): ");
        String country = scanner.nextLine().toLowerCase();

        if (name.isBlank()) {
            System.out.println("❌ Name can't be empty.");
        } else if (age < 18) {
            System.out.println("❌ Age minimum is 18 years.");
        } else {
            switch (country) {
                case "brasil":
                case "canada":
                case "portugal":
                    System.out.println("\n✅ Registration successful!");
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Country: " + country);
                    break;
                default:
                    System.out.println("❌ Country not accepted. Please enter brasil, canada or portugal.");
                    break;
            }
        }

        scanner.close();
    }
}
