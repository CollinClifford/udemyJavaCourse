package learning.java;

public class Main {

    public static void main(String[] args) {
        // This line creates a new instance of the House class.
        // House is a blueprint, and we are assigning it to the blueHouse variable.  It is a reference to the object
        // in the memory
	    House blueHouse = new House("blue");
        // This line creates another reference to the same object.
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor()); // prints blue
        System.out.println(anotherHouse.getColor()); // prints blue

        // This changes both references to yellow because the share the same object.
        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor()); // prints red
        System.out.println(anotherHouse.getColor()); // prints red

        // This creates a new instance of the class House.
        House greenHouse = new House("green");
        // This dereferences anotherHouse and sets the reference to greenHouse.
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor()); // prints red
        System.out.println(greenHouse.getColor()); // prints green
        System.out.println(anotherHouse.getColor()); // prints green
    }

}

// A ClASS is basically a blueprint for a house, using the blueprint (plans) we can build as many houses as we like
// based on those plans.
// Each house you build (or in other words instantiate using the new operator) as an OBJECT also known as an INSTANCE.
// Each house you build have an address (a physical location).  In other words if you want to tell someone where you
// live, you give them your address (perhaps written on a piece of paper).  This is known as a REFERENCE.
// You can copy that REFERENCE as many times as you like but there is still just one house.  In other words we are
// copying the paper that has address on it not the house itself.
// We can pass REFERENCES as PARAMETERS to CONSTRUCTORS and METHODS.
