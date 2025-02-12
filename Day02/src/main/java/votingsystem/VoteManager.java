package votingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VoteManager {

    private HashMap<String, Integer> votes;
    private LinkedHashMap<String, Integer> orderedVotes;

    public VoteManager() {
        votes = new HashMap<>();
        orderedVotes = new LinkedHashMap<>();
    }

    // Method to cast a vote
    public void vote(String candidateName) {
        votes.put(candidateName, votes.getOrDefault(candidateName, 0) + 1);
        orderedVotes.put(candidateName, votes.get(candidateName)); // maintaining order of votes
    }

    // Method to display sorted results
    public void showSortedResults() {
        TreeMap<String, Integer> sortedVotes = new TreeMap<>((candidate1, candidate2) -> {
            // Sorting by vote count (descending order), if same, by name (ascending order)
            return votes.get(candidate2).compareTo(votes.get(candidate1));
        });
        sortedVotes.putAll(votes);

        System.out.println("Voting Results:");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
}

