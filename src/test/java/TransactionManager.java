import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private final List<Transaction> transactions;

    public TransactionManager() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public void displayLedger() {
        System.out.println("Date       Time       Description            Vendor                Amount");

}
