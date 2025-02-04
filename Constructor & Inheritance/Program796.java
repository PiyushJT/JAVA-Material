/*

Create a class named 'Rectangle' with two data members
'length' and 'breadth' and two methods to print the area
and perimeter of the rectangle respectively.

Its constructor having parameters for length and breadth
is used to initialize length and breadth of the rectangle.

Let class 'Square' inherit the 'Rectangle' class with its
constructor having a parameter for its side (suppose s)
calling the constructor of its parent class as 'super(s,s)‘.
Print the area and perimeter of a rectangle and a square.

*/

class Program796 {

    public static void main(String[] args) {

        Rectangle2 r = new Rectangle2(2,3);
        r.printPerimeter();
        r.printArea();

        System.out.println();

        Square2 s = new Square2(2);
        s.printPerimeter();
        s.printArea();

    }

}


class Rectangle2{

    int length;
    int breadth;

    Rectangle2(int length, int breadth){

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


class Square2 extends Rectangle2{

    Square2(int s){

        super(s,s);

    }

}