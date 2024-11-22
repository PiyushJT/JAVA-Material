/*

WAP to accept a string and count the number of vowels present in a string.

*/

import java.util.*;

class Program479 {

    public static void main(String[] args) {

        // Getting String from
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sc.nextLine();

        // Generalising to string to lower case
        str = str.toLowerCase();

        System.out.println(str);


        // vowel count
        int count = 0;


        // increment vowel count if it is a vowel
        for(int i = 0; i <= str.length()-1; i++){

            if((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')){
                count++;
            }


        }

        System.out.println(count);

    }

}
