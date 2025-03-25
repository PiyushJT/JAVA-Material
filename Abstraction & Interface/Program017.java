/*

Describe abstract class called Shape which has three sub
classes say Triangle, Rectangle, Circle. Define one method
area() in the abstract class and override this area() in
these three subclasses to calculate for specific object
i.e. area() of Triangle subclass should calculate area of
triangle etc. Same for Rectangle and Circle.

*/

class Program017 {
    public static void main(String[] args) {


    }
}

abstract class Shape2{

    abstract float area();

}


class Triangle6 extends Shape2{

    float base, height;

    float area(){
        return 0.5f * base * height;
    }

}

class Rectangle6 extends Shape2{

    float length, breadth;

    float area(){
        return length * breadth;
    }

}

class Circle6 extends Shape2{

    float radius;

    float area(){
        return 3.14f * radius * radius;
    }

}