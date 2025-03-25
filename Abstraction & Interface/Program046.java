/*

Write a program to demonstrate the multipath
inheritance for the classes having relations
as shown in figure

A     B    C
 \   /   /
   D   /
   | /
   E

*/

class Program046 {
    public static void main(String[] args) {

    }
}


interface A33{}
interface B33 extends A33{}
interface C33 extends A33{}

interface D33 extends A33, B33{}

class E33 implements D33, C33{}