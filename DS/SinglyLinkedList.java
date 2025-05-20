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


    public void insertAfter(int after, int val){

        Node n = head;

        while (n != null){

            if (n.data == after){

                Node n2 = n.next;

                n.next = new Node(val);

                n.next.next = n2;

                return;

            }

            n = n.next;
        }

        System.out.println("404 value not found! :( ");


    }

    public void deleteVal(int val){

        Node n = head;

        if (head.data == val) {
            head = head.next;
            return;
        }


        while (n.next != null){

            if (n.next.data == val){
                n.next = n.next.next;
                return;
            }

            n = n.next;
        }

    }


    void swap(int pos){

        if (head == null || head.next == null)
            return;

        Node n1 = head;
        Node n2 = head.next;


        for (int i = 1; i < pos; i++){
            n1 = n1.next;
            n2 = n2.next;
        }

        if (n2 == null)
            return;

        int temp = n1.data;
        n1.data = n2.data;
        n2.data = temp;

    }


    public SinglyLinkedList copy(){

        SinglyLinkedList l = new SinglyLinkedList();

        Node n = head;

        while (n != null){
            l.insertEnd(n.data);
            n = n.next;
        }

        return l;

    }


    public void sort(){

        Node n = head;

        for(Node n1 = head; n1 != null; n1 = n1.next){

            for (Node n2 = n1; n2 != null; n2 = n2.next){

                if (n1.data > n2.data){
                    int temp = n1.data;
                    n1.data = n2.data;
                    n2.data = temp;
                }

            }

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