/*

Write a java program that read employee details and
store into emp.txt text file using file handling.

*/

import java.io.*;

public class Program352 {

    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter emp name: ");
        String name = br.readLine();

        System.out.println("Enter emp salary: ");
        int salary = Integer.parseInt(br.readLine());

        System.out.println("Enter age: ");
        int age = Integer.parseInt(br.readLine());

        File file = new File("Data/emp.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        writer.write("Name: " + name);
        writer.newLine();
        writer.write("Salary: " + salary);
        writer.newLine();
        writer.write("Age: " + age);

        writer.flush();

        writer.close();
    }

}