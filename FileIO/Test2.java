import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) throws IOException {

        File f = new File("scratch.txt");

        FileReader fl = new FileReader(f);

        char[] ch = new char[(int) f.length()];

        fl.read(ch);

        for (char c : ch)
            System.out.print(c);

    }


}