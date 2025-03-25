/*

Write a abstract class named Person and its two
subclasses named student and Employee.
A person has a name, address, phone number and email address.
A student has enrollment course.
An Employee has an office, salary, and designation.
Define constructors and methods for input and display
for both classes.
Write a main program to give demonstration of all.

*/

class Program016 {
    public static void main(String[] args) {

        Student4 st = new Student4("John", "Amd", 1234567890L, "john@example.com", "240021XXXXXXXX");
        Employee4 emp = new Employee4("Lana", "Amd", 9876543210L, "lana@example.com", "Office A", 500000, "Actor");

        st.display();
        emp.display();

    }
}


abstract class Person2{

    String name;
    String add;
    Long phone;
    String email;

}

class Student4 extends Person2{

    String enrollment;

    Student4(String name, String add, Long phone, String email, String enrollment) {
        this.name = name;
        this.add = add;
        this.phone = phone;
        this.email = email;
        this.enrollment = enrollment;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + add);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Enrollment: " + enrollment);
    }

}

class Employee4 extends Person2{

    String Office;
    int salary;
    String designation;

    Employee4(String name, String add, Long phone, String email, String Office, int salary, String designation) {
        this.name = name;
        this.add = add;
        this.phone = phone;
        this.email = email;
        this.Office = Office;
        this.salary = salary;
        this.designation = designation;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + add);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Office: " + Office);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }

}