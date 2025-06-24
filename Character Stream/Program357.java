/*

Write an application that reads a file and counts
the number of occurrences of digit 5. Supply the
file name as a command-line argument

*/

import java.io.*;

public class Program357 {

    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter src file");
        String ogFile = "Data/" + br.readLine();
        ogFile = "Data/sample.txt";

        File file = new File(ogFile);

        BufferedReader bR = new BufferedReader(new FileReader(file));

        String data = "";

        String line = bR.readLine();
        while (line != null) {
            data += line + "\n";
            line = bR.readLine();
        }

        int count = 0;

        for (int i = 0; i < data.length(); i++)
            if (data.charAt(i) == '5')
                count++;

        System.out.println(count);

    }

}