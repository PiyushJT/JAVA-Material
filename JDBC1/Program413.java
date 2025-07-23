/*

Write a java program for the above same
employee table - to do delete employee
those having salary more than salary
entered by user. from the table. Take all details
from user and update this by using PreparedStatement.
- Take salary from user.

*/

import java.sql.*;
import java.util.*;

public class Program413 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        if (con != null) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter salary threshold: ");
            float salary = sc.nextFloat();

            // Query to delete data
            String query = """
                    DELETE FROM employee
                    WHERE emp_salary > ?;
                """;

            PreparedStatement pst = con.prepareStatement(query);
            pst.setFloat(1, salary);

            int r = pst.executeUpdate();

            System.out.println(r + " record(s) deleted.");

            con.close();

        }
        else
            System.out.println("Connection failed");
    }

}