package week_1.exercises.conditionals;

/*
1. What do I need to do? -> Ask the user for a number from 1 to 7 and show the corresponding day of the week.

2. What type of data am I dealing with? -> Integer number and String

3. What tools will I use?
Scanner to read user input
Int variable to store the number and the Switch to check which day of the week it corresponds to
name
Switch to check which day of the week it corresponds to
System.out.printf to display the result

4. Steps in pseudocode
    1- Create Scanner
    2- Read the number
    3- Declare variables and use a switch to determine the day of the week
    4- Display the result
    5- Close the scanner
*/

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number. Please enter a number from 1 to 7.");
        }

        scanner.close();
    }
}

