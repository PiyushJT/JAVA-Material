/*

WAP to print following pattern using loop statement for n row.
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

*/


import java.util.*;

class H12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();


        for(int i = 1; i <= n; i++) {

            int gap = n-1;

            for(int j = 1, num = i; j <= i; j++){

                System.out.print(num + " ");
                num += gap;
                gap--;

            }

            System.out.println();

        }

    }
}