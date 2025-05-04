package block_1.exercises.mini_projects;

import java.util.Scanner;

/*
 Create user registration validator using conditionals and switch

This mini console application validates user input for name, age, and country.
- Name must not be blank (uses String.isBlank())
- Age must be 18 or older
- Country is validated using a switch statement (only 'brasil', 'canada', or 'portugal' are accepted)
- If all validations pass, a success message is shown
- If any validation fails, the corresponding error message is displayed
This version does not use methods or loops, keeping it simple for the current learning phase.

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