/*

Write a java program to insert  brochure_id brochure_name,
brochure_pages in the brochure table with LJU database.
Do this using Statement Interface. Take necessary
data from user for inserting atleast 5 records.

*/

import java.sql.*;
import java.util.*;

public class Program405 {
    public static void main(String[] args) throws Exception {

        // Database Connection Details
        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";


        Class.forName("com.mysql.jdbc.Driver");

        // Connection
        Connection con = DriverManager.getConnection(url, user, pass);


        if (con != null) {

            Scanner sc = new Scanner(System.in);
            Statement st = con.createStatement();

            // Insert 5 records from user input
            for (int i = 1; i <= 5; i++) {

                System.out.print("Enter brochure_id: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter brochure_name: ");
                String name = sc.nextLine();

                System.out.print("Enter brochure_pages: ");
                int pages = sc.nextInt();



                // Query to insert data
                String query = String.format(
                        """
                            INSERT INTO
                            brochure (brochure_id, brochure_name, brochure_pages)
                            VALUES (%d, '%s', %d);
                        """,
                        id,
                        name,
                        pages
                );

                int r = st.executeUpdate(query);
                System.out.println(r + " record inserted.");

            }

            con.close();
        }
        else
            System.out.println("Connection failed");
    }

}