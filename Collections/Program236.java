/*

Write a Java program to get the first and last occurrence of the specified elements in a linked list.

*/

import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.Scanner;

public class Program236 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(asList(10, 20, 30, 40, 50, 10, 20, 30, 40, 50));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter element: ");
        int ele = sc.nextInt();

        int first = list.indexOf(ele);
        int last = list.lastIndexOf(ele);

        System.out.println("First occurrence of " + ele + " is at index " + first);
        System.out.println("Last occurrence of " + ele + " is at index " + last);


    }

}