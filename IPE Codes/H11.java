/*

WAP to print following pattern using loop statement for n row.
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567

*/


import java.util.*;

class H11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();


        // Forward
        for(int i = 1; i <= n; i++) {


            // Forward Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Forward Pattern
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }

            System.out.println();

        }


        // Reverse
        for(int i = n-1; i > 0; i--) {


            // Reverse Space
            for(int j = i; j > 0; j--){
                System.out.print(" ");
            }

            for(int j = i; j <= n; j++){
                System.out.print(j);
            }

            System.out.println();

        }
    }
}