# Accounting Ledger App

The FinancialTracker class is a Java program that enables the user to keep track of their finances by recording deposits and payments. It uses a CSV file to store transaction data and a TransactionManager class to handle transactions.

## Functionality

The main method consists of a loop that prompts the user to choose an option and then calls the relevant methods based on the user's selection. The program provides the following features:

- **Add deposit**: enables the user to record a deposit by inputting the transaction details, which are stored as a HashMap. The createTransaction method creates a new Transaction object from the HashMap containing the transaction details, and the addTransactionToCSV method adds the transaction to the CSV file.

- **Make payment**: allows the user to record a payment by inputting the transaction details, which are then stored as a HashMap. The createTransaction method creates a new Transaction object from the HashMap containing the transaction details, and the addTransactionToCSV method adds the transaction to the CSV file.

- **Display ledger**: displays a list of all transactions in the TransactionManager.

- **Exit program**: enables the user to exit the program.

## CSV file

The program uses a CSV file to store transaction data. The updateTransactionCSV method updates the CSV file with a list of transactions, and the readTransactionsFromCSV method reads transactions from the CSV file and adds them to the TransactionManager.

## Conclusion

The Accounting Ledger App provides a simple yet effective way for users to keep track of their finances. With its user-friendly interface and easy-to-use functionality, users can easily manage their finances and stay on top of their financial transactions.
