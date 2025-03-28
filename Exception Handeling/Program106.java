/*

Write a program to create user define exception MyException.
Define a class ExceptionDemo that has a method name
compute(int a ) which throws a MyException object,
when compute( int a )’s integer parameter is
divisible by 7 and not divisible by 5.

*/

class Program106 {
    public static void main(String[] args) {

        ExceptionDemo2 ed = new ExceptionDemo2();

        ed.compute(42);

    }

}

class ExceptionDemo2 {
    void compute(int a) throws MyException2 {
        if (a % 7 == 0 && a % 5 != 0)
            throw new MyException2();
        else
            System.out.println(a);
    }
}


class MyException2 extends RuntimeException {
    MyException2(){
        super("Value should be divisible by 7 and not by 5");
    }
}