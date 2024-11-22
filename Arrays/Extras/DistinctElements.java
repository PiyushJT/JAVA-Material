/*

I/P 1,2,3,4,4,3,2,3,1,45

O/P 1,2,3,4,45

*/


import java.util.*;

class DistinctElements{
	public static void main(String[] args){


		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array: ");
		int len = sc.nextInt();

		System.out.println();

		// Take Elements
		int[] a = new int[len];

		for(int i = 0; i<len; i++){
			
			System.out.println("Enter value: ");
			a[i] = sc.nextInt();
			
		}
		
		System.out.println();

		
		for(int i = 0; i < len; i++){
			
			boolean isRepeated = false;
			
			for(int j = 0; j < i; j++){
				
				if(a[i] == a[j])
					isRepeated = true;
				
			}
			if(!isRepeated){ // ! -> not

				System.out.println(a[i]);

			}
			
			
		}
		
		
	}

}