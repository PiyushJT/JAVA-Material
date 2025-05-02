public class SinglyLinkedList {

    Node head = null;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void insertFirst(int data) {

        Node n = new Node(data);
        n.next = head;

        head = n;

    }

    public void insertEnd(Node n, int data) {

        if (n != null)
            if (n.next == null)
                n.next = new Node(data);
            else
                insertEnd(n.next, data);
        else
            head = new Node(data);

    }

    public void insertEnd(int data) {

        Node n = head;

        if (n != null) {
            while (n.next != null)
                n = n.next;
            n.next = new Node(data);
        } else {
            head = new Node(data);
        }

    }

    public void deleteEnd() {

        Node n = head;

        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        while (n.next.next != null)
            n = n.next;
        n.next = null;


    }

    public void deleteFirst() {

        if (head != null)
            head = head.next;

    }


    public void display() {

        Node n = head;

        System.out.println();
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();

    }

    public void display(Node n){

        if(n != null){
            System.out.print(n.data + " ");
            display(n.next);
        }
        else
            System.out.println();

    }

    public int length(){

        int i = 0;
        Node n = head;

        while (n != null) {
            n = n.next;
            i++;
        }

        return i;

    }


}