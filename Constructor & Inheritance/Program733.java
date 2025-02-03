/*

Write program to print roll no, name, college name
of three students using static method.

*/

import java.util.Scanner;

class Program733 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){

            System.out.println("enter roll");
            int roll = sc.nextInt();

            System.out.println("enter name");
            String name = sc.next();

            System.out.println("enter college");
            String college = sc.next();

            printInfo(roll, name, college);

        }


    }
    static void printInfo(int roll, String name, String college){

        System.out.println(roll);
        System.out.println(name);
        System.out.println(college);

    }

}