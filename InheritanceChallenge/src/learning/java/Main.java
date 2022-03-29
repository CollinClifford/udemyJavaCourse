package learning.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Impreza banjo = new Impreza(0);
        banjo.steer(45);
        banjo.accelerate(30);
        banjo.accelerate(20);
        banjo.accelerate(-42);
    }
    // Challenge
    // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
    // Finally, create another class, a specific type of Car that inherits from the Car class.
    // You should be able to handle steering, changing gears, and moving (speed in other words).
    // You will want to decide where to put the appropriate state and behaviors (fields and methods).
    // As mentioned above, changing gears, increasing/decreasing speed should be included.
    // For your specific type of vehicle you will want to add something specific for that type of car.
}
