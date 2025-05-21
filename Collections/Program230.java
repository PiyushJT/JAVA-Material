/*

Merge two sorted ArrayLists
Write a Java program to merge two sorted ArrayLists into
a single sorted ArrayList.
You need to implement a function that takes two sorted
ArrayLists as input and returns a single
sorted ArrayList containing all the elements.

*/

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Comparator;

public class Program230 {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>(asList(1, 3, 5, 7, 9));
        ArrayList<Integer> a2 = new ArrayList<>(asList(2, 4, 5, 67, 69));

        ArrayList<Integer> merged = mergeArrayLists(a1, a2);

        System.out.println(merged);

    }


    public static ArrayList<Integer> mergeArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2){

        ArrayList<Integer> merged = new ArrayList<>();

        merged.addAll(list1);
        merged.addAll(list2);

        merged.sort(Comparator.naturalOrder());

        return merged;

    }

}