package learning.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    // Method overloading means providing two or more separate methods in a class with the same name but different
    // parameters.
    // Method return type may or may not be different and that allows us to reuse the same method name
    // Overloading is very handy, it reduces duplicate code and we don't have to remember multiple method names
    // Overloading does not have anything to do with polymorphism but Java developers often refer to overloading as
    // Compile Time Polymorphism
    // In other words the compiler decided which method is going to be called based on the method name, return type
    // and argument list.
    // We can overload static and instance methods.
    // Usually overloading happens inside a single class, but a method can also be treated as overloaded in the
    // subclass of that class.
    // That is because a subclass inherits one version of the method from the parent class and then the subclass can
    // have another overloaded version of the method.
    // Methods will be considered overloaded if both follow the following rules
    //   * Methods must have the same method name
    //   * Methods must have different parameters
    // If Methods follow the rules above they may or may not
    //   * have different return types
    //   * have different access modifiers
    //   * Throw different checked or unchecked exceptions

    // Method overriding means defining a method in a child class that already exists in the parent class with the
    // same signature (same name, same arguments).
    // By extending the parent class the child class gets all the methods defined in the parent class (those methods
    // are also known as derived methods).
    // Method overriding is also known as Runtime Polymorphism and Dynamic Method Dispatch, because the method that is
    // going to be called is decided at runtime by the Java Virtual Machine (JVM).
    // When we override a method it's recommended to put @Override immediately above the method definition.  This is an
    // annotation that the compiler reads and will then show us if we don't follow overriding rules correctly.
    // We can't override static methods.  Only instance methods.
    // Methods will be considered overridden if we follow these rules:
    //   * It must have the same name and same arguments
    //   * Return type can be a subclass of the return type in the parent class
    //   * It can't be a lower access modifier
    //   * For example if the parent method is protected using private in the child is not allowed but using public
    //     in the child would be allowed.
    // There are also some important points about method overriding to keep in mind
    //   * Only inherited methods can be overridden, in other words methods can only be overridden in the child class
    //   * Constructors and private methods cannot be overridden
    //   * Methods that are final cannot be overridden
    //   * A subclass can use super.methodName() to call the superclass version of an overridden method.
}
