/*

Create a Java program for a Quiz game consisting of 5 Multiple
Choice Questions (MCQs) with 3 participants. Each participant
will be represented by the "Participant" class, which will have attributes
such as "name," "age," and "contactNumber".
To ensure the correctness of the contact number, implement a validation check.
If a participant enters a contact number that is not 10 digits long or
does not start with '9', display a message stating "Wrong number"
and prompt the participant to enter the correct contact number.
This validation check should continue until the participant
enters a valid 10- digit contact number starting with '9'.
Create objects of the "Participant" class and store them in an ArrayList.
This ArrayList will hold all the participant objects participating in the quiz.
Use a Stack data structure to store the correct answers to all 5 MCQs.
Each answer should be represented as a character in the stack.
This stack will serve as the reference for evaluating the participants' answers.
The correct answer sequence is as follows: A, B , A , D , C.
Create a thread for each participant using Java's threading mechanism.
Each thread will represent an individual participant .
The participant with the lowest age should be given the chance
to answer all 5 questions first using scanner class.
At a time only one participant can give answer of Questions.
During the quiz, the participant's answers should be stored in an ArrayList.
This ArrayList will hold the participant's submitted answers.
After all participants have submitted their answers,
calculate and display each participant's score.
The score should be calculated by comparing each participant's submitted
answers (ArrayList) with the correct answers (Stack). Award 1 point for
each correct answer and calculate the total score for each participant out of 5.
Finally, declare the winner based on the participant with the highest score.
In case of tie, younger participant will be declared as winner.
Below is the list of 5 Questions which is asked in Quiz.

Q.1. National bird of INDIA..(A) Peacock (B) Sparrow (C) Duck (D) Owl
Q.2  Independence year of INDIA..(A) 1955 (B) 1947 (C) 1999 (D) 1929
Q.3  Gandhi Jayanti is on......(A) 2nd Oct (B) 5th Oct (C) 9th Oct (D) 7th Oct
Q.4  Count of states in INDIA..(A) 17 (B) 21 (C) 25 (D) 28
Q.5  how many continents are there in the world..(A) 5 (B) 6 (C) 7 (D) 8
Answers: A, B , A , D , C

*/

import java.util.*;

public class Program246 {

    static Stack<Character> correctAnswers = new Stack<>();
    static ArrayList<Participant> participants = new ArrayList<>();


    public static void main(String[] args) throws InterruptedException{

        Scanner sc = new Scanner(System.in);

        correctAnswers.push('A');
        correctAnswers.push('B');
        correctAnswers.push('A');
        correctAnswers.push('D');
        correctAnswers.push('C');


        // Input 3 participants
        for (int i = 0; i < 3; i++) {

            System.out.println("Enter details for Participant " + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Age: ");
            int age = sc.nextInt();

            // contact validation
            long contact;
            while (true) {
                System.out.print("Contact Number: ");
                long input = sc.nextLong();

                if (input > 9999999999L || input < 9000000000L)
                    System.out.println("Wrong number.");
                else {
                    contact = input;
                    break;
                }
            }

            participants.add(new Participant(name, age, contact));

        }

        // Sort participants by age
        participants.sort(Comparator.comparingInt(Participant::getAge));


        // Quiz questions
        String[] questions = {
                "Q1. National bird of INDIA..(A) Peacock (B) Sparrow (C) Duck (D) Owl",
                "Q2. Independence year of INDIA..(A) 1955 (B) 1947 (C) 1999 (D) 1929",
                "Q3. Gandhi Jayanti is on......(A) 2nd Oct (B) 5th Oct (C) 9th Oct (D) 7th Oct",
                "Q4. Count of states in INDIA..(A) 17 (B) 21 (C) 25 (D) 28",
                "Q5. How many continents are there in the world..(A) 5 (B) 6 (C) 7 (D) 8"
        };


        for (Participant p : participants) {
            Quiz quiz = new Quiz(p, questions);
            quiz.start();

            quiz.join(); // wait till first is finished
        }


        // Calculate scores
        for (Participant p : participants) {
            int score = 0;
            for (int i = 0; i < 5; i++) {
                if (p.answers.get(i) == correctAnswers.get(i)) {
                    score++;
                }
            }
            p.score = score;
            System.out.println(p.name + "'s Score: " + score);
        }


        // Determine winner (youngest if tied)
        Participant winner = participants.get(0);

        for (int i = 1; i < participants.size(); i++) {

            Participant current = participants.get(i);

            if (current.score > winner.score ||
                    (current.score == winner.score && current.age < winner.age)) {
                winner = current;
            }
        }

        System.out.println();
        System.out.println("Winner is: " + winner.name + " with score " + winner.score);

    }
}

// Thread class for each participant
class Quiz extends Thread {
    Participant participant;
    String[] questions;

    public Quiz(Participant participant, String[] questions) {
        this.participant = participant;
        this.questions = questions;
    }

    public void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println(participant.name + "'s Turn:");

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            char answer = sc.next().toUpperCase().charAt(0);

            participant.answers.add(answer);

        }
    }
}

class Participant {
    String name;
    int age;
    long contact;

    ArrayList<Character> answers = new ArrayList<>();
    int score = 0;


    public Participant(String name, int age, long contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

}