/*

Problem Statement: Library Management System
You are required to design a library management system in Java using ArrayList.
The system should have the following classes:
Book - This class should contain the following attributes:
 bookId, bookName, author, and quantity. It should also have a method to display book details.
User - This class should contain the following attributes:
 userId, userName, and booksIssued. It should also have methods to display user details and to issue/return a book.
Library - This class should contain an ArrayList to store all the books and an ArrayList to store all the users.
It should have methods to add/remove books and users, to display all books/users,
to issue/return a book, and to display all books issued by a particular user.

*/

import java.util.ArrayList;

public class Program234 {

    public static void main(String[] args) {


        Library3 library = new Library3();

        Book3 book1 = new Book3(1, "Java Basics", "James Gosling", 2);
        Book3 book2 = new Book3(2, "Advanced Java", "Joshua Bloch", 1);
        Book3 book3 = new Book3(3, "DJU TMKC", "PJT", 69);



        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);



        User3 user1 = new User3(101, "Alice");
        User3 user2 = new User3(102, "Bob");


        library.addUser(user1);
        library.addUser(user2);



        System.out.println("All Books in Library:");
        library.displayBooks();


        System.out.println("All Users:");
        library.displayUsers();



        System.out.println("Issuing Books:");

        user1.issueBook(book1);
        book1.quantity--;

        user1.issueBook(book2);
        book2.quantity--;

        user2.issueBook(book3);
        book3.quantity--;


        System.out.println("Books Issued by Alice:");
        library.displayBooksIssuedByUser(user1);

        System.out.println("Books Issued by Bob:");
        library.displayBooksIssuedByUser(user2);


        System.out.println("Returning a Book:");
        user1.returnBook(book1);
        book1.quantity++;


        System.out.println("Final Book List:");
        library.displayBooks();


        System.out.println("Final User Details:");
        library.displayUsers();

    }

}


class Book3 {

    int bookID;
    String bookName;
    String author;
    int quantity;

    public Book3(int bookID, String bookName, String author, int quantity) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
    }

    public void display(){

        System.out.println();
        System.out.println("Book ID: " + bookID);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Quantity: " + quantity);
        System.out.println();

    }

}

class User3 {

    int userID;
    String userName;
    ArrayList<Book3> booksIssued = new ArrayList<>();

    public User3(int userID, String userName) {
        this.userID = userID;
        this.userName = userName;
    }


    public void display(){

        System.out.println();
        System.out.println("User ID: " + userID);
        System.out.println("User Name: " + userName);
        System.out.println("Books Issued: ");
        for(Book3 b : booksIssued){
            b.display();
        }
        System.out.println();

    }

    public void issueBook(Book3 book){
        booksIssued.add(book);
    }

    public void returnBook(Book3 book){
        booksIssued.remove(book);
    }


}

class Library3 {

    ArrayList<Book3> books = new ArrayList<>();
    ArrayList<User3> users = new ArrayList<>();

    public void addBook(Book3 book){
        books.add(book);
    }

    public void removeBook(Book3 book){
        books.remove(book);
    }

    public void addUser(User3 user){
        users.add(user);
    }

    public void removeUser(User3 user){
        users.remove(user);
    }

    public void displayBooks(){
        for(Book3 b : books){
            b.display();
        }
    }

    public void displayUsers(){
        for(User3 u : users){
            u.display();
        }
    }

    public void displayBooksIssuedByUser(User3 user){

        for(Book3 b : user.booksIssued){
            b.display();
        }

    }


}