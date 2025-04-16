package week_1.exercises.conditionals;

import java.util.Scanner;

/*
1. What do I need to do? -> Check if a number is even or odd

2. What type of data am I dealing with? -> Integer number

3. What tools will I use?
Scanner to read user input
Int variable to store the number
Math operation to check if the number is even or odd => number % 2 == 0
System.out.printf to display the result

4. Steps in pseudocode
    1- Create Scanner
    2- Read the number
    3- Use a math operation to check if the number is even or odd
    4- Display the result
*/

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        scanner.close();
    }
}
