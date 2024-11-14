/*

L J L J L
 L J L J
  L J L
   L J
    L

*/


class Pattern298 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i > 0; i--){

            char ch = 'L';

            System.out.println();

            // for spaces
            for(int k = 0; k < (n-i); k++){
                System.out.print(" ");
            }

            // for pattern
            for(int j = i; j > 0; j--){

                System.out.print(ch + " ");

                ch = (ch == 'L')?'J':'L';

            }

        }

    }
}