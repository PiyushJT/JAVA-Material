/*

Write a java program to update  book_price and book_name
in the book table with LJU database. Do this using Statement.
To do this, First ask user to enter book_id. And then ask
new book name and price to be updated.

*/

import java.sql.*;
import java.util.*;

public class Program407 {

    public static void main(String[] args) throws Exception {


        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);


        Scanner sc = new Scanner(System.in);

        if (con != null) {


            System.out.print("Enter book id to update: ");
            int bookId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter new book name: ");
            String bookName = sc.nextLine();

            System.out.print("Enter new book price: ");
            float bookPrice = sc.nextFloat();


            // Query to update data
            String query = String.format(
                """
                    UPDATE book
                    SET book_name = '%s', book_price = %f
                    WHERE book_id = %d;
                """,
                bookName,
                bookPrice,
                bookId
            );

            Statement st = con.createStatement();

            int r = st.executeUpdate(query);

            System.out.println(r + " record(s) updated.");
            con.close();

        }
        else
            System.out.println("Connection failed");
    }

}