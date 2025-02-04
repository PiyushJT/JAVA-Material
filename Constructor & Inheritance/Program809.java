/*

Write a JAVA program to create a super class called
figure that stores the dimensions of a two-dimensional
object.

It also defines a method called area () that
returns the area of an object.

The program derives two sub classes from figure.
The first is rectangle and the second is Triangle.
Each of these subclasses overrides area (),
so that it returns the area of a rectangle and
a triangle respectively

*/

class Program809 {

    public static void main(String[] args) {

        Parent8 p = new Parent8();
        p.displayP(); // 1

        Child8 c = new Child8();
        c.displayC(); // 2
        c.displayP(); // 3


    }

}
