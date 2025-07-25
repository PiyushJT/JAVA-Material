/*

Write a stroed procedure with name multiProduct(?,?,?)
This do the follwong.
- update product price by product id
- return the product name which is updated by us in previous query.
- So here write both queries in a single procedure call. Use3
- IN and OUT parameter as per your understanding.

*/

import java.sql.*;
import java.util.Scanner;

public class Program421 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID: ");

        int pid = sc.nextInt();
        System.out.print("Enter New Price: ");

        double newPrice = sc.nextDouble();
        sc.close();


        try {

            String url = "jdbc:mysql://localhost:3306/LJU";
            String user = "root";
            String pass = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "{call multiProduct(?, ?, ?)}";

            CallableStatement cstmt = con.prepareCall(sql);

            cstmt.setInt(1, pid);
            cstmt.setDouble(2, newPrice);
            cstmt.registerOutParameter(3, Types.VARCHAR);

            cstmt.execute();

            String pname = cstmt.getString(3);
            System.out.println("Updated Product Name: " + pname);

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

} 