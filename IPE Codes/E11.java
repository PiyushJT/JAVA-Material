/*

WAP to print following pattern using loop statement for n row.

*
# #
* * *
# # # #
* * * * *
# # # # # #
* * * * * * *

*/


import java.util.*;

class E11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

                if(i % 2 == 0)
                    System.out.print("# ");
                else
                    System.out.print("* ");

            }

            System.out.println();
        }


    }

}