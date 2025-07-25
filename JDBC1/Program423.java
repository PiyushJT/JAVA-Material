/*

Write a java code to fetch all student's marks from the table
and do addition of all marks.

*/

import java.sql.*;

public class Program423 {
    public static void main(String[] args) throws Exception {

        try {

            String url = "jdbc:mysql://localhost:3306/LJU";
            String user = "root";
            String pass = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            Statement stmt = con.createStatement();
            String sql = "SELECT std_marks FROM student";
            ResultSet rs = stmt.executeQuery(sql);

            int total = 0;

            System.out.println("\nStudent Marks:\n");

            while (rs.next()) {
                int marks = rs.getInt("std_marks");
                System.out.println(marks);
                total += marks;
            }

            System.out.println("\nTotal of all marks: " + total + "\n");

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}