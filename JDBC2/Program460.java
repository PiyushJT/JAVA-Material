/*

Write a java code snippet that checks weather the database
connection is established or not? If the connection is
established perfectly then it should give us the version
of the driver which I have used for the connection.

*/

import java.sql.*;

public class Program460 {

    public static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Connection con;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            if (con != null) {

                System.out.println("Database connection established successfully.");
                DatabaseMetaData metaData = con.getMetaData();

                System.out.println("JDBC Driver Name: " + metaData.getDriverName());
                System.out.println("JDBC Driver Version: " + metaData.getDriverVersion());

            }
            else
                System.out.println("Failed to establish database connection.");

        }

        catch (Exception e) {
            System.out.println("Error while connecting to the database: " + e.getMessage());
        }

    }
} 