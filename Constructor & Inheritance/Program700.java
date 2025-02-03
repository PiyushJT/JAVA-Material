/*

Create copy constructor which is used for copying
the values of one object to another object.

*/

import java.util.Scanner;

class Program700 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value");
        int val = sc.nextInt();

        abc a = new abc(val);

        abc b = new abc(a);

        System.out.println(a.val);
        System.out.println(b.val);


    }

}


class abc{

    int val;

    abc(abc a){

        this.val = a.val;

    }

    abc(int val){

        this.val = val;

    }

}