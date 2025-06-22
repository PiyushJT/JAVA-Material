/*

Write a program to check that whether the name given
from command line is file or not? If it is a file
then print the size of file and if it is directory
then it should display the name of all files in it.

All external files are in DATA folder.

*/

import java.io.*;

public class Sem2Program323 {

    public static void main(String[] args) throws Exception {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Enter name: ");
        String name = "Data/" + br.readLine();

        File file = new File(name);

        if (file.isFile())
            System.out.println("Length is " + file.length());

        else
            for (File fl : file.listFiles())
                System.out.println(fl.getName());


        br.close();

    }

}