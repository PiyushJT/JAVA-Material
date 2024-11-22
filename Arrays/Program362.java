/*

Write a JAVA Program to accept array of N integers
and find Largest odd number as well as largest even
number and display them


Logic ->
1 Take array input
2 Calculate number of odd and even elements
3 Create two new arrays for even and odd
4 Add elements in even and odd arrays
5 Find Max and Min from both arrays

*/

import java.util.*;

class Program362{
	public static void main(String[] args){

		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array: ");
		int len = sc.nextInt();

		System.out.println();

		// Initialise the array
		int[] a = new int[len];
		

		// 1 Take array input
		for(int i = 0; i<len; i++){
			
			System.out.println("Enter value: ");
			a[i] = sc.nextInt();
			
		}
		

		// 2 Calculate number of odd and even elements
		int oddLen = 0, evenLen = 0;

		for(int i = 0; i < len; i++){
			
			if(a[i] % 2 == 0)
				evenLen++;
			else
				oddLen++;
			
		}


		// 3 Create two new arrays for even and odd
		int[] even = new int[evenLen];
		int[] odd = new int[oddLen];



		// 4 Add elements in even and odd arrays
		int evenActualLen = 0, oddActualLen = 0;

		for(int i = 0; i < len; i++){
			
			if(a[i] % 2 == 0){
				
				even[evenActualLen] = a[i];
				evenActualLen++;
				
			}			
			else{
				
				odd[oddActualLen] = a[i];
				oddActualLen++;
				
			}
			
		}


		// 5 Find Max and Min from both arrays

		System.out.println();

		// Even
		int evenMax, evenMin, oddMax, oddMin;
		
		evenMax = even[0];
		evenMin = even[0];


		for(int i = 0; i < even.length; i++){

			if(evenMax <= even[i])
				evenMax = even[i];


			if(evenMin >= even[i])
				evenMin = even[i];

		}
		
		System.out.println("Even min " + evenMin);
		System.out.println("Even max " + evenMax);


		System.out.println();

		// Odd
		oddMax = odd[0];
		oddMin = odd[0];
		
		
		for(int i = 0; i < odd.length; i++){
			
			if(oddMax <= odd[i])
				oddMax = odd[i];
			
			
			if(oddMin >= odd[i])
				oddMin = odd[i];
			
		}
		
		System.out.println("Odd min " + oddMin);
		System.out.println("Odd max " + oddMax);
		
	}

}