document.addEventListener("DOMContentLoaded", function() {
    const userForm = document.getElementById("userForm");
    const adminForm = document.getElementById("adminForm");

    const calculateButton = document.getElementById("calculateButton");
    calculateButton.addEventListener("click", calculateReimbursement);

    const saveAdminSettingsButton = document.getElementById("saveAdminSettings");
    saveAdminSettingsButton.addEventListener("click", saveAdminSettings);
});

function calculateReimbursement() {
    const tripDate = document.getElementById("tripDate").value;
    const receiptType = document.getElementById("receiptType").value;
    const receiptAmount = parseFloat(document.getElementById("receiptAmount").value);
    const numberOfDays = parseInt(document.getElementById("numberOfDays").value);
    const drivenDistance = parseFloat(document.getElementById("drivenDistance").value);

    // Perform calculations based on the inputs
    // You can implement the reimbursement calculation logic here

    // Example: Calculate total reimbursement based on rates and input values
    const dailyAllowanceRate = parseFloat(document.getElementById("dailyAllowanceRate").value);
    const mileageRate = parseFloat(document.getElementById("mileageRate").value);

    const dailyAllowanceReimbursement = dailyAllowanceRate * numberOfDays;
    const mileageReimbursement = mileageRate * drivenDistance;
    const totalReimbursement = receiptAmount + dailyAllowanceReimbursement + mileageReimbursement;

    // Display the total reimbursement
    document.getElementById("totalReimbursement").value = totalReimbursement.toFixed(2);
}

function saveAdminSettings() {
    // Get values from the admin form and perform necessary actions
    const dailyAllowanceRate = parseFloat(document.getElementById("dailyAllowanceRate").value);
    const mileageRate = parseFloat(document.getElementById("mileageRate").value);
    const receiptTypes = Array.from(document.getElementById("receiptTypes").selectedOptions).map(option => option.value);
    const reimbursementLimit = parseFloat(document.getElementById("reimbursementLimit").value);

    // Perform actions such as updating rates, receipt types, and reimbursement limits
    // You can implement the necessary logic here
}
