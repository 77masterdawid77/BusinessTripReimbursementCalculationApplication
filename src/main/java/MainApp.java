import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulate user and admin users
        User endUser = new User("user123", "user_password", "user");
        User adminUser = new User("admin456", "admin_password", "admin");

        System.out.println("Welcome to the Business Trip Reimbursement Application!");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User loggedInUser = authenticateUser(username, password, endUser, adminUser);

        if (loggedInUser != null) {
            System.out.println("Logged in as: " + loggedInUser.getUsername());

            if (loggedInUser.getRole().equals("user")) {
                // User interactions
                // Create views, perform actions, etc.
                // Example: UserView userView = new UserView(loggedInUser);
            } else if (loggedInUser.getRole().equals("admin")) {
                // Admin interactions
                // Create views, perform actions, etc.
                // Example: AdminView adminView = new AdminView(loggedInUser);
            }
        } else {
            System.out.println("Invalid username or password. Exiting.");
        }

        scanner.close();
    }

    private static User authenticateUser(String username, String password, User... users) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
