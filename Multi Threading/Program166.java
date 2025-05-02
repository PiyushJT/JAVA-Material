/*

Write an application that executes two threads. One thread displays "Good Morning" every
1000 milliseconds & another thread displays "Good Afternoon" every 3000 milliseconds for 10 times..
Create the threads by implementing the Runnable interface.

*/

public class Program166 {
    public static void main(String[] args) {

        Mor m = new Mor();
        Aft a = new Aft();

        Thread mor = new Thread(m);
        Thread aft = new Thread(a);

        mor.start();
        aft.start();

    }

}

class Mor implements Runnable {

    public void run() {

        for (int i = 1; i <= 10; i++)
            try {
                System.out.println(i + " Good Morning");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

    }

}

class Aft implements Runnable {

    public void run() {

        for (int i = 1; i <= 10; i++)
            try {
                System.out.println(i + " Good Afternoon");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

    }

}