/*

Write a java code for the below tasks.
- Table Name : student  : std_id, std_roll_no, std_name, std_marks,
std_div
- DB Name : LJU
- Write tow callable stored procedure with below names.
A) getMakrs(): this procedure will give you marks of students from  name.
B) updateRollNo() : this procedure will update the roll no
by giving the name of the student.

*/

import java.sql.*;
import java.util.Scanner;

public class Program422 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        try {

            String url = "jdbc:mysql://localhost:3306/LJU";
            String user = "root";
            String pass = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println();
            System.out.println("1. Get Marks by Student Name");
            System.out.println("2. Update Roll No by Student Name");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("\nEnter Student Name: ");
                    String name = sc.nextLine();

                    CallableStatement cstmt = con.prepareCall("{call getMakrs(?, ?)}");
                    cstmt.setString(1, name);

                    cstmt.registerOutParameter(2, Types.INTEGER);
                    cstmt.execute();

                    int marks = cstmt.getInt(2);
                    System.out.println("\nMarks of " + name + ": " + marks + "\n");

                    break;

                case 2:

                    System.out.print("\nEnter Student Name: ");
                    String sname = sc.nextLine();

                    System.out.print("Enter New Roll No: ");
                    int newRoll = sc.nextInt();

                    cstmt = con.prepareCall("{call updateRollNo(?, ?)}");
                    cstmt.setString(1, sname);
                    cstmt.setInt(2, newRoll);

                    cstmt.execute();
                    System.out.println("\nRoll number updated for " + sname + "\n");

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