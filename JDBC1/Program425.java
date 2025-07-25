/*

Management of the LJ wants to do compilation of total marks of the students.
For this they do the following process.
1. Table - mse_marks with columns  - roll_no, t1, t2, bonus.
2. Table – final_marks with roll_no, total ( where total = (t1+t2)/2 + bonus
)
Process 1: Need to fetch all the details from the table mse_marks
using CallableStatement. Write SQL code an Java code for the same.
Procedure name is getMarks().
Process 2: Need to insert same roll_no fetched from the mse_marks
to final_marks table and total after calculating it perfectly from the table mse_marks.
This insertion query you have to write using PreparedStatement.

*/

import java.sql.*;
import java.util.Scanner;

public class Program425 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        try {

            String url = "jdbc:mysql://localhost:3306/LJU";
            String user = "root";
            String pass = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println("\n1. Fetch all details from mse_marks");
            System.out.println("2. Insert into final_marks after calculation");
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    CallableStatement cstmt = con.prepareCall("{call getMarks()}");
                    ResultSet rs = cstmt.executeQuery();

                    System.out.println("\nroll_no\tt1\tt2\tbonus");

                    while (rs.next()) {
                        System.out.println(rs.getInt("roll_no") + "\t" + rs.getInt("t1") + "\t" + rs.getInt("t2") + "\t" + rs.getInt("bonus"));
                    }

                    System.out.println();
                    break;

                case 2:

                    Statement stmt = con.createStatement();

                    rs = stmt.executeQuery("SELECT roll_no, t1, t2, bonus FROM mse_marks");
                    PreparedStatement pstmt = con.prepareStatement("INSERT INTO final_marks (roll_no, total) VALUES (?, ?)");

                    while (rs.next()) {
                        int roll = rs.getInt("roll_no");
                        int t1 = rs.getInt("t1");
                        int t2 = rs.getInt("t2");
                        int bonus = rs.getInt("bonus");
                        double total = ((t1 + t2) / 2.0) + bonus;

                        pstmt.setInt(1, roll);
                        pstmt.setDouble(2, total);
                        pstmt.executeUpdate();

                        System.out.println("Inserted roll_no: " + roll + ", total: " + total);
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("\nInvalid choice!\n");
                    break;
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}