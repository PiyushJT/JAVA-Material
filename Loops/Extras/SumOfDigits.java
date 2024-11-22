import java.util.*;

class SumOfDigits{
	public static void main(String[] args){

		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println();

		
		int sum = 0;

		// Adding last digit to sum and removing last digit
		for(; n > 0;){
			
			sum += n % 10;
			n /= 10;
			
		}

		
		System.out.println(sum);
		
	}
}