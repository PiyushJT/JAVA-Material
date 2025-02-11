/*

WAP to check whether the given number is Prime or not

*/


import java.util.*;

class E6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int count = 0;

        if(n > 1){

            for(int i = 2; i < n; i++) {

                if (n % i == 0) {
                    count++;
                }

            }

            if(count > 0){

                System.out.println("It is not prime");
            }
            else{

                System.out.println("It is prime");
            }

        }

        else{
            System.out.println("It is neither");
        }

    }

}