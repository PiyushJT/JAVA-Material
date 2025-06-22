/*

Read employee salary and calculate the
income tax based on 10% of income and store it in
tax.txt file for five different employees.

All external files are in DATA folder.

*/

import java.io.*;

public class Sem2Program321 {

    public static void main(String[] args) throws Exception {

        File salaryFile = new File("Data/salary.txt");
        File taxFile = new File("Data/tax.txt");

        BufferedReader salaryReader = new BufferedReader(new FileReader(salaryFile));
        BufferedWriter taxWriter = new BufferedWriter(new FileWriter(taxFile));

        String line = salaryReader.readLine();

        while (line != null) {

            int salary = Integer.parseInt(line);
            int tax = (int) (salary * 0.1f);

            taxWriter.write(tax + "\n");

            line = salaryReader.readLine();

        }

        taxWriter.flush();

        salaryReader.close();
        taxWriter.close();

    }

}