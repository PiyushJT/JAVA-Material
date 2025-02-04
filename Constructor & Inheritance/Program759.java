/*

Write a java program to find second largest number
from three numbers using nested class concept.

*/

import java.util.Scanner;

class Program759 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Parent3 p = new Parent3();

        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();

        Parent3.Child3 child = p.new Child3(a,b,c);
        child.findSecondMax();

    }

}

class Parent3{

    class Child3{

        int a;
        int b;
        int c;

        Child3(int a, int b, int c){

            this.a = a;
            this.b = b;
            this.c = c;

        }

        void findSecondMax(){

            if (a>b && a>c){
                if (b>c)
                    System.out.println(b);
                else
                    System.out.println(c);

            }
            else if (b > a && b > c) {
                if (a > c)
                    System.out.println(a);
                else
                    System.out.println(c);

            }
            else {
                if (a > b)
                    System.out.println(a);
                else
                    System.out.println(b);

            }

        }

    }

}