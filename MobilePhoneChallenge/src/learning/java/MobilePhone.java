package learning.java;

import java.util.ArrayList;

public class MobilePhone {
    // Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.

    private String myNumber;
    private ArrayList<Contact> myContacts;

    // A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't
    // exist, or false if the contact already exists.

    private boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    // updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact)
    // and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact
    // doesn't exist.

    private boolean updateContact(Contact contact, Contact newContact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            return false;
        }
        myContacts.set(foundPosition, newContact);
        return true;
    }

    // removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and
    // was removed successfully, or false if the contact doesn't exist.

    private boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact.getName());
        if (foundPosition < 0) {
            return false;
        }
        this.myContacts.remove(foundPosition);
        return true;
    }

    // findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in the
    // ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    // findContact(), same as above, only it has one parameter of type String.

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and
    // then return the Contact. Return null otherwise.

    private Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    // printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}