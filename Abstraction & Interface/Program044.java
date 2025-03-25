/*

The Transport interface declares a deliver() method.
The abstract class Animal is the superclass of
the Tiger, Camel, Deer and Donkey classes.
The Transport interface is implemented by the
Camel and Donkey classes.
Write a test program that initialize an array of four Animal objects.
If the object implements the Transport interface,
the deliver() method is invoked.

*/

class Program044 {
    public static void main(String[] args) {

        Animal3[] animals = new Animal3[4];
        animals[0] = new Tiger();
        animals[1] = new Camel();
        animals[2] = new Deer();
        animals[3] = new Donkey();

        if (animals[0] instanceof Transport)
            ((Transport) animals[0]).deliver();

        if (animals[1] instanceof Transport)
            ((Transport) animals[1]).deliver();

        if (animals[2] instanceof Transport)
            ((Transport) animals[2]).deliver();

        if (animals[3] instanceof Transport)
            ((Transport) animals[3]).deliver();



    }
}

interface Transport{
    void deliver();
}

abstract class Animal3{

}

class Tiger extends Animal3{}
class Deer extends Animal3{}


class Camel extends Animal3 implements Transport{
    public void deliver() {
        System.out.println("Camel deliver");
    }
}

class Donkey extends Animal3 implements Transport {
    public void deliver() {
        System.out.println("Donkey deliver");
    }
}