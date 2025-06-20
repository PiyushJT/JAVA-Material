/*

In my restaurant I used to manage it well as per the order.
I never want to skip any order from the customer.
So I prepare a rule: When I get the order
I add it in the last of my cook queue.
And when the order is ready I used to pick it up
from the first of the cook queue.
So, write a java program with class Restaurant.
Create a queue cook which contains item names.
Ask user weather he wants to Order or take food.
If user press 1 then ask for the name of the
item and it should be added in the cook queue.
If user press 2 then The first item from the
queue should be removed from the queue.
If user press 3 then he can see the items of the queue.
If user press 4 then he should move out from the Restaurant.

*/

import java.util.*;

public class Program284 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> cook = new ArrayDeque<>();

        int ch;

        do {

            System.out.println("Menu");
            System.out.println("1. Add a new Order at back");
            System.out.println("2. Get your order");
            System.out.println("3. View the Order queue");
            System.out.println("0. Quit");

            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("Enter Item name: ");
                    String name = sc.next();
                    sc.nextLine();
                    cook.addLast(name);
                    break;

                case 2:
                    if (cook.isEmpty())
                        System.out.println("No Orders in queue!");
                    else
                        System.out.println("Here, take your " + cook.poll());
                    break;

                case 3:
                    if (cook.isEmpty())
                        System.out.println("No Orders in queue!");
                    else
                        System.out.println("Current queue: " + cook);
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