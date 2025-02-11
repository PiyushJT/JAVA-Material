/*

 Declare a class called coordinate to represent 3 dimensional Cartesian coordinates
 (x, y, and z) define following method.
- Initialize Method
- Display to print values of members
- Add_coordinates, to add three such coordinates object to produce a resultant coordinates object.
- Main , to show use of above method

*/


import java.util.*;

class H17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Coordinate c1 = new Coordinate();

        System.out.println("Enter x, y, z");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        c1.initialize(x, y, z);

        Coordinate c2 = new Coordinate();
        System.out.println("Enter x, y, z");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        c2.initialize(x, y, z);

        Coordinate c3 = new Coordinate();
        System.out.println("Enter x, y, z");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        c3.initialize(x, y, z);


        Coordinate c = c3.addCoordinates(c1, c2);

        c.display();


    }

}

class Coordinate{

    int x;
    int y;
    int z;

    void initialize(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void display(){

        System.out.println();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

    Coordinate addCoordinates(Coordinate c1, Coordinate c2){

        Coordinate c = new Coordinate();

        c.x = this.x + c1.x + c2.x;
        c.y = this.y + c1.y + c2.y;
        c.z = this.z + c1.z + c2.z;

        return c;
    }

}