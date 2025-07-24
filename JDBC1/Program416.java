/*

Write a java program that update record of emp_designation,
and emp_salary where emp_name is rahul. Here emp_id is
primary key and auto incremented. Table name is employee.
And Database is : LJU. Now, update record using CallableStatement.
- Create procedure with name : updateEmployeeByName(?,?,?)
Emp id is auto incremented. Consider all parameters as IN parameter.

*/

import java.sql.*;
import java.util.*;

public class Program416 {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        Scanner sc = new Scanner(System.in);

        if (con != null) {

            System.out.print("Enter new designation for rahul: ");
            String designation = sc.nextLine();

            System.out.print("Enter new salary for rahul: ");
            float salary = sc.nextFloat();

            // Query to call stored procedure
            String query = """
                {call updateEmployeeByName(?,?,?)}
            """;

            CallableStatement cst = con.prepareCall(query);
            cst.setString(1, "rahul");
            cst.setString(2, designation);
            cst.setFloat(3, salary);

            int r = cst.executeUpdate();
            System.out.println(r + " record(s) updated.");

            con.close();

        }
        else
            System.out.println("Connection failed");
    }

}