/*

Write necessary code to make connection with the database LJUADMISSION.
Write code upon executing which two tables named confirmed and
rejected will be created and data of top five students as per
the rank will be stored in table confirmed and remaining in table rejected.
After that provide following repeating menu to user.

1.Press 1 to display names of admission conﬁrmed student.
(Fetch data from confirmed table through query and print it on consol.)
2.Press 2 to display name of admission rejected students.
(Fetch data from rejected table through query and print it on consol.)
3.Press 3 to remove any student from conﬁrmed table through id.
( Before removing data of particular student take confirmation
( use setAutoCommit and  commit methods)
)
4. Press 4 to print additional data of database.
( Driver name , URL , Database product   name) Database product   name)
5. Exit

*/

import java.sql.*;
import java.util.*;

public class Program475 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJUADMISSION";
        String user = "root";
        String pass = "";

        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        Statement st = con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS confirmed (id INT PRIMARY KEY, name VARCHAR(100), rank INT)");
        st.executeUpdate("CREATE TABLE IF NOT EXISTS rejected (id INT PRIMARY KEY, name VARCHAR(100), rank INT)");
        st.executeUpdate("DELETE FROM confirmed");
        st.executeUpdate("DELETE FROM rejected");
        ResultSet rs = st.executeQuery("SELECT * FROM application ORDER BY rank ASC");

        int count = 0;
        while (rs.next()) {

            if (count < 5) {

                PreparedStatement pst = con.prepareStatement("INSERT INTO confirmed VALUES (?, ?, ?)");
                pst.setInt(1, rs.getInt(1));
                pst.setString(2, rs.getString(2));
                pst.setInt(3, rs.getInt(3));
                pst.executeUpdate();

            }
            else {
                PreparedStatement pst = con.prepareStatement("INSERT INTO rejected VALUES (?, ?, ?)");
                pst.setInt(1, rs.getInt(1));
                pst.setString(2, rs.getString(2));
                pst.setInt(3, rs.getInt(3));
                pst.executeUpdate();
            }
            count++;
        }

        while (true) {

            System.out.println();
            System.out.println("1. Display confirmed");
            System.out.println("2. Display rejected");
            System.out.println("3. Remove from confirmed");
            System.out.println("4. Print DB info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    ResultSet r1 = st.executeQuery("SELECT name FROM confirmed");
                    System.out.println("Confirmed students:");

                    while (r1.next())
                        System.out.println(r1.getString(1));

                    break;

                case 2:

                    ResultSet r2 = st.executeQuery("SELECT name FROM rejected");
                    System.out.println("Rejected students:");

                    while (r2.next())
                        System.out.println(r2.getString(1));

                    break;

                case 3:

                    con.setAutoCommit(false);

                    System.out.print("Enter id to remove from confirmed: ");
                    int rid = sc.nextInt();

                    PreparedStatement pst = con.prepareStatement("DELETE FROM confirmed WHERE id=?");
                    pst.setInt(1, rid);

                    int r = pst.executeUpdate();

                    if (r == 1) {
                        con.commit();
                        System.out.println("Student removed.");
                    }
                    else {
                        con.rollback();
                        System.out.println("Student not found.");
                    }

                    con.setAutoCommit(true);

                    break;

                case 4:

                    DatabaseMetaData meta = con.getMetaData();
                    System.out.println("Driver: " + meta.getDriverName());
                    System.out.println("URL: " + meta.getURL());
                    System.out.println("Product: " + meta.getDatabaseProductName());

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
} 