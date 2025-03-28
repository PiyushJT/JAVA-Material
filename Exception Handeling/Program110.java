/*

Write a complete program to accept N integer numbers from the command line. Raise and
handle exceptions for following cases :
- when a number is –ve
- when a number is evenly divisible by 10
- when a number is greater than 1000 and less than 2000
- when a number is greater than 7000
Skip the number if an exception is raised for it, otherwise add it to find total sum

*/

class Program110 {
    public static void main(String[] args) {

        args = new String[]{"1397","98","7898","-97","1","1","0","2","0"};

        sum(args);

    }

    static void sum(String[] args) {
        int sum = 0;
        for (String val : args) {
            int num = Integer.parseInt(val);

            try {
                if (num < 0)
                    throw new InvalidNumberException("Negative number");
                else if (num % 10 == 0)
                    throw new InvalidNumberException("Divisible by 10");
                else if (num > 1000 && num < 2000)
                    throw new InvalidNumberException("Between 1000 and 2000");
                else if (num > 7000)
                    throw new InvalidNumberException("Greater than 7000");
                else
                    sum += num;
            }

            catch (InvalidNumberException e) {
                System.out.println(e);
            }
        }
        System.out.println(sum);
    }

}


class InvalidNumberException extends RuntimeException{
    InvalidNumberException(String s){
        super(s);
    }
}