/*

The abstract Vegetable class has three subclasses named
Potato, Brinjal and Tomato. Write an application that
demonstrates how to establish this class hierarchy.
Declare one instance variable of type String that indicates
the color of a vegetable. Create and display instances of
these objects. Override the toString() method of Object to
return a string with the name of the vegetable and its color.

*/

class Program018 {
    public static void main(String[] args) {

        Potato2 p = new Potato2();
        Brinjal2 b = new Brinjal2();
        Tomato2 t = new Tomato2();

        System.out.println(p.toString());
        System.out.println(b.toString());
        System.out.println(t.toString());


    }
}


abstract class Vegetable2 {
    String color;

    Vegetable2(String color) {
        this.color = color;
    }

    public abstract String toString(); // public is needed for overriding
}


class Potato2 extends Vegetable2 {
    Potato2() {
        super("pale yellow");
    }

    public String toString() {
        return "Potato (Color: " + color + ")";
    }
}


class Brinjal2 extends Vegetable2 {
    Brinjal2() {
        super("blue");
    }

    public String toString() {
        return "Brinjal (Color: " + color + ")";
    }
}


class Tomato2 extends Vegetable2 {
    Tomato2() {
        super("red");
    }

    public String toString() {
        return "Tomato (Color: " + color + ")";
    }
}