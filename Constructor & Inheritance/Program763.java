/*

Write a Java Program to display the Joining date of employee
using Nested class concept. Kindly take DOJ as nested class of class
Employee. Employee should have constructor with variable name
& DOJ has varibales date, month and year.

*/

class Program763 {

    public static void main(String[] args) {

        Employee e = new Employee("name");

        Employee.DOJ d = e.new DOJ(12,12,2024);

        d.display();
    }

}

class Employee{

    String name;

    Employee(String name){
        this.name = name;
    }

    class DOJ{

        int date;
        int month;
        int year;

        DOJ(int date, int month, int year){

            this.date = date;
            this.month = month;
            this.year = year;

        }


        void display(){

            System.out.println(date);
            System.out.println(month);
            System.out.println(year);

        }

    }

}