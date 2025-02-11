/*

WAP to print following pattern using loop statement for n row.

1
0 1
1 0 1
0 1 0 1

*/


import java.util.*;

class E12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
        int no = 0;


        for(int i = 1; i <= n; i++){

            System.out.println();

            no = (i%2 == 1)?1:0;


            for(int j = 1; j <= i; j++){

                System.out.print(no + " ");

                no = (no==1)?0:1;
            }


        }


    }

}