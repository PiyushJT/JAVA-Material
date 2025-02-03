/*

Define Class named point which represents 2-D Point,
i.e P(x, y). Define Default constructor to initialize both data
member value 5, Parameterized constructor to initialize
member according to value supplied by user. Define
Necessary Function and Write a program to test class
Point.

*/

import java.util.Scanner;

class Program699 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("Enter y");
        int y = sc.nextInt();


        Point p1 = new Point();
        p1.display();

        Point p2 = new Point(x, y);
        p2.display();


    }

}

class Point{

    int x;
    int y;


    Point(){

        x = 5;
        y = 5;

    }

    Point(int x, int y){

        this.x = x;
        this.y = y;

    }

    void display(){

        System.out.println(this.x);
        System.out.println(this.y);


    }


}