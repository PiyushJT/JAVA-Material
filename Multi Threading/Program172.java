/*

Write a program to create two thread one display
alphabet from a to z and other will display
numbers from 1 to 100

*/

public class Program172 {

    public static void main(String[] args) {

        Alpha a = new Alpha();
        Num n = new Num();

        a.start();
        n.start();

    }

}

class Alpha extends Thread {

    public void run(){

        for (char c = 'A'; c <= 'Z'; c++)
            System.out.print(c + " ");

    }

}

class Num extends Thread {

    public void run(){

        for (int i = 1; i <= 100; i++)
            System.out.print(i + " ");

    }

}