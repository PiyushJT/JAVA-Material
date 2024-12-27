/*

Design a class named Fan to represent a fan.
The class contains:
  - Three constants named SLOW, MEDIUM and FAST
    with values 1, 2 and 3 to denote the fan speed.
  - An int data field named speed that specifies the
    speed of the fan (default SLOW).
  - A boolean data field named f_on that specifies
    whether the fan is on (default false).
  - A double data field named radius that specifies
    the radius of the fan (default 4).
  - A data field named color that specifies the color of
    the fan (default blue).

 - A no-arg method that creates a default fan.
 - A parameterized method initializes the fan objects to given values.
 - A method named display() will display description for the fan.

   If the fan is on, the display() method displays speed,
   color and radius.
   If the fan is not on, the method returns fan color
   and radius along with the message “fan is off”.

   Write a test program that creates two Fan objects.
   One with default values and the other with medium speed, radius 6,
   color brown, and turned on status true.
   Display the descriptions for two created Fan objects

*/

import java.util.*;

class Program548 {

    public static void main(String[] args) {

        Fan fan1 = createObj();
        Fan fan2 = createObj();

        fan1.setValues();
        fan1.Display();

        fan2.setValues(true, 6.0, "brown");
        fan2.Display();

    }

    // no-arg method
    static Fan createObj(){
        return new Fan();
    }

}



class Fan{

    int SLOW = 1, MEDIUM = 2, FAST = 3;
    int speed = SLOW;
    boolean f_on = false;
    double radius = 4.0;
    String color = "blue";


    void setValues(boolean on, double rad, String c){
        f_on = on;
        if(f_on){

            Scanner sc = new Scanner((System.in));

            System.out.println("Enter speed of the fan: ");
            System.out.println("1 for SLOW");
            System.out.println("2 for MEDIUM");
            System.out.println("3 for FAST: ");

            int n = sc.nextInt();
            while (n < 1 || n > 3){

                System.out.println("Invalid Input Enter speed again: ");
                n = sc.nextInt();

            }
            speed = n;
        }

        radius = rad;
        color = c;

    }

    void setValues(){}

    void Display(){

        if(f_on) {

            String speedStr;
            if(speed == 1){
                speedStr = "LOW";
            } else if (speed == 2) {
                speedStr = "MEDIUM";
            } else {
                speedStr = "HIGH";
            }

            System.out.println("Speed is " + speedStr);

            System.out.println("Color is " + color);

            System.out.println("Radius is " + radius);

        }
        else {

            System.out.println("Color is " + color);

            System.out.println("Radius is " + radius);

            System.out.println("The Fan is off");

        }
    }
}