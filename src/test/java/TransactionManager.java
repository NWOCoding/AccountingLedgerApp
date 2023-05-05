import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    // List to hold all the transactions
    private final List<Transaction> transactions;

    // Constructor to initialize the transactions list
    public TransactionManager() {
        this.transactions = new ArrayList<>();
    }

    // Method to add a transaction to the transactions list
    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    // Method to display the ledger of all transactions
    public void displayLedger() {
        System.out.println("Date       Time       Description            Vendor                Amount");
        System.out.println("----------------------------------------------------------------------------");

        // Loop through all the transactions and print each one
        for (Transaction transaction : this.transactions) {
            System.out.println(transaction.toString());
        }


        System.out.println("----------------------------------------------------------------------------");
    }
}
