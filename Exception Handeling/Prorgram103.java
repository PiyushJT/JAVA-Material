/*

Write a method for computing x ^ y  by doing repetitive multiplication.
x and y are of type integer and are to be given as
command line arguments.
Raise and handle exception(s) for invalid values of x and y.
Also define method main

*/

class Program103 {
    public static void main(String[] args) {

        // args = new String[]{"-1", "2"};

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        try {
            System.out.println(power(x, y));
        }
        catch (PowerException e) {
            System.out.println(e);
        }

    }

    static int power ( int x, int y) throws PowerException{

        if (y < 0) {
            throw new PowerException();
        }

        if (y == 0) {
            return 1;
        } else {
            return x * power(x, y - 1);
        }

    }
}

class PowerException extends RuntimeException{
    PowerException(){
        super("Power not valid");
    }
}