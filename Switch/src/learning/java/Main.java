package learning.java;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 1;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

        // challenge

        // Create a new Switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // add a default displays a message saying not found

        char letter = 'D';
        switch(letter) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("letter was a " + letter);
                break;
            default:
                System.out.println("'" + letter + "'" + " not valid");
                break;
        }

        String month = "January";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("It is " + month);
                break;
            case "June":
                System.out.println("It is Tim's bday month");
            default:
                System.out.println("Not sure");
        }
    }
}
