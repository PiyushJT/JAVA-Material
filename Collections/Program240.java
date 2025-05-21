/*

I have an Induction machine manufacturing company.
My Manager wants to analyze some data of the induction machines of our manufacturing unit.
What I have: List of machine's price. Note: each price is in Double.
Write a java program that contains list of various machine's price.
& do the following tasks.

Task 1 - Create a list of 5 machine's price. [10000.0,55000.0,80000.0,25000.0,55000.0]
Task 2 - Find the maximum price from the list.
Task 3 - sort the list.

*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Program240 {

    public static void main(String[] args) {

        ArrayList<Double> prices = new ArrayList<>();

        prices.add(10000.0);
        prices.add(55000.0);
        prices.add(80000.0);
        prices.add(25000.0);


        // max without sorting

        Iterator i = prices.iterator();

        double max = 0;

        while(i.hasNext()) {

            double price = (double) i.next();

            if (price > max) {
                max = price;
            }
        }

        System.out.println("Max is " + max);



        // sorting
        prices.sort(Comparator.naturalOrder());

        System.out.println(prices);


        // max value
        max = prices.get(prices.size() - 1);

        System.out.println(max);


    }

}