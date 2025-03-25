/*

Create an interface named Polygon. It has a default method
getSides() and an abstract method getArea().
create two classes Rectangle and Square that implement Polygon.
The Rectangle class provides the implementation of the
getArea() method and overrides the getSides() method.
the Square class only provides the implementation of the getArea() method.
while calling the getSides() method using the Rectangle
object, the overridden method is called. However, in the
case of the Square object, the default method is called.

*/

class Program045 {

    public static void main(String[] args) {
        Rectangle7 r = new Rectangle7();
        r.getSides();
        r.getArea();

        Square s = new Square();
        s.getSides();
        s.getArea();
    }
}

interface Polygon {
    default void getSides() {
        System.out.println("Polygon getSides");
    }

    void getArea();

}

class Rectangle7 implements Polygon {
    public void getArea() {
        System.out.println("Rectangle getArea");
    }

    public void getSides() {
        System.out.println("Rectangle getSides");
    }

}

class Square implements Polygon {
    public void getArea() {
        System.out.println("Square getArea");
    }

}