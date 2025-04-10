/*

**Food Ordering System**
You are tasked with developing a food ordering system in Java.
The system should allow users to select any one food item from
a menu, specify the quantity of that item, place their order,
and make a payment. Write a Java program that meets the following requirements:
1. Define an abstract class called `FoodItem` with the following attributes and methods:
   - Attributes: - `name` (protected String). `price` (protected double)
   - Methods:   - `display()`: an abstract method that displays the details of the food item.
2. Define an interface called `Orderable` with the following methods:
   - `placeOrder(int quantity)`: a method that takes an integer `quantity`
      as a parameter and only prints a message indicating the order details.
   - `cancelOrder()`: a method that only prints a cancellation message.
3. Implement two concrete classes, `Pizza` and `Shake`, which inherit from
   the `FoodItem` class and implement the `Orderable` interface.

Each class should have additional attributes and methods as follows:
- `Pizza` class:
     - Attributes:  - `size` (private String): representing the size of the pizza.
     - Methods:   - Implement the abstract `display()` method to display the pizza's details.
- `Shake` class:
     - Attributes:   - `size` (private String): representing the size of the shake.
     - Methods:     - Implement the abstract `display()` method to display the shake's details.
4. Define a custom exception class called `InvalidMenuItemException` that extends the `Exception`
   class. The `InvalidMenuItemException` should have a constructor that accepts
   a String parameter to display an error message.
5. In the `FoodOrderingSystem` class's `main` method, perform all the following steps:
   - Create an array of `FoodItem` called `menu` with a capacity of 4.
   - Initialize the `menu` array with four different food items, including pizzas
     and shakes, each with different name, price and size as follows:
   FooditemNamePriceSize
   PizzaMargherita349Regular
   PizzaPepperoni449Large
   ShakeChocolate149Regular
   ShakeStrawberry249Large
   - Display the menu by iterating over the `menu` array and calling the
     `display()` method for each item.
   - Prompt the user to enter the item number they wish to order.
   - Validate the user input:- If the item number is invalid (less than 1 or greater
     than the menu length), throw an `InvalidMenuItemException` with the message
     "Invalid item number selected!".
   - If the item number is valid, then prompt the user to enter the quantity to order.
   - If no exceptions occur, retrieve the selected item from the `menu` array based on the
     user's input, cast it to `Orderable`, and call the
     `placeOrder()` method with the specified quantity.
   - Prompt the user to make a payment by entering a payment method (1 for cash, 2 for credit card).
   - Implement the `payment()` method with a switch case to handle the payment scenarios:

For Cash payment: Show total bill amount and ask user to enter the same
or more cash_amount. If cash_amount > = bill amount, then payment is
successful, display a payment confirmation message. Else throw a
custom exception called `PaymentFailedException` with the message "Cash Payment failed!".
For Creditcard payment: Show total bill amount and ask user to enter the same or
more amount. If credit_amount > =bill amount and Creditcard= 12345678, then only payment
is successful, display a payment confirmation message. Else throw a custom exception called
`PaymentFailedException` with the message "Creditcard Payment failed!".

Handle any exceptions that may occur during the payment process using appropriate
exception handling mechanisms.
Validation: (You may use below Test cases to validate the functionality of your
program before submitting code)
1. Valid item number and quantity:
   - Select an item from the menu.
   - Enter a valid quantity.
   - Make a successful payment.
2. Invalid item number:
   - Enter an invalid item number (less than 1 or greater than the menu length).
   - Verify that the program throws the `InvalidMenuItemException`.
3. Payment failure:
   - Select an item from the menu and Enter a valid quantity.
   - Choose any payment flow such that it results in a payment failure.
   - Verify that the program throws the `PaymentFailedException`.

*/


import java.util.Scanner;

// consider this as FoodOrderingSystem class;
public class Program113 {
    public static void main(String[] args) throws InvalidMenuItemException{

        Scanner sc = new Scanner(System.in);

        FoodItem[] menu = new FoodItem[4];

        menu[0] = new Pizza("Margherita", 349, "Regular");
        menu[1] = new Pizza("Pepperoni", 449, "Large");
        menu[2] = new Shake("Chocolate", 149, "Regular");
        menu[3] = new Shake("Strawberry", 249, "Large");


        for(int i = 0; i < menu.length; i++){
            System.out.println(i + 1);
            menu[i].display();
            System.out.println();
        }

        System.out.println("Enter item number");
        int itemNumber = sc.nextInt();

        if (itemNumber < 1 || itemNumber > menu.length)
            throw new InvalidMenuItemException("Invalid item number selected!");

        System.out.println("Enter quantity");
        int quantity = sc.nextInt();

        Orderable orderable = (Orderable) menu[itemNumber - 1];
        orderable.placeOrder(quantity);

        System.out.println("Enter payment method (1 for cash, 2 for credit card)");
        int paymentMethod = sc.nextInt();

        try {
            payment(paymentMethod, quantity, menu[itemNumber - 1]);
        }
        catch (PaymentFailedException e){
            System.out.println(e);
            orderable.cancelOrder();
        }

    }

    static void payment(int paymentMethod, int quantity, FoodItem item) throws PaymentFailedException {

        Scanner sc = new Scanner(System.in);


        double billAmount = item.price * quantity;
        System.out.println("Bill amount is " + billAmount);


        switch (paymentMethod){
            case 1: {

                System.out.println("Enter cash amount");
                int cashAmount = sc.nextInt();

                if(cashAmount >= billAmount)
                    System.out.println("Payment successful");
                else
                    throw new PaymentFailedException("Cash Payment failed!");


                break;
            }
            case 2: {

                System.out.println("Enter credit card amount");
                int creditAmount = sc.nextInt();

                System.out.println("Enter credit card number");
                int creditCard = sc.nextInt();

                if(creditAmount >= billAmount && creditCard == 12345678)
                    System.out.println("Payment successful");
                else
                    throw new PaymentFailedException("Credit card Payment failed!");

                break;
            }
            default: {
                System.out.println("Invalid payment method");
            }
        }
    }

}

abstract class FoodItem{

    protected String name;
    protected double price;

    abstract void display();

}

interface Orderable{

    void placeOrder(int quantity);
    void cancelOrder();

}

class Pizza extends FoodItem implements Orderable{

    private String size;

    Pizza(String name, double price, String size){
        this.name = name;
        this.price = price;
        this.size = size;
    }

    void display() {
        System.out.println(name + " " + price + " " + size);
    }

    public void placeOrder(int quantity) {

    }

    public void cancelOrder() {

    }
}

class Shake extends FoodItem implements Orderable{

    private String size;

    Shake(String name, double price, String size){
        this.name = name;
        this.price = price;
        this.size = size;
    }

    void display() {
        System.out.println(name + " " + price + " " + size);
    }

    public void placeOrder(int quantity) {
        System.out.println("Order Placed");
    }

    public void cancelOrder() {
        System.out.println("Order canceled");
    }
}


class InvalidMenuItemException extends Exception{

    InvalidMenuItemException(String m){
        super(m);
    }

}

class PaymentFailedException extends Exception{

    PaymentFailedException(String m){
        super(m);
    }

}