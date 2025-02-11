/*

WAP to print following pattern using loop statement for n row.

1
2 3
4 5 6
7 8 9 10

*/


import java.util.*;

class E13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int no = 1;


        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

                System.out.print(no + " ");

                no++;

            }


            System.out.println();

        }


    }

}