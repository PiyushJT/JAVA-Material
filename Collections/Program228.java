/*

Write a Java program to remove duplicates from an
ArrayList as per given input and output.
Take main class 'Exam'.
Create ArrayList: [1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 6, 9, 1, 1, 10]
in main method then you need to implement another method named
'removeDuplicate' that takes an ArrayList as an argument ,
removes all duplicates and returns an ArrayList without duplicates.
At end print that Arraylist from main method. (No need to use Scannner)

Output of your code should be:-   [2, 3, 5, 7, 8, 10]

*/

import static java.util.Arrays.asList;

import java.util.ArrayList;

public class Program228 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(asList(1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 6, 9, 1, 1, 10));

        System.out.println(list);

        ArrayList<Integer> newList = removeDuplicate(list);

        System.out.println(newList);


    }

    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){

        ArrayList<Integer> newList = new ArrayList<>(list);


        for (int i = 0; i < list.size(); i++){

            ArrayList<Integer> dup =  new ArrayList<>();

            for (int j = 0; j < i; j++) {

                int iVal = list.get(i);
                int jVal = list.get(j);

                if (iVal == jVal) {
                    dup.add(iVal);
                    newList.removeAll(dup);
                }

            }

        }

        return newList;

    }


}