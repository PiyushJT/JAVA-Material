/*

Write a java program which read source file and destination file
name and copy the content of source file to destination file
using InputeStream class.

All external files are in DATA folder.

*/

import java.io.*;
import java.util.Scanner;

public class Sem2Program319 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter source file name: ");
        String src = sc.next();

        System.out.println("Enter destination file name: ");
        String dest = sc.next();

        File sFile = new File("Data/" + src);
        File dFile = new File("Data/" + dest);

        FileInputStream fis = new FileInputStream(sFile);
        FileOutputStream fos = new FileOutputStream(dFile);


        int data = fis.read();
        while (data != -1) {
            fos.write(data);
            data = fis.read();
        }

        fos.flush();
        System.out.println("Done 👍🏻");

        fis.close();
        fos.close();

    }

}