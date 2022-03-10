package learning.java;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while (count != 5) {
            System.out.println("while Count value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("while second Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("do/while Count value was " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int numberOfEvenNumbers = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number " + number);
            numberOfEvenNumbers++;
            if (numberOfEvenNumbers == 5) {
                break;
            }

        }
        System.out.println("Number of even numbers " + numberOfEvenNumbers);
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end display the total number of even numbers found.
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
