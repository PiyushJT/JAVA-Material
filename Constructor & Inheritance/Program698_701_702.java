/*

698: Write a Java Program to calculate area of Circle and
     Rectangle using constructor overloading.

701: create a parameterized constructor to find the area
     of Rectangle

702: Write a Java Program to calculate area of Circle
     using default constructor.

*/

import java.util.Scanner;

class Program698_701_702 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter radius");
        int rad = sc.nextInt();

        System.out.println("Enter length");
        int len = sc.nextInt();

        System.out.println("Enter breadth");
        int bre = sc.nextInt();

        Area a1 = new Area(rad);
        Area a2 = new Area(len, bre);

    }

}


class Area{


    Area(int rad){

        System.out.println(3.14f*rad*rad);

    }

    Area(int x, int y){

        System.out.println(x*y);

    }

}