/*

Write a java program to find even and odd number
from series of n numbers using nested class concept.

*/

class Program758 {

    public static void main(String[] args) {

        Parent2 p = new Parent2();

        Parent2.Child2 c = p.new Child2();
        c.findMaxMin();

    }

}

class Parent2{

    int[] arr = {1,2,3,4,5,6,7,8,9,10};

    class Child2{

        void findMaxMin(){

            for (int val : arr){

                if (val%2 == 0)
                    System.out.println(val + " is even");
                else
                    System.out.println(val + " is odd");

            }

        }

    }

}