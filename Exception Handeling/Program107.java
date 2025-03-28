/*

Write a program to enter the five subject marks out of 100 of student.
If any subject marks is less than 35 then programm will generate exception

*/

import java.util.Scanner;

class Program107 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        for(int i = 0; i < marks.length; i++){

            System.out.println("Enter marks: ");

            int mark = sc.nextInt();
            if(mark < 35)
                throw new FailException();
            else
                marks[i] = mark;

        }

    }

}

class FailException extends RuntimeException{
    FailException(){
        super("Your marks are very less.  DJU! tmkc");
    }
}