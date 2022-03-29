package learning.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(20,true);
        printer.addToner(29);
        System.out.println(printer.getTonerLevel());
        printer.printPages(3);
        System.out.println(printer.getPagesPrinted());
    }
    // create a class and demonstrate proper encapsulation techniques
    // the class will be called Printer
    // It will simulate a real computer printer
    // It should have fields for the toner Level, number of pages printed, and
    // also whether it is a duplex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%), another method to
    // simulate printing a page (which should increase the number of pages printed)
    // Decide on the scope, whether to use constructors, and anything else you think is needed.

}
