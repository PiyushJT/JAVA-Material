/*

WAP that determines if a year is a leap year or not by using if…else.

*/


import java.util.*;

class E18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = sc.nextInt();


        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("Yes it is a leap year");
        else
            System.out.println("It is not a leap year");

    }
}