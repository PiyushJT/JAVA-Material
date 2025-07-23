/*

Write a java program that inserts record of employees
like emp_id, emp_name, emp_designation, emp_salary.
Here emp_id is primary key and auto incremented.
Table name is employee. And Database is : LJU. Now,
insert one record using PreparedStatement.
Ask User how many records you want to enter.
And insert n - records using prepared statement

*/

import java.sql.*;
import java.util.*;

public class Program411 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        if (con != null) {

            Scanner sc = new Scanner(System.in);

            System.out.print("How many employee records to insert? ");
            int n = sc.nextInt();
            sc.nextLine();

            // Query to insert data
            String query = """
                    INSERT INTO employee (emp_name, emp_designation, emp_salary)
                    VALUES (?, ?, ?);
                """;

            PreparedStatement pst = con.prepareStatement(query);

            for (int i = 0; i < n; i++) {

                System.out.println("Enter details for employee " + (i+1) + ":");

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Designation: ");
                String designation = sc.nextLine();

                System.out.print("Salary: ");
                float salary = sc.nextFloat();
                sc.nextLine();

                pst.setString(1, name);
                pst.setString(2, designation);
                pst.setFloat(3, salary);

                pst.executeUpdate();
            }

            System.out.println(n + " record(s) inserted.");
            con.close();

        }
        else
            System.out.println("Connection failed");
    }

}