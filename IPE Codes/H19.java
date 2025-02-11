/*

Write a Java Program to Create a class Account.
It has three data member account id, name and balance.
Define method to assign value and display value.
Define method that search account number given by the user
by passing array to method.
If account number exists, print detail of that account.
Write a program using array of object.
Declare at least 5 account and print details.

*/


import java.util.*;

class H19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of object (Object of class Demo)
        Account2[] arrayOfObject = new Account2[5];


        // Initializing the objects
        for(int i = 0; i < 5; i++){
            arrayOfObject[i] = new Account2();
        }

        // setting values and displaying
        for (Account2 account : arrayOfObject){

            account.setData();

        }



        System.out.println();

        // printing the data
        for (Account2 student : arrayOfObject){

            student.showData();

        }

        System.out.println();
        Account2 search = new Account2();


        System.out.println("Enter id to search");

        search.searchByID(arrayOfObject, sc.nextInt());

    }
}

class Account2{

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

    void showData(Account2 acc) {

        System.out.println();
        System.out.println("Member Id is " + acc.memId);
        System.out.println("Name is " + acc.name);
        System.out.println("Balance is " + acc.balance);

    }



    void searchByID(Account2[] accounts, int id){

        Account2 acc = new Account2();

        for(Account2 account : accounts){

            if(id == account.memId)
                acc = account;

        }

        System.out.println("The searched account is");

        showData(acc);

    }

}