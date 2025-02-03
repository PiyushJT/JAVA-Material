/*

It is required to compute SPI (semester performance index)
of n students of a class for their registered subjects in
a semester. Assume that all students register for 6 subjects
and each subject carry 5 credits, follow method for computation
of SPI. Declare a class called student having following data members:
id_no, marks_obtained(out of 100) for 6 subjects and spi.
Define constructor, display and calculate_spi methods.
Define main to process data of n students Use SPI calculation formula
(subl*credits+sub2*credits+sub3*credits+sub4*credits+sub5*credits+sub6*credits) /(total credits*10)

*/

import java.util.Scanner;

class Program697 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for(Student st : s){

            System.out.println("Enter id:");
            int id = sc.nextInt();

            int[] marks = new int[6];

            for(int i = 0; i < 6; i++){

                System.out.println("Enter marks");
                marks[i] = sc.nextInt();

            }

            st = new Student(id, marks);

        }


    }

}

class Student{

    int id;
    int[] marks;
    float spi;

    Student(int id, int[] marks){

        this.id = id;
        this.marks = marks;

        calculateSpi();
        display();

    }

    void display(){

        System.out.println(id);
        System.out.println(spi);

    }

    void calculateSpi(){

        spi = 0;

        for (float mark : marks){

            spi += (mark*5);

        }

        spi /= 300;

    }

}