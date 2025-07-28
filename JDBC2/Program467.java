/*

Table name: product 
Columns: pId, pName, pPrice, pCategory
Create a java program through which user can
ask for the following
Enter 1 to know Number of Column 
Enter 2 to know the Table Name 
Enter 3 to know Column Name & Ask for Index of column
Enter 4 to know the type of column of Index given by user  

*/

import java.sql.*;
import java.util.*;

public class Program467 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM product");

        ResultSetMetaData md = rs.getMetaData();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n1. Number of Columns");
        System.out.println("2. Table Name");
        System.out.println("3. Column Name (by Index)");
        System.out.println("4. Column Type (by Index)");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:

                System.out.println("Number of Columns: " + md.getColumnCount());
                break;

            case 2:

                System.out.println("Table Name: " + md.getTableName(1));
                break;

            case 3:
                System.out.print("Enter column index (1 to " + md.getColumnCount() + "): ");
                int idx1 = sc.nextInt();

                if (idx1 >= 1 && idx1 <= md.getColumnCount())
                    System.out.println("Column Name at index " + idx1 + ": " + md.getColumnName(idx1));
                else
                    System.out.println("Invalid column index.");

                break;

            case 4:
            
                System.out.print("Enter column index (1 to " + md.getColumnCount() + "): ");
                int idx2 = sc.nextInt();

                if (idx2 >= 1 && idx2 <= md.getColumnCount()) {
                    System.out.println("Column Type at index " + idx2 + ": " + md.getColumnTypeName(idx2));
                }
                else
                    System.out.println("Invalid column index.");

                break;

            default:
                System.out.println("Invalid choice.");

        }

        con.close();
    }
} 