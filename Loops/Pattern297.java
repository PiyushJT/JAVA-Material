/*

1
2 3
6 5 4
7 8 9 10
15 14 13 12 11

*/


import java.util.*;

class Pattern297 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        // reverse numbers
        int r = 2;

        // forward numbers
        int f = 1;


        // Row
        for(int i =1; i <= n; i++) {

            // next line
            System.out.println();


            // Forward rows
            if (i % 2 == 0){

                int j = 1;

                while(j <= i) {

                    f++;
                    System.out.print(f + " ");

                    r = f + i + 2;


                    j++;
                }

            }

            // Reverse rows
            else {

                int j = 1;

                while (j <= i){

                    r--;
                    System.out.print(r + " ");

                    f = r + i -1;


                    j++;
                }

            }
        }

    }
}