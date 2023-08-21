import java.util.List;

public class UserView {
    private User user;

    public UserView(User user) {
        this.user = user;
    }

    public ReimbursementClaim createReimbursementClaim(String tripDate, int numberOfDays, double drivenDistance, List<Receipt> receipts, RateConfiguration rates) {
        // Calculate reimbursement for daily allowance and mileage using the rates
        double dailyAllowanceReimbursement = user.hasRole("user") ? numberOfDays * rates.getDailyAllowanceRate() : 0;
        double mileageReimbursement = user.hasRole("user") ? drivenDistance * rates.getMileageRate() : 0;

        double totalReimbursement = dailyAllowanceReimbursement + mileageReimbursement;

        // Create a new claim instance
        ReimbursementClaim claim = new ReimbursementClaim(tripDate, numberOfDays, drivenDistance, receipts, totalReimbursement);
        return claim;
    }

    public void addReceiptToClaim(ReimbursementClaim claim, Receipt receipt) {
        claim.getReceipts().add(receipt);
    }

    public double calculateReimbursement(ReimbursementClaim claim, RateConfiguration rates) {
        // Calculate reimbursement based on receipts and configured rates
        double receiptReimbursement = claim.getReceipts().stream()
                .mapToDouble(receipt -> receipt.getAmount())
                .sum();

        return receiptReimbursement + claim.getTotalReimbursement();
    }

    // Other methods with the rates parameter
}
