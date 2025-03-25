/*

Explain single level and multiple inheritances in java.
Write a program to demonstrate combination of both types
of inheritance as shown in figure 1. i.e. hybrid inheritance.

A     B
 \   /
   C
   |
   D

*/

class Program043 {
    public static void main(String[] args) {

    }
}

interface A22{}
interface B22{}

interface C22 extends A22, B22{}
class D22 implements C22{}