/*

IPL 2023 Awards
 |    Java code Filename:  OnlineVoting.java

As a Java intern, you have been assigned the task of designing
an online voting system using Java to elect "Best Captain
(Viewers Choice)- IPL 2023". The system is intended to
manage the voting process for an election involving five Indian
captains of IPL 2023 . Each captain is associated with a name,
age, and team affiliation. The voting process will involve 50
voters, each randomly selecting one of the five captains.
The goal is to implement an efficient and user-friendly system
that can handle the following tasks:
1. Storing Captain Information:
   - The system should use a HashMap data structure to store captain
     information.
   - Each captains details, including their name, age, and team affiliation,
     will be represented as a `Captain` object.
   - The HashMap will use the captains name as the key and the corresponding
     `Captain` object as the value.
   - The five captains are Rohit(32 years old, Team MI), Dhoni (39 years old,
     Team CSK), Virat (30 years old, Team RCB), Hardik (31 years old, Team GT),
     and Rishabh (29 years old, Team DC).
2. Displaying Captain Details:
   - Before the voting process begins, the system should display the details
     of all the captains to the user.
   - The captain details should be printed on the console.
3. Simulating the Voting Process:
   - The voting process will involve 50 voters, each voter will be named Voter-1,
     Voter-2, and so on, and will randomly select one of the five
     captains.
   - The random selection will be done using the Math.random() method.
4. Recording the Voting Sequence:
   - The system should record the voting sequence, indicating the voter name
     and the captain they voted for.
   - The voting sequence should be stored in a ArrayDeque.
5. Writing Initial Captain Details to File:
   - The system should create a text file named "Voting Result.txt"
     to store the voting details.
   - Before the voting process begins, the system should write the
     initial captain details (stored in the HashMap) to the file.
   - The captain details should be written in a formatted manner
     for better readability
6. Writing Voting Sequence to File:
   - After the voting process is complete, the system should update the
     "Voting Result.txt" file.
   - The voting sequence, including the name of the voter and the captain
     they voted for, should be written to the file only.
7. Counting Votes:
   - The system should count the votes received by each captain.
   - The vote count should be stored in a HashMap, where the captain's
     name is the key, and the vote count is the value.
8. Sorting and Displaying Voting Results:
   - The system should sort the captains based on the vote count
     in descending order.
   - The sorted results should be displayed on the console,
     showing the number of votes and the percentage of
     votes gained for each captain.
   - The system should also determine the winner, i.e., the captain
     with the highest number of votes.
   - The winner's name, team affiliation, total votes, and percentage
     of votes received should be displayed on the console.
9. Writing Final Voting Results to File:
   - The system should update the "Voting Result.txt" file with the final voting results.
   - The final voting results, including the number of votes and percentage
     of votes for each captain, and then the winner's details, should be written to the file.
10. Error Handling:
    - The system should handle any potential errors during file operations.

Overall, the goal of the system is to provide an efficient and reliable
platform for conducting the voting process and generating accurate
voting results for the election of "Best Captain (Viewers Choice)- IPL 2023"
winner that will be new captain for team India in upcoming WorldCup-2023.
Thanks for being an outstanding intern, and we are confident that your
future holds tremendous success and achievement. Wishing you
the very best in all your endeavors!

*/


// imports
import java.util.*;
import java.io.*;

public class Program364 {

