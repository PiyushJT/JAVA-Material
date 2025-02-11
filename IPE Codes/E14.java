/*

WAP to print following pattern using loop statement for n row.
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/


import java.util.*;

class E14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();


        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

                System.out.print(i + " ");

            }

            System.out.println();

        }

    }
}