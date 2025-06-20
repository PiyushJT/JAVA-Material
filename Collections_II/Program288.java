/*

Write a program that reads in a list of stock prices
for a company and stores them in a HashMap,
where the key is the date and the value is the price.
The program should then compute the average price for
the entire period and output it to the user.

*/

import java.util.*;

public class Program288 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> stockPrices = new HashMap<>();

        System.out.println("Enter number of stock prices to be stored: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter date " + i + ": ");
            String date = sc.next();

            System.out.println("Enter price " + i + ": ");
            double price = sc.nextDouble();

            stockPrices.put(date, price);

        }

        double sum = 0;

        for (double price : stockPrices.values())
            sum += price;

        double average = sum / n;

        System.out.println("Average price: " + average);

    }

}