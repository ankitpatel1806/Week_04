package votingsystem;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class VotingSystemTest {

    private VotingSystem votingSystem;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
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

    @After
    public void tearDown() {

        System.setOut(originalOut);
    }
}

