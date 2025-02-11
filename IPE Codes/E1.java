/*

WAP to print grade of a student using following rules:
Percentage >70 means Grade A
Percentage 60-70 means Grade B
Percentage 50-60 means Grade C
Percentage <50 means Grade F

*/


import java.util.*;

class E1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter percentage");
        float per = sc.nextFloat();
        System.out.println(per);
        char grade;

        if(per <= 100.0f && per >= 0.0f) {

            if (per > 70.0f) {
                grade = 'A';
            } else if (per >= 60.0f) {
                grade = 'B';
            } else if (per >= 50.0f) {
                grade = 'C';
            } else {
                grade = 'F';
            }

            System.out.println("Your Grade is " + grade);

        }
        else {

            System.out.println("Marks not valid!");

        }

    }

}