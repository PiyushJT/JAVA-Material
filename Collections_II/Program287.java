/*

Write a program that reads in a list of names and
corresponding phone numbers from the user, and stores
them in a HashMap. The program should then prompt
the user for a name and output the corresponding phone
number, or a message indicating that the name is not in the map.

*/

import java.util.*;

public class Program287 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Long> map = new HashMap<>();

        System.out.println("Enter number of names to be stored: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {

            System.out.println("Enter name " + i + ": ");
            String name = sc.next();

            System.out.println("Enter phone number " + i + ": ");
            long phone = sc.nextLong();

            map.put(name, phone);

        }

        System.out.println("Enter name to be searched: ");
        String name = sc.next();

        if (map.containsKey(name))
            System.out.println("Phone number of " + name + " is " + map.get(name));
        else
            System.out.println("Name not found!");

    }

}