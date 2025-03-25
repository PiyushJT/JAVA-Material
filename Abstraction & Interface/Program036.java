/*

Write a program that demonstrates the instanceof operator.
Declare interfaces I1 and I2.
Interface I3 extends both of these interfaces.
Also declare interface I4.
class X implements I3.
Class W extends X and implements I4.
create an object of class W.
Use the instanceof operator to test if that object
implements each of the interfaces and is of type X.

*/

class Program036 {
    public static void main(String[] args) {

        W w = new W();
        System.out.println(w instanceof I1);
        System.out.println(w instanceof I2);
        System.out.println(w instanceof I3);
        System.out.println(w instanceof I4);
        System.out.println(w instanceof X);

    }
}

interface I1{}

interface I2{}

interface I3 extends I1, I2{}

interface I4{}

class X implements I3{}

class W extends X implements I4{}