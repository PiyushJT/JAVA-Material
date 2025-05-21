/*

Write a complete multi-threaded program to meet following requirements:
o Two threads of same type are to be instantiated in the method main.
o Each thread acts as a producer as well as a consumer.
o A shared buffer can store only one integer information along with the source &
  destination of the information at a time.
o The information produced is to be consumed by appropriate consumer.
o Both producers produce information for both consumers.
o Each thread produces 5 information.

*/

public class Program167_172 {

    public static void main(String[] args) {

        PandC pc = new PandC();

        producer p = new producer(pc);
        consumer c = new consumer(pc);

        p.start();
        c.start();

    }

}


class PandC {

    boolean b = false;
    int data;

    synchronized void produce(int n) throws InterruptedException {

        if(b)
            wait();

        data = n;
        System.out.println("produced " + data);

        b = true;
        notify();

    }

    synchronized void consume() throws InterruptedException {

        if (!b)
            wait();

        System.out.println("consumed " + data);

        b = false;
        notify();

    }

}


class producer extends Thread{

    PandC pc;

    public producer(PandC pc) {
        this.pc = pc;
    }

    public void run(){

        for (int i = 1; i <= 5; i++){

            try {
                pc.produce(i);
            }
            catch (InterruptedException e){
                System.out.println("Interrupted");
            }

        }

    }

}


class consumer extends Thread{

    PandC pc;

    consumer(PandC pc){
        this.pc = pc;
    }

    public void run(){

        for(int i = 0; i <= 5; i++){

            try {
                pc.consume();
            }
            catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        }

    }

}