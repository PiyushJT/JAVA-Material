import java.util.*;

class PrimeNo{
	public static void main(String[] args){

		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();

		System.out.println();


		// initialisation
		int i = 1, count = 0;


		// Prime number can only be known if it is greater than 1
		if(n > 1){


			// Count the number of factors
			for(; i<=n; i++) {

				if (n % i == 0) {
					count++;
				}

			}


			// if it is greater than 2 -> it is not prime else it is prime
			if(count > 2){
			
				System.out.println("It is not prime");
			}
			else{
			
				System.out.println("It is prime");
			}
			
		}


		else{
			System.out.println("It is neither");
		}
		
	}
}