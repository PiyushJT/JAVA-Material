import java.util.*;

class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int a = 0, b = 1;

        if( n>1 ){

            if(n != 2){
                System.out.print(a + " ");
                System.out.print(b + " ");

                int count = 3;

                while(count <= n){
                    int c = a + b;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                    count++;
                }
            }

            else {
                System.out.print(a + " " + b + " ");
            }

        }

        else {
            System.out.print("Enter valid number");
        }

    }
}
