/*

Write a Java program to swap two numbers using this keyword.

*/

import java.util.Scanner;

class Program714 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no.");
        int a = sc.nextInt();

        System.out.println("Enter 2nd no.");
        int b = sc.nextInt();

        Swap s = new Swap(a,b);
        s.swap();

    }

}

class Swap{
    int a;
    int b;

    Swap(int a, int b){

        this.a = a;
        this.b = b;

    }

    void swap(){

        int t = this.a;
        this.a = this.b;
        this.b = t;


        System.out.println(a);
        System.out.println(b);

    }


}