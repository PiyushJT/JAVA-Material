/*

Write a Java code to show use of super keyword with variables.
Create class vehicle with variable maxSpeed = 120.
Class car has variable maxSpeed and display method.
Class car is child class of Vehicle. User super keyword
to access maxSpeed from vehicle to car and make a displayO
method to print maxSpeed of both classes.

*/

class Program836 {

    public static void main(String[] args) {

        Car c = new Car();
        c.display();

    }

}


class Vehicle{

    int maxSpeed = 120;

}

class Car extends Vehicle{

    int maxSpeed = 100;


    void display(){

        System.out.println(super.maxSpeed);
        System.out.println(maxSpeed);

    }

}