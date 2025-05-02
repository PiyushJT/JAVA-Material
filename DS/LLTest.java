import java.util.Scanner;

public class LLTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SinglyLinkedList myList = new SinglyLinkedList();


        int ch;

        do {

            System.out.println();
            System.out.println();
            System.out.println("1. Insert start");
            System.out.println("2. Insert end");
            System.out.println("3. Delete start");
            System.out.println("4. Delete end");
            System.out.println("5. display");
            System.out.println();
            System.out.println("6. length");
            System.out.println();
            System.out.println("0. Exit");
            System.out.println();
            System.out.println("Enter your choice: ");

            ch = sc.nextInt();

            switch(ch){
                case 1: {

                    System.out.println("Enter value: ");
                    int val = sc.nextInt();
                    myList.insertFirst(val);
                    break;

                }
                case 2: {

                    System.out.println("Enter value: ");
                    int val = sc.nextInt();

                    //myList.insertEnd(myList.head, val);
                    myList.insertEnd(val);

                    break;

                }
                case 3: {

                    myList.deleteFirst();
                    break;

                }
                case 4: {

                    myList.deleteEnd();
                    break;

                }
                case 5: {

                    //myList.display();
                    myList.display(myList.head);
                    break;

                }
                case 6: {

                    System.out.println("The length is " + myList.length());
                    break;

                }
                case 0: {
                    System.out.println("Okay Bye :)");
                    break;
                }

                default: {
                    System.out.println("Wrong input.");
                    break;
                }
            }

        }
        while (ch != 0);


    }

}