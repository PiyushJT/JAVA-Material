/*

Write an application that read limit from user and executes two threads.
One thread displays total of first n even numbers & another
thread displays total of first n odd numbers.
Create the threads by implementing the Runnable interface

*/

import java.util.Scanner;

public class Program171 {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number limit: ");
        int n = sc.nextInt();

        SumOdd so = new SumOdd(n);
        SumEven se = new SumEven(n);

        Thread odd = new Thread(so);
        Thread even = new Thread(se);

        odd.start();
        even.start();

    }

}


class SumOdd implements Runnable {

    int n;
    int total = 0;

    SumOdd(int n){
        this.n = n;
    }

    public void run() {

        for (int i = 1; i <= n; i += 2)
            total += i;

        System.out.println("Total of Odd is " + total);

    }

}

class SumEven implements Runnable {

    int n;
    int total = 0;

    SumEven(int n){
        this.n = n;
    }

    public void run() {

        for (int i = 2; i <= n; i += 2)
            total += i;

        System.out.println("Total of Even is " + total);
    }


}