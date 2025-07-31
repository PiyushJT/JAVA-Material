/*

Write a java code that is retrive file that contains .txt file from table
and convert new file in d:/java location with same name stored
in table but extension with .java

*/

import java.sql.*;
import java.util.*;
import java.io.*;

public class Program473 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        System.out.print("Enter file_id to retrieve .txt file: ");
        int id = sc.nextInt();

        String q = "SELECT file_name, file_content, file_extension FROM file_table WHERE file_id=? AND file_extension='txt'";

        PreparedStatement pst = con.prepareStatement(q);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {

            String fileName = rs.getString("file_name");

            Clob fileClob = rs.getClob("file_content");
            Reader r = fileClob.getCharacterStream();


            String newFileName = "d:/java/" + fileName + ".java";
            File dir = new File("d:/java");

            if (!dir.exists())
                dir.mkdirs();

            FileWriter fw = new FileWriter(newFileName);
            int i = r.read();

            while (i != -1) {
                fw.write((char) i);
                i = r.read();
            }

            fw.close();
            System.out.println(".txt file retrieved and saved as: " + newFileName);

        }
        else
            System.out.println("No .txt file found with the given file_id.");

        con.close();

    }

}