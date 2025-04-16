package week_1.exercises.conditionals;

import java.util.Scanner;


/*
1. What do I need to do? -> Ask for three integers and identify which one is the largest. Bonus challenge: say if there is a tie.

2. What type of data am I dealing with? -> Integer numbers

3. What tools will I use?
Scanner to read user input
Int variables to store the numbers
Conditional statements to check which number is the largest and if there’s a tie
System.out.println to display the result

4. Steps in pseudocode
    1- Create Scanner
    2- Read 3 integers
    3- Use conditionals to check the largest number and if there’s a tie
    4- Display the result
*/

public class IntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("The largest number is: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The largest number is: " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("The largest number is: " + number3);
        } else {
            System.out.println("The numbers are equal.");
        }

        scanner.close();
    }
}
