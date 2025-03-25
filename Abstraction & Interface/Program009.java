/*

Create class Fruit with method void display().
Create subclasses Apple and Banana that
overrides display().
In main method kindly show the concept of
Dynamic method dispatch by creating reference
of Fruit and object of Apple and Banana
respectively and call display()

*/

class Program009 {
    public static void main(String[] args) {

        Fruit a = new Apple();
        Fruit b = new Banana();

        a.display();
        b.display();

    }
}

class Fruit{
    void display(){}
}

class Apple extends Fruit{
    void display(){
        System.out.println("Apple");
    }
}

class Banana extends Fruit{
    void display(){
        System.out.println("Banana");
    }
}