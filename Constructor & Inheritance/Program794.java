/*

Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary

It also has a method named 'printSalary' which prints the salary of
the members.
Two classes 'Employee' and 'Manager' inherits the 'Member'
class.
The 'Employee' and 'Manager' classes have data members 'specialization'
and 'department' respectively.
Now, assign name, age, phone number, address and salary
to an employee and a manager by making an object of both
of these classes and print the same.

*/

class Program794 {

    public static void main(String[] args) {

        Employee2 e = new Employee2();
        e.name = "you";
        e.age = 25;
        e.phoneNo = 8989898989L;
        e.address = "city";
        e.salary = 89000;

        System.out.println(e.name);
        System.out.println(e.age);
        System.out.println(e.phoneNo);
        System.out.println(e.address);
        e.printSalary();
        System.out.println();

        Manager m = new Manager();
        m.name = "also you";
        m.age = 55;
        m.phoneNo = 8798324278L;
        m.address = "city";
        m.salary = 157000;

        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.phoneNo);
        System.out.println(m.address);
        m.printSalary();


    }

}

class Members{

    String name;
    int age;
    long phoneNo;
    String address;
    int salary;


    void printSalary(){

        System.out.println(salary);

    }

}

class Employee2 extends Members{

    String specialization;

}

class Manager extends Members{

    String department;

}