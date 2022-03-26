package learning.java;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount() {
        this(67890, 22.22, "John Doe", "myemail@email.com", 5555555);
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, long phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
    }

    public BankAccount(String customerName, String email, long phoneNumber) {
        this(00000, 105.00, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double amount) {
        this.balance += amount;
        System.out.println("Your new balance is: " + this.balance);
    }

    public void withdrawalFunds(double amount) {
        if ((this.balance - amount) < 0) {
            System.out.println("You do not have enough available funds for this transaction.");
        } else {
            this.balance -= amount;
            System.out.println("Your new balance is: " + this.balance);
        }
    }

    public void printStatement() {
        System.out.println("--------------------------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + email);
        System.out.println("Balance: $" + balance);
        System.out.println("--------------------------------");
    }
 }
