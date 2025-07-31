/*

Write necessary code to make connection with the database:
Create one repeating menu as given below:

1.Press 1 to Insert data in database.
2.Press 2 to update data in database.
3.Press 3 to delete data from database.
4.Press 4 to Read data from database.
5.Press 5 to get informaƟon about happyWedding table.
6.Press 6 to exit from menu

All the Cases should me made according to given instruction as below:

Case 1: To Insert Data in Table:
•Here, user have to insert data by using PreparedStatement. (Don’t use Scanner Class)
•Values to be inserted are given below
Note: All the txt files and jpg files are provided in soft copy of Question, Use those files only.

Case 2: To Update Data in Table:
•Here, age & salary (both together) should be updated as per given name.
•age, salary and name will be given by user by using Scanner Class only.
•Data should be updated by using Statement Interface Only.

Case 3: To Delete Data from Table:
•Data should be deleted by given id.
•id will be given by user by using Scanner class.
•Use TransacƟon concept to delete data. AŌer wriƟng query ask user that whether
he want to commit or rollback. If user choose commit then 1 row will be deleted
and if user choose rollback, then Query will be rollback and no change in table.
•Data should be deleted by using PreparedStatement only.

Case 4: To Read Data from Table
•All the data of parƟcular person should be printed in the console by given age & salary.
•age and salary should be given by user by using Scanner Class
•Data should be Read by using Statement Interface Only.

Case 5: To Get Information about happyWedding Table:
•Write a code to print total no of column, name of parƟcular column and
Data type of particular column on the console. Here, column index will be inserted by user by using Scanner class.
•Use PreparedStatement in this case.

Case 6: To exit from menu:
•Use System class to get exit from the menu.

*/

import java.sql.*;
import java.util.*;
import java.io.*;

public class Program476 {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS employee (id INT PRIMARY KEY, name VARCHAR(100), gender VARCHAR(10), age INT, occupation VARCHAR(100), salary DOUBLE, biodata CLOB, photo BLOB)");

        while (true) {

            System.out.println();
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Read");
            System.out.println("5. Table Info");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    PreparedStatement pst = con.prepareStatement("INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                    pst.setInt(1, 1);
                    pst.setString(2, "Raju");
                    pst.setString(3, "Male");
                    pst.setInt(4, 26);
                    pst.setString(5, "Artist");
                    pst.setDouble(6, 50000);

                    File biodataFile = new File("Raju.txt");
                    FileReader biodataReader = new FileReader(biodataFile);

                    pst.setCharacterStream(7, biodataReader, (int) biodataFile.length());

                    File photoFile = new File("Raju.jpg");
                    FileInputStream photoStream = new FileInputStream(photoFile);
                    pst.setBinaryStream(8, photoStream, (int) photoFile.length());

                    int r = pst.executeUpdate();
                    System.out.println(r + " row inserted.");

                    biodataReader.close();
                    photoStream.close();

                    break;

                case 2:

                    System.out.print("Enter name to update: ");
                    String uname = sc.next();

                    System.out.print("Enter new age: ");
                    int uage = sc.nextInt();

                    System.out.print("Enter new salary: ");
                    double usal = sc.nextDouble();

                    int ur = st.executeUpdate("UPDATE employee SET age=" + uage + ", salary=" + usal + " WHERE name='" + uname + "'");
                    System.out.println(ur + " row(s) updated.");

                    break;

                case 3:

                    System.out.print("Enter id to delete: ");
                    int did = sc.nextInt();

                    System.out.print("Are you sure? (yes/no): ");
                    String conf = sc.next();

                    if (conf.equalsIgnoreCase("yes")) {

                        con.setAutoCommit(false);

                        PreparedStatement dpst = con.prepareStatement("DELETE FROM employee WHERE id=?");
                        dpst.setInt(1, did);

                        int dr = dpst.executeUpdate();

                        if (dr == 1) {
                            con.commit();
                            System.out.println("Row deleted.");
                        }
                        else {
                            con.rollback();
                            System.out.println("Row not found.");
                        }

                        con.setAutoCommit(true);

                    }
                    else
                        System.out.println("Cancelled.");

                    break;

                case 4:

                    System.out.print("Enter age: ");
                    int rage = sc.nextInt();

                    System.out.print("Enter salary: ");
                    double rsal = sc.nextDouble();

                    ResultSet rs = st.executeQuery("SELECT * FROM employee WHERE age=" + rage + " AND salary=" + rsal);

                    while (rs.next()) {

                        System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Gender: " + rs.getString(3) + ", Age: " + rs.getInt(4) + ", Occupation: " + rs.getString(5) + ", Salary: " + rs.getDouble(6));

                        Clob bioClob = rs.getClob(7);
                        if (bioClob != null) {

                            Reader reader = bioClob.getCharacterStream();
                            StringBuilder sb = new StringBuilder();

                            int ch = reader.read();
                            while (ch != -1) {
                                sb.append((char) ch);
                                ch = reader.read();
                            }

                            reader.close();

                            System.out.println("Biodata: " + sb);

                        }

                        Blob photoBlob = rs.getBlob(8);

                        if (photoBlob != null) {

                            byte[] photoBytes = photoBlob.getBytes(1, (int) photoBlob.length());
                            String outFile = "output_photo_" + rs.getInt(1) + ".jpg";

                            FileOutputStream fos = new FileOutputStream(outFile);

                            fos.write(photoBytes);
                            fos.close();

                            System.out.println("Photo saved as: " + outFile);

                        }
                    }

                    break;

                case 5:

                    PreparedStatement ipst = con.prepareStatement("SELECT * FROM employee LIMIT 1");
                    ResultSet irs = ipst.executeQuery();
                    ResultSetMetaData md = irs.getMetaData();
                    System.out.println("Total columns: " + md.getColumnCount());

                    for (int i = 1; i <= md.getColumnCount(); i++)
                        System.out.println(i + ". " + md.getColumnName(i) + " (" + md.getColumnTypeName(i) + ")");

                    break;

                case 6:

                    con.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid choice.");
                    break;

            }

        }

    }
}