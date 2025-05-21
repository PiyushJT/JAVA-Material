/*

Problem Statement: Balanced Parentheses
Given a string containing only parentheses, determine if it is balanced.
A string is considered balanced if every opening parenthesis has
a corresponding closing parenthesis, and they are properly nested.
You need to implement a function that takes a string as input and
returns true if the string is balanced and false otherwise.

HINT: To solve this problem, you can use a stack to keep track of the
opening parentheses and pop them off the stack when a closing
parenthesis is encountered.
If at any point the stack is empty when a closing parenthesis is
encountered or if the top of the stack doesn't match the current
closing parenthesis, then the string is not balanced.



Logic ->
On traversing through string,
1. if '(' is found, it is pushed on top of the stack,
2. if ')' is found, if checks
       if the stack is empty, -> it is unbalanced, because for a ')'  bracket, an '(' bracket is must.
       else (if the '(' bracket is found )-> it pops the corresponding '(' bracket.

3. after the traversal,
    if the stack is empty ( no unmatched '(' brackets remaining),
     it is balanced,
    else it is unbalanced.

*/

import java.util.Scanner;
import java.util.Stack;

public class Program242 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.next();

        System.out.println(isBalanced(str));


    }

    static boolean isBalanced(String str){

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < str.length(); i++){

            if (str.charAt(i) == '(')
                stack.push(str.charAt(i));
            else if (str.charAt(i) == ')') {

                if (stack.isEmpty())
                    return false;

                stack.pop();
            }

        }
        return stack.isEmpty();

    }

}