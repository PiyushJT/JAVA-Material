/*

Write a Java program to insert the specified element at the specified position in the linked list.

*/

import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.Scanner;

public class Program235 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(asList(10, 20, 30, 40, 50));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter position to insert: ");
        int position = sc.nextInt();


        if (position < 0 || position > list.size())
            System.out.println("Invalid position!");
        else
            list.add(position, element);


        System.out.println(list);


    }

}