/*

Consider Bank table with attributes AccountNo, CustomerName,
Balance, Phone and Address. Write a database application
which allows insertion, updation and deletion of records
in Bank table. Print values of all customers whose
balance is greater than 20,000.

*/

import java.sql.*;
import java.util.*;

public class Program417 {

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
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Display (balance > 20000)");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:

                    System.out.print("Account No: ");
                    int acc = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Balance: ");
                    float bal = sc.nextFloat();
                    sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Address: ");
                    String addr = sc.nextLine();

                    String query = """
                                INSERT INTO Bank (AccountNo, CustomerName, Balance, Phone, Address)
                                VALUES (?, ?, ?, ?, ?);
                            """;

                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setInt(1, acc);
                    pst.setString(2, name);
                    pst.setFloat(3, bal);
                    pst.setString(4, phone);
                    pst.setString(5, addr);

                    int r = pst.executeUpdate();
                    System.out.println(r + " record(s) inserted.");

                    break;

                case 2:

                    System.out.print("Enter Account No to update: ");
                    acc = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Balance: ");
                    bal = sc.nextFloat();
                    sc.nextLine();

                    query = """
                                UPDATE Bank SET Balance = ? WHERE AccountNo = ?;
                            """;

                    pst = con.prepareStatement(query);
                    pst.setFloat(1, bal);
                    pst.setInt(2, acc);

                    r = pst.executeUpdate();
                    System.out.println(r + " record(s) updated.");

                    break;

                case 3:

                    System.out.print("Enter Account No to delete: ");

                    acc = sc.nextInt();
                    sc.nextLine();

                    query = """
                                DELETE FROM Bank WHERE AccountNo = ?;
                            """;

                    pst = con.prepareStatement(query);
                    pst.setInt(1, acc);

                    r = pst.executeUpdate();
                    System.out.println(r + " record(s) deleted.");

                    break;

                case 4:

                    query = """
                                SELECT * FROM Bank WHERE Balance > 20000;
                            """;

                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);

                    while (rs.next()) {
                        System.out.println("AccountNo: " + rs.getInt("AccountNo") + ", Name: " + rs.getString("CustomerName") + ", Balance: " + rs.getFloat("Balance") + ", Phone: " + rs.getString("Phone") + ", Address: " + rs.getString("Address"));
                    }
                    break;

                case 5:

                    con.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;

            }

        }

    }

}