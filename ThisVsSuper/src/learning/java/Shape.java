package learning.java;

public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ShapeRectangle extends Shape {
    private int width;
    private int height;

    // 1st constructor
    public ShapeRectangle(int x, int y) {
        this(x, y, 0, 0); // calls from first constructor
    }

    // 2nd constructor
    public ShapeRectangle(int x, int y, int width, int height) {
        super(x, y); // calls from parent (Shape)
        this.width = width;
        this.height = height;
    }
}

// In this example we have a class Shape with x,y variables and class ShapeRectangle that extends Shape
// with variables width and height.
// In ShapeRectangle, in the first constructor we're calling the second constructor
// the second constructor calls the parent constructor
// The parent constructor will initialize x,y variables while the second constructor will initialize the width
// and height variables
// Here we have super() and this() calls.
