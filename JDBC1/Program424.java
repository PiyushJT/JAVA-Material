/*

Write a java code to update student's marks in the follwing manner.
Students having makrs > 50  add + 5 in total
marks > 60 add + 10
marks > 80 add + 15 in the marks and update the table in it.

*/

import java.sql.*;

public class Program424 {

    public static void main(String[] args) throws Exception {


        try {

            String url = "jdbc:mysql://localhost:3306/LJU";
            String user = "root";
            String pass = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            Statement stmt = con.createStatement();
            int count80 = stmt.executeUpdate("UPDATE student SET std_marks = std_marks + 15 WHERE std_marks > 80");
            int count60 = stmt.executeUpdate("UPDATE student SET std_marks = std_marks + 10 WHERE std_marks > 60 AND std_marks <= 80");
            int count50 = stmt.executeUpdate("UPDATE student SET std_marks = std_marks + 5 WHERE std_marks > 50 AND std_marks <= 60");

            System.out.println("Updated marks for students:");
            System.out.println("> 80: " + count80 + " students");
            System.out.println("> 60: " + count60 + " students");
            System.out.println("> 50: " + count50 + " students");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}