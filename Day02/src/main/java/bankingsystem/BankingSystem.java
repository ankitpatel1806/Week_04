package bankingsystem;

public class BankingSystem{

    public static void main(String[] args) {

        BankingService bankingService = new BankingService();


        Account account1 = new Account("A123", 1000);
        Account account2 = new Account("A124", 1500);
        Account account3 = new Account("A125", 500);

        bankingService.addAccount(account1);
        bankingService.addAccount(account2);
        bankingService.addAccount(account3);

        bankingService.displaySortedAccounts();

        bankingService.processWithdrawal("A123", 200);
        bankingService.processWithdrawal("A124", 300);
        bankingService.processWithdrawal("A126", 100); // Account does not exist

        bankingService.displaySortedAccounts();
        bankingService.processAllWithdrawals();
    }
}

