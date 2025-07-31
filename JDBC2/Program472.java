/*

Create a Transaction Management System that uses Thread, Where one thread is used to
deposite in account and other thread is used to withdraw from the account.
You need to run both thread on the wishes of user in database.
Try to use synchronized keywotrd to avoid deadlock

*/

import java.sql.*;
import java.util.*;

public class Program472 {

    static String url = "jdbc:mysql://localhost:3306/LJU";
    static String user = "root";
    static String pass = "";

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        Statement st = con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS account (acc_no INT PRIMARY KEY, acc_balance DOUBLE)");

        Program472 obj = new Program472();

        while (true) {

            System.out.println();
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {

                case 1:

                    System.out.print("Enter account number: ");
                    int accNoD = sc.nextInt();

                    System.out.print("Enter amount to deposit: ");
                    double amtD = sc.nextDouble();

                    DepositThread depositThread = new DepositThread(obj, accNoD, amtD);

                    depositThread.start();
                    depositThread.join();

                    break;

                case 2:

                    System.out.print("Enter account number: ");
                    int accNoW = sc.nextInt();

                    System.out.print("Enter amount to withdraw: ");
                    double amtW = sc.nextDouble();

                    WithdrawThread withdrawThread = new WithdrawThread(obj, accNoW, amtW);

                    withdrawThread.start();
                    withdrawThread.join();

                    break;

                case 3:

                    con.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid choice.");
                    break;

            }

        }

    }

    public synchronized void deposit(int accNo, double amt) {

        try (Connection con = DriverManager.getConnection(url, user, pass)) {

            PreparedStatement ps = con.prepareStatement("UPDATE account SET acc_balance = acc_balance + ? WHERE acc_no = ?");
            ps.setDouble(1, amt);
            ps.setInt(2, accNo);

            int r = ps.executeUpdate();

            if (r == 1)
                System.out.println("Deposit successful.");
            else
                System.out.println("Account not found.");

        }
        catch (Exception e) {
            System.out.println("Deposit error: " + e.getMessage());
        }
    }

    public synchronized void withdraw(int accNo, double amt) {

        try (Connection con = DriverManager.getConnection(url, user, pass)) {

            PreparedStatement ps = con.prepareStatement("UPDATE account SET acc_balance = acc_balance - ? WHERE acc_no = ? AND acc_balance >= ?");
            ps.setDouble(1, amt);
            ps.setInt(2, accNo);
            ps.setDouble(3, amt);

            int r = ps.executeUpdate();

            if (r == 1)
                System.out.println("Withdrawal successful.");
            else
                System.out.println("Account not found or insufficient funds.");

        }
        catch (Exception e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

    }

}


class DepositThread extends Thread {

    private final Program472 obj;

    private final int accNo;
    private final double amt;

    public DepositThread(Program472 obj, int accNo, double amt) {
        this.obj = obj;
        this.accNo = accNo;
        this.amt = amt;
    }

    public void run() {
        obj.deposit(accNo, amt);
    }

}


class WithdrawThread extends Thread {

    private final Program472 obj;

    private final int accNo;
    private final double amt;

    public WithdrawThread(Program472 obj, int accNo, double amt) {
        this.obj = obj;
        this.accNo = accNo;
        this.amt = amt;
    }

    public void run() {
        obj.withdraw(accNo, amt);
    }

} 