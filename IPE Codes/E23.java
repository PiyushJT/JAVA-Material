/*

WAP to count the number of words in user given string sentence.

*/


import java.util.*;

class E23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sc.nextLine().trim();

        int count = 1;

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == ' ')
                count++;


        }

        System.out.println(count);

    }
}