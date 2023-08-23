import java.util.List;

public class AdminView {
    private User adminUser;

    public AdminView(User adminUser) {
        this.adminUser = adminUser;
    }

    public RateConfiguration configureRates(double dailyAllowanceRate, double mileageRate) {
        // Update the rate configuration
        RateConfiguration newRates = new RateConfiguration(dailyAllowanceRate, mileageRate);
        return newRates;
    }

    public void editReceiptTypes(List<String> availableReceiptTypes, String newReceiptType) {
        availableReceiptTypes.add(newReceiptType);
    }

    public void defineReimbursementLimits(ReimbursementClaim claim, double limit) {
        // Set the reimbursement limit for the claim
        claim.setTotalReimbursement(Math.min(claim.getTotalReimbursement(), limit));
    }


}
