import java.util.*;

class Program317 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int sum = n%10;

        while(n > 10){
            n /= 10;
        }
        sum += n;

        System.out.println("Sum of first and last digits is " + sum);

    }
}