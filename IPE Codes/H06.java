/*

Write a program that prompts the user to enter the
number of students, the students’ names, and their
scores, and prints student names in decreasing order
of their scores. Use Class, object & method.

*/


import java.util.*;

class H06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Students");
        int n = sc.nextInt();

        Stud[] s = new Stud[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter Name");
            String name = sc.next();
            System.out.println("Enter Score");
            int score = sc.nextInt();
            s[i] = new Stud(name, score);
        }


        printInOrder(s);


    }


    static void printInOrder(Stud[] s){

        for(int i = 0; i < s.length; i++){

            for(int j = i+1; j < s.length; j++){

                if(s[i].score < s[j].score){
                    Stud temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }

            }

        }

        for(Stud val : s){

            val.print();

        }

    }

}

class Stud{

    String name;
    int score;

    Stud(String name, int score){
        this.name = name;
        this.score = score;
    }

    void print(){
        System.out.println();
        System.out.println(name);
        System.out.println(score);
    }

}