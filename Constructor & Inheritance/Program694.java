/*

Define class for Complex number with real and imaginary part.
Describe constructor overloading method by using the constructors
and instantiate its object. Also define addition
method to add Complex objects

*/

import java.util.Scanner;

class Program694 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real part: ");
        float real = sc.nextFloat();

        System.out.println("Enter imaginary part: ");
        float img = sc.nextFloat();

        Complex c1 = new Complex(real, img);


        System.out.println("Enter real part: ");
        float real2 = sc.nextFloat();

        System.out.println("Enter imaginary part: ");
        float img2 = sc.nextFloat();

        Complex c2 = new Complex(real2, img2);


        c1.add(c2);

    }

}

class Complex{

    float real;
    float img;


    Complex(float real, float img){

        this.real = real;
        this.img = img;

    }

    void add(Complex c){

        System.out.println("Real");
        System.out.println(this.real + c.real);

        System.out.println();

        System.out.println("Imaginary");
        System.out.println(this.img + c.img);

    }

}