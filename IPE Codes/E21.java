/*

Write a program that prompts the user to enter two points (x1, y1) and (x2, y2)
and displays their distance between them.
The formula for computing the distance is √(x2 - x1)2 + (y2 - y1)2

*/


import java.util.*;

class E21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1");
        int x1 = sc.nextInt();

        System.out.println("Enter x2");
        int x2 = sc.nextInt();

        System.out.println("Enter y1");
        int y1 = sc.nextInt();

        System.out.println("Enter y2");
        int y2 = sc.nextInt();


        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2)
                        +
                Math.pow(y2 - y1, 2)
        );

        System.out.println(distance);

    }
}