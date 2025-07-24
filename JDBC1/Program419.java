/*

Write Java application program to change the basic = basic + 500 of
all the employees whose age is greater then 40 from employee table
then display how many record updated.

*/

import java.sql.*;

public class Program419 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        if (con == null) {
            System.out.println("Connection failed");
            return;
        }

        String query = """
            UPDATE employee
            SET basic = basic + 500
            WHERE age > 40;
        """;

        Statement st = con.createStatement();
        int r = st.executeUpdate(query);

        System.out.println(r + " record(s) updated.");
        con.close();

    }

}