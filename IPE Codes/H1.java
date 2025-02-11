/*

Write a class named Rectangle to represent a rectangle.
It contains following members: Data: width(double) and height (Double)
that specify the width and height of the rectangle. Methods:

1. A no-arg constructor that creates a default rectangle.
2. A constructor that creates a rectangle with the specified width and height.
3. A method named getArea() that returns the area of this rectangle.
4. A method named getPerimeter() that returns the perimeter.

*/


import java.util.*;

class H1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width");
        double width = sc.nextDouble();

        System.out.println("Enter height");
        double height = sc.nextDouble();

        Rectangle3 r1 = new Rectangle3(width, height);

        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());


        Rectangle3 r2 = new Rectangle3();

        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());

    }
}

class Rectangle3{

    double width;
    double height;

    Rectangle3(){

        this.width = 30;
        this.height = 20;

    }

    Rectangle3(double width, double height){

        this.width = width;
        this.height = height;

    }


    double getPerimeter(){

        return 2 * (width + height);

    }

    double getArea(){

        return width * height;

    }

}