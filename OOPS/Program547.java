/*

Write a Java program to find nPr by using class NPR
and main method. (take n=10, r= 3)

*/

import java.util.*;

class Program547 {

    public static void main(String[] args) {

        // Object
        Program547 p = new Program547();


        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();

        System.out.println("Enter value of r: ");
        int r = sc.nextInt();



        System.out.println();
        System.out.println(p.main(n, r));

    }

    int main(int n, int r){

        return fact(n) / (fact(r) * fact(n-r));

    }

    int fact(int n){

        if(n == 1){
            return 1;
        }
        else {
            return n * fact(n-1);
        }

    }

}
