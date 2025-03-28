/*

Write an application that searches through its command-line argument.
If any of command line argument is found nagative then display error message

*/

class Program098 {
    public static void main(String[] args) {

        int[] arr = new int[args.length];

        for (int i = 0; i < args.length; i++)
            arr[i] = Integer.parseInt(args[0]);


        try {
            for(int val : arr){
                if(val < 0)
                    throw new NegException();
                else
                    System.out.println(val);
            }
        }
        catch (NegException e) {
            System.out.println(e);
        }
    }
}

class NegException extends Exception {

}