/*

Write a program in JAVA to sort N integer
Numbers in ascending order.

Logic ->
1 Compare 1st value with every other value
 .1 If 1st value is greater -> swap the numbers
 .2 Else Do nothing

2 After comparing, 1st value will be lowest of all

3 Similarly compare all other values with other
  values coming after that


Loop Traversing ->
	i = 1
		j = 2,3,4,5,...
	i = 2
		j = 3,4,5,...
	i = 3
		j = 4,5,...
	i = 4
		j = 5...

*/

import java.util.*;

class Program363{
	public static void main(String[] args){

		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array: ");
		int len = sc.nextInt();

		System.out.println();


		// Initialise Array
		int[] a = new int[len];

		// Take input for array
		for(int i = 0; i<len; i++){

			System.out.println("Enter value: ");
			a[i] = sc.nextInt();
			
		}
		
		System.out.println();
		

		// Loop Traversing
		for(int i = 0; i < len; i++){

			// check for i+1
			for(int j = i+1; j < len; j++){

				// If first number is greater -> then only swap
				if(a[i] > a[j]){

					// Code to swap numbers
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
			
		}


		// Print the sorted Array
		for(int i = 0; i < len; i++){
			
			System.out.println(a[i]);
			
		}
		
		
	}

}