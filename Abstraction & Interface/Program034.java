/*

Java program to implement interface with hierarchical inheritance

*/

class Program034 {
    public static void main(String[] args) {

        Child11 c = new Child11();
        c.m1();

    }
}


interface GrandParent11{
    void m1();
}

interface Parent11 extends GrandParent11{
    void m2();
}

class Child11 implements Parent11{

    public void m1(){
        System.out.println("Printed m1 from child class");
    }

    public void m2(){
        System.out.println("Printed m2 from child class");
    }

}