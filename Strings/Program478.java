/*

WAP to check given string is palindrome or not without using reverse method.

*/

import java.util.*;

class Program478{
	public static void main(String[] args){

		
		Scanner sc = new Scanner(System.in);

		// Getting a string from user
		System.out.println("Enter String: ");
		String str = sc.nextLine();

		System.out.println();
		
		
		// Defining a reverse string
		String rev = "";
		

		// Traversing in reverse order to make it reverse
		for(int i = str.length() -1; i >= 0; i--){
			
			rev = rev + str.charAt(i);
			
		}


		// Comparing with original string
		if(rev.compareTo(str) == 0)
			System.out.println("yes");
		else
			System.out.println("no");
		

	}

}