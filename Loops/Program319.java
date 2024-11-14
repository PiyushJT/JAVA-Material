/*

Assume that you want to make the sum of 1 to 100. Give the necessary code to perform the same using
(1) For loop (2) While loop (3) Do-while loop

*/


class Program319 {
    public static void main(String[] args) {

        int sum = 0;

        for(int i=1;i<=100;i++){

            sum += i;

        }

        System.out.println("The sum is " + sum);

        sum = 0;
        int i = 1;

        while (i <= 100) {

            sum += i;

            i++;

        }

        System.out.println("The sum is " + sum);


        sum = 0;
        i = 1;

        do{
            sum += i;

            i++;
        } while (i <= 100);

        System.out.println("The sum is " + sum);

    }
}
