package bankingsystem;

import java.util.*;

public class BankingService {
    private Map<String, Account> accountMap = new HashMap<>();
    private TreeMap<Double, String> sortedAccounts = new TreeMap<>();
    private Queue<String> withdrawalRequests = new LinkedList<>();

    // Add a new account
    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
        sortedAccounts.put(account.getBalance(), account.getAccountNumber());
    }

    // Get an account by account number
    public Account getAccount(String accountNumber) {
        return accountMap.get(accountNumber);
    }

    // Process a withdrawal request
    public void processWithdrawal(String accountNumber, double amount) {
        Account account = accountMap.get(accountNumber);

        if (account != null) {
            if (account.getBalance() >= amount) {
                account.setBalance(account.getBalance() - amount);
                // Update the TreeMap with the new balance
                sortedAccounts.put(account.getBalance(), accountNumber);
                System.out.println("Withdrawal successful for Account: " + accountNumber);
            } else {
                System.out.println("Insufficient balance for Account: " + accountNumber);
            }
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    // Display accounts sorted by balance
    public void displaySortedAccounts() {
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            Account account = accountMap.get(entry.getValue());
            System.out.println(account);
        }
    }

    // Process all withdrawal requests
    public void processAllWithdrawals() {
        while (!withdrawalRequests.isEmpty()) {
            String accountNumber = withdrawalRequests.poll();
            Account account = accountMap.get(accountNumber);
            if (account != null) {
                System.out.println("Processing withdrawal for Account: " + accountNumber);
            } else {
                System.out.println("Account not found: " + accountNumber);
            }
        }
    }
}
