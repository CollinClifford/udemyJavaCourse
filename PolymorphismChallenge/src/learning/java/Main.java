package learning.java;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Subaru extends Car {
    public Subaru(int cylinders, String name) {
        super(4, "Subaru");
    }

    @Override
    public String startEngine() {
        return "Subaru -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Subaru -> accelerate()";
    }

    @Override
    public String brake() {
        return "Subaru -> brake()";
    }
}

class Honda extends Car {
    public Honda(int cylinders, String name) {
        super(4, "Honda");
    }

    @Override
    public String startEngine() {
        return "Honda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Honda -> accelerate()";
    }

    @Override
    public String brake() {
        return "Honda -> brake()";
    }
}

class Kia extends Car {
    public Kia(int cylinders, String name) {
        super(2, "Kia");
    }

    @Override
    public String startEngine() {
        return "Kia -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Kia -> accelerate()";
    }

    @Override
    public String brake() {
        return "Kia -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());;
        System.out.println(car.brake());
        Subaru subaru = new Subaru(4, "Impreza");
        System.out.println(subaru.startEngine());
        System.out.println(subaru.accelerate());
        System.out.println(subaru.brake());
        Honda honda = new Honda(4, "Civic");
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());
        Kia kia = new Kia(4, "Idk");
        System.out.println(kia.startEngine());
        System.out.println(kia.accelerate());
        System.out.println(kia.brake());
        // We are going to go back to the car analogy.
        // Create a base class called Car.
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true.  Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake.
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in one java file (this one).
    }
}
