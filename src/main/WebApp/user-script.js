document.addEventListener("DOMContentLoaded", function() {
    const claimForm = document.getElementById("claim-form");
    const totalReimbursement = document.getElementById("total-reimbursement");

    claimForm.addEventListener("submit", function(event) {
        event.preventDefault();

        const tripDate = document.getElementById("trip-date").value;
        const receiptType = document.getElementById("receipt-type").value;
        const receiptAmount = parseFloat(document.getElementById("receipt-amount").value);
        const numberOfDays = parseInt(document.getElementById("number-of-days").value) || 0;
        const drivenDistance = parseFloat(document.getElementById("driven-distance").value) || 0;

        // Calculate reimbursement
        const dailyAllowanceRate = 15.0;
        const mileageRate = 0.3;

        const dailyAllowanceReimbursement = dailyAllowanceRate * numberOfDays;
        const mileageReimbursement = mileageRate * drivenDistance;
        const receiptReimbursement = receiptAmount;

        const totalReimbursementAmount = dailyAllowanceReimbursement + mileageReimbursement + receiptReimbursement;

        // Display the total reimbursement amount
        totalReimbursement.textContent = `Total Reimbursement: $${totalReimbursementAmount.toFixed(2)}`;
    });
});
