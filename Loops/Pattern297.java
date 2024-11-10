import java.util.*;

class Pattern297 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int num = 0;

        int i = 0;

        boolean isLineChanged = false;
        while (i <= n) {

            System.out.println();
            isLineChanged = true;

            if (i % 2 == 0){

                int j = 1;
                while(j <= i) {

                    num++;
                    System.out.print(num + " ");

                    j++;
                    isLineChanged = false;
                }

            }
            else {

                int j = 1;
                int k = 0;
                while (j <= i){

                    if(isLineChanged){
                        num += i+1;

                        k = num-1;
                    }

                    num--;
                    System.out.print(num + " ");

                    j++;
                    isLineChanged = false;

                    if(j > i){
                        num = k;
                    }

                }

            }

            i++;
        }

    }

}