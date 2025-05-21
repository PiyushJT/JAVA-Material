/*

Implement a Prime Number Finder
Write a Java program to implement a prime number finder
that checks if a given number is prime or not in a separate thread.
The program should use the join() method to wait for all the threads to finish,
and the isAlive() method to check if a thread is still running.

To solve this problem, you can create a prime number finder thread
that implements the Runnable interface and checks if a given number is prime or not.
You can then create multiple instances of the prime number finder thread
and start them using separate threads.
The main thread can use the join() method to wait for all the threads to finish,
and the isAlive() method to check if a thread is still running.

*/

public class Program177 {

    public static void main(String[] args) throws InterruptedException {

        PrimeFinder pf1 = new PrimeFinder(10007);
        PrimeFinder pf2 = new PrimeFinder(10009);
        PrimeFinder pf3 = new PrimeFinder(10011);
        PrimeFinder pf4 = new PrimeFinder(10013);


        Thread t1 = new Thread(pf1);
        Thread t2 = new Thread(pf2);
        Thread t3 = new Thread(pf3);
        Thread t4 = new Thread(pf4);



        t1.start();
        t2.start();

        System.out.println(t2.isAlive());

        t3.start();
        t4.start();

        System.out.println(t1.isAlive());


        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println(t1.isAlive());

    }

}


class PrimeFinder implements Runnable{

    int n;

    PrimeFinder(int n){
        this.n = n;
    }

    public void run(){

        boolean isPrime = true;

        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }

}