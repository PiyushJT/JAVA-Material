/*

Write a java code to insert text file or java file in table with name
file_table where columns are file_id, file_name, file_size,
file_content, file_extension

*/

import java.sql.*;
import java.io.*;
import java.util.*;

public class Program465 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();


        File f = new File(path);
        FileReader fr = new FileReader(f);

        long size = f.length()/1024;

        String ext = path.substring(path.lastIndexOf('.')+1);

        String q = """
            INSERT INTO file_table (file_name, file_size, file_content, file_extension)
            VALUES (?, ?, ?, ?);
        """;

        PreparedStatement pst = con.prepareStatement(q);
        pst.setString(1, path);
        pst.setLong(2, size);
        pst.setCharacterStream(3, fr,f.length());
        pst.setString(4, ext);

        int r = pst.executeUpdate();
        System.out.println("\n" + r + " file inserted.");
        con.close();

    }
}
