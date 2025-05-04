package block_1.exercises.data_types;

import java.util.Scanner;

/*
 1. What do I need to do? -> Write a program that reads an employee's number,
 the number of hours worked, the amount they earn per hour, and calculates their salary.

 2. What type of data am I dealing/tratando/ with? -> int and double with two decimal places

 3. Java tools I will use:
    Scanner to read user input
    Int-type variables
    Double-type variables
    Mathematical operations
    System.out.printf() for formatting with two decimal places

 4. Steps in pseudocode:
    1- Import Scanner
    2- Create Scanner
    3- Display message asking for the employee number (int)
    4- Read the entered value
    5- Display message asking for the number of hours worked (double)
    6- Read the entered value
    7- Display message asking for the hourly wage (double)
    8- Read the entered value
    9- Apply a formula to calculate the employee’s salary:
       double salary = hoursWorked * hourlyRate;/taxa horária/
   10- Display the final result of the operations.
        Note: there should be a space before and after the equal sign.
        For the salary, there should also be a space after the U$.
*/

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Salary Calculator***");
        System.out.print("Enter your employee number: ");
        int employeeNumber = scanner.nextInt();
        System.out.print("Number of hours worked: ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("Hourly wage: ");
        double hourlyRate = scanner.nextDouble();

        double salary = hoursWorked  * hourlyRate;

        System.out.printf("EMPLOYEE NUMBER = %d%nSALARY = U$ %.2f%n", employeeNumber, salary);

        scanner.close();
    }
}

