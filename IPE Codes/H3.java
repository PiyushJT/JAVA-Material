/*

Write a JAVA program to create a super class called figure that
stores the dimensions of a two-dimensional object.
It also defines a method called area () that computes the area of
an object. The program derives two sub classes from figure.
The first is rectangle and the second is Triangle. Each of these subclasses
overrides area (), so that it returns the area of a rectangle
and a triangle respectively

*/


import java.util.*;

class H3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height");
        int height = sc.nextInt();

        System.out.println("Enter width");
        int width = sc.nextInt();

        Rectangle4 r = new Rectangle4(height, width);
        r.area();

        Triangle t = new Triangle(height, width);
        t.area();

    }
}


class Figure{
    int height;
    int width;

    void area(){

    }
}


class Rectangle4 extends Figure{

    Rectangle4(int height, int width){

        this.height = height;
        this.width = width;

    }

    void area(){

        System.out.println(height * width);

    }

}

class Triangle extends Figure{

    Triangle(int height, int width){

        this.height = height;
        this.width = width;

    }

    void area(){

        System.out.println(0.5f * height * width);

    }

}

