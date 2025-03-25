/*

Write a java program to implement the
multiple inheritance concepts for
calculating area of circle and square

*/

class Program037 {
    public static void main(String[] args) {

        Shape3 s = new Shape3();
        System.out.println(s.cArea(5));
        System.out.println(s.sArea(5));

    }
}

interface Circle3{
    float cArea(float radius);
}

interface Square3{
    float sArea(float side);
}

class Shape3 implements Circle3, Square3{
    public float cArea(float radius){
        return 3.14f * radius * radius;
    }
    public float sArea(float side){
        return side * side;
    }
}