/*

Write a Java Program to display the Joining date
of employee using Nested class concept

*/

class Program755 {

    public static void main(String[] args) {

        empleyee e = new empleyee();

        empleyee.childEmpl c = e.new childEmpl();

    }

}


class empleyee{

    String joiningDate = "hi";

    class childEmpl{

        String post;

        childEmpl(){

            System.out.println(joiningDate);

        }

    }

}