/*

Problem Statement: Implement a Phone Book
Write a Java program to implement a phone book using an ArrayList and a LinkedList.
The phone book should allow users to add, delete, and search for contacts by name or phone number.
To solve this problem, you can create a Contact class that stores
the name and phone number of each contact.
You can then use an ArrayList to store the contacts and a
LinkedList to store the indices of the contacts sorted by name.

*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Program239 {

    ArrayList<Contact> contacts = new ArrayList<>();
    LinkedList<Contact> indices = new LinkedList<>();

    public static void main(String[] args) {

        Program239 phoneBook = new Program239();

        //   -... ..- -.. .... .... .- / -... .... --- ... -.. .-
        phoneBook.addContact("Dilip", 6969696969l);
        phoneBook.addContact("Tony stark", 9876543210l);
        phoneBook.addContact("Homelander", 5555555555l);


        phoneBook.searchContactByName("Dilip");
        phoneBook.searchContactByPhoneNo(9876543210l);

        phoneBook.deleteContact("Dilip");

        phoneBook.searchContactByName("Dilip");


    }

    public void addContact(String name, long phoneNo){

        Contact contact = new Contact(name, phoneNo);

        contacts.add(contact);
        indices.add(contact);

        indices.sort(Comparator.comparing(Contact::getName));

    }

    public void deleteContact(String name) {

        Iterator i = contacts.iterator();

        while (i.hasNext()) {

            Contact contact = (Contact) i.next();

            if (contact.getName().equals(name)) {
                contacts.remove(contact);
                indices.remove(contact);
                break;
            }

        }

    }


    public void searchContactByName(String name){

        Iterator i = indices.iterator();

        while(i.hasNext()) {

            Contact contact = (Contact) i.next();

            if (contact.getName().equals(name)) {
                contact.display();
                break;
            }

        }
    }


    public void searchContactByPhoneNo(long phoneNo) {

        Iterator i = contacts.iterator();

        while (i.hasNext()) {
            Contact contact = (Contact) i.next();

            if (contact.getPhoneNumber() == phoneNo) {
                contact.display();
                break;
            }
        }

    }

}


class Contact{

    String name;
    long phoneNumber;

    public Contact(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public void display() {
        System.out.println("name=" + name + ", phoneNumber=" + phoneNumber);
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}