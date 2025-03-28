/*

Write an application that searches through its
command-line argument.
If an argument is found that does not begin
with an upper case letter,
display error message and terminate.

*/

class Program104 {
    public static void main(String[] args) {

        // args = new String[]{"abc", "def"};

        for(String val : args){
            if(val.charAt(0) < 'A' || val.charAt(0) > 'Z')
                throw new UpperCaseException();
            else
                System.out.println(val);
        }

    }

}

class UpperCaseException extends RuntimeException {
    UpperCaseException(){
        super("Value should start with upper case");
    }
}