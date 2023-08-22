document.addEventListener("DOMContentLoaded", function() {
    const loginForm = document.getElementById("login-form");

    loginForm.addEventListener("submit", function(event) {
        event.preventDefault();

        const username = document.getElementById("username").value;
        const password = document.getElementById("password").value;

        // Replace these conditions with your actual login logic
        if (username === "user123" && password === "user_password") {
            window.location.href = "user.html"; // Redirect to user.html
        } else if (username === "admin456" && password === "admin_password") {
            window.location.href = "admin.html"; // Redirect to admin.html
        } else {
            alert("Invalid username or password");
        }
    });
});
