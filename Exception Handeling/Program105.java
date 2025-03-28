/*

Write a program to create user define exception MyException.
Define a class ExceptionDemo, that has a method named
compute(int a )  which throws a MyException object,
when compute(int a )’s integer parameter is greater than 10

*/

class Program105 {
    public static void main(String[] args) {

        ExceptionDemo ed = new ExceptionDemo();

        ed.compute(11);

    }

}

class ExceptionDemo {

    void compute(int a) throws MyException {
        if (a > 10)
            throw new MyException();
        else
            System.out.println(a);
    }

}

class MyException extends RuntimeException {
    MyException(){
        super("Value should be less than 10");
    }
}