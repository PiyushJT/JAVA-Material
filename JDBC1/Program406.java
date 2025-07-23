/*

Write a java program to update  book_price by book_name in the
book table with LJU database. Do this using Statement.
Here, Book id is auto incremented. So do accordingly.

*/

import java.sql.*;
import java.util.*;

public class Program406 {
    public static void main(String[] args) throws Exception {


        // Database Connection Details
        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";


        Class.forName("com.mysql.jdbc.Driver");

        // Connection
        Connection con = DriverManager.getConnection(url, user, pass);


        if (con != null) {

            Scanner sc = new Scanner(System.in);


            System.out.print("Enter book name to update price: ");
            String name = sc.nextLine();

            System.out.print("Enter new price: ");
            float price = sc.nextFloat();


            // Query to update data
            String query = String.format(
                    """
                        UPDATE book
                        SET book_price = %f
                        WHERE book_name = '%s';
                    """,
                    price,
                    name
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