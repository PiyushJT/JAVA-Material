/*

Write a java program that inserts record of employees like
emp_id, emp_name, emp_designation, emp_salary. Here emp_id
is primary key and auto incremented. Table name is employee.
And Database is : LJU. Now, insert one record using CallableStatement.
- Create procedure with name : insertEmployee(?,?,?)  Emp id is auto
incremented. Consider all parameters as IN parameter

*/

import java.sql.*;
import java.util.*;

public class Program415 {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user, pass);


        Scanner sc = new Scanner(System.in);

        if (con != null) {

            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter employee designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter employee salary: ");
            float salary = sc.nextFloat();

            // Query to call stored procedure
            String query = """
                {call insertEmployee(?,?,?)}
            """;

            CallableStatement cst = con.prepareCall(query);
            cst.setString(1, name);
            cst.setString(2, designation);
            cst.setFloat(3, salary);

            int r = cst.executeUpdate();
            System.out.println(r + " record(s) inserted.");

            con.close();

        }
        else
            System.out.println("Connection failed");
    }

}