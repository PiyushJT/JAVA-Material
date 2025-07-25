/*
Suppose you are working on a project for a banking system that requires you to implement JDBC CRUD operations. You need to create a Java application that allows users to add, view, update, and delete customer accounts from the database. The program should establish a connection to the database using JDBC and use PreparedStatement to execute SQL statements.
Requirements:
The program should establish a connection to the database using JDBC. The program should allow users to add, view, update, and delete customer accounts from the database.
The program should use PreparedStatement to execute SQL statements. The program should display appropriate messages to the user indicating the success or failure of the operation.
Functionality:
The program should provide a menu to the user to add, view, update, and delete customer accounts.
The program should handle exceptions such as SQLException and ClassNotFoundException.
Program430
*/

import java.sql.*;
import java.util.*;

public class Program430 {

    public static void main(String[] args)  throws Exception{

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        if (con == null) {
            System.out.println("Connection failed");
            return;
        }

        while (true) {
            System.out.println();
            System.out.println("1. Add Customer Account");
            System.out.println("2. View All Customer Accounts");
            System.out.println("3. Update Customer Account");
            System.out.println("4. Delete Customer Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (choice == 1) {
                // Add Customer Account
                System.out.print("Enter Customer Name: ");
                String name = sc.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Customer name cannot be empty.");
                    continue;
                }
                System.out.print("Enter Account Number: ");
                String accNo = sc.nextLine().trim();
                if (accNo.isEmpty()) {
                    System.out.println("Account number cannot be empty.");
                    continue;
                }
                System.out.print("Enter Account Type: ");
                String accType = sc.nextLine().trim();
                if (accType.isEmpty()) {
                    System.out.println("Account type cannot be empty.");
                    continue;
                }
                System.out.print("Enter Balance: ");
                double balance = 0;
                try {
                    balance = Double.parseDouble(sc.nextLine());
                    if (balance < 0) {
                        System.out.println("Balance cannot be negative.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid balance.");
                    continue;
                }
                String insert = "INSERT INTO customer (name, acc_no, acc_type, balance) VALUES (?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(insert);
                pst.setString(1, name);
                pst.setString(2, accNo);
                pst.setString(3, accType);
                pst.setDouble(4, balance);
                int r = pst.executeUpdate();
                if (r > 0) System.out.println("Customer account added successfully.");
                else System.out.println("Failed to add customer account.");
            }
            else if (choice == 2) {

                // View All Customer Accounts
                String select = "SELECT * FROM customer";

                PreparedStatement pst = con.prepareStatement(select);
                ResultSet rs = pst.executeQuery();
                System.out.println("\nID\tName\tAccount No\tType\tBalance");

                while (rs.next()) {

                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String accNo = rs.getString("acc_no");
                    String accType = rs.getString("acc_type");
                    double balance = rs.getDouble("balance");
                    System.out.println(id + "\t" + name + "\t" + accNo + "\t" + accType + "\t" + balance);

                }
            }
            else if (choice == 3) {

                // Update Customer Account
                System.out.print("Enter Customer ID to update: ");
                int id = sc.nextInt();

                System.out.print("Enter New Name: ");
                String name = sc.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Customer name cannot be empty.");
                    continue;
                }

                System.out.print("Enter New Account Number: ");
                String accNo = sc.nextLine().trim();
                if (accNo.isEmpty()) {
                    System.out.println("Account number cannot be empty.");
                    continue;
                }

                System.out.print("Enter New Account Type: ");
                String accType = sc.nextLine().trim();
                if (accType.isEmpty()) {
                    System.out.println("Account type cannot be empty.");
                    continue;
                }

                System.out.print("Enter New Balance: ");
                double balance = sc.nextDouble();

                String update = "UPDATE customer SET name=?, acc_no=?, acc_type=?, balance=? WHERE id=?";
                PreparedStatement pst = con.prepareStatement(update);

                pst.setString(1, name);
                pst.setString(2, accNo);
                pst.setString(3, accType);
                pst.setDouble(4, balance);
                pst.setInt(5, id);
                int r = pst.executeUpdate();

                if (r > 0)
                    System.out.println("Customer account updated successfully.");
                else
                    System.out.println("Failed to update customer account. Check ID.");

            }

            else if (choice == 4) {

                // Delete Customer Account
                System.out.print("Enter Customer ID to delete: ");
                int id = sc.nextInt();

                String delete = "DELETE FROM customer WHERE id=?";

                PreparedStatement pst = con.prepareStatement(delete);
                pst.setInt(1, id);

                int r = pst.executeUpdate();

                if (r > 0)
                    System.out.println("Customer account deleted successfully.");
                else
                    System.out.println("Failed to delete customer account. Check ID.");

            }

            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid choice.");
            }

        }

    }

}