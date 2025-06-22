/*

Write a program to create directories (/home/abc/bcd/def/ghi/jkl)
in the home directory  /home/abc and list the files and
directories showing file/directory,file size.
Read-writeexecute permissions.

All external files are in DATA folder.

*/

import java.io.*;

public class Sem2Program326 {

    public static void main(String[] args) {

        String path = "home/abc/bcd/def/ghi/jkl";

        File dir = new File(path);

        // mkdirS -> with s for multiple
        dir.mkdirs();

        File newDir = new File("home/abc");

        for (String fileName : newDir.list()) {

            System.out.println();
            System.out.println();

            File file = new File("home/abc", fileName);

            if (file.isFile())
                System.out.println("It is a file");
            else
                System.out.println("It is a directory");


            System.out.println(file.getName() + " -> " + file.length());

            System.out.println("Permissions");
            System.out.println("Read " + file.canRead());
            System.out.println("Write " + file.canWrite());
            System.out.println("Execute " + file.canExecute());


        }


    }

}