package learning.java;

public class Contact {
    //     Two fields, both String, one called name and the other phoneNumber.

    private String name;
    private String phoneNumber;

    // A constructor that takes two Strings, and initialises name and phoneNumber.

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // And Three methods, they are:
    // getName(), getter for name.

    public String getName() {
        return name;
    }

    //  getPhoneNumber(), getter for phoneNumber.

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // createContact(), has two parameters of type String (the persons name and phone number) and returns an instance
    // of Contact. This is the only method that is static.

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
