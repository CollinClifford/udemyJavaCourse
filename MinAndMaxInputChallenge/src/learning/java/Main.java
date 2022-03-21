package learning.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
        // Before the user enters the number, print the message "Enter number:"
        // If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                input = scanner.nextInt();
                if (input > max) {
                    max = input;
                }
                if (input < min) {
                    min = input;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Your max was " + max + " and your min was " + min);
        scanner.close();
        // Hint:
        // Use an endless while loop.
        // Bonus:
        // Create a project with the name MinAndMaxInputChallenge.
    }
}
