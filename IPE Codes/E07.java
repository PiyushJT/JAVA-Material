/*

WAP to find out Armstrong Numbers from a given number. (Given number should be any digit)

*/


import java.util.*;

class E07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int digits = 0, sum = 0, r;

        // to get digits
        for(int temp = n; temp > 0; digits++) {

            temp /= 10;

        }


        for(int temp = n; temp > 0; temp /= 10) {

            r = temp % 10;

            sum += (int) Math.pow(r, digits);

        }

        if(sum == n)
            System.out.println(n + " is an Armstrong Number.");
        else
            System.out.println(n + " is not an Armstrong Number.");


    }

}