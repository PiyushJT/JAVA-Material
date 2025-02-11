/*

WAP to print following pattern using loop statement for n row.

1 2 3 4 5 6 7 8 9
  2 3 4 5 6 7 8
    3 4 5 6 7
      4 5 6
        5
      4 5 6
    3 4 5 6 7
  2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9


*/


import java.util.*;

class H14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();


        // Decreasing width
        for(int i = 1; i <= n; i++){


            // Spaces
            for(int j = 1; j < i; j++){
                System.out.print("  ");
            }


            // Actual pattern
            for(int j = i; j <= (n*2) -i; j++){

                System.out.print(j + " ");

            }

            System.out.println();

        }



        // Increasing width
        for(int i = n-1; i > 0; i--){


            // Spaces
            for(int j = i-1; j > 0; j--){

                System.out.print("  ");

            }


            // Actual Pattern
            for(int j = i; j <= (n*2) -i; j++){

                    System.out.print(j + " ");

            }

            System.out.println();

        }

    }
}