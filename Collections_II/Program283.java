/*

Make the system as User interactive and give choices to user.
Web browser history: Write a program that simulates a web
browser history using an ArrayDeque. The program should
allow the user to navigate back and forward through their
history of visited web pages, similar to how a web browser works.
The program should keep track of the URLs of visited web pages using
an ArrayDeque, where each element in the deque represents a visited
web page. When the user navigates to a new web page, you can push
the URL onto the deque. When the user navigates back or forward,
you can pop URLs off the front or back of the deque, respectively.


⚠️ remove from front and back does not replicate the behaviour of going forward in a
   browser tab history.

*/

import java.util.*;

public class Program283 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();

        int ch;

        do {

            System.out.println("Menu");
            System.out.println("1. Go to a new page");
            System.out.println("2. Go back");
            System.out.println("0. Quit");

            System.out.println("Enter your choice: ");
            ch = sc.nextInt();


            switch (ch) {

                case 1:
                    System.out.println("Enter URL: ");
                    String url = sc.next();
                    sc.nextLine();
                    history.addLast(url);
                    break;

                case 2:
                    if (history.isEmpty())
                        System.out.println("No history!");
                    else
                        System.out.println("Going back to " + history.removeLast());
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