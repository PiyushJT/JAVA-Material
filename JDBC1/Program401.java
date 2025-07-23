/*

Consider a table with name – student and database as admission.
The student table have fields like stdId, stdName, stdMarks(float).
Write a java program that adds 2 records using PreparedStatement.
[have to write connection code here.]

*/

import java.sql.*;

public class Program401 {

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