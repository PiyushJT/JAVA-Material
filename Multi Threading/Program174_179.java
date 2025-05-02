/*

Explain the concept of Syncronization by taking suitable example.

-> Here, In this example, There is a class BankAcc.
-> It has two methods withdraw and deposit.
-> The withdraw method is synchronized which means only one object (or thread)
   can work on it at a time.
-> Now, we have two threads t1 & t2.
-> Both withdraws 9000 from bank account.
-> Both these threads are started simultaneously
-> But only one thread will work at a time. (first come first serve)


*/

public class Program174_179 {

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        T1 t1 = new T1(b);
        T2 t2 = new T2(b);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

    }

}



class BankAccount{
    int balance = 10000;

    public void deposit(int amount){
        balance += amount;

        System.out.println("Success!");
        System.out.println(balance + " is your current balance");
    }

    synchronized public void withdraw(int amount){
        if(amount <= balance){

            balance -= amount;

            System.out.println("Success!");
            System.out.println(balance + " is your current balance");

        }
        else {
            System.out.println("Insufficient Balance! :(");
            System.out.println(balance + " is your current balance");

        }
    }

}


class T1 extends Thread{

    BankAccount bA;

    T1(BankAccount bA){
        this.bA = bA;
    }

    public void run(){
        bA.withdraw(9000);
    }

}

class T2 extends Thread{

    BankAccount bA;

    T2(BankAccount bA){
        this.bA = bA;
    }

    public void run(){
        bA.withdraw(9000);
    }

}