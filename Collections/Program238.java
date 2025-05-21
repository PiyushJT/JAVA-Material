/*

Write a Java program to append the specified element to the end of a
linked list & Write a Java program to iterate through all elements in a linked list.

*/

import static java.util.Arrays.asList;

import java.util.Iterator;
import java.util.LinkedList;

public class Program238 {

    public static void main(String[] args) {

        LinkedList list = new LinkedList(asList(1,2,3,4,5));

        list.add(6);


        Iterator i = list.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

    }

}