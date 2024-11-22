import java.util.*;

class Factors{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println();

		
		for(int i = 1;  i<= n; i++){
			
			if(n%i == 0){
				System.out.println(i);
			}
		}
		
		
		
	}
}