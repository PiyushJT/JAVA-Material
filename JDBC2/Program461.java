/*

Write a java code snippet that checks weather the database
connection is established or not? If the connection is
established perfectly then it should give us the version
of the driver which I have used for the connection

*/

import java.sql.*;

public class Program461 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        if (con != null) {

            DatabaseMetaData meta = con.getMetaData();

            System.out.println("Connection established.");
            System.out.println("Driver Version: " + meta.getDriverVersion());
        }
        else {
            System.out.println("Connection failed.");
        }

        con.close();

    }

}