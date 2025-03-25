/*

⚠ Incorrect Question in PB ⚠
👇 here is the correct 👇

Write a program that illustrates interface inheritance.
Interface A is extended by A1 and A2.
Interface A12 inherits from both A1 and A2.
Each interface declares one constant and one method.
Class B implements A12.
Instantiate B and invoke each of its methods.
Each method displays one of the constants.

*/

class Program038_40_41 {
    public static void main(String[] args) {

        B b = new B();
        b.m1();
        b.m2();
        b.m3();
        b.m4();

    }
}

interface A{
    int constantA = 10;
    void m1();
}

interface A1 extends A{
    int constantA1 = 20;
    void m2();
}
interface A2 extends A{
    int constantA2 = 30;
    void m3();
}

interface A12 extends A1, A2{
    int constantA12 = 40;
    void m4();
}

class B implements A12{
    public void m1(){
        System.out.println(constantA);
    }
    public void m2() {
        System.out.println(constantA1);
    }
    public void m3() {
        System.out.println(constantA2);
    }
    public void m4() {
        System.out.println(constantA12);
    }
}