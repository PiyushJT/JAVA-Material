/*

Write a program to store n numbers in an array.
Then find out Sum, Maximum and Average of these
n numbers.

*/

import java.util.*;

class Program365{
	public static void main(String[] args){


		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array: ");
		int len = sc.nextInt();

		System.out.println();

		// Take input for array
		int[] a = new int[len];
		for(int i = 0; i<len; i++){

			System.out.println("Enter value: ");
			a[i] = sc.nextInt();
			
		}

		System.out.println();

		// Sum
		int sum = 0;

		for(int i = 0; i < len; i++){
			sum += a[i];
		}

		System.out.println("sum is " + sum);
		System.out.println("Average is " + sum/len);


		int max = a[0];

		for(int i = 0; i < len; i++){
			if(max <= a[i])
				max = a[i];
		}

		System.out.println("Maximum is " + max);
		
	}

}