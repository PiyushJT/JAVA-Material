/*

Write a java code to insert image in table with name img_table where
columns are img_id, img_name, img_size, img_content.

*/

import java.io.*;
import java.sql.*;
import java.util.*;

public class Program463 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter image file path: ");
        String path = sc.nextLine();

        System.out.print("Enter image name: ");
        String name = sc.nextLine();

        File imageFile = new File(path);
        long length = imageFile.length()/1024;

        String q = "INSERT INTO img_table (img_name, img_size, img_content) VALUES (?, ?, ?)";

        FileInputStream ﬁs = new FileInputStream(imageFile);

        PreparedStatement pst = con.prepareStatement(q);
        pst.setString(1, name);
        pst.setLong(2, length);
        pst.setBinaryStream(4, ﬁs, length);


        int r = pst.executeUpdate();

        System.out.println("\n" + r + " image inserted.");
        con.close();

    }
}