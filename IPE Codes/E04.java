/*

WAP to print multiple of N from given range of integers.
For example, if N=5 and range is [17, 45]
it prints 20, 25, 30, 35, 40, 45. Take input using Scanner class.

*/


import java.util.*;

class E04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println("Enter the lower Bound");
        int lB = sc.nextInt();

        System.out.println("Enter the upper Bound");
        int uB = sc.nextInt();

        System.out.println();

        for(; lB <= uB; lB++) {

            if(lB % n == 0) {
                System.out.println(lB);
            }

        }

    }

}