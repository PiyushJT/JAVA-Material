/*

Write a Java program to create an array of objects

*/

import java.util.*;

class Program623 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Array of object (Object of class Demo)
        Demo[] arrayOfObject = new Demo[4];


        // Initializing the objects and setting values
        for(int i = 0; i < 4; i++){

            arrayOfObject[i] = new Demo();

            arrayOfObject[i].num = i;
        }


        // printing the data
        for (Demo object : arrayOfObject){

            System.out.println(object.num);

        }
    }
}


class Demo{
    int num = 10;
}