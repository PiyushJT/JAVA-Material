/*

Write a java program to find second largest number from three numbers using nested class concept

*/


import java.util.*;

class H07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n1 = sc.nextInt();

        System.out.println("Enter the Number");
        int n2 = sc.nextInt();

        System.out.println("Enter the Number");
        int n3 = sc.nextInt();

        C1 c1 = new C1(n1, n2, n3);

        C1.C2 c2 = c1.new C2();

        c2.secondLargest();

    }

}

class C1{
    int a;
    int b;
    int c;

    C1(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    class C2{

        void secondLargest(){

            if (a > b && a > c) {
                System.out.println(Math.max(b, c));
            }
            else if(b > a && b > c){
                System.out.println(Math.max(a,c));
            }
            else {
                System.out.println(Math.max(a,b));
            }

        }

    }
}