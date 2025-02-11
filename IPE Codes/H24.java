/*

Write a Java program to count all digits of an integer number using method of different class

*/


import java.util.*;

class H24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        Other o = new Other();

        int digits = o.countDigits(num);

        System.out.println("There are " + digits + " digits in this number.");

    }

}

class Other{

    int countDigits(int n){
        int count = 0;

        while(n > 0){

            n /= 10;
            count++;

        }

        return count;
    }

}