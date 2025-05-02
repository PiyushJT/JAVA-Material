/*

Write a multithreaded program to print all odd
positive numbers in ascending order up to n,
where n is a positive integer number given as
a command line argument.
Instantiate requited number of threads, where each thread
except the last, examines next 50 numbers
and the last thread examines remaining numbers up to n

*/

public class Program170 {

    public static void main(String[] args) throws InterruptedException {

        int start = 1;
        int size = 50;

        // int n = Integer.parseInt(args[0]);
        int n = 120;

        while (n > 0) {

            // min from 50 and remaining numbers
            int end = Math.min(start + size - 1, start + n - 1);

            // declaring the Thread with bounds
            PrintOdd2 p = new PrintOdd2(start, end);

            p.start();

            // waiting for first thread to complete
            p.join();

            // Decrementing the given range
            n -= (end - start + 1);

            // Incrementing the initial bound
            start = end + 1;

        }

    }

}


class PrintOdd2 extends Thread {
    int n1;
    int n2;

    PrintOdd2(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void run() {

        for (int i = n1; i <= n2; i++)
            if (i % 2 == 1)
                System.out.print(i + " ");

    }

}