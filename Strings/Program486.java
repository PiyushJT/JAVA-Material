/*

WAP to remove given character from the string.

---> we can use replaceAll(str, "")

*/

import java.util.*;

class Program486 {

    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        String newStr = "";

        for(int i = 0; i<= str.length()-1; i++){


            // If the char from the string is not the char which is to be removed
            if(str.charAt(i) != ch){

                // Add the char at the end of new string
                newStr = newStr + str.charAt(i);

            }
        }

        str = newStr;



    /* -----> Without using length() method


        // Adding null at the end. -> to know that string is finished.
        str = str + '\0';


        // i = index
        int i = 0;

        // run while the string is not finished
        while(str.charAt(i) != '\0'){


            // If the char is found
            if(str.charAt(i) == ch){

                str = str.substring(0, i) + str.substring(i+1); // Slicing before and after

                i--;
            }

            i++;
        }

        // remove null from end.
        str = str.substring(0, str.length()-1);


    */

        System.out.println(str);

    }
}