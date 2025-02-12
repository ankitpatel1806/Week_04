package votingsystem;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class VotingSystemTest {

    private VotingSystem votingSystem;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {

        votingSystem = new VotingSystem();

        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testVoteCounting() {

        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        votingSystem.displayResults();


        String output = outputStream.toString();
        assertTrue(output.contains("Alice: 2 votes"));
        assertTrue(output.contains("Bob: 1 vote"));
    }

    @Test
    public void testVoteOrder() {

        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");


        votingSystem.displayResults();

        String output = outputStream.toString();
        assertTrue(output.indexOf("Alice") < output.indexOf("Bob"));
    }

    @Test
    public void testMultipleVotesForSameCandidate() {

        votingSystem.castVote("Charlie");
        votingSystem.castVote("Charlie");


        votingSystem.displayResults();

        String output = outputStream.toString();
        assertTrue(output.contains("Charlie: 2 votes"));
    }

    @AfterAll
    public void tearDown() {

        System.setOut(originalOut);
    }
}

