/*

642: Write a Java program to Swap two values, which
     is given from user by using call by reference.

643: Write a program using call by reference concept
     to read an array of integers and print its elements
     in reverse order

*/

class Program642_643 {

    public static void main(String[] args) {

        Demo5 d = new Demo5();

        int[] arr = {3,4};

        d.swap(arr);

        System.out.println("a is " + arr[0]);
        System.out.println("b is " + arr[1]);

        d.printInReverse(arr);

    }
}

class Demo5{

    void swap(int[] arr){

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println("a is " + arr[0]);
        System.out.println("b is " + arr[1]);

    }


    void printInReverse(int[] arr){

        System.out.println();
        System.out.println("Printing in Reverse");

        for(int i = arr.length-1; i >= 0; i--){

            System.out.println(arr[i]);

        }

    }

}