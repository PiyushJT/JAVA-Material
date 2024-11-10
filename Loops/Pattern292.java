import java.util.*;

class Pattern292 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();


        // pattern
        for(int i = n; i > 0; i--){


            // for spaces
            for(int k = i; k < n; k++){
                System.out.print(" ");
            }

            // single line
            for(int j = i; j > 0; j--){
                System.out.print(j);
            }
            
            System.out.println();

        }

    }
}