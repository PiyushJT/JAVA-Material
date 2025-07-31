/*

I try to hack the system of Adhar card. For this somehow, I got the
access of the database – “aadhar” and it’s table – “aadharDetails”.
Now can you help me with the following?
1 – To find the total number of columns in this table
2 – To find the name of the column 1 and 2
3 – To find the name of the column type of column 3 and 4.
Write the java code for the above mentioned tasks.
[No need to write code for connection]

*/

import java.sql.*;

public class Program474 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/aadhar";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM aadharDetails LIMIT 1");
        ResultSetMetaData md = rs.getMetaData();

        // 1
        System.out.println("Total columns: " + md.getColumnCount());

        // 2
        System.out.println("Column 1: " + md.getColumnName(1));
        System.out.println("Column 2: " + md.getColumnName(2));

        // 3
        System.out.println("Type of column 3: " + md.getColumnTypeName(3));
        System.out.println("Type of column 4: " + md.getColumnTypeName(4));

    }

} 