/*

Write a Java Program to Create a class Account. It has
three data member account id, name and balance.
 Define method to assign value and display value.
 Define method that search account number given by the user.
 If account number exists, print detail of that account.
 Write a program using array of object. Declare at least
 5 account and print details.

*/

import java.util.*;

class Program625 {

    public static void main(String[] args) {


        // Array of object (Object of class Demo)
        Account[] arrayOfObject = new Account[5];


        // Initializing the objects
        for(int i = 0; i < 5; i++){
            arrayOfObject[i] = new Account();
        }

        // setting values and displaying
        for (Account account : arrayOfObject){

            account.setData();

        }



        System.out.println();

        // printing the data
        for (Account student : arrayOfObject){

            student.showData();

        }

        System.out.println();
        Account search = new Account();

        search.searchByID(arrayOfObject, 420);

    }
}

class Account{

    int memId;
    String name;
    long balance;


    void setData(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Member ID: ");
        memId = sc.nextInt();

        System.out.println("Enter name: ");
        name = sc.next();

        System.out.println("Enter Balance: ");
        balance = sc.nextLong();

        showData();


    }

    void showData(){

        System.out.println();
        System.out.println("Member Id is " + memId);
        System.out.println("Name is " + name);
        System.out.println("Balance is " + balance);

    }

    void showData(Account acc) {

        System.out.println();
        System.out.println("Member Id is " + acc.memId);
        System.out.println("Name is " + acc.name);
        System.out.println("Balance is " + acc.balance);

    }



    void searchByID(Account[] accounts, int id){

        Account acc = new Account();

        for(Account account : accounts){

            if(id == account.memId)
                acc = account;

        }

        System.out.println("The searched account is");

        showData(acc);

    }

}