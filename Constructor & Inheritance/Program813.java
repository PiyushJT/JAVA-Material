/*

Declare a class called book having author_name as data member.
Extend book class to have two sub classes called book_publication
& paper_publication. Each of these classes have member called title.
Write a complete program to show usage of method overriding to display
book or paper publications of given author. (Use Scanner class for inputting data)

*/

class Program813 {

    public static void main(String[] args) {

        book_publication bookPub = new book_publication("author", "bookTitle");

        paper_publication paperPub = new paper_publication("author", "paperTitle");

        bookPub.display();

        paperPub.display();

    }

}

// Base class
class Book {
    String author_name;

    Book(String author_name) {
        this.author_name = author_name;
    }

    void display() {
        System.out.println(author_name);
    }

}

class book_publication extends Book {
    String title;

    book_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    void display() {
        System.out.println(author_name);
        System.out.println(title);
    }
}

class paper_publication extends Book {
    String title;

    paper_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    void display() {
        System.out.println(author_name);
        System.out.println(title);
    }
}