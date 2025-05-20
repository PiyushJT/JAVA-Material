/*

Write a program in which create two ArrayList.
Add odd numbers between 1 to 10 in one arraylist
and even numbers between 1 to 10 in another arraylist.
Now merge these two ArrayList and sort them in descending order.
At last print this sorted ArrayList.

*/

import java.util.ArrayList;
import java.util.Comparator;

public class Program225 {

    public static void main(String[] args) {

        ArrayList<Integer> odd = new ArrayList<>();

        ArrayList<Integer> even = new ArrayList<>();


        for (int i = 1; i <= 10; i++)
            if (i % 2 == 0)
                odd.add(i);
            else
                even.add(i);


        System.out.println(odd);
        System.out.println(even);



        // To merge
        ArrayList<Integer> merged = new ArrayList<>();

        merged.addAll(odd);
        merged.addAll(even);

        merged.sort(Comparator.naturalOrder());


        System.out.println(merged);


    }

}