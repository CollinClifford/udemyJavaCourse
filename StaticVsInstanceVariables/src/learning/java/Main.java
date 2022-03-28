package learning.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog rex = new Dog("Rex"); // creates instance (rex)
        Dog fluffy = new Dog("Fluffy"); // creates instance (fluffy)
        rex.printName(); // prints fluffy
        fluffy.printName(); // prints fluffy
    }
    // Static Variables
    // Declared by using the keyword static
    // static variables are also known as static member variables
    // Every instance of that class shares the same static variables
    // If changes are made to that variable, all other instances will see the effect of the change.
    // static variabels aren't used very often but can sometimes be very useful.
    // For example when reading user input using Scanner we will declare scanner as static variable
    // that way the static methods can access it directly
    // Instance Variables
    // They don't use static keyword
    // Instance variables are also known as fields or member variables
    // Instance variables belong to an instance of a class
    // Every instance has it's own copy of an instance variable
    // Every instance can have a different value (state)
    // Instance variables represent the state of an instance


}
