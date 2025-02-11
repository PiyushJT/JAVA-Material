/*

WAP to calculate nCr using recursion.  nCr = n! / (r! * (n-r)!)

*/


import java.util.*;

class H04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int n = sc.nextInt();

        System.out.println("Enter r");
        int r = sc.nextInt();

        System.out.println(nCr(n, r));
        System.out.println(nCrDirect(n , r));

    }

    // method 1
    static int nCr(int n, int r){

        return fact(n) / (fact(r) * fact(n-r));

    }

    static int fact(int n){

        if(n <= 0)
            return 1;
        else
            return n * fact(n-1);

    }





    // method 2
    static int nCrDirect(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }
        return nCrDirect(n - 1, r - 1) + nCrDirect(n - 1, r);
    }

}