/*

Write an application that searches through its
command-line argument. If first command line argument
is found zero then display error message.

*/

class Program096 {
    public static void main(String[] args){

        int a = Integer.parseInt(args[0]);

        try {
            if (a == 0)
                throw new ZeroException();
            else
                System.out.println(a);
        }
        catch (ZeroException e) {
            System.out.println(a);
        }
    }
}

class ZeroException extends Exception{

}