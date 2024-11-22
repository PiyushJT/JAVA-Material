/*

Sum of factorial of n numbers
-> 1! + 2! + 3! + 4! + ... n!

*/

import java.util.*;

class FactorialSum{
	public static void main(String[] args){

		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println();


		// initialization
		int sum = 0, j = 1;
		int fact = 1;


		// For summation of fact
		for(int i = 1; i <= n; i++){
			

			// for finding fact
			for(j = 1, fact = 1; j <= i; j++){
			
				fact *= j;
			
			}

			// increment fact to sum
			sum += fact;
			
		}
		
		System.out.println(sum);
		
	}
}