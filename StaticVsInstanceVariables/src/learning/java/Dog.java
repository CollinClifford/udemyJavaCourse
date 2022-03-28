package learning.java;

public class Dog {
    // private static String name; // makes it to where each method prints "Fluffy"
    private String name; // allows for variables to change independently.
    public Dog(String name) {
        // Dog.name = name
        this.name = name;
    }
    public void printName() {
        System.out.println("name = " + name);
    }
}
