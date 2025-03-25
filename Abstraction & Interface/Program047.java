/*

Q1)Create an abstract class pen with methods
   write () and refill () as abstract methods
Q2)Use the pen class from Q1 to create a
   concrete class fountain pen with
   additional method change Nib ()
Q3)Create a class monkey with jump ( )
   and bite ( ) methods Create a class human
   whichinherits this monkey class and implements
   basicanimal interface with eat ( ) and sleep methods
Q4)Create a class telephone with dial ( ) , lift ( )
   and disconnected ( ) methods as abstract
   methods create another class smart telephone
   and demonstrate polymorphism
Q5)Demonstrate polymorphism using using
   monkey  class from Q3
Q6)Create an interface TVremote and use it to
   inherit another interface smart TVremote
Q7)Create a class TV which implements
   TVremote interface from Q6

*/

class Program047 {
    public static void main(String[] args) {

        Telephone t = new SmartTelephone();

        Monkey m = new Human();

    }
}

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{

    void write() {

    }

    void refill() {
    }

    void changeNib(){
    }

}

class Monkey{
    void jump(){}
    void bite(){}
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    public void eat() {}
    public void sleep() {}
}


abstract class Telephone{
    abstract void dial();
    abstract void lift();
    abstract void disconnected();
}

class SmartTelephone extends Telephone{
    public void dial() {}
    public void lift() {}
    public void disconnected() {}
}

interface TVRemote{}
interface SmartTVRemote extends TVRemote{}

class TV implements TVRemote{}