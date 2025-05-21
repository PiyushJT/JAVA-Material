/*

It's IPL 2023 time. In this process of IPL-23 there is a thread called Bowler.
This Bowler is going to create two threads with name – “Yorker” and “googly”.
Write a java program to perform following task with each thread.
Task 1 : if the thread name is "yorker" then it should print "SIXER"
Task 2 : if the thread name is "googly" then it should print "WICKET"
Make sure first thread bowl must be yorker.
When execution of first thread is completed then and only then
second bowl googly should work.
Hint: Here Bowler is a Thread Class.
and It must have execution of SIXER AND WICKET.
Both yorker and googly must be from Bowler Thread Only.
Give name IPL to the class of Main method.

*/

public class Program164 {

    public static void main(String[] args) throws InterruptedException {

        Bowler y = new Bowler("Yorker");
        Bowler g = new Bowler("googly");

        y.start();
        y.join();
        g.start();

    }

}

class Bowler extends Thread {

    Bowler(String name){
        super(name);
    }


    public void run(){

        String threadName = Thread.currentThread().getName();

        if(threadName.equalsIgnoreCase("Yorker"))
            System.out.println("SIXER");
        else if(threadName.equalsIgnoreCase("googly"))
            System.out.println("WICKET");


    }

}