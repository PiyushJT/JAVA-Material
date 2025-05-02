/*

Create PaymentThread class by extending Thread and
Make a program to count payments of 10 tickets each of 100 rs.
Display total using main thread.

*/

public class Program169 {

    public static void main(String[] args) throws InterruptedException{

        PaymentThread pt = new PaymentThread();
        pt.start();
        pt.join();
        System.out.println(pt.getTotal());

    }
}

class PaymentThread extends Thread {

    int total = 0;

    public void run() {

        for (int i = 1; i <= 10; i++) {
            total += 100;
        }

    }

    public int getTotal(){
        return total;
    }

}