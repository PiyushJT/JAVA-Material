/*

Write the java program that do connection with database

*/

import java.sql.*;

public class Program402 {
    public static void main(String[] args) {

        // Database Connection
        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);


            // If connection is not successful
            if (con != null) {
                System.out.println("Connection successful");
                con.close();
            }
            else
                System.out.println("Connection failed");
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}