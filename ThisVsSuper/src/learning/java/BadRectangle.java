package learning.java;

public class BadRectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public BadRectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public BadRectangle(int width, int height) {
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    public BadRectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

// In this example we have three constructors.
// All three constructors initialize variables.
// There is repeated code in every constructor.  We are initializing variables in each constructor with some default
// values.
// YOU SHOULD NEVER WRITE CODE LIKE THIS.
