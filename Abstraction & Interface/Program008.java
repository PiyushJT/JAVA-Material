/*

Write a program that implementts dynamic method dispatch

*/

class Program008 {
    public static void main(String[] args) {

        Parent10 ch = new Child10();

        ch.m1();
        ch.m2();

    }
}

class Parent10{
    void m1(){
        System.out.println("Parent m1");
    }
    void m2(){
        System.out.println("Parent m2");
    }
}

class Child10 extends Parent10{
    void m2(){
        System.out.println("Child m2");
    }
}