package learning.java;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Collin", 500);
        System.out.println("new score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calFeetAndInchesToCentimeters(6, 11);
        System.out.println(centimeters);
        centimeters = calFeetAndInchesToCentimeters(-10);
        System.out.println(centimeters);
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("no player name, no player score");
        return 0;
    }

    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters
    // feet is the first parameter, inches is the second parameter
    //
    // You should validate that the first parameter feet is >= 0
    // You should validate that the second parameter inches is >= 0 and <= 12
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimeters
    // comprise the feet and inches passed to this method and return
    // that value

    public static double calFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 11)) {
            return -1;
        }
        return ((feet * 12) + inches) * 2.54;
    }

    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    // validate that its >= 0
    // return -1 if it is not true
    // But if it is valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call the other overloaded method passing the correct feet and inches
    // calculated so that it can calculate correctly.
    // hints: use doubles for you number datatypes is probably a good idea;
    // 1 inch = 2.54 cm and one foot is 12 inches
    // use the link I give you to confirm your code is calculating correctly
    // calling another overloaded method just requires you to use the
    // right number of parameters

    public static double calFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) Math.floor(inches / 12);
        double remainingInches = (int) inches % 12;
        return calFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
