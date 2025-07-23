/*

Write a java program that fetch all details of employees from
employee table. Table name is employee. And Database is : LJU.
Now, fetch record using CallableStatement. - Create procedure
with name : getEmployees() Emp id is auto incremented.

*/

import java.sql.*;

public class Program414 {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        if (con != null) {
            // Query to call stored procedure
            String query = """
                    {call getEmployees()}
                """;

            CallableStatement cst = con.prepareCall(query);

            ResultSet rs = cst.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("emp_id");
                String name = rs.getString("emp_name");
                String designation = rs.getString("emp_designation");
                float salary = rs.getFloat("emp_salary");

                System.out.println("Id: " + id + " name: " + name + " designation: " + designation + " salary: " + salary);

            }

            con.close();

        }
        else
            System.out.println("Connection failed");
    }

}