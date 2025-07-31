/*

Project Definition:
You are developing a Java program for a small business that requires storing
and retrieving employee data and their profile images using JDBC.
The program should allow authorized HR staff to add, retrieve,
and delete employee data from the database. Additionally, the
program should store and retrieve profile images for each employee.
Requirements:
The program should establish a connection to the database using
JDBC. The program should create a table if it doesn't exist and
use the table for storing and retrieving employee data.
The program should allow authorized HR staff to add employee data to the table.
The program should allow authorized HR staff to retrieve employee data from
the table based on a specified employee ID.
The program should allow authorized HR staff to delete employee data from
the table based on a specified employee ID.
The program should store and retrieve profile images using the Blob data
type in JDBC.
The program should handle exceptions such as SQLException and IOException.
Functionalities:
Add employee data (employee ID, name, department, designation, and profile image)
Retrieve employee data (employee ID, name, department, designation, and profile image)
Delete employee data (employee ID)
Exit the program

*/

import java.sql.*;
import java.util.*;
import java.io.*;

public class Program470 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";
        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS employee (emp_id INT PRIMARY KEY, emp_name VARCHAR(100), emp_dept VARCHAR(100), emp_designation VARCHAR(100), emp_image BLOB)");

            while (true) {

                System.out.println();
                System.out.println("1. Add Employee");
                System.out.println("2. Retrieve Employee");
                System.out.println("3. Delete Employee");
                System.out.println("4. Retrieve Profile Image");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt(); sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();

                        System.out.print("Enter Designation: ");
                        String desig = sc.nextLine();

                        System.out.print("Enter image file path: ");
                        String imgPath = sc.nextLine();

                        File imgFile = new File(imgPath);

                        FileInputStream fis = new FileInputStream(imgFile);

                        PreparedStatement pst = con.prepareStatement("INSERT INTO employee VALUES (?, ?, ?, ?, ?)");
                        pst.setInt(1, id);
                        pst.setString(2, name);
                        pst.setString(3, dept);
                        pst.setString(4, desig);
                        pst.setBinaryStream(5, fis, (int) imgFile.length());

                        int r = pst.executeUpdate();
                        System.out.println(r + " employee added.");

                        break;

                    case 2:

                        System.out.print("Enter Employee ID: ");
                        int rid = sc.nextInt();

                        PreparedStatement pst2 = con.prepareStatement("SELECT * FROM employee WHERE emp_id=?");
                        pst2.setInt(1, rid);

                        ResultSet rs = pst2.executeQuery();

                        if (rs.next()) {

                            System.out.println("ID: " + rs.getInt(1));
                            System.out.println("Name: " + rs.getString(2));
                            System.out.println("Department: " + rs.getString(3));
                            System.out.println("Designation: " + rs.getString(4));

                        }
                        else
                            System.out.println("Employee not found.");

                        break;

                    case 3:

                        System.out.print("Enter Employee ID to delete: ");
                        int did = sc.nextInt();

                        PreparedStatement pst3 = con.prepareStatement("DELETE FROM employee WHERE emp_id=?");

                        pst3.setInt(1, did);
                        int dr = pst3.executeUpdate();

                        System.out.println(dr + " employee deleted.");

                        break;

                    case 4:

                        System.out.print("Enter Employee ID for image: ");
                        int iid = sc.nextInt();

                        PreparedStatement pst4 = con.prepareStatement("SELECT emp_image FROM employee WHERE emp_id=?");
                        pst4.setInt(1, iid);

                        ResultSet rs2 = pst4.executeQuery();

                        if (rs2.next()) {

                            Blob b = rs2.getBlob(1);

                            byte[] arr = b.getBytes(1, (int) b.length());

                            String outFile = "emp_" + iid + "_profile.jpg";

                            FileOutputStream fos = new FileOutputStream(outFile);
                            fos.write(arr);

                            fos.close();

                            System.out.println("Image saved");

                        }
                        else
                            System.out.println("Employee/image not found.");

                        break;

                    case 5:

                        con.close();
                        System.exit(0);

                    default:

                        System.out.println("Invalid choice.");
                        break;
                }

            }

        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

} 