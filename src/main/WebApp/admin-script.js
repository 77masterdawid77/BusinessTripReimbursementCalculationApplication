document.addEventListener('DOMContentLoaded', function () {
    // Retrieve elements
    const saveSettingsButton = document.getElementById('saveSettingsButton');
    const dailyAllowanceRateInput = document.getElementById('dailyAllowanceRate');
    const carMileageRateInput = document.getElementById('carMileageRate');
    const updateStatusDiv = document.getElementById('updateStatus');

    // Attach change event listeners to input fields
    dailyAllowanceRateInput.addEventListener('change', updateTotalReimbursement);
    carMileageRateInput.addEventListener('change', updateTotalReimbursement);

    // Attach click event listener to the "Save Settings" button
    saveSettingsButton.addEventListener('click', saveSettings);

    // Function to update the total reimbursement amount
    function updateTotalReimbursement() {
        const dailyAllowanceRate = parseFloat(dailyAllowanceRateInput.value);
        const carMileageRate = parseFloat(carMileageRateInput.value);
        const totalReimbursementOutput = document.getElementById('totalReimbursement');

        // Calculate and display the updated total reimbursement amount
        const totalReimbursement = dailyAllowanceRate + carMileageRate;
        totalReimbursementOutput.textContent = totalReimbursement.toFixed(2);
    }

    // Function to save the settings
    function saveSettings() {
        const settings = {
            dailyAllowanceRate: parseFloat(dailyAllowanceRateInput.value),
            carMileageRate: parseFloat(carMileageRateInput.value)

        };

        // Use AJAX to send the settings to the server
        $.ajax({
            type: 'POST',
            url: '/saveSettings', // Replace with the actual server endpoint
            data: JSON.stringify(settings),
            contentType: 'application/json',
            success: function (response) {
                updateStatusDiv.textContent = 'Settings saved successfully!';
            },
            error: function (error) {
                updateStatusDiv.textContent = 'Error saving settings.';
            }
        });
    }

    // Call the updateTotalReimbursement function initially to set the values
    updateTotalReimbursement();
});
