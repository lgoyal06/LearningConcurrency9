package java9.arrays;

public class Transaction {

public String transactionId;

    public Transaction(String transactionId, double transactionAmount) {
        this.transactionId = transactionId;
        this.transactionAmount = transactionAmount;
    }

    public double transactionAmount;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}

