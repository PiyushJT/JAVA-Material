/*

Write a program that counts number of characters, words,
and lines ina text file.

*/

import java.io.*;

public class Program353_359 {

    public static void main(String[] args) throws Exception {

        File file = new File("Data/sample.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String data = "";

        String line = br.readLine();
        while (line != null) {
            data += line + "\n";
            line = br.readLine();
        }
        data = data.substring(0, data.length()-1);


        int words = 1, lines = 1, alpha = 0, digits = 0, spaces = 0;
        for (int i = 0; i < data.length(); i++) {

            if (data.charAt(i) == '\n'){
                lines++;
                if (data.charAt(i+1) != '\n')
                    words++;
            }
            if (data.charAt(i) == ' ')
                words++;

            if (data.charAt(i) >= '0' && data.charAt(i) <= '9')
                digits++;
            if (data.toLowerCase().charAt(i) >= 'a' && data.toLowerCase().charAt(i) <= 'z')
                alpha++;

            if (data.charAt(i) == ' ')
                spaces++;

        }

        System.out.println("Characters: " + data.length());
        System.out.println("Words: " + words);
        System.out.println("Spaces: " + spaces);
        System.out.println("Lines: " + lines);
        System.out.println("Alphabets: " + alpha);
        System.out.println("Digits: " + digits);

    }

}