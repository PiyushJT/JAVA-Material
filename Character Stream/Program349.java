/*

Write a JAVA program to read student.txt file and display the content.

All external files are in DATA folder.

*/

import java.io.*;

public class Program349 {

    public static void main(String[] args) throws Exception {

        File student = new File("Data/student.txt");

        FileInputStream fis = new FileInputStream(student);

        int data = fis.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }

    }

}