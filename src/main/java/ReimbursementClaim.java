import java.util.List;

public class ReimbursementClaim {
    private String tripDate;
    private int numberOfDays;
    private double drivenDistance;
    private List<Receipt> receipts;
    private double totalReimbursement;

    public ReimbursementClaim(String tripDate, int numberOfDays, double drivenDistance, List<Receipt> receipts, double totalReimbursement) {
        this.tripDate = tripDate;
        this.numberOfDays = numberOfDays;
        this.drivenDistance = drivenDistance;
        this.receipts = receipts;
        this.totalReimbursement = totalReimbursement;
    }

    public String getTripDate() {
        return tripDate;
    }

    public void setTripDate(String tripDate) {
        this.tripDate = tripDate;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getDrivenDistance() {
        return drivenDistance;
    }

    public void setDrivenDistance(double drivenDistance) {
        this.drivenDistance = drivenDistance;
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }

    public double getTotalReimbursement() {
        return totalReimbursement;
    }

    public void setTotalReimbursement(double totalReimbursement) {
        this.totalReimbursement = totalReimbursement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trip Date: ").append(tripDate)
                .append(", Number of Days: ").append(numberOfDays)
                .append(", Driven Distance: ").append(drivenDistance)
                .append(", Receipts: ").append(receipts)
                .append(", Total Reimbursement: $").append(totalReimbursement);

        return sb.toString();
    }
}
