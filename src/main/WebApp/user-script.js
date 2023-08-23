document.addEventListener("DOMContentLoaded", function() {
    const savedDetailsBox = document.getElementById("savedDetailsBox");
    const calculatedAmount = document.getElementById("calculatedAmount");
    const addEntryButton = document.getElementById("addEntryButton");
    const clearEntriesButton = document.getElementById("clearEntriesButton");

    addEntryButton.addEventListener("click", function() {
        const tripDate = document.getElementById("tripDate").value;
        const receiptType = document.getElementById("receiptType").value;
        const dailyAllowance = parseFloat(document.getElementById("dailyAllowance").value) || 0;
        const disableDays = document.getElementById("disableDays").checked;
        const carDistance = parseFloat(document.getElementById("carDistance").value) || 0;

        // Calculate reimbursement for this entry
        let entryAmount = 0;
        if (!disableDays) {
            entryAmount += dailyAllowance;
        }
        entryAmount += carDistance * 0.3; // Assuming 0.3 $/km rate

        // Add entry details to the saved details box
        const entryDetails = `Date: ${tripDate}, Type: ${receiptType}, Amount: $${entryAmount.toFixed(2)}`;
        savedDetailsBox.innerHTML += `<p>${entryDetails}</p>`;

        // Update calculated total amount
        updateCalculatedAmount();
    });

    clearEntriesButton.addEventListener("click", function() {
        savedDetailsBox.innerHTML = "";
        calculatedAmount.textContent = "";
    });

    function updateCalculatedAmount() {
        const entryAmounts = Array.from(savedDetailsBox.querySelectorAll("p")).map(entry => {
            const amountMatch = entry.textContent.match(/Amount: \$([0-9.]+)/);
            return amountMatch ? parseFloat(amountMatch[1]) : 0;
        });

        const totalAmount = entryAmounts.reduce((sum, amount) => sum + amount, 0);
        calculatedAmount.textContent = `Total Reimbursement: $${totalAmount.toFixed(2)}`;
    }
});
