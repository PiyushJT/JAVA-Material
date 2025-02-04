/*

Write a java program to find the sum of two digit natural numbers
which are divisible by 10. For this code use the concept of nested
class. In non static Inner class take non static method which find
the required sum and it must return the required sum.
Call this method in class Main to display the required sum.

*/

class Program764 {

    public static void main(String[] args) {

        Parent7.Child8.sum();

    }

}

class Parent7{

    static class Child8{

        static void sum(){

            int sum = 0;

            for(int i = 10; i < 100; i++){

                if(i % 10 == 0)
                    sum += i;

            }

            System.out.println(sum);

        }

    }

}