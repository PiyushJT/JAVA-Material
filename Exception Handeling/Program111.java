/*

Declare a class called Coordinate2 to represent 3 dimensional Cartesian c0ordinates( x, y and z).
Define following methods:
- constructor
- display, to print values of members
- add_coordinates, to add three such Coordinate2 objects to produce a resultant
Coordinate2 object. Generate and handle exception if x, y and z c0ordinates of the result are zero.
- main, to show use of above methods.

*/

import java.util.Scanner;

class Program111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x");
        int x1 = sc.nextInt();
        System.out.println("Enter y");
        int y1 = sc.nextInt();
        System.out.println("Enter z");
        int z1 = sc.nextInt();
        Coordinate2 c1 = new Coordinate2(x1, y1, z1);
        c1.display();

        System.out.println("Enter x");
        int x2 = sc.nextInt();
        System.out.println("Enter y");
        int y2 = sc.nextInt();
        System.out.println("Enter z");
        int z2 = sc.nextInt();
        Coordinate2 c2 = new Coordinate2(x2, y2, z2);


        System.out.println("Added to 3rd Coordinate2");
        Coordinate2 c3 = new Coordinate2(0, 0, 0);
        c3.add_coordinates(c1, c2);
        c3.display();

    }
}

class Coordinate2 {
    int x, y, z;
    Coordinate2(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void display(){
        System.out.println("x: " + x + " y: " + y + " z: " + z);
    }

    void add_coordinates(Coordinate2 c1, Coordinate2 c2){
        this.x = c1.x + c2.x;
        this.y = c1.y + c2.y;
        this.z = c1.z + c2.z;

        try {
            if ((c1.x == 0 && c1.y == 0 && c1.z == 0) || (c2.x == 0 && c2.y == 0 && c2.z == 0)) {
                throw new ZeroCoordinateException();
            }
        }
        catch (ZeroCoordinateException e){
            System.out.println(e);
        }

    }

}

class ZeroCoordinateException extends RuntimeException{
    ZeroCoordinateException(){
        super("All c0ordinates are zero");
    }
}