package learning.java;

public class VipCustomer {
    String name;
    double creditLimit;
    String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public VipCustomer() {
        this("Collin Clifford", 2000.00, "collinclifford@ymail.com");
    }

    public VipCustomer(double creditLimit, String email) {
        this("Erin League", creditLimit, email);
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public void printStatement() {
        System.out.println("--------------------------------");
        System.out.println("Customer Name: " + name);
        System.out.println("Credit Limit: " + creditLimit);
        System.out.println("Email Address: " + email);
        System.out.println("--------------------------------");
    }
}
