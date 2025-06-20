/*

Music player playlist: Write a program that simulates a
music player playlist using an ArrayDeque. The program
should allow the user to add songs to the playlist, play
the next or previous song in the playlist, and shuffle the playlist.
The program should keep track of the songs in the playlist
using an ArrayDeque, where each element in the deque represents
a song. When the user adds a song, you can use the addLast
method to add it to the end of the playlist. When the user plays
the next or previous song, you can use the removeFirst or
removeLast method, respectively, to remove the current song
from the front or back of the deque and add it to the end or
beginning of the deque. When the user shuffles the playlist,
you can use the shuffle method to randomly reorder the songs in the deque.

*/

import java.util.*;

public class Program282 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> playlist = new ArrayDeque<>();

        int ch;

        do {

            System.out.println("Menu");
            System.out.println("1. Add new song");
            System.out.println("2. Play next");
            System.out.println("3. Play previous");
            System.out.println("4. Shuffle");
            System.out.println("0. Exit");

            System.out.println("Enter choice");
            ch = sc.nextInt();


            switch (ch) {

                case 1:
                    System.out.println("Enter name of the song: ");
                    String name = sc.next();
                    sc.nextLine();

                    playlist.addLast(name);
                    break;

                case 2:
                    if (playlist.isEmpty())
                        break;
                    String next = playlist.removeFirst();
                    playlist.addLast(next);

                    System.out.println("Playing " + next);
                    break;

                case 3:
                    if (playlist.isEmpty())
                        break;
                    String prev = playlist.removeLast();
                    playlist.addFirst(prev);

                    System.out.println("Playing " + prev);
                    break;

                case 4:

                    ArrayList<String> list = new ArrayList<>(playlist);

                    Collections.shuffle(list);

                    playlist.clear();
                    playlist.addAll(list);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid input");

            }

        }
        while (ch != 0);

    }

}