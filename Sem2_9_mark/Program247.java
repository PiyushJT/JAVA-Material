/*

Filename: ConsProd.java
You are tasked with implementing a multi-threaded program in Java that simulates the Consumer Producer problem. In this problem, you have a shared buffer between a consumer and a producer. The producer generates data and puts it into the buffer, while the consumer retrieves data from the buffer.
Shared Buffer: Implement a SharedBuffer class.  This class represents the shared resource between the producer and consumer threads. It should support operations for putting data into the buffer (one at a time by producer) and retrieving data from the buffer (one at a time by consumer). It has a value(int) field and isReady(boolean) field indicating whether the value is ready to be consumed or not. The produce() method sets the value and notifies the consumer, while the consume() method consumes the value and notifies the producer.
Producer: Create a Producer thread class that generates data items and puts them into the buffer. It repeatedly produces (total 5) values and sleeps for 1 second between each production. The producer should wait if the buffer is full.
Consumer: Create a Consumer thread class that retrieves data items from the buffer. It repeatedly consumes the produced value (total 5) and sleeps for 1 second between each consumption.The consumer should wait if the buffer is empty.
Main Class (ConsProd): This is the entry point of the program. Create an object of the SharedBuffer class and two threads - one for the producer and one for the consumer. Then start both threads to achieve goal. Sample output: (assume above mentioned delay between each production and each consumption)
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3
Produced: 4
Consumed: 4
Produced: 5
Consumed: 5
Properly do use of synchronization in methods of the SharedBuffer class to ensure thread safety, and  wait() and notify() methods for coordinating between the producer and consumer threads.

*/

public class Program247 {

    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();

    }

}


class SharedBuffer {

    boolean isReady = false;
    int value;

    synchronized void produce(int data) throws InterruptedException {

        if (isReady)
            wait();

        value = data;
        isReady = true;
        System.out.println("Produced: " + data);
        notify();

    }


    synchronized int consume() throws InterruptedException {

        if (!isReady)
            wait();

        int consumedValue = value;
        isReady = false;
        System.out.println("Consumed: " + consumedValue);
        notify();

        return consumedValue;
    }

}


class Producer extends Thread {

    SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        for (int i = 1; i <= 5; i++)

            try {

                buffer.produce(i);
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Producer Interrupted");
            }

    }

}


class Consumer extends Thread {

    SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        for (int i = 1; i <= 5; i++)

            try {

                buffer.consume();
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Consumer Interrupted");
            }

    }

}