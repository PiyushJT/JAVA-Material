/*

Write a program using JDBC for getting personal information
– name, birthdate, sex, address, phone no, email-id & store
it in database. Also provide list of all records, all male,
all female & all minors (age below 18).

*/

import java.sql.*;
import java.util.*;

public class Program418 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user, pass);
        Scanner sc = new Scanner(System.in);

        if (con == null) {
            System.out.println("Connection failed");
            return;
        }

        while (true) {
            System.out.println();
            System.out.println("1. Insert");
            System.out.println("2. Display All");
            System.out.println("3. Display Male");
            System.out.println("4. Display Female");
            System.out.println("5. Display Minors (age < 18)");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Birthdate (YYYY-MM-DD): ");
                    String birthdate = sc.nextLine();
                    System.out.print("Sex (M/F): ");
                    String sex = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    String query = """
                        INSERT INTO PersonalInfo (name, birthdate, sex, address, phone, email)
                        VALUES (?, ?, ?, ?, ?, ?);
                    """;
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, name);
                    pst.setString(2, birthdate);
                    pst.setString(3, sex);
                    pst.setString(4, address);
                    pst.setString(5, phone);
                    pst.setString(6, email);
                    int r = pst.executeUpdate();
                    System.out.println(r + " record(s) inserted.");
                    break;
                case 2:
                    query = "SELECT *, TIMESTAMPDIFF(YEAR, birthdate, CURDATE()) AS age FROM PersonalInfo;";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while (rs.next()) {
                        System.out.println("Name: " + rs.getString("name") + ", Birthdate: " + rs.getString("birthdate") + ", Sex: " + rs.getString("sex") + ", Address: " + rs.getString("address") + ", Phone: " + rs.getString("phone") + ", Email: " + rs.getString("email") + ", Age: " + rs.getInt("age"));
                    }
                    break;
                case 3:
                    query = "SELECT *, TIMESTAMPDIFF(YEAR, birthdate, CURDATE()) AS age FROM PersonalInfo WHERE sex = 'M';";
                    st = con.createStatement();
                    rs = st.executeQuery(query);
                    while (rs.next()) {
                        System.out.println("Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
                    }
                    break;
                case 4:
                    query = "SELECT *, TIMESTAMPDIFF(YEAR, birthdate, CURDATE()) AS age FROM PersonalInfo WHERE sex = 'F';";
                    st = con.createStatement();
                    rs = st.executeQuery(query);
                    while (rs.next()) {
                        System.out.println("Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
                    }
                    break;
                case 5:
                    query = "SELECT *, TIMESTAMPDIFF(YEAR, birthdate, CURDATE()) AS age FROM PersonalInfo HAVING age < 18;";
                    st = con.createStatement();
                    rs = st.executeQuery(query);
                    while (rs.next()) {
                        System.out.println("Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
                    }
                    break;
                case 6:
                    con.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
