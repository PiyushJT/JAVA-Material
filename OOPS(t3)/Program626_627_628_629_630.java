/*

626: Write a Java program to sort the numbers by
     using the concept of passing arrays to methods

627: Write a Java program to display elements of one
     dimensional array using  passing arrays to methods

628: Write a Java program to find Even number and Odd
     number from given Array using the concept of passing
     arrays to methods

629: Write a java program to find min and max values
     from a given array using passing arrays to methods.

630: Write a java program to  reverse elements of
     array using logic of swapping elements. Here,
     use concept of passing array as argument to method.
     method. Use Scanner class to enter Array elements.

*/

class Program626_627_628_629_630 {

    public static void main(String[] args) {

        int[] arr = {4,5,10,23,35,352};

        Demo2 d = new Demo2();

        d.sort(arr);

        d.oddEven(arr);

        d.minMax(arr);

        d.reverse(arr);


    }
}

class Demo2 {

    void sort(int[] arr){

        for(int i = 0; i < arr.length; i++){

            for(int j = i+1; j < arr.length; j++){

                if(arr[i] > arr[j]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }


        show(arr);

    }

    void show(int[] arr){

        for(int val : arr)
            System.out.println(val);

    }

    void oddEven(int[] arr){

        System.out.println();

        for(int val : arr){

            if(val % 2 == 0){
                System.out.println("Even " + val);
            }
            else {
                System.out.println("Odd " + val);
            }

        }

        System.out.println();

    }

    void minMax(int[] arr){

        int min = arr[0], max = arr[0];

        for(int val : arr){

            if(val < min)
                min = val;

            if(val > max)
                max = val;

        }

        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);

    }

    void reverse(int[] arr){

        System.out.println();

        for(int i = 0, j = arr.length-1; i < arr.length/2; i++, j--){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        show(arr);

    }

}