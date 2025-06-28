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

        l.display();
        l.reverse();
        l.display();


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




        CircularLinkedList c = new CircularLinkedList();

        c.insertLast(20);

        c.printOddPosition();

        c.insertLast(30);
        c.insertLast(40);
        c.insertLast(50);

        c.display();

        c.printOddPosition();

        System.out.println();
        System.out.println();
        System.out.println();

        c.display();

        c.deleteOddPositioned();

        c.display();


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        CircularLinkedList l1 = new CircularLinkedList();

        l1.insertLast(2);
        l1.insertLast(4);
        l1.insertLast(6);
        l1.insertLast(7);
        l1.insertLast(9);


        CircularLinkedList l2 = new CircularLinkedList();

        l2.insertLast(5);
        l2.insertLast(3);
        l2.insertLast(12);
        l2.insertLast(11);
        l2.insertLast(45);


        CircularLinkedList.addCross(l1,l2).display();


    }

}