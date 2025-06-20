/*

Write a Java program that takes a list of integers as
input from the user and stores them in a PriorityQueue.
The program should then remove and display the top
three highest integers from the PriorityQueue.

*/

import java.util.*;

public class Program279 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Not enough elements!");
            return;
        }

        System.out.println("Enter the elements: ");

        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        System.out.println("Top three highest integers: ");

        for (int i = 0; i < 3; i++) {
            System.out.println(pq.poll());
        }

    }

}