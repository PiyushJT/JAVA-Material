/*

Create a class named 'Shape' with a method to print
"This is shape".
Then create two other classes named
'Rectangle', 'Circle' inheriting the Shape class, both
having a method to print "This is rectangular shape"
and "This is circular shape" respectively.
Create a subclass 'Square' of 'Rectangle' having a method to print
"Square is a rectangle".
Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.

*/

class Program795 {

    public static void main(String[] args) {

        Rect r = new Rect();

        Rect.Square sq = r.new Square();

        sq.print();
        sq.printIt();


    }

}

class Shape{

    void print(){

        System.out.println("This is shape");

    }

}

class Rect extends Shape{

    void printIt(){

        System.out.println("This is rectangular shape");

    }

    class Square extends Rect{

        void printSq(){

            System.out.println("Square is a rectangle");

        }

    }

}


class Circle extends Shape{

    void printIt(){

        System.out.println("This is Circular shape");

    }

}

