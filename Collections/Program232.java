/*

Problem Statement: Employee Management System
Implement an employee management system in Java
using ArrayList and a class. The system should
have the following functionalities:

Add an employee to the system
Remove an employee from the system
Update an employee's details
Display all employees in the system

To implement this system, you can create an
Employee class with attributes such as name, age, salary, etc.
Then, you can create an ArrayList to store all the employees.
You can then implement functions to add, remove, update and display employees.

*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Program232 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee3> employees = new ArrayList<>();

        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. Update Employee");
        System.out.println("4. Display Employees");
        System.out.println("5. Exit");




        int choice;

        do {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {

                    System.out.println("Enter name: ");
                    String name = sc.next();

                    System.out.println("Enter age: ");
                    int age = sc.nextInt();

                    System.out.println("Enter salary: ");
                    float salary = sc.nextFloat();

                    employees.add(new Employee3(name, age, salary));

                    System.out.println("employee added successfully!");
                    break;

                }
                case 2: {

                    System.out.println("Enter name of employee to remove: ");
                    String name = sc.next();

                    Iterator i = employees.iterator();

                    while (i.hasNext()) {

                        Employee3 e = (Employee3) i.next();
                        if (e.getName().equals(name)) {
                            i.remove();
                            System.out.println("Employee removed!");
                            break;
                        }
                    }

                    break;

                }
                case 3: {

                    Iterator i = employees.iterator();

                    System.out.println("Enter name of Employee to update: ");
                    String name = sc.next();

                    while (i.hasNext()) {
                        Employee3 e = (Employee3) i.next();
                        if (e.getName().equals(name)) {

                            System.out.println("Enter new name: ");
                            e.name = sc.next();

                            System.out.println("Enter new age: ");
                            e.age = sc.nextInt();

                            System.out.println("Enter new salary: ");
                            e.salary = sc.nextFloat();

                            System.out.println("Employee updated!");
                            break;
                        }
                    }
                    break;

                }
                case 4: {

                    System.out.println("Employees");

                    Iterator i = employees.iterator();

                    while (i.hasNext()) {
                        System.out.println(i.next());
                    }

                    break;

                }
                case 5: {
                    System.out.println("Exiting...");
                    return;
                }
                default: {
                    System.out.println("Not a valid choice. Try again!");
                    break;
                }
            }
        }
        while (choice != 5);
    }


}



class Employee3{

    String name;
    int age;
    float salary;

    Employee3(String name, int age, float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString(){
        return "Name = " + name + ", Age = " + age + ", Salary = " + salary;
    }

    public String getName() {
        return name;
    }

}