package bankingsystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankingServiceTest {

    private BankingService bankingService;

    @BeforeEach
    public void setUp() {
        bankingService = new BankingService();
        // Add sample accounts for testing
        bankingService.addAccount(new Account("A123", 1000));
        bankingService.addAccount(new Account("A124", 1500));
        bankingService.addAccount(new Account("A125", 500));
    }

    @Test
    public void testAddAccount() {
        Account account = new Account("A126", 2000);
        bankingService.addAccount(account);

        // Assert that account "A126" was added successfully and is present in the account map
        assertNotNull(bankingService.getAccount("A126"));
        assertEquals(2000, bankingService.getAccount("A126").getBalance());
    }

    @Test
    public void testWithdrawalSuccess() {
        bankingService.processWithdrawal("A123", 200);

        // Check that the balance is reduced correctly
        assertNotNull(bankingService.getAccount("A123"));
        assertEquals(800, bankingService.getAccount("A123").getBalance());
    }

    @Test
    public void testWithdrawalInsufficientBalance() {
        bankingService.processWithdrawal("A125", 600);  // Insufficient funds for A125

        // Ensure the balance remains unchanged
        assertNotNull(bankingService.getAccount("A125"));
        assertEquals(500, bankingService.getAccount("A125").getBalance());
    }

    @Test
    public void testProcessWithdrawalNotFound() {
        bankingService.processWithdrawal("A999", 100);  // Account does not exist

        // Ensure that no exception is thrown, and nothing changes in the system
        assertNull(bankingService.getAccount("A999"));
    }

    @Test
    public void testDisplaySortedAccounts() {
        // Test if accounts are sorted by balance in ascending order
        bankingService.displaySortedAccounts();

        // Add assertions to check that the sorting works as expected
        // (You can redirect the output to a string and compare it against expected output)
    }
}
