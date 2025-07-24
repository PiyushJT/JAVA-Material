/*

Write a java code that used to insert Products in the product
table and update product price by product name.

*/

import java.sql.*;
import java.util.*;

public class Program420 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Scanner sc = new Scanner(System.in);

        if (con == null) {
            System.out.println("Connection failed");
            return;
        }

        while (true) {

            System.out.println("\n1. Insert Product\n2. Update Price by Name\n3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            sc.nextLine();

            switch (ch) {

                case 1:

                    System.out.print("Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Product Price: ");
                    float price = sc.nextFloat();
                    sc.nextLine();

                    String query = """
                        INSERT INTO product (product_name, product_price)
                        VALUES (?, ?);
                    """;

                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, name);
                    pst.setFloat(2, price);

                    int r = pst.executeUpdate();
                    System.out.println(r + " record(s) inserted.");

                    break;

                case 2:

                    System.out.print("Product Name to update: ");
                    name = sc.nextLine();

                    System.out.print("New Price: ");
                    price = sc.nextFloat();
                    sc.nextLine();

                    query = """
                        UPDATE product
                        SET product_price = ?
                        WHERE product_name = ?;
                    """;

                    pst = con.prepareStatement(query);
                    pst.setFloat(1, price);
                    pst.setString(2, name);

                    r = pst.executeUpdate();
                    System.out.println(r + " record(s) updated.");
                    break;

                case 3:
                    con.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }

}