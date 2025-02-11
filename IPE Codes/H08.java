/*

Create a class named 'Rectangle' with two data members 'length' and 'breadth'
and two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used
to initialize length and breadth of the rectangle.
Let class 'Square' inherit the 'Rectangle' class with its constructor
having a parameter for its side (suppose s) calling the constructor of
its parent class as 'super(s,s)'.
Print the area and perimeter of a rectangle and a square.
Print the area of 10 squares.

*/


import java.util.*;

class H08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length");
        int length = sc.nextInt();

        System.out.println("Enter breadth");
        int breadth = sc.nextInt();

        Rectangle5 r = new Rectangle5(length, breadth);
        r.printPerimeter();
        r.printArea();

        System.out.println();


        for(int i = 1; i <= 10; i++) {

            System.out.println("Enter side for square " + i);
            int side = sc.nextInt();

            Square5 s = new Square5(side);
            s.printPerimeter();
            s.printArea();

        }

    }

}


class Rectangle5{

    int length;
    int breadth;

    Rectangle5(int length, int breadth){

        this.length = length;
        this.breadth = breadth;

    }

    void printPerimeter(){

        System.out.println(2* (length + breadth));

    }

    void printArea(){

        System.out.println(length * breadth);

    }

}


class Square5 extends Rectangle5{

    Square5(int s){

        super(s,s);

    }

}