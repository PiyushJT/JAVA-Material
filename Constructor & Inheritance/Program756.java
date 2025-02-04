/*

Write a Java Program to access variable of static inner
class without creating an object of the outer class

*/

class Program756 {

    public static void main(String[] args) {

        System.out.println(Parent.Child.b);

    }

}


class Parent{

    int a = 90;

    static class Child{

        static int b = 10;

    }

}