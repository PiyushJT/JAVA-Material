/*

Write a program of counter by using static variable.

*/

import java.util.Scanner;

class Program732 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("Enter y to count");
            String s = sc.nextLine();

            if(s.equals("y")) {
                Demo8 demo = new Demo8();
            }
            else {
                break;
            }

        }

    }

}


class Demo8 {
    // Static variable to count the number of objects created
    static int count = 0;

    // Constructor increments the count when a new object is created
    Demo8() {
        count++;
        System.out.println(count);
    }

}
