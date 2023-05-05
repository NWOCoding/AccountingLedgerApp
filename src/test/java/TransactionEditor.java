import java.io.*;
import java.util.*;

public class TransactionEditor {
    public static void main(String[] args) throws IOException {
        // Read the transaction.csv file into a List
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("transaction.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        // Create a HashMap to store the updated transaction data
        HashMap<String, String> transactionData = new HashMap<>();

        // Get user input for the updated transaction data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter transaction ID: ");
        String transactionId = scanner.nextLine();
        System.out.print("Enter transaction amount: ");
        String transactionAmount = scanner.nextLine();

        // Put the updated transaction data into the HashMap
        transactionData.put(transactionId, transactionAmount);

        // Update the transaction.csv file with the new data
        try (PrintWriter writer = new PrintWriter(new FileWriter("transaction.csv"))) {
            for (String line : lines) {
                String[] parts = line.split(",");
                String id = parts[0];
                if (transactionData.containsKey(id)) {
                    // Use the updated amount if available
                    writer.println(id + "," + transactionData.get(id));
                    transactionData.remove(id);
                } else {
                    // Otherwise, use the original data
                    writer.println(line);
                }
            }
            // Add any new transactions
            for (String id : transactionData.keySet()) {
                writer.println(id + "," + transactionData.get(id));
            }
        }

        System.out.println("Transaction updated successfully.");
    }
}
