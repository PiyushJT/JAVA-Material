/*

Create a class Student with Roll_No ,Name and Mobile_No
as data member. Use necessary method to initialize it
and to print. Create at least 5 student. (Use array of object).

*/

import java.util.*;

class Program624 {

    public static void main(String[] args) {


        // Array of object (Object of class Demo)
        Students[] arrayOfObject = new Students[4];


        // Initializing the objects
        for(int i = 0; i < 4; i++){
            arrayOfObject[i] = new Students();
        }

        // setting values and displaying
        for (Students student : arrayOfObject){

            student.setData();

        }



        System.out.println();

        // printing the data
        for (Students student : arrayOfObject){

            System.out.println();
            student.showData();

        }
    }
}


class Students{

    int roll_no;
    String name;
    long mobile;

    void setData(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter roll number: ");
        roll_no = sc.nextInt();

        System.out.println("Enter name: ");
        name = sc.next();

        System.out.println("Enter mobile number: ");
        mobile = sc.nextLong();

        showData();

    }

    void showData(){

        System.out.println("Roll is " + roll_no);
        System.out.println("Name is " + name);
        System.out.println("Mobile is " + mobile);

    }

}