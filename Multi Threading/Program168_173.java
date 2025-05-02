/*

⚠️ Incomplete. "don't read this. its very confusing"
⚠️ (Question not clear)

Write a complete multi-threaded program to meet following requirements:
o Two threads of same type are to be instantiated in the method main.
o Each thread acts as a producer as well as a consumer.
o A shared buffer can store only one integer information along with the source &
  destination of the information at a time.
o The information produced is to be consumed by appropriate consumer.
o Both producers produce information for both consumers.
o Each thread produces 5 information.

*/

public class Program168_173 {

    public static void main(String[] args) {

        ProducerConsumer pc1 = new ProducerConsumer("pc1");
        ProducerConsumer pc2 = new ProducerConsumer("pc2");

    }

}

class Info {
    int val;
    String source;
    String destination;

    Info(int val, String source, String destination) {
        this.val = val;
        this.source = source;
        this.destination = destination;
    }

}

class ProducerConsumer extends Thread {

    Info givenInfo;

    ProducerConsumer(Info givenInfo, String name) {
        this.givenInfo = givenInfo;
        Thread.currentThread().setName(name);
    }

    ProducerConsumer(String name) {
        Thread.currentThread().setName(name);
    }


    public void run() {

        for (int i = 1; i <= 5; i++) {
            Info info = new Info(i, "source", "destination");
            System.out.println(info.val + " " + info.source + " " + info.destination);
        }


    }

}