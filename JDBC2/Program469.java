/*

Write a java code that retreives file with .java extension only
from the table and create a new file.

*/

import java.sql.*;
import java.util.*;
import java.io.*;

public class Program469 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file_id to retrieve .java file: ");
        int id = sc.nextInt();

        String q = "SELECT file_name, file_content, file_extension FROM file_table WHERE file_id=? AND file_extension='java'";

        PreparedStatement pst = con.prepareStatement(q);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {

            String fileName = rs.getString("file_name");
            Clob fileClob = rs.getClob("file_content");

            Reader r = fileClob.getCharacterStream();

            String newFileName = "retrieved_" + fileName;

            FileWriter fw = new FileWriter(newFileName);

            int i = r.read();
            while (i != -1) {

                fw.write((char) i);
                i = r.read();

            }

            fw.close();
            System.out.println(".java file retrieved and saved as: " + newFileName);

        }
        else
            System.out.println("No .java file found with the given file_id.");

        con.close();

    }
} 