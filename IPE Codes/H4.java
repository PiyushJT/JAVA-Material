/*

WAP to calculate nCr using recursion.  nCr = n! / (r! * (n-r)!)

*/


import java.util.*;

class H4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int n = sc.nextInt();

        System.out.println("Enter r");
        int r = sc.nextInt();

        System.out.println(nCr(n, r));

    }

    static int nCr(int n, int r){

        return fact(n) / (fact(r) * fact(n-r));

    }

    static int fact(int n){

        if(n <= 0)
            return 1;
        else
            return n * fact(n-1);

    }
}