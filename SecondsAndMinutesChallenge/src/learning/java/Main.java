package learning.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String solution;
        solution = getDurationString(65, 45);
        System.out.println(solution);
        solution = getDurationString(3945);
        System.out.println(solution);
        solution = getDurationString(-10);
        System.out.println(solution);
        solution = getDurationString(65, -9);
        System.out.println(solution);
    }
    // create a method called getDurationString with two parameters, first parameter
    // (int) minutes and 2nd parameter (int) seconds
    // You should validate that the first parameter minutes is >= 0
    // You should validate that the second parameter seconds is >= 0 and <= 59
    // The method should return "Invalid Value" in the method if either of the above are not
    // true
    // If the parameters are valid then calculate how many hours, minutes and seconds
    // equal the minutes and seconds passed to this method and return that value as
    // string in format "XXh YYm ZZs" where XX represents the number of hours, YY the
    // number of minutes and ZZ the seconds

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = (int) minutes / 60;
        int remainingMinutes = minutes % 60;
        String hourString = hours + "h ";
        if (hours < 10) {
            hourString = "0" + hourString;
        }
        String minuteString = remainingMinutes + "m ";
        if (remainingMinutes < 10) {
            minuteString = "0" + minuteString;
        }
        String secondString = seconds + "s";
        if (seconds < 10) {
            secondString = "0" + secondString;
        }
        return hourString + minuteString + secondString;
    }

    // create a 2nd method of the same name but with only one parameter (int) seconds
    // Validate that it is >= 0 and return "Invalid Value" if it is not true
    // If it is valid calculate how many minutes are in the seconds value and then call
    // the other overloaded method passing the correct minutes and seconds calculated so
    // that it can calculate correctly

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = (int) seconds / 60;
        int remainingSeconds = (int) seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    // call both methods to print values to the console
    //
    // TIPS:
    // Use Int or long for your number data types is probably a good idea
    // 1 minutes = 60 seconds, 1 hour = 60 minutes or 3600 seconds
    // Methods should be static as we have used previously
    //
    // BONUS:
    // For the input 61 minutes output should be 01h 01m 00s, but it's okay if it is  1hr 1m 0s
    // (Tip: use if-else)
    // Create a new console project and call it SecondsAndMinutesChallenge
}
