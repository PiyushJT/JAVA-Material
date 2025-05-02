/*

Write a program to create two threads,
one thread will print odd numbers and
second thread will print even numbers
between 1 to 100 numbers

*/

public class Program167 {

    public static void main(String[] args) {

        PrintOdd po = new PrintOdd();
        PrintEven pe = new PrintEven();

        po.start();
        pe.start();


    }

}


class PrintOdd extends Thread {

    public void run() {

        for (int i = 1; i <= 100; i += 2)
            System.out.println(i);

    }

}

class PrintEven extends Thread {

    public void run() {

        for (int i = 2; i <= 100; i += 2)
            System.out.println(i);

    }

}