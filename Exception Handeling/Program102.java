/*

Write a program to handle InterruptedException,
IllegalArgumentException using try-cat-finally and throw

*/

class Program102 {
    public static void main(String[] args) {


        try {
            Thread.sleep(2000); // causes interrupted exception
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Final code run");
        }


        try {
            Integer.parseInt("abc");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Final code run");
        }

    }
}