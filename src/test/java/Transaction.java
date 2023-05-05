import java.time.LocalDate;
import java.time.LocalTime;

// Define instance variables
public class Transaction {
    private LocalDate date;
    private LocalTime time;
    private String description;
    private String vendor;
    private double amount;

    // Constructor to initialize the instance variables
    public Transaction(LocalDate date, LocalTime time, String description, String vendor, double amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }


    // Override the toString() method to return a formatted string representation of the transaction

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", date.toString(), time.toString(), description, vendor, amount);
    }
}