/*

Sports tournament organizer:
Write a program that simulates a sports tournament
using a PriorityQueue.
The program should allow the user to input team
names and their win-loss records. The program should
then prioritize teams based on their win-loss records
and add them to the PriorityQueue. When it's time for
the next match, the program should remove the two
highest priority teams from the PriorityQueue
and display their names.

*/

import java.util.*;

public class Program280 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Team> teams = new PriorityQueue<>(
                Comparator.comparing(Team::getEffectiveWin).reversed()
        );

        System.out.println("Enter number of teams: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Not enough teams!");
            return;
        }

        for (int i = 0; i < n; i++) {

            System.out.println("Enter team name: ");
            String name = sc.next();
            sc.nextLine();

            System.out.println("Enter wins: ");
            int win = sc.nextInt();

            System.out.println("Enter losses: ");
            int loss = sc.nextInt();

            teams.add(new Team(name, win, loss));

        }


        System.out.println("The next match is between: " + teams.poll().getName() + " and " + teams.poll().getName());

    }

}


class Team {

    String name;
    int win;
    int loss;

    Team(String name, int win, int loss) {
        this.name = name;
        this.win = win;
        this.loss = loss;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + ", Wins: " + win + ", Losses: " + loss;
    }

    public int getEffectiveWin() {
        return win - loss;
    }

}