/*

Write a Java code for the following task.
- Table Name : student  : std_id, std_roll_no, std_name, std_marks,
std_div
- DB : LJU
- Insert 5 Records using prepared statement.
- Update Div of students having marks > 50  - To - Div B - Use callable statement for this

*/

import java.sql.*;

public class Program428 {

    public static void main(String[] args) throws Exception {

        // Database Connection
        String url = "jdbc:mysql://localhost:3306/admission";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user, pass);


        // If connection is not successful
        if (con == null) {
            System.out.println("Connection failed");
            return;
        }


        // query to insert data
        String query = """
                INSERT INTO
                student (stdId, stdName, stdMarks)
                VALUES (?, ?, ?),
                (?, ?, ?);
            """;


        // Statement
        PreparedStatement pst = con.prepareStatement(query);

        pst.setInt(1, 1001);
        pst.setString(2, "Piyush");
        pst.setFloat(3, 99.9f);

        pst.setInt(4, 1002);
        pst.setString(5, "Not Piyush");
        pst.setFloat(6, 99.9f);


        // Execute the query and get the number of rows affected
        int r = pst.executeUpdate();

        System.out.println(r + " records inserted.");

        con.close();

    }

}