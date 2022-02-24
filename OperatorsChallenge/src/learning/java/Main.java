package learning.java;

public class Main {

    public static void main(String[] args) {
	    // create a double variable with a value of 20.00
        // create a second variable of type double with the value 80.00
        // add both numbers together and multiply by 100.00
        // use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00
            // We use the modulus or remainder operator on ints in the course, but we can also use it on a double.
        // create a boolean variable that assigns the value true if the remainder in $4 is 0, or false if its not zero
        // output the boolean variable

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double sumDouble = (firstDouble + secondDouble) * 100.00d;
        System.out.println(sumDouble);
        double remainderDouble = sumDouble % 40.00d;
        System.out.println(remainderDouble);
        boolean isZero = (remainderDouble == 0) ? true : false;
        System.out.println(isZero);
        // write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.
            // Don't be surprised if you see output for this step, where you might expect it not to show, I'll explain it in my solution.
        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
