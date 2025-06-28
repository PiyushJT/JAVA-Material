public class DoublyLinkedList {

    Node head;

    class Node {

        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    void insertFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;

    }

    void insertLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node n = head;

        while (n.next != null) {
            n = n.next;
        }

        n.next = newNode;
        newNode.prev = n;

    }


    void reverse(){

        Node temp = null;
        Node current = head;

        while (current != null) {

            temp = current.prev;

            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if(temp != null )
            head = temp.prev;

    }

    int deleteFirst() {

        if (head == null)
            return 0;

        int data = head.data;

        if (head.next == null) {
            head = null;
            return data;
        }

        head = head.next;
        head.prev = null;
        return data;

    }


    int deleteLast() {

        if (head == null)
            return 0;

        if (head.next == null) {
            head = null;
            return head.data;
        }

        Node n = head;

        while (n.next.next != null)
            n = n.next;

        int data = n.next.data;

        n.next = null;
        return data;

    }

    void display() {

        Node n = head;

        System.out.println();
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();

    }


    void displaySchema() {

        Node n = head;

        while (n != null) {
            System.out.println();

            if (n.prev != null)
                System.out.print(n.prev.data + " ");
            else
                System.out.print("null ");

            System.out.print(n.data + " ");

            if (n.next != null)
                System.out.print(n.next.data + " ");
            else
                System.out.println("null ");

            n = n.next;

        }

    }

    void deleteOdd() {

        if (head == null)
            return;

        Node n = head;

        while (n != null) {

            if (n.data % 2 == 1) {

                if (n == head)
                    deleteFirst();

                else {
                    if (n.next != null)
                        n.next.prev = n.prev;

                    n.prev.next = n.next;

                }
            }

            n = n.next;
        }

    }

    void getMid() {

        if (head == null)
            return;

        Node f = head;
        Node s = head;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }

        System.out.println(s.data);

    }


    void delete(int data) {

        if (head == null)
            return;


        if (head.data == data) {
            deleteFirst();
            return;
        }

        Node n = head;

        while (n != null) {

            if (n.data == data) {
                n.prev.next = n.next;

                if (n.next != null)
                    n.next.prev = n.prev;
            }

            n = n.next;

        }

    }


    void insertSorted(int data) {

        if (head == null) {
            insertFirst(data);
            return;
        }


        if (head.data > data) {
            insertFirst(data);
            return;
        }


        Node n = head;

        while (n != null) {

            if (n.next == null) {
                insertLast(data);
                return;
            }

            if (n.next.data > data) {

                Node n2 = new Node(data);

                n2.next = n.next;
                n2.next.prev = n2;
                n2.prev = n;
                n.next = n2;

                return;

            }

            n = n.next;
        }

    }


    void getMax() {


        if (head == null)
            return;

        Node n = head;
        int max = head.data;

        while (n != null) {

            if (n.data > max)
                max = n.data;

            n = n.next;
        }


        System.out.println("Max: " + max);

    }


    void printReverse() {

        Node n = head;

        while (n.next != null)
            n = n.next;

        while (n != null) {
            System.out.print(n.data + " ");
            n = n.prev;
        }

        System.out.println();

    }


    void printOdd() {

        Node n = head;

        while (n != null) {

            if (n.data % 2 == 1)
                System.out.print(n.data + " ");

            n = n.next;
        }

    }



}