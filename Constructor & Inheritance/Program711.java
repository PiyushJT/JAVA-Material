/*

Write a Java Program to calculate the addition and subtraction of two values using this keyword.

*/

class Program711 {

    public static void main(String[] args) {

        Calc c = new Calc();
        c.add();
        c.subtr();

    }

}

class Calc{
    int a = 13;
    int b = 54;

    void add(){

        System.out.println(this.a + this.b);

    }

    void subtr(){

        System.out.println(this.a - this.b);

    }

}