/*

Write a java program to delete books from the book table
book_name in the book table with LJU database.
Do this using Statement.

*/

import java.sql.*;
import java.util.*;

public class Program408 {

    public static void main(String[] args) throws Exception {

        // Database Connection Details
        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";


        Class.forName("com.mysql.jdbc.Driver");

        // Connection
        Connection con = DriverManager.getConnection(url, user, pass);


        Scanner sc = new Scanner(System.in);

        if (con != null) {

            System.out.print("Enter book name to delete: ");
            String bookName = sc.nextLine();

            // Query to delete data
            String query = String.format(
                """
                    DELETE FROM book
                    WHERE book_name = '%s';
                """,
                bookName
            );

            Statement st = con.createStatement();
            int r = st.executeUpdate(query);

            System.out.println(r + " record(s) deleted.");
            con.close();
        }
        else
            System.out.println("Connection failed");
    }

}