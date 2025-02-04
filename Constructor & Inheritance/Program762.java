/*

Write a Java Program using Nested Class concept
for Counting how many positive values from given 5 values.

*/

import java.util.Scanner;

class Program762 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i = 0; i < 5; i++){

            System.out.println("Enter value");
            arr[i] = sc.nextInt();

        }

        Parent6 p = new Parent6();
        Parent6.Child6 c = p.new Child6();
        c.positive(arr);

    }

}

class Parent6 {

    class Child6 {

        void positive(int[] arr) {

            int count = 0;

            for (int val : arr) {

                if (val > 0)
                    count++;

            }
            System.out.println(count);

        }

    }
}