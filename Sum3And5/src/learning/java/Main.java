package learning.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("This number is divisible by 3 and 5: " + i);
                sum += i;
                count++;
            }
            if (count == 5) {
                System.out.println("Exiting loop");
                break;
            }
        }
        System.out.println("Total of all numbers divisible by 3 and also 5: " + sum);
    }
    // create a for statement using a range of numbers from 1 to 1000 inclusive
    // sum all the numbers that can be divided by both 3 and also with 5
    // for those numbers that met the above conditions, print out the number
    // break out of the loop once you find 5 numbers that meet the above conditions
    // after breaking out of the loop print the sum of the numbers that met the above conditions
    // Note: type all code in main method
}
