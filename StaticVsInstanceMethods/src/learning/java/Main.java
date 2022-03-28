package learning.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator.printSum(5, 10);
        printHello();

        Dog rex = new Dog(); // create instance
        rex.bark(); // call the instance method
    }
    public static void printHello() {
        System.out.println("hello");
    }
    // Static methods are declared using a static modifier
    // Static methods can't access instance methods and instance variables directly
    // They are usually used for operations that don't require any data from an instance of the class (from 'this')
    // If you remember, the this keyword is the current instance of a class
    // In static methods we don't have access to the this keyword.
    // Whenever you see a method that doesn't use instance variables that method should be declared as a static method
    // For example, main is a static method and it is called by the JVM when it starts an application.
    //
    // Instance methods belong to an instance of a class
    // To use an instance method we have to instantiate the class first usually by using the new keyword
    // Instance methods can access instance methods and instance variables directly
    // Instance methods can also access static methods and static variables directly
    //
}

