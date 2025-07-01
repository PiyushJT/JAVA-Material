/*

You are tasked with implementing a basic Library Management System in
Java, which allows users to manage books, register users, and handle
borrowing and returning of books. The system should support storing
information in files for persistence. The program consists of several
classes and functionalities, as described below:
Classes and Their Responsibilities:
1.Book:
•Represents a book with properƟes: id, Ɵtle, author, and availability.
•Provides a constructor to iniƟalize these properƟes.
•Overrides the toString method to display book details in a user-friendly format.
2.Catalog:
•Manages a collecƟon of books using an ArrayDeque.
•Provides methods to add a book, display all books, and ﬁnd a book by its
 ID.
3.User:
•Represents a library user with properƟes: userID, name, contactNumber,
 and membershipDate.
•Provides a constructor to iniƟalize these properƟes.
•Overrides the toString method to display user details in a user-friendly format.
4.TransacƟon:
•Represents a transacƟon for borrowing or returning a book with
 properties: bookId, userId, borrowDate, and returnDate.
5.Library:
•Manages the enƟre library system.
•Uses a Catalog object to manage books and a Hashtable to manage
 users.
•Uses an ArrayDeque to manage transacƟons.
•IniƟalizes the system and ensures ﬁles for books and users exist.
•Provides methods to register users, add books, display catalog, display
 users, borrow books, and return books.
•Provides methods to write user and book details to respecƟve ﬁles for
 persistence.
Main Functionality:
1.Adding a Book:
•Prompts the user to input book details and adds the book to the catalog.
•Writes book details to a ﬁle named books.txt.
2.Displaying the Catalog:
•Displays all books available in the catalog.
3.Registering a User:
•Prompts the user to input user details and registers the user in the
 system.
•Writes user details to a ﬁle named users.txt.
4.Displaying Users:
•Displays all registered users.
5.Borrowing a Book:
•Prompts the user to input the book ID, user ID, and borrow date.
•Marks the book as borrowed if it is available and records the transacƟon. 6.Returning a Book:
•Prompts the user to input the book ID, user ID, and return date.
•Marks the book as available if it was borrowed and updates the transaction.
7.ExiƟng the System:
•Provides an opƟon to exit the system.

*/

import java.util.ArrayDeque;

public class Sem2Program365 {

    public static void main(String[] args) {



    }

}


class Book5 {

    int id;
    String title;
    String author;
    boolean isAvailable;

    public Book5(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }


    public String toString() {
        return "ID: " + id + "\nTitle: " + title + "\nAuthor: " + author + "\nAvailable: " + isAvailable;
    }


}


class Catalog {

    ArrayDeque<Book5> books = new ArrayDeque();

    void addBook(Book5 book) {
        books.add(book);
    }

    void displayAllBooks() {
        for (Book5 book : books)
            System.out.println(book);
    }

    Book5 findBookById(int id) {
        for (Book5 book : books)
            if (book.id == id)
                return book;

        return null;
    }

}

class User {

    int userID;
    String name;
    String contactNumber;
    String membershipDate;

    public User(int userID, String name, String contactNumber, String membershipDate) {
        this.userID = userID;
        this.name = name;
        this.contactNumber = contactNumber;
        this.membershipDate = membershipDate;
    }

    public String toString() {
        return "User ID: " + userID + "\nName: " + name + "\nContact Number: " + contactNumber + "\nMembership Date: " + membershipDate;
    }

}


class Transaction {

    int bookId;
    int userId;
    String borrowDate;
    String returnDate;

    public Transaction(int bookId, int userId, String borrowDate, String returnDate) {
        this.bookId = bookId;
        this.userId = userId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String toString() {
        return "Book ID: " + bookId + "\nUser ID: " + userId + "\nBorrow Date: " + borrowDate + "\nReturn Date: " + returnDate;
    }

}