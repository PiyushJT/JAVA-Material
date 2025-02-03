/*

WAP that counts the number of objects created by using static variable.

*/

class Program731 {

    public static void main(String[] args) {


        // Creating objects
        Demo7 obj1 = new Demo7();
        Demo7 obj2 = new Demo7();
        Demo7 obj3 = new Demo7();

        // Printing the number of objects created
        System.out.println(Demo7.count);

    }

}


class Demo7 {
    // Static variable to count the number of objects created
    static int count = 0;

    // Constructor increments the count when a new object is created
    Demo7() {
        count++;
    }

}
