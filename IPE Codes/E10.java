/*

WAP to print following pattern using loop statement for n row.

1
1 3
1 3 5
1 3 5 7

*/


import java.util.*;

class E10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            for (
                    int j = 1;
                    j <= i * 2;
                    j++, j++
            ) {

                System.out.print(j + " ");

            }

            System.out.println();
        }


    }

}