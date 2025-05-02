/*

Make caller thread by extending thread class which calls synchronized
receiver method available in receiver class.
Make two threads of Caller  and display message "Ringing"
and thread name  according to thread.
Thread name must be Caller1 and Caller2.

*/

public class Program177 {

    public static void main(String[] args) {

        Caller Caller1 = new Caller("Caller 1");
        Caller Caller2 = new Caller("Caller 2");

        Caller1.start();
        Caller2.start();


    }

}

class Caller extends Thread {

    Receiver receiver = new Receiver();

    Caller(String name) {
        super(name);
    }

    public void run() {
        receiver.receiver();
        System.out.println("Ringing");
    }

}

class Receiver {

    public synchronized void receiver() {

        System.out.println("Call Received by " + Thread.currentThread().getName());

    }

}