/*

WAP to print following pattern using loop statement for n row.
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

*/


import java.util.*;

class H10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            // forward
            for(int j = 1; j <= i; j++){

                System.out.print(j + " ");

            }

            // reverse
            for(int j = i - 1; j > 0; j--){

                System.out.print(j + " ");

            }

            System.out.println();

        }
    }
}