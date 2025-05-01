/*

Write a program to create two threads,
one thread will check whether given number
is prime or not and
second thread will print prime numbers
between 0 to 100

*/

import java.util.Scanner;

public class Program164 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check: ");
        int n = sc.nextInt();
        CheckPrime cp = new CheckPrime(n);

        PrintPrime p = new PrintPrime();

        cp.start();
        p.start();

    }



    static class CheckPrime extends Thread {

        int n;

        CheckPrime(int n) {
            this.n = n;
        }

        public void run() {

            if(isPrime(n))
                System.out.println("It is prime");
            else
                System.out.println("It is not prime");

        }

    }

    static class PrintPrime extends Thread {

        public void run(){

            System.out.println();

            for(int i = 1; i <= 100; i++)
                if (isPrime(i))
                    System.out.print(i + " ");

        }

    }

    static Boolean isPrime(int n){

        if (n < 2)
            return true;


        for(int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;

    }

}