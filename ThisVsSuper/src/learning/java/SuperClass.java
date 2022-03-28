package learning.java;

public class SuperClass { // parent class aka super class
    public void printMethod() {
        System.out.println("Printed in SuperClass.");
    }

    class SubClass extends SuperClass { // subclass aka child class
        // overides method from parent
        @Override
        public void printMethod() {
            super.printMethod(); // calls method in SuperClass (parent)
            System.out.println("Printed in SubClass.");
        }
    }
}
// The keyword super is commonly used with method overriding, when we call a method with the same name from the parent
// class.  In other words it's calling the method with the same name from the parent class.  Without the keyword
// super in this case it would be recursive call.  Meaning that the method would call itself forever (or until memory
// is fully used).  That is why the super keyword is needed.
