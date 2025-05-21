/*

Write a Java program to clone an linked list to another linked list.

*/

import static java.util.Arrays.asList;
import java.util.LinkedList;

public class Program237 {

    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>(asList(1,2,3,5));
        LinkedList<Integer> list2 = new LinkedList<>(list);

        System.out.println(list2);


    }

}