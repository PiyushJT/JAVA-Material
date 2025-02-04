/*

LJ Institute of Engineering and Technology have following hierarchy
in their academics. Under the class HOD we have Multiple Faculties and
Each Faculty Have Multiple Students for mentoring. Show the usage of
hierarchical inheritance in the following way. Class HOD1 is inherited
by Class Facultyl and Faculty2.
Class Facultyl is Further Extended By Studentl and Faculty2 is extended By Student2.
Create necessary methods like displayHODl(), displayFacl(), displayFac2(),
displayStdlQ, displayStd2().
Show usage of hierarchical inheritance by creating object of last child
classes Studentl and Student2 by calling parent class methods with objects of them.

*/

class Program793 {

    public static void main(String[] args) {

        Student1 s1 = new Student1();
        s1.displayHODl();
        s1.displayFacl();
        s1.displayStd1();

        Student2 s2 = new Student2();
        s2.displayHODl();
        s2.displayFac2();
        s2.displayStd2();


    }

}

class HOD1{


    void displayHODl(){

        System.out.println("displaying hod1");

    }

}


class Faculty1 extends HOD1{

    void displayFacl(){

        System.out.println("displaying faculty1");

    }

}

class Faculty2 extends HOD1{

    void displayFac2(){

        System.out.println("displaying faculty2");

    }

}

class Student1 extends Faculty1{

    void displayStd1(){

        System.out.println("displaying student1");

    }

}

class Student2 extends Faculty2{

    void displayStd2(){

        System.out.println("displaying student2");

    }

}