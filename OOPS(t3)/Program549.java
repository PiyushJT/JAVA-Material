/*

Define the Rectangle class that contains:
 Two double fields x and y that specify the center of the rectangle,
 the data field width and height,
 A no-arg method that creates the default rectangle with
 (0,0) for (x,y) and 1 for both width and
 height. A parameterized method creates a rectangle with the
 specified x,y,height and width.

 -A method getArea() that returns the area of the rectangle.
 -A method getPerimeter() that returns the perimeter of the rectangle.
 -A method contains(double x, double y) that returns true if the
    specified point (x,y) is inside this rectangle.

Write a test program that creates two rectangle objects.
One with default values and other with user specified values.
Test all the methods of the class for both the objects.

*/

import java.util.*;

class Program549 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.setValue();
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.contains(0,0));


        System.out.println("Enter x: ");
        double x = sc.nextDouble();

        System.out.println("Enter y: ");
        double y = sc.nextDouble();

        System.out.println("Enter width: ");
        double width = sc.nextDouble();

        System.out.println("Enter height: ");
        double height = sc.nextDouble();


        r1.setValue(x, y, width, height);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());


        System.out.println("Check in x: ");
        double xCheck = sc.nextDouble();

        System.out.println("Check in y: ");
        double yCheck = sc.nextDouble();

        System.out.println(r1.contains(xCheck, yCheck));


    }

}

class Rectangle{

    double x, y;
    double width, height;

    void setValue(){

        x = 0;
        y = 0;
        width = 1;
        height = 1;

    }

    void setValue(double xInp, double yInp, double widthInp, double heightInp){

        x = xInp;
        y = yInp;
        width = widthInp;
        height = heightInp;

    }

    double getArea(){

        return width * height;

    }

    double getPerimeter(){

        return 2 * (width + height);

    }

    boolean contains(double xInp, double yInp){

        return (xInp >= x-(width/2) && xInp <= x+(width/2)) &&
                (yInp >= y-(height/2) && yInp <= y+(height/2));

    }

}