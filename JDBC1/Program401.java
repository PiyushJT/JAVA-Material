/*

Consider a table with name – student and database as admission.
The student table have fields like stdId, stdName, stdMarks(float).
Write a java program that adds 2 records using PreparedStatement.
[have to write connection code here.]

*/

import java.sql.*;

public class Program401 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/admission";
        String username = "root";
        String password = "";

        String query = "INSERT INTO student (stdId, stdName, stdMarks) VALUES (?, ?, ?)";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("Database connected successfully!");

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, 101);
            preparedStatement.setString(2, "John Doe");
            preparedStatement.setFloat(3, 85.5f);

            preparedStatement.executeUpdate();


            preparedStatement.setInt(1, 102);
            preparedStatement.setString(2, "Jane Smith");
            preparedStatement.setFloat(3, 92.0f);

            preparedStatement.executeUpdate();


            preparedStatement.close();
            connection.close();

        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}