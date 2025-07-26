/*

Write a java code to retrieve image in table with name img_table
where columns are img_id, img_name, img_size, img_content.

*/

import java.sql.*;
import java.util.*;
import java.io.*;

public class Program464 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter image id to retrieve: ");
        int id = sc.nextInt();

        String q = "SELECT img_name, img_content FROM img_table WHERE img_id=?";

        PreparedStatement pst = con.prepareStatement(q);
        pst.setInt(1, id);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {

            String name = rs.getString(1);
            Blob b = rs.getBlob(2);

            byte[] arr = b.getBytes(1, (int) b.length());

            String fileName ="D://new"+rs.getString("file_name");

            FileOutputStream fos = new FileOutputStream(fileName);

            fos.write(arr);
            fos.close();

            System.out.println("\nImage saved as: " + name);

        }
        else
            System.out.println("\nImage not found.");

        con.close();
    }

}