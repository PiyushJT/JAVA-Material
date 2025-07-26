/*

Write database application that prints different records from
a table. Find out the name of table, no. of columns, no. of
records and type of the columns. Here DB name is LJU and
Table is employee with emp_id, emp_name, emp_designation, emp_salary

*/

import java.sql.*;

public class Program462 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employee");

        ResultSetMetaData md = rs.getMetaData();
        
        int colCount = md.getColumnCount();
        System.out.println("\nTable Name: " + md.getTableName(1));
        System.out.println("No. of Columns: " + colCount);

        System.out.println("Column Details:");

        for (int i = 1; i <= colCount; i++)
            System.out.println(i + ". " + md.getColumnName(i) + " (" + md.getColumnTypeName(i) + ")");
        
        int rowCount = 0;

        System.out.println("\nRecords:");
        while (rs.next()) {

            rowCount++;
            for (int i = 1; i <= colCount; i++)
                System.out.print(rs.getString(i) + " ");

            System.out.println();
        }

        System.out.println("\nNo. of Records: " + rowCount);

        con.close();
    }

}