/*

Use of final variable:
Create class Circle with final variable CIRCLE PI.
Create method area() to calculate area of circle by using variable CIRCLE_PI in area formula.

*/


import java.util.Scanner;

class Program837 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle2 c = new Circle2();

        System.out.println("Enter radius");
        float rad = sc.nextFloat();

        System.out.println(c.area(rad));

    }

}


class Circle2{

    final float PI = 3.14f;

    float area(float rad){

        return PI*rad*rad;

    }

}