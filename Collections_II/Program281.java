/*

Write a program that simulates a queue of customers at a coffee
shop using an ArrayDeque. The program should allow the user
to perform the following actions:
Add a new customer to the back of the queue
Serve the next customer in the queue (i.e. remove the customer from the front of the queue)
View the current queue of customers
The program should continue to prompt the user for actions until they choose to quit.

*/

import java.util.*;

public class Program281 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> customers = new ArrayDeque<>();

        int ch;

        do {

            System.out.println("Menu");
            System.out.println("1. Add a new customer at back");
            System.out.println("2. Serve the next customer");
            System.out.println("3. View the current queue");
            System.out.println("0. Quit");

            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("Enter customer name: ");
                    String name = sc.next();
                    sc.nextLine();
                    customers.add(name);
                    break;

                case 2:
                    if (customers.isEmpty())
                        System.out.println("No customers in queue!");
                    else
                        System.out.println("Serving " + customers.poll());
                    break;

                case 3:
                    if (customers.isEmpty())
                        System.out.println("No customers in queue!");
                    else
                        System.out.println("Current queue: " + customers);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;

            }

        }
        while (ch != 0);

    }
}