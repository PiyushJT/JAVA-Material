/*

Write a java program for the above same employee
table - to do upate emp designation and salary
BY emp_name. Take all details from user and
update this by using PreparedStatement

*/

import java.sql.*;
import java.util.*;

public class Program412 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        Scanner sc = new Scanner(System.in);

        if (con != null) {

            System.out.print("Enter employee name to update: ");
            String name = sc.nextLine();

            System.out.print("Enter new designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter new salary: ");
            float salary = sc.nextFloat();

            // Query to update data
            String query = """
                    UPDATE employee
                    SET emp_designation = ?, emp_salary = ?
                    WHERE emp_name = ?;
                """;

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, designation);
            pst.setFloat(2, salary);
            pst.setString(3, name);


            int r = pst.executeUpdate();

            System.out.println(r + " record(s) updated.");

            con.close();
        }
        else
            System.out.println("Connection failed");
    }

}