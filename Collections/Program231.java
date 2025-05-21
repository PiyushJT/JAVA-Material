/*

Write a Java program to copy one array list into another.
& sort the second arraylist & search an element in a array list

*/

import static java.util.Arrays.asList;
import java.util.*;

public class Program231 {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        ArrayList<Integer> b = new ArrayList<>(a);

        b.sort(Comparator.naturalOrder());

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        int num = sc.nextInt();

        Iterator i = b.iterator();

        while (i.hasNext()) {

            int n = (int) i.next();

            if (n == num) {
                System.out.println("Number found!");
                return;
            }
        }

        System.out.println("Number not found!");

    }

}