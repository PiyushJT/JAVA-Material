public class LLTest {

    public static void main(String[] args) {

        SinglyLinkedList l = new SinglyLinkedList();


        l.insertEnd(10);
        l.insertEnd(40);
        l.insertEnd(30);
        l.insertEnd(50);
        l.insertEnd(20);


        l.insertAfter(20, 25);
        l.insertAfter(30, 35);
        l.insertAfter(0, 45);

        l.display();

        l.swap(7);

        l.display();

        l.sort();

        l.display();

        SinglyLinkedList l2 = l.copy();

        l2.display();
        l2.deleteVal(25);

        l.display();
        l2.display();



    }

}