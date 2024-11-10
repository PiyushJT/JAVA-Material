import java.util.*;

class Program323 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int n1 = n;
        int n2 = n;

        int digits = 0, r = 0, sum = 0;

        while(n1 > 0){

            n1 /= 10;
            digits++;

        }

        while(n2 > 0){

            r = n2 % 10;

            sum += (int) Math.pow(r,digits);
            digits--;

            n2 /= 10;

        }

        if (n == sum){
            System.out.println("It is a Disarium Number");
        }
        else{
            System.out.println("It is not a Disarium Number");
        }

    }
}