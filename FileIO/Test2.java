import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) throws IOException {

        File f = new File("/Users/piyushthummar/Library/CloudStorage/GoogleDrive-piyushthummar7@gmail.com/My Drive/College/Sem 2/student.txt");


        FileReader fl = new FileReader(f);

        char[] ch = new char[(int) f.length()];

        fl.read(ch);

        for (char c : ch)
            System.out.print(c);

    }


}