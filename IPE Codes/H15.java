/*

Write a java program to find nPr using nested class concept.

*/


import java.util.*;

class H15 {

    public static void main(String[] args) {

        Parent9 p = new Parent9();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("enter r");
        int r = sc.nextInt();

        Parent9.Child9 c = p.new Child9(n, r);
        c.npr();


    }
}



class Parent9 {

    class Child9 {

        int n;
        int r;

        Child9(int n, int r) {

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