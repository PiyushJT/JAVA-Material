/*

Write a Java program which executes values in two
different static blocks and overwrite in output.

*/

class Program735 {


    static int a;

    static {
        a = 20;
    }

    static {
        a = 10;
    }

    public static void main(String[] args) {

        System.out.println(Program575.a);

    }

}