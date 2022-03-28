package learning.java;

public class GoodRectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    // first constructor
    public GoodRectangle() {
        this(0, 0); // calls the second constructor
    }

    // 2nd constructor
    public GoodRectangle(int width, int height) {
        this(0, 0, width, height); // call the 3rd constructor
    }

    // 3rd constructor
    public GoodRectangle(int x, int y, int width, int height) {
        // initialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
// In this example we have three constructors.
// The 1st constructor calls the 2nd, the 2nd constructor calls the 3rd constructor, and the 3rd constructor
// initializes the instance variables.
// The 3rd constructor does all the work
// No matter what constructor we call, the variables will always be initialized in the 3rd constructor
// This is known as constructor chaining, the last constructor has the "responsibility" to initialize the variables.