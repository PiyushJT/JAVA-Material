/*

Write a program to demonstrate the multipath inheritance
for the classes having relations as
shown in figure A-> (B, C) ->D.

    A
 /    \
B      C
 \    /
    D

*/

class Program042 {
    public static void main(String[] args) {

    }
}

interface A11{}

interface B11 extends A11{}

interface C11 extends A11{}

class D11 implements B11, C11{}