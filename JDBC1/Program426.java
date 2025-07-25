/*

Ask User to do the following taks in book table. All the details of table are given in above examples.
1 - for insertion
2 - for deletion by book name
3 - for update book name and price both BY book id.
4. for show all books from the table.
Do above program using switch case and untill user press - 5 - ask them again do the above operations.

*/

import java.sql.*;
import java.util.Scanner;

public class Program426 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        try {


            String url = "jdbc:mysql://localhost:3306/LJU";
            String user = "root";
            String pass = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            int choice;

            do {
                System.out.println();
                System.out.println("1. Insert Book");
                System.out.println("2. Delete Book by Name");
                System.out.println("3. Update Book Name and Price by ID");
                System.out.println("4. Show All Books");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:

                        System.out.print("\nEnter Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Book Price: ");
                        double price = sc.nextDouble();

                        PreparedStatement pstmt = con.prepareStatement("INSERT INTO book (id, name, price) VALUES (?, ?, ?)");
                        pstmt.setInt(1, id);
                        pstmt.setString(2, name);
                        pstmt.setDouble(3, price);
                        pstmt.executeUpdate();

                        System.out.println("\nBook inserted successfully.\n");
                        break;

                    case 2:

                        System.out.print("\nEnter Book Name to Delete: ");
                        String delName = sc.nextLine();

                        pstmt = con.prepareStatement("DELETE FROM book WHERE name = ?");
                        pstmt.setString(1, delName);

                        int delCount = pstmt.executeUpdate();

                        System.out.println("\nBooks deleted: " + delCount + "\n");

                        break;

                    case 3:

                        System.out.print("\nEnter Book ID to Update: ");
                        int upId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Book Name: ");
                        String upName = sc.nextLine();

                        System.out.print("Enter New Book Price: ");
                        double upPrice = sc.nextDouble();

                        pstmt = con.prepareStatement("UPDATE book SET name = ?, price = ? WHERE id = ?");
                        pstmt.setString(1, upName);
                        pstmt.setDouble(2, upPrice);
                        pstmt.setInt(3, upId);

                        int upCount = pstmt.executeUpdate();

                        System.out.println("\nBooks updated: " + upCount + "\n");

                        break;

                    case 4:

                        pstmt = con.prepareStatement("SELECT * FROM book");

                        ResultSet rs = pstmt.executeQuery();

                        System.out.println("\nID\tName\tPrice");
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getDouble("price"));
                        }
                        System.out.println();

                        break;

                    case 5:

                        System.out.println("\nExiting...\n");
                        break;

                    default:
                        System.out.println("\nInvalid choice!\n");
                        break;

                }
            }
            while (choice != 5);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}