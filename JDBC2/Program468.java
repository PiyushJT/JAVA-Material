/*

Write a java code that stores .java file in the file table

*/

import java.sql.*;
import java.io.*;
import java.util.*;

public class Program468 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter .java file path: ");

        String path = sc.nextLine();

        File f = new File(path);
        FileReader fr = new FileReader(f);

        long size = f.length() / 1024;

        String ext = "java";
        String q = "INSERT INTO file_table (file_name, file_size, file_content, file_extension) VALUES (?, ?, ?, ?)";

        PreparedStatement pst = con.prepareStatement(q);
        pst.setString(1, f.getName());
        pst.setLong(2, size);
        pst.setCharacterStream(3, fr, f.length());
        pst.setString(4, ext);


        int r = pst.executeUpdate();

        System.out.println("\n" + r + " .java file inserted.");
        con.close();

    }
} 