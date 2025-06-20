/*

Write a Java program that creates a HashTable to store
information about books in a library. The HashTable should use
the book titles as keys and store information about each book,
such as the author, publisher, and year of publication.
The program should provide the following functionality:
Add a book: The program should prompt the user for a
book title, author, publisher, and year of publication, and
add the book to the HashTable. Remove a book: The program
should prompt the user for a book title and remove the
corresponding entry from the HashTable.
Search for a book: The program should prompt the user for a
book title and output the corresponding information stored
in the HashTable, such as the author, publisher, and year
of publication. If the book title is not found in the HashTable,
the program should o
List all books: The program should list all books in the HashTable,
along with their corresponding information.To accomplish these tasks,
you can use the following HashTable methods: put(key, value): Inserts
a key-value pair into the HashTable.
remove(key): Removes a key-value pair from the HashTable.
get(key): Returns the value corresponding to a given key in the HashTable.
containsKey(key): Returns true if the HashTable contains a given key.
keySet(): Returns a Set of all the keys in the HashTable.

*/

import java.util.*;

public class Program292 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hashtable<String, Book4> books = new Hashtable<>();

        int ch;

        do {

            System.out.println("Menu");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Search a book");
            System.out.println("4. Show all books");
            System.out.println("0. Exit");

            ch = sc.nextInt();


            switch (ch) {

                case 1:

                    System.out.println("Enter Title of book");
                    String title = sc.next();
                    sc.nextLine();

                    System.out.println("Enter author:");
                    String author = sc.next();
                    sc.nextLine();

                    System.out.println("Enter Publisher: ");
                    String publisher = sc.next();
                    sc.nextLine();

                    System.out.println("Enter year of publication: ");
                    int yOP = sc.nextInt();

                    Book4 newBook = new Book4(author, publisher, yOP);

                    books.put(title, newBook);
                    System.out.println("New book added successfully");
                    break;


                case 2:

                    System.out.println("Enter Title of book");
                    String bookTitle = sc.next();
                    sc.nextLine();

                    books.remove(bookTitle);

                    System.out.println("Done.");
                    break;


                case 3:

                    System.out.println("Enter Title of book");
                    String bkTitle = sc.next();
                    sc.nextLine();

                    if (books.containsKey(bkTitle))
                        System.out.println(books.get(bkTitle));
                    else
                        System.out.println("Book not found");
                    break;


                case 4:

                    System.out.println();

                    for (String s : books.keySet()) {

                        System.out.println();

                        System.out.println(s);
                        System.out.println(books.get(s));

                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid input");
                    break;

            }

        }
        while (ch != 0);


    }

}


class Book4 {

    String author;
    String publisher;
    int yearOfPublication;

    public Book4(String author, String publisher, int yearOfPublication) {
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "author: " + author + ", publisher: " + publisher + ", year of Publication: " + yearOfPublication;
    }

}