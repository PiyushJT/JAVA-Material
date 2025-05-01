/*

Write a program to create a child thread to print integer numbers 1 to 10

*/

public class Program163 {
    public static void main(String[] args) {

        Thread163 t = new Thread163();

        t.start();

    }
}

class Thread163 extends Thread{
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }
}