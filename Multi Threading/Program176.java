/*

Create a program for class PVR having Total_seats as instance variable.
Create  method for seat booking.
Create two threads which try to book seat of PVR screen1 (common object).
Use concept of synchronization.

*/

public class Program176 {

    public static void main(String[] args) {

        PVR m1 = new PVR();

        BookMyShow b1 = new BookMyShow(m1, 6);
        b1.setName("X");

        PayTM b2 = new PayTM(m1, 8);
        b2.setName("Y");

        b1.start();
        b2.start();
    }

}

class PVR {
    int total_seats = 10;

    synchronized public void bookTicket(int seats){

        String threadName = Thread.currentThread().getName();

        if (total_seats >= seats) {
            System.out.println(threadName + "'s " + seats + " tickets booked successfully");

            total_seats -= seats;
        }
        else {
            System.out.println(
                    threadName + "'s ticket not booked. only " + total_seats + " tickets left"
            );
        }

    }
}




class BookMyShow extends Thread{
    PVR m1;
    int seats;

    BookMyShow(PVR m1, int seats){
        this.m1 = m1;
        this.seats = seats;
    }

    public void run(){
        m1.bookTicket(seats);
    }

}


class PayTM extends Thread{
    PVR m1;
    int seats;

    PayTM(PVR m1, int seats){
        this.m1 = m1;
        this.seats = seats;
    }

    public void run(){
        m1.bookTicket(seats);
    }

}