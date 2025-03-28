/*

Write an application that searches through its command-line argument.
If sum of first and second
command line argument is found 10
then display error message.

*/

class Program097 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        try {
            if (a + b == 10)
                throw new SumException();
            else
                System.out.println(a + b);
        }
        catch (SumException e) {
            System.out.println(e);
        }
    }
}

class SumException extends RuntimeException {

}