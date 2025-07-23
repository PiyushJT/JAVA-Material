/*

Write a java program to display all brochures from the
brochure table where table contains columns like :
brochure_id, brochure_name, brochure_pages.

*/

import java.sql.*;

public class Program409 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        if (con != null) {

            String query = """
                    SELECT *
                    FROM brochure;
                """;

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("brochure_id");
                String name = rs.getString("brochure_name");
                int pages = rs.getInt("brochure_pages");

                System.out.println("Id: " + id + " name: " + name + " pages: " + pages);
            }
            con.close();

        }
        else
            System.out.println("Connection failed");
    }

}