/*

Write an application that creates and starts three threads.
Each thread is instantiated from the same class.
It executes a loop with 10 iterations.
Each iteration displays string "HELLO",
sleeps for 300 milliseconds.
The application waits for all the threads to complete & displays
the message "Good Bye..."

*/

import java.util.*;

public class Program162 {
    public static void main(String[] args) {

        Thread162 t1 = new Thread162();
        Thread162 t2 = new Thread162();
        Thread162 t3 = new Thread162();

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Good Bye...");

    }
}

class Thread162 extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("HELLO");

            try {
                Thread.sleep(300);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}