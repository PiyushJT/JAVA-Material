/*

Create a class with a method that prints "This is parent class"
and its subclass with another method that prints "This is child class".

Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class

*/

class Program797 {

    public static void main(String[] args) {

        Parent8 p = new Parent8();
        p.displayP(); // 1

        Child8 c = new Child8();
        c.displayC(); // 2
        c.displayP(); // 3


    }

}

class Parent8{

    void displayP(){

        System.out.println("This is parent class");

    }

}


class Child8 extends Parent8{

    void displayC(){

        System.out.println("This is child class");

    }

}