/*

The Vegetable class has three subclasses named Potato, Brinjal and Tomato.
Write an application that demonstrates how to establish this class hierarchy.
Declare one instance variable of type String that indicates the color of a vegetable.
Create and display instances of these objects.
Override the toStringO method of Object to return a string
with the name of the vegetable and its color.

*/

class Program810 {

    public static void main(String[] args) {


        Potato p = new Potato();
        Tomato t = new Tomato();
        Brinjal b = new Brinjal();
        System.out.println(p.toString());
        System.out.println(t.toString());
        System.out.println(b.toString());


    }

}


class Vegetable{

    String veg;
    String color;

    public String toString(){

        return veg + " " + color;

    }

}

class Potato extends Vegetable{

    Potato(){
        veg = "potato";
        color = "White";
    }

}

class Tomato extends Vegetable{

    Tomato(){
        veg = "Tomato";
        color = "Red";
    }

}

class Brinjal extends Vegetable{

    Brinjal(){
        veg = "Brinjal";
        color = "Blue";
    }

}