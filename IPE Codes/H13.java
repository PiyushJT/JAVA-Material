/*

WAP to print following pattern using loop statement for n row.

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

*/


import java.util.*;

class H13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();


        int spaces = -1;
        for(int i = 1; i <= n; i++) {

            for(int j = n-i; j > 0; j--){
                System.out.print(" ");
            }

            System.out.print("*");

            for(int space = 1; space <= spaces; space++){
                System.out.print(" ");
            }

            if(spaces != -1)
                System.out.print("*");

            System.out.println();
            spaces += 2;
        }


        spaces -= 3;

        for(int i = n-1; i > 0; i--){

            spaces -= 2;

            for(int j = n-i; j > 0; j--){
                System.out.print(" ");
            }

            System.out.print("*");

            for(int space = spaces; space >= 0; space--){
                System.out.print(" ");
            }

            if(spaces != -2)
                System.out.print("*");

            System.out.println();

        }

    }
}