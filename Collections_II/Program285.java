/*

Write  a java program that reads in a list of integers
from the user and stores them in a HashSet.
The program should then compute the sum of all unique
integers in the HashSet and output the result to the user.
If the user enters the same integer multiple times,
it should only be counted once in the sum.

Trick question:
Hash set does not allow duplicate elements. (Nice try d.d.y)

*/

import java.util.*;

public class Program285 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter element " + i + ": ");
            set.add(sc.nextInt());

        }

        int sum = 0;

        for (int i : set) {
            sum += i;
        }

        System.out.println("Sum of unique elements: " + sum);

    }

}