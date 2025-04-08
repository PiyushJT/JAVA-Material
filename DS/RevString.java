import java.util.Scanner;

public class RevString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String s = sc.nextLine();

        System.out.println(reverseString(s));
    }

    static String reverseString(String s){

        CharStack cs = new CharStack(s.length());

        for(int i = 0; i < s.length(); i++){
            cs.push(s.charAt(i));
        }

        String rev = "";

        while(!cs.isEmpty()){
            rev += cs.pop();
        }

        return rev;

    }

}