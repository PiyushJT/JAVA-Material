/*

WAP to print following pattern using only recursion
for n row.(Do not use loop at all)

*
* *
* * *
* * * *

*/

import java.util.*;

class Program577 {
    static int n;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value: ");
        n = sc.nextInt();

        pattr(1);

    }

    static void pattr(int i){
        int j = 1;

        System.out.println();

        if(i <= n)
            pattc(i, j);

    }

    static void pattc(int i, int j){

        if(j>i){
            pattr(i+1);
        }
        else {
            System.out.print("* ");
            pattc(i, j+1);
        }

    }

}