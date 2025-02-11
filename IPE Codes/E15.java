/*

WAP to check given string is palindrome or not

*/


import java.util.*;

class E15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter String: ");
        String str = sc.nextLine();

        System.out.println();


        String rev = "";


        for(int i = str.length() -1; i >= 0; i--){

            rev = rev + str.charAt(i);

        }

        if(rev.compareTo(str) == 0)
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");


    }
}