/*

Write a java program to display the details of
student(roll no, name, marks) using this keyword

*/

class Program710 {

    public static void main(String[] args) {

        Data d = new Data();

        d.roll = 12;
        d.name = "Someone";
        d.marks = 69;

        d.show(12, "someone", 69);

    }

}

class Data{

    int roll;
    String name;
    int marks;


    void show(int roll, String name, int marks){

        System.out.println(this.roll);
        System.out.println(this.name);
        System.out.println(this.marks);

    }

}