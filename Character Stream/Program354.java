/*

Create a class called Student. Write a student manager
program to manipulate the student information from
files by using the BufferedReader and BufferedWriter.

*/

import java.io.*;

public class Program354 {

    public static void main(String[] args) throws Exception {

        File file = new File("Data/student.txt");
        File fileEdited = new File("Data/studentEdited.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileEdited));

        String line = br.readLine();
        while (line != null) {

            Student8 student = Student8.getObject(line);

            // manipulate student object
            student.name = "not me";
            student.roll++;


            // writing to another file
            bw.write(student.toString());
            bw.newLine();

            line = br.readLine();
        }

        br.close();
        bw.close();

    }

}

class Student8 {

    int roll;
    String name;

    public Student8(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return roll + " " + name;
    }

    public static Student8 getObject(String data) {

        String[] arr = data.split(" ");

        int roll = Integer.parseInt(arr[0]);

        return new Student8(roll, arr[1]);

    }


}