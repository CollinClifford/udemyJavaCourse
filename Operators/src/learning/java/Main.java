package learning.java;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;  // 3 -1 = 2;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result  = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);
        result = result % 3; // 4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("and I am scared of aliens.");
        }

        int yourScore = 50;
        int topScore = 100;
        int secondScore = 80;
        if (yourScore <= topScore && yourScore > secondScore) {
            System.out.println("You got the high score!");
        } else {
            System.out.println("Try again");
        }

        if ((topScore) > 90 || (secondScore >= 90)) {
            System.out.println("either or both are true");
        }

        int newValue = 50;
        if ((newValue == 50)){
            System.out.println("this is an error");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not suppose to happen.");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("was true");
        }
    }
}
