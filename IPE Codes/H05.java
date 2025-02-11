/*

WAP to find GCD of the 2 numbers using recursion

*/


import java.util.*;

class H05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int n1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int n2 = sc.nextInt();

        System.out.println(GCD(n1, n2));

    }
    static int GCD(int a, int b) {

        if (b == 0)
            return a;
        else
            return GCD(b, a % b);

    }

}