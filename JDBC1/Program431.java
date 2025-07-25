/*

Create one database named LJUADMISSION in phpMyAdmin.
LJUADMISSION database received 10 applications for admission.
Data of this applications are stored in table named
application in database as follow.

id | name    | rank
-------------------
1  | Raju    | 1205
2  | Shyam   | 1508
3  | Anant   | 1009
4  | Radhika | 879
5  | Shivya  | 403
6  | Yuvraj  | 1800
7  | Mrunal  | 2214
8  | Pritam  | 1212
9  | Arijit  | 1785
10 | Krunal  | 456

-->Write necessary code to make connection with the database LJUADMISSION.
--> Write code upon executing which two tables named confirmed and
rejected will be created and data of top five students as per the rank will
be stored in table confirmed and remaining in table rejected.
--> After that provide following repeating menu to user.
1.Press 1 to display names of admission confirmed student.
2.Press 2 to display name of admission rejected students.
3.Press 3 to remove any student from confirmed table through id.
   (Before removing data of particular student take confirmation ( use setAutoCommit and commit methods ) )
4. Press 4 to print additional data of database. ( Driver name , URL , Database product name)
5. Exit

*/

import java.sql.*;
import java.util.*;

public class Program431 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/LJUADMISSION";
        String user = "root";
        String pass = "";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        if (con == null) {
            System.out.println("Connection failed");
            return;
        }

        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS confirmed (id INT PRIMARY KEY, name VARCHAR(50), rank INT)");
        st.executeUpdate("CREATE TABLE IF NOT EXISTS rejected (id INT PRIMARY KEY, name VARCHAR(50), rank INT)");

        st.executeUpdate("DELETE FROM confirmed");
        st.executeUpdate("DELETE FROM rejected");


        String top5 = "INSERT INTO confirmed SELECT id, name, rank FROM application ORDER BY rank ASC LIMIT 5";
        String rest = "INSERT INTO rejected SELECT id, name, rank FROM application WHERE id NOT IN (SELECT id FROM confirmed)";

        st.executeUpdate(top5);
        st.executeUpdate(rest);

        while (true) {

            System.out.println();
            System.out.println("1. Show confirmed students");
            System.out.println("2. Show rejected students");
            System.out.println("3. Remove student from confirmed");
            System.out.println("4. Show DB metadata");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    // Show confirmed
                    System.out.println("\nConfirmed Students:");
                    ResultSet rs1 = st.executeQuery("SELECT name FROM confirmed");

                    while (rs1.next()) {
                        System.out.println(rs1.getString("name"));
                    }

                    break;

                case 2:

                    // Show rejected
                    System.out.println("\nRejected Students:");

                    ResultSet rs2 = st.executeQuery("SELECT name FROM rejected");
                    while (rs2.next()) {
                        System.out.println(rs2.getString("name"));
                    }

                    break;

                case 3:

                    // Remove from confirmed with transaction

                    System.out.print("Enter ID to remove from confirmed: ");

                    int id = sc.nextInt();

                    System.out.print("Are you sure? (yes/no): ");

                    String confirm = sc.nextLine().trim().toLowerCase();

                    if (!confirm.equals("yes")) {

                        System.out.println("Cancelled.");
                        break;

                    }

                    con.setAutoCommit(false);
                    PreparedStatement pst = con.prepareStatement("DELETE FROM confirmed WHERE id=?");

                    pst.setInt(1, id);

                    int r = pst.executeUpdate();

                    if (r > 0) {
                        con.commit();
                        System.out.println("Student removed and committed.");
                    }
                    else {
                        con.rollback();
                        System.out.println("No such student. Rollback.");
                    }

                    con.setAutoCommit(true);
                    break;

                case 4:
                    // Show DB metadata

                    DatabaseMetaData meta = con.getMetaData();

                    System.out.println("\nDriver Name: " + meta.getDriverName());
                    System.out.println("URL: " + meta.getURL());
                    System.out.println("Database Product: " + meta.getDatabaseProductName());

                    break;

                case 5:

                    System.out.println("Exiting...");
                    con.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        }

    }

}