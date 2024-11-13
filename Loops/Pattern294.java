/*

12345
2345
345
45
5

*/


import java.util.*;

class Pattern294 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            System.out.println();

            for(int j = i; j<=n; j++){

                System.out.print(j);

            }

        }

    }
}