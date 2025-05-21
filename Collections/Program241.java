/*

Write a program that contains Stack of 3 items.
First insert 3 items in stack.
Then do pop operation 2 times. and print the stack.

*/

import java.util.Stack;

public class Program241 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();
        stack.pop();

        System.out.println(stack);

    }

}