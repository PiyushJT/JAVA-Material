/*

Write an application that illustrates method overriding.
Class Aclass is extended by Bclass.each of these classes
defines a display)) method that outputs the string "1 am
in Aclass" or "1 am in Bclass", respectively

*/

class Program811 {

    public static void main(String[] args) {

        AClass a = new AClass();
        a.display();

        BClass b = new BClass();
        b.display();

    }

}

class AClass{

    void display(){
        System.out.println("1");
    }

}

class BClass extends AClass{

    void display(){
        System.out.println("2");
    }

}