$(document).ready(function() {
    // Get the current reimbursement rate
    $.ajax({
        type: "GET",
        url: "reimbursement?action=getRate",
        success: function(rate) {
            $("#currentRate").text(rate);
        },
        error: function() {
            $("#currentRate").text("Error retrieving rate");
        }
    });

    // Update the reimbursement rate
    $("#updateRateBtn").click(function() {
        var newRate = $("#newRate").val();

        $.ajax({
            type: "POST",
            url: "reimbursement?action=updateRate",
            data: { newRate: newRate },
            success: function(response) {
                $("#updateStatus").text(response);
            },
            error: function() {
                $("#updateStatus").text("Error updating rate");
            }
        });
    });
});
