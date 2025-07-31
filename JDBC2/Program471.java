/*

Write a  java program for the following tasks
The program should establish a connection to the database using JDBC.
The program should allow users to enter the source account number,
destination account number, and the amount to be transferred.
The program should begin a transaction and deduct the amount from
the source account and add the amount to the destination account.
The program should commit the transaction if the transaction is
successful.
The program should rollback the transaction if any exception occurs
during the transaction.
Functionality:
The program should provide a menu to the user to perform the transfer of funds.
The program should handle exceptions such as SQLException and ClassNotFoundException.
Create Two Tables:
account : acc_no & acc_balance
transaction : trans_id, ,src_acc_no, dest_acc_no, trans_amt
OUTPUT
Welcome to the Fund Transfer System.
1. Transfer Funds
2. Exit
Enter your choice: 1
Enter source account number: 123456
Enter destination account number: 987654
Enter amount to be transferred: 5000
Transaction successful.
1. Transfer Funds
2. Exit
Enter your choice: 2

*/

import java.sql.*;
import java.util.*;

public class Program471 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/LJU";
        String user = "root";
        String pass = "";

        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            Statement st = con.createStatement();

            st.executeUpdate("CREATE TABLE IF NOT EXISTS account (acc_no INT PRIMARY KEY, acc_balance DOUBLE)");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS transaction (trans_id INT AUTO_INCREMENT PRIMARY KEY, src_acc_no INT, dest_acc_no INT, trans_amt DOUBLE)");

            while (true) {

                System.out.println();
                System.out.println("Welcome to the Fund Transfer System.");
                System.out.println("1. Transfer Funds");
                System.out.println("2. Exit");

                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                switch (choice) {

                    case 1:

                        System.out.print("Enter source account number: ");
                        int src = sc.nextInt();

                        System.out.print("Enter destination account number: ");
                        int dest = sc.nextInt();

                        System.out.print("Enter amount to be transferred: ");
                        double amt = sc.nextDouble();

                        try {

                            con.setAutoCommit(false);

                            PreparedStatement ps1 = con.prepareStatement("UPDATE account SET acc_balance = acc_balance - ? WHERE acc_no = ?");
                            ps1.setDouble(1, amt);
                            ps1.setInt(2, src);

                            int r1 = ps1.executeUpdate();


                            PreparedStatement ps2 = con.prepareStatement("UPDATE account SET acc_balance = acc_balance + ? WHERE acc_no = ?");
                            ps2.setDouble(1, amt);
                            ps2.setInt(2, dest);
                            int r2 = ps2.executeUpdate();


                            if (r1 == 1 && r2 == 1) {

                                PreparedStatement ps3 = con.prepareStatement("INSERT INTO transaction (src_acc_no, dest_acc_no, trans_amt) VALUES (?, ?, ?)");
                                ps3.setInt(1, src);
                                ps3.setInt(2, dest);
                                ps3.setDouble(3, amt);
                                ps3.executeUpdate();

                                con.commit();

                                System.out.println("Transaction successful.");

                            }
                            else {

                                con.rollback();
                                System.out.println("Transaction failed. Account not found or insufficient funds.");

                            }
                        }
                        catch (Exception e) {

                            con.rollback();
                            System.out.println("Transaction failed: " + e.getMessage());

                        }

                        break;

                    case 2:

                        con.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice.");
                        break;

                }

            }

        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

} 