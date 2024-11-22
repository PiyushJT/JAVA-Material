import java.util.*;

class Table{
	public static void main(String[] args){

		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println();


		for(int i = 1; i <= 10; i++){
			
			System.out.println(n + " x " + i + " = " + n*i);
			
		}
		
	}
}