/*

1
24
135
2468
13579

*/


import java.util.*;

class Pattern296 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            System.out.println();

            if(i%2 == 1) {
                for (int j = 1; j <= i * 2; j += 2) {
                    System.out.print(j);
                }
            }
            else{
                for (int j = 2; j <= i * 2; j += 2) {
                    System.out.print(j);
                }
            }

        }

    }
}