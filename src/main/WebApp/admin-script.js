document.addEventListener('DOMContentLoaded', function () {
    // Retrieve elements
    const saveSettingsButton = document.getElementById('saveSettingsButton');
    const dailyAllowanceRateInput = document.getElementById('dailyAllowanceRate');
    const carMileageRateInput = document.getElementById('carMileageRate');

    // Attach change event listeners to input fields
    dailyAllowanceRateInput.addEventListener('change', updateTotalReimbursement);
    carMileageRateInput.addEventListener('change', updateTotalReimbursement);

    // Function to update the total reimbursement in user.html
    function updateTotalReimbursement() {
        const dailyAllowanceRate = parseFloat(dailyAllowanceRateInput.value);
        const carMileageRate = parseFloat(carMileageRateInput.value);
        const totalReimbursementOutput = document.getElementById('totalReimbursement');

        // Calculate and display the updated total reimbursement amount
        const totalReimbursement = dailyAllowanceRate + carMileageRate;
        totalReimbursementOutput.textContent = totalReimbursement.toFixed(2);
    }

    // Call the updateTotalReimbursement function initially to set the values
    updateTotalReimbursement();
});
