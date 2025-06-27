public class LLTest {

    public static void main(String[] args) {

        DoublyLinkedList l = new DoublyLinkedList();


        l.insertLast(10);
        l.insertLast(20);
        l.insertLast(30);
        l.insertLast(40);
        l.insertLast(50);

        l.getMax();

        l.insertSorted(15);
        l.insertSorted(0);
        l.insertSorted(60);
        l.insertSorted(35);

        l.display();
        l.getMax();


        l.printReverse();

        l.printOdd();

    }

}