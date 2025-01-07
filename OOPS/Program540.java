/*

Create a class name Temperature in which create two
methods of given name ferenhit(), celcius() to perform
basic conversion. Call all this methods using
class named Main.

*/

import java.util.*;

class Program540 {

    public static void main(String[] args) {


        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert to celcius and 2 to convert to ferenhit: ");
        int n = sc.nextInt();

        // Object
        Temperature t = new Temperature();

        if(n == 1){

            System.out.println("Enter ferenhit value: ");
            float f = sc.nextFloat();

            System.out.println( t.celcius(f) );

        }
        else {

            System.out.println("Enter celcius value: ");
            float c = sc.nextFloat();

            System.out.println( t.ferenhit(c) );

        }


    }

}

class Temperature {

    float ferenhit(float celcius){

        return celcius * 9/5 + 32;
    }

    float celcius(float ferenhit){

        return (ferenhit - 32) * 5/9;
    }

}
