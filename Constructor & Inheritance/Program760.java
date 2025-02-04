/*

Write a java program to find nPr using nested class concept

*/

import java.util.Scanner;

class Program760 {

    public static void main(String[] args) {

        Parent4 p = new Parent4();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("enter r");
        int r = sc.nextInt();

        Parent4.Child4 c = p.new Child4(n, r);
        c.npr();

    }

}

class Parent4 {


    class Child4 {

        int n;
        int r;

        Child4(int n, int r) {

            this.n = n;
            this.r = r;

        }

        void npr() {

            System.out.println(
                    fact(n) / fact(n - r)
            );

        }

        int fact(int n) {

            if (n <= 1)
                return 1;
            return n * fact(n - 1);

        }

    }

}