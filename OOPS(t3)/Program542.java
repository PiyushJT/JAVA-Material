/*

Write a Java program to perform basic Calculator
operations using following methods categories:

sum() - without arguments without return,
minus() - with arguments without return,
multi() - without arguments with return
divide() - with arguments with return

*/

import java.util.*;

class Program542 {

    float a,b;

    public static void main(String[] args) {


        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to minus");
        System.out.println("Enter 3 to multiply");
        System.out.println("Enter 4 to divide: ");
        int n = sc.nextInt();


        // Object
        Program542 p = new Program542();


        System.out.println("Enter a: ");
        p.a = sc.nextFloat();

        System.out.println("Enter b: ");
        p.b = sc.nextFloat();


        // Ladder
        if(n == 1){
            p.sum();
        } else if (n == 2) {
            p.minus(p.a, p.b);
        } else if (n == 3) {
            System.out.println(p.multi());
        } else {
            System.out.println(p.divide(p.a, p.b));
        }


    }



    void sum(){
        System.out.println(a+b);
    }

    void minus(float a, float b){
        System.out.println(a-b);
    }

    float multi(){
        return a*b;
    }

    float divide(float a, float b){
        return a/b;
    }

}