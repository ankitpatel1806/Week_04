package votingsystem;
import java.util.Map;
public class VotingSystem {

    private VoteManager voteManager;

    public VotingSystem() {
        this.voteManager = new VoteManager();
    }

    public void castVote(String candidateName) {
        voteManager.vote(candidateName);
    }

    public void displayResults() {
        voteManager.showSortedResults();
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        system.castVote("Anand Soni");
        system.castVote("Ankit Kumar");
        system.castVote("Aakriti Barsaiyan");
        system.castVote("Avinash Rai");
        system.castVote("Muskan Gupta");
        system.castVote("Pragya Sable");
        system.castVote("Yaman");

        system.displayResults();
    }
}
