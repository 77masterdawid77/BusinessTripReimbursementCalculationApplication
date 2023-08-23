document.addEventListener("DOMContentLoaded", function() {
    const loginForm = document.getElementById("login-form");

    loginForm.addEventListener("submit", function(event) {
        event.preventDefault();

        const username = document.getElementById("username").value;
        const password = document.getElementById("password").value;

        // Perform authentication logic here (replace with your actual logic)
        if (username === "admin" && password === "adminpass") {
            // Redirect to admin.html if user is an admin
            window.location.href = "admin.html";
        } else if (username === "user" && password === "userpass") {
            // Redirect to user.html if user is a regular user
            window.location.href = "user.html";
        } else {
            alert("Invalid username or password. Please try again.");
        }
    });
});
