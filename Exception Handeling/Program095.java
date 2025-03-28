/*

Write a program to handle NullPointerException.

*/

class Program095 {
    public static void main(String[] args) {

        String x = null;

        try{
            System.out.println(x.length());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }

    }

}