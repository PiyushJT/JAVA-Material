/*

Write a java program that inserts record of employees
like emp_id, emp_name, emp_designation, emp_salary.
Here emp_id is primary key and auto incremented.
Table name is employee. And Database is : LJU. Now,
insert one record using PreparedStatement

*/

import java.sql.*;
import java.util.*;

public class Program410 {

    public static void main(String[] args) throws Exception {


        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);


        if (con != null) {

            Scanner sc = new Scanner(System.in);


            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter employee designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter employee salary: ");
            float salary = sc.nextFloat();

            // Query to insert data
            String query = """
                    INSERT INTO employee (emp_name, emp_designation, emp_salary)
                    VALUES (?, ?, ?);
                """;

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, designation);
            pst.setFloat(3, salary);

            int r = pst.executeUpdate();

            System.out.println(r + " record(s) inserted.");
            con.close();

        }
        else
            System.out.println("Connection failed");
    }

}