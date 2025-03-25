/*

Create interface Univerity with method takeExam().
Create Interface State with method getName().
Create interface StateUniversity that extends University and State.
Create print() inside StateUniversity.
Create class TestState that implements StateUniversity interface.
and Create a class with main method that calls all methods of TestState class

*/

class Program039 {
    public static void main(String[] args) {

        TestState ts = new TestState();
        ts.print();
        ts.getName();
        ts.takeExam();

    }
}

interface University{
    void takeExam();
}

interface State{
    void getName();
}

interface StateUniversity extends University, State{
    void print();
}

class TestState implements StateUniversity{

    public void print() {
        System.out.println("printed");
    }

    public void getName() {
        System.out.println("got name");
    }

    public void takeExam() {
        System.out.println("took exam");
    }
}