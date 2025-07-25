/*

Write a java program that select record emp_designation, and
emp_salary where emp_name is rahul. Here emp_id is primary
key and auto incremented. Table name is employee. And
Database is : LJU. Now, update record using CallableStatement.
- Create procedure with name : selectEmployeeByName(?,?,?)
Emp id is auto incremented. Here : emp_name is IN parameter.
emp_designation and emp_salary are OUT parameter.

*/

import java.sql.*;

public class Program427 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        if (con != null) {

            String query = "{call selectEmployeeByName(?, ?, ?)}";
            CallableStatement cst = con.prepareCall(query);

            cst.setString(1, "rahul");
            cst.registerOutParameter(2, Types.VARCHAR);
            cst.registerOutParameter(3, Types.FLOAT);

            cst.execute();

            String designation = cst.getString(2);
            float salary = cst.getFloat(3);

            System.out.println("Designation: " + designation);
            System.out.println("Salary: " + salary);

            con.close();

        }
        else
            System.out.println("Connection failed");
    }

}