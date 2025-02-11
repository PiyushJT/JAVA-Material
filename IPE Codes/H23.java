/*

WAP to remove given character from the string.

*/


import java.util.*;

class H23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sc.nextLine();

        System.out.println("Enter character to remove");
        char ch = sc.next().charAt(0);

        String newStr = "";

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) != ch)
                newStr += str.charAt(i);

        }

        System.out.println(newStr);

    }

}