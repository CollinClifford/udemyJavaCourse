package learning.java;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string.";
        System.out.println("My string is = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My string is = " + myString);
        myString = myString + "\u00A9 2022";
        System.out.println("My string is = " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = myInt + lastString;
        System.out.println("lastString is = " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is = " + lastString);
    }
}
