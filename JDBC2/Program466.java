/*

Write a java code to retrieval text file or java file in table with
name file_table where columns are file_id, file_name, file_size,
file_content, file_extension

*/

import java.sql.*;
import java.util.*;
import java.io.*;

public class Program466 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file id to retrieve: ");
        int id = sc.nextInt();

        String q = "SELECT file_name, file_content FROM file_table WHERE file_id=?";

        PreparedStatement pst = con.prepareStatement(q);
        pst.setInt(1, id);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {

            String fileName = rs.getString("file_name");
            Clob fClob = rs.getClob("file_path");

            Reader r = fClob.getCharacterStream();

            FileWriter fw = new FileWriter("D://"+fileName+".txt");

            int i = r.read();

            while(r.read() != -1) {
                fw.write((char)i);
                i = r.read();
            }

            fw.close();

            System.out.println("D://" + fileName + " saved");

        }
        else {
            System.out.println("\nFile not found.");
        }

        con.close();
    }
} 