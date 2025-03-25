/*

Write a java program to explain runtime polymorphism using interfaces

*/

class Program035 {
    public static void main(String[] args) {


        Parent12 c1 = new Child1201();
        c1.m1();

        Parent12 c2 = new Child1202();
        c2.m1();

    }
}

interface Parent12{
    void m1();
}

class Child1201 implements Parent12{

    public void m1() {
        System.out.println("child 1");
    }
}

class Child1202 implements Parent12{

    public void m1() {
        System.out.println("Child 2");
    }
}