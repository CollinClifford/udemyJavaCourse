package learning.java;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. to allow the customer to withdraw funds.  This should deduct from the balance field,
        // but not allow withdrawal to complete if there are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // add some System.out.println() in the two methods above as well.
        BankAccount bankAccount = new BankAccount(12345, 534.23, "Collin Clifford", "collinclifford@ymail.com", 2788876);
        BankAccount newAccount = new BankAccount();
        BankAccount timAccount = new BankAccount("Tim", "tim@time.com", 4444444);
        // bankAccount.setAccountNumber(12345);
        // bankAccount.setBalance(534.23);
        // bankAccount.setCustomerName("Collin Clifford");
        // bankAccount.setEmail("collinclifford@ymail.com");
        // bankAccount.setPhoneNumber(2788876);
        bankAccount.withdrawalFunds(555.34);  // You do not have enough available funds for this transaction.
        bankAccount.depositFunds(200.44); // Your new balance is: 734.67
        bankAccount.withdrawalFunds(420.69); // Your new balance is: 313.98
        bankAccount.printStatement();
        newAccount.printStatement();
        timAccount.printStatement();

        // Create a new Class VipCustomer
        VipCustomer collin = new VipCustomer();
        VipCustomer erin = new VipCustomer(2500.00, "member@bank.net");
        VipCustomer johnDoe = new VipCustomer("John Doe", 10, "johndoe@email.co.uk");
        collin.printStatement();
        erin.printStatement();
        johnDoe.printStatement();


        // it should have 3 field name, credit limit, and email address
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the two values it recieves and add a default value for the 3rd
        // 3rd constructor should save all fields
        // create getters only for this using code generation of IntelliJ as setters won't be needed
        // test and confirm it works.
    }

}