    public static void main(String[] args) throws Exception {


        // Captains' data
        HashMap<String, Captain> captains = new HashMap<>();
        captains.put("Rohit", new Captain("Rohit", 32, "MI"));
        captains.put("Dhoni", new Captain("Dhoni", 39, "CSK"));
        captains.put("Virat", new Captain("Virat", 30, "RCB"));
        captains.put("Hardik", new Captain("Hardik", 31, "GT"));
        captains.put("Rishabh", new Captain("Rishabh", 29, "DC"));


        // Displaying Captain Details
        System.out.println("\n\n\tCaptain Details");
        for (Captain captain : captains.values()) {
            System.out.println(captain);
        }


        // Creating the file
        File file = new File("Data/Voting Result.txt");

        if (!file.exists())
            file.createNewFile();


        // Writing the initial captain details to the file
        FileWriter writer = new FileWriter(file);

        writer.write("\tCaptain Details\n\n");
        writer.write(String.format("%-9s %-4s %-4s", "Name", "Age", "Team"));
        writer.write("\n");

        for (Captain captain : captains.values())
            writer.write(captain.toString() + "\n");

        writer.flush();



        // simulating the random voting process
        ArrayDeque<Voter> votes = new ArrayDeque<>();
        ArrayList<Captain> captainList = new ArrayList<>(captains.values());

        for (int i = 1; i <= 50; i++) {

            int randomIndex = (int) (Math.random() * 5);

            Captain randomCaptain = captainList.get(randomIndex);

            Voter voter = new Voter("Voter-" + i, randomCaptain);
            votes.add(voter);

        }


        // writing the voting sequence to the file
        writer.write("\n\n\tVoting Sequence\n\n");
        writer.write(String.format("%-9s %-7s", "Name", "Voted To"));
        writer.write("\n");

        for (Voter v : votes)
            writer.write(v.toString() + "\n");

        writer.flush();


        // Vote counting
        HashMap<String, Integer> voteCount = new HashMap<>();
        voteCount.put("Rohit", 0);
        voteCount.put("Dhoni", 0);
        voteCount.put("Virat", 0);
        voteCount.put("Rishabh", 0);
        voteCount.put("Hardik", 0);

        for (Voter v : votes)
            voteCount.put(v.votedTo.name, voteCount.get(v.votedTo.name) + 1);


        // sorting the vote results
        List<Map.Entry<String, Integer>> sortedVotes = new ArrayList<>(voteCount.entrySet());

        Collections.sort(sortedVotes, Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed());


        // displaying the voting results
        System.out.println("\n\n\tVoting Results");
        for (Map.Entry<String, Integer> map : sortedVotes)
            System.out.println(getFormatted(map.getKey(), map.getValue(), map.getValue() * 100 / 50));


        // getting total votes and vote percentage of winner
        String winner = sortedVotes.get(0).getKey();
        Captain winnerObj = captains.get(winner);
        int winnerVotes = sortedVotes.get(0).getValue();
        int winnerVotesPercentage = sortedVotes.get(0).getValue() * 100 / 50;


        // printing the winner details
        System.out.println();
        System.out.println("\tWinner");
        System.out.println(String.format("%-9s %-5s %-6s %-7s %-4s", "Name", "Age", "Team", "Votes", "Percentage"));
        System.out.println(getFormatted(winnerObj.name, winnerObj.age, winnerObj.team, winnerVotes, winnerVotesPercentage));



        // writing voting result
        writer.write("\n\n\tFinal Voting Results\n\n");

        writer.write(String.format("%-9s %-7s", "Name", "Votes") + "\n");
        for (Map.Entry<String, Integer> map : sortedVotes)
            writer.write(getFormatted(map.getKey(), map.getValue()) + "\n");


        // writing winner details
        writer.write("\n\n\tWinner\n\n");

        writer.write(String.format("%-9s %-5s %-6s %-7s %-4s", "Name", "Age", "Team", "Votes", "Percentage"));
        writer.write("\n");
        writer.write(getFormatted(winnerObj.name, winnerObj.age, winnerObj.team, winnerVotes, winnerVotesPercentage));

        writer.flush();

        writer.close();


    }


    // String formatters for printing and writing
    static String getFormatted(String name, int age, String team, int votes, int percentage) {
        return String.format("%-9s %-5s %-6s %-7s %-4s", name, age, team, votes, percentage);
    }
    static String getFormatted(String name, int votes) {
        return String.format("%-9s %-7s", name, votes);
    }
    static String getFormatted(String name, int votes, int percentage) {
        return String.format("%-9s %-7s %-4s", name, votes, percentage);
    }


}



class Captain {

    String name;
    int age;
    String team;

    Captain(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    @Override
    public String toString() {
        return String.format("%-9s %-4d %-7s", name, age, team);
    }

}

class Voter {

    String name;
    Captain votedTo;

    Voter(String name, Captain votedTo) {
        this.name = name;
        this.votedTo = votedTo;
    }

    @Override
    public String toString() {
        return String.format("%-9s %-7s", name, votedTo.name);
    }

}