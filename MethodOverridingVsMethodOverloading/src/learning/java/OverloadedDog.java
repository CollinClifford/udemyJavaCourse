package learning.java;

public class OverloadedDog {
    public void bark() {
        System.out.println("Woof");
    }

    public void bark(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Woof");
        }
    }
}
