/*

Write a program to handle ArrayIndexOutofBoundsException using try- catch-finally and throw.

*/

class Program094 {
    public static void main(String[] args) {
        int[] arr = {1, 2};

        try {

            System.out.println(arr[5]);

        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception caught: " + e.getMessage());

            // throw new ArrayIndexOutOfBoundsException("Array index is out of bounds!");

        } finally {
            System.out.println("Final code run");
        }
    }

}