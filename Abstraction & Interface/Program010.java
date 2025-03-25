/*

Declare a class called book having author_name as private data member.
Extend book class to have two sub classes called
book_publication & paper_publication.
Each of these classes have private member called title.
Write a complete program to show usage of dynamic method
dispatch (dynamic polymorphism) to display book or
paper publications of given author.
Use command line arguments for inputting data.

*/

import java.util.*;

class Program010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter author name");
        String author = sc.next();
        System.out.println("Enter type (paper or book)");
        String type = sc.next();
        System.out.println("Enter title");
        String title = sc.next();


        // object declaration
        Book2 publication;

        if (type.equalsIgnoreCase("book")) {

            publication = new Book_publication(author, title);

        }
        else if (type.equalsIgnoreCase("paper")) {

            publication = new Paper_publication(author, title);

        }
        else {
            System.out.println("Don't be smart");
        }


    }
}



class Book2{
    private String author_name;

    Book2(String author_name){
        this.author_name = author_name;
    }
}

class Book_publication extends Book2{
    private String title;

    Book_publication(String author, String title){
        super(author);
        this.title = title;
    }

}

class Paper_publication extends Book2{
    private String title;

    Paper_publication(String author, String title){
        super(author);
        this.title = title;
    }

}