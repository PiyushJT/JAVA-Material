import java.util.*;

class ReverseNumber{
	public static void main(String[] args){

		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();

		System.out.println();

		
		int sum = 0;

		// Algorithm for creating the reverse of a number
		for(int r = 0; n > 0; ){

			r = n%10;        // stores remainder ( last digit )

			sum = sum*10 +r; // make the sum bigger { 2-> 20,  23-> 230 } so that new number can be added

			n /= 10;         // removes last digit

		}
		
		
		System.out.println(sum);
		
	}
}