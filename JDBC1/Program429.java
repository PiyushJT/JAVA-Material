/*

Assume you are building an online bookstore application that allows customers to purchase books.
You have decided to use JDBC to handle database operations. The application should have the following functionality:
Add books to the database
Retrieve a list of books from the database
Update book information in the database
Delete a book from the database
Requirements:
The program should establish a connection to the database using JDBC. The program should
allow users to enter book information such as title, author, publisher, and price.
The program should use PreparedStatement to insert, update and delete data from the database.
The program should use Statement to retrieve data from the database.
The program should display the list of books retrieved from the database.  The program
should handle exceptions such as SQLException and ClassNotFoundException.
Functionality:
The program should provide a menu to the user to perform CRUD operations on
the book database.
The program should handle input validation for book information such as non-null
values, valid prices, and book title length.
The program should display a success or failure message after each CRUD operation.

*/

import java.sql.*;
import java.util.*;

public class Program429 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {

            String url = "jdbc:mysql://localhost:3306/LJU";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            if (con == null) {
                System.out.println("Connection failed");
                return;
            }

            while (true) {

                System.out.println();
                System.out.println("1. Add Book");
                System.out.println("2. Show All Books");
                System.out.println("3. Update Book");
                System.out.println("4. Delete Book");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                String choice = sc.next();
                sc.nextLine();

                switch (choice) {


                    case "1":

                        // Add Book
                        System.out.print("Enter Title: ");
                        String title = sc.nextLine().trim();

                        if (title.isEmpty() || title.length() > 100) {
                            System.out.println("Invalid title. Must be non-empty and <= 100 chars.");
                            continue;
                        }

                        System.out.print("Enter Author: ");
                        String author = sc.nextLine().trim();

                        if (author.isEmpty()) {
                            System.out.println("Author cannot be empty.");
                            continue;
                        }

                        System.out.print("Enter Publisher: ");
                        String publisher = sc.nextLine().trim();

                        if (publisher.isEmpty()) {
                            System.out.println("Publisher cannot be empty.");
                            continue;
                        }

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        String insert = "INSERT INTO book (title, author, publisher, price) VALUES (?, ?, ?, ?)";

                        PreparedStatement pst = con.prepareStatement(insert);
                        pst.setString(1, title);
                        pst.setString(2, author);
                        pst.setString(3, publisher);
                        pst.setDouble(4, price);

                        int r = pst.executeUpdate();

                        if (r > 0)
                            System.out.println("Book added successfully.");
                        else
                            System.out.println("Failed to add book.");

                        break;

                    case "2":

                        // Show All Books
                        String select = "SELECT * FROM book";

                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(select);

                        System.out.println("\nID\tTitle\tAuthor\tPublisher\tPrice");

                        while (rs.next()) {

                            int id = rs.getInt("id");
                            title = rs.getString("title");
                            author = rs.getString("author");
                            publisher = rs.getString("publisher");
                            price = rs.getDouble("price");

                            System.out.println(id + "\t" + title + "\t" + author + "\t" + publisher + "\t" + price);

                        }

                        break;

                    case "3":

                        // Update Book
                        System.out.print("Enter Book ID to update: ");
                        int id = sc.nextInt();

                        System.out.print("Enter New Title: ");
                        title = sc.nextLine().trim();

                        if (title.isEmpty() || title.length() > 100) {
                            System.out.println("Invalid title. Must be non-empty and <= 100 chars.");
                            continue;
                        }

                        System.out.print("Enter New Author: ");
                        author = sc.nextLine().trim();

                        if (author.isEmpty()) {
                            System.out.println("Author cannot be empty.");
                            continue;
                        }

                        System.out.print("Enter New Publisher: ");
                        publisher = sc.nextLine().trim();

                        if (publisher.isEmpty()) {
                            System.out.println("Publisher cannot be empty.");
                            continue;
                        }

                        System.out.print("Enter New Price: ");
                        price = sc.nextDouble();
                        String update = "UPDATE book SET title=?, author=?, publisher=?, price=? WHERE id=?";

                        pst = con.prepareStatement(update);
                        pst.setString(1, title);
                        pst.setString(2, author);
                        pst.setString(3, publisher);
                        pst.setDouble(4, price);
                        pst.setInt(5, id);

                        r = pst.executeUpdate();
                        if (r > 0)
                            System.out.println("Book updated successfully.");
                        else
                            System.out.println("Failed to update book. Check ID.");

                        break;

                    case "4":

                        // Delete Book
                        System.out.print("Enter Book ID to delete: ");
                        id = sc.nextInt();

                        String delete = "DELETE FROM book WHERE id=?";
                        pst = con.prepareStatement(delete);

                        pst.setInt(1, id);

                        r = pst.executeUpdate();

                        if (r > 0)
                            System.out.println("Book deleted successfully.");
                        else
                            System.out.println("Failed to delete book. Check ID.");

                        break;

                    case "5":

                        System.out.println("Exiting...");
                        break;

                    default:

                        System.out.println("Invalid choice.");
                        break;

                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}