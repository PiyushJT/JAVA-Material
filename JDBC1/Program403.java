/*

Write a java program to insert book_id, book_name, book_price
in the book table with LJU database. Do this using Statement

*/

import java.sql.*;

public class Program403 {
    public static void main(String[] args) throws Exception {

        // Database Connection Details
        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");

        // Connection
        Connection con = DriverManager.getConnection(url, user, pass);

        if (con != null) {

            // Query to insert data
            String query = """
                INSERT INTO
                book (book_id, book_name, book_price)
                VALUES (1001, 'Java Book', 499.99);
            """;

            Statement st = con.createStatement();

            // Execute the query
            int r = st.executeUpdate(query);

            System.out.println(r + " record inserted.");
            con.close();
        }
        else
            System.out.println("Connection failed");
    }

}