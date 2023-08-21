public class Receipt {
    private String receiptType;
    private double amount;

    public Receipt(String receiptType, double amount) {
        this.receiptType = receiptType;
        this.amount = amount;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean validate() {
        return !receiptType.isEmpty() && amount >= 0;
    }

    @Override
    public String toString() {
        return "Receipt: " + receiptType + ", Amount: " + amount;
    }
}
