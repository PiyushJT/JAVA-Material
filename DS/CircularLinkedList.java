public class CircularLinkedList {

    Node head;

    class Node {

        int data;
        Node next;

        Node (int data) {
            this.data = data;
        }

    }


    void insertFirst(int data) {

        Node n = new Node(data);

        if (head == null) {
            head = n;
            head.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = n;
        n.next = head;
        head = n;

    }


    void insertLast(int data) {

        Node n = new Node(data);

        if (head == null) {
            head = n;
            head.next = head;
            return;
        }


        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = n;
        n.next = head;

    }


    int deleteFirst() {

        if (head == null)
            return 0;

        int data = head.data;

        Node n = head;

        while (n.next != head)
            n = n.next;

        n.next = head.next;
        head = head.next;

        return data;

    }


    int deleteLast() {

        if (head == null)
            return 0;

        if (head.next == head) {

            int data = head.data;
            head = null;
            return data;
        }

        Node n = head;

        while (n.next.next != head) {
            n = n.next;
        }

        int data = n.next.data;
        n.next = head;

        return data;

    }


    void display() {

        if (head == null)
            return;

        Node n = head;

        System.out.println();
        while (n.next != head) {

            System.out.print(n.data + " ");

            n = n.next;
        }
        System.out.println(n.data);

    }

    void printOddPosition() {

        if (head == null)
            return;


        if (head.next == head) {
            System.out.println(head.data);
            return;
        }

        Node n = head;

        int ind = 1;

        System.out.println();
        while (n.next != head) {

            if (ind % 2 == 1)
                System.out.print(n.data + " ");

            n = n.next;
            ind++;
        }
        if (ind % 2 == 1)
            System.out.println(n.data);


    }


    void deleteOddPositioned() {

        deleteFirst();

        Node n = head;

        while (n.next != head) {
            System.out.println(n.data);
            n.next = n.next.next;
            n = n.next;

            if (n == head)
                return;
        }

    }


    static CircularLinkedList addCross(CircularLinkedList l1, CircularLinkedList l2) {

        CircularLinkedList l3 = new CircularLinkedList();


        Node n1 = l1.head;
        Node n2 = l2.head.next;

        while (n2 != l2.head) {

            l3.insertLast(n1.data + n2.data);

            n1 = n1.next;
            n2 = n2.next;
        }

        l3.insertLast(n1.data + n2.data);

        return l3;

    }


}