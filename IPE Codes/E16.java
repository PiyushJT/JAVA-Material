/*

WAP to accept a string and count the number of vowels present in a string.

*/


import java.util.*;

class E16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        int count = 0;


        for(int i = 0; i <= str.length()-1; i++){

            if(
                    (str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')
            )
                count++;

        }

        System.out.println(count);

    }
}