import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class FinancialTracker {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> transaction;
        TransactionManager transactionManager = new TransactionManager();

        while (true) {
            System.out.println("Financial Tracker\n");
            System.out.println("D) Add Deposit");
            System.out.println("P) Make Payment (Debit)");
            System.out.println("L) Ledger");
            System.out.println("X) Exit\n");

            System.out.print("Select an option: ");
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "D":
                    transaction = readTransactionFromUser("Deposit");
                    Transaction deposit = createTransaction(transaction);
                    transactionManager.addTransaction(deposit);
                    System.out.println("\nDeposit saved.\n");
                    break;
                case "P":
                    transaction = readTransactionFromUser("Payment");
                    Transaction payment = createTransaction(transaction);
                    transactionManager.addTransaction(payment);
                    System.out.println("\nPayment saved.\n");
                    break;
                case "L":
                    transactionManager.displayLedger();
                    break;
                case "X":
                    System.out.println("\nExiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid option. Please try again.\n");
                    break;
            }
        }
    }
    private static HashMap<String, String> readTransactionFromUser(String type) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> transaction = new HashMap<>();

        System.out.println("\nEnter " + type + " details:");
        System.out.print("Date (YYYY-MM-DD): ");


    }