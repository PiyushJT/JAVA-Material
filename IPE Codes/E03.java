/*

WAP to enter a character and check whether it is a
vowel or consonant using switch statement.

*/


import java.util.*;

class E03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character");
        char ch = sc.next().toLowerCase().charAt(0);


        switch (ch){

                case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is a consonant");
                break;
        }

    }

}