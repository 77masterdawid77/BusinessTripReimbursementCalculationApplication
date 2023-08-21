function calculateReimbursement() {
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "C:\\Users\\44746\\IdeaProjects\\BusinessTripReimbursementCalculationApplication/reimbursement?action=calculateReimbursement", true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            var reimbursementAmount = xhr.responseText;
            // Update the UI with the reimbursement amount
        }
    };
    xhr.send();
}
