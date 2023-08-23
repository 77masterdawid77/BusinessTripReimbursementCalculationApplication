import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // Simulate user and admin users
        User endUser = new User("user123", "user_password", "user");
        User adminUser = new User("admin456", "admin_password", "admin");

        // Simulate available receipt types
        List<String> availableReceiptTypes = new ArrayList<>();
        availableReceiptTypes.add("Taxi");
        availableReceiptTypes.add("Hotel");


        // Simulate rates configuration
        RateConfiguration rates = new RateConfiguration(15.0, 0.3);

        // Initialize user and admin views
        UserView userView = new UserView(endUser);
        AdminView adminView = new AdminView(adminUser);

        // Simulate user interactions
        ReimbursementClaim userClaim = userView.createReimbursementClaim("2023-08-21", 5, 200.0, new ArrayList<>(), rates);
        userView.addReceiptToClaim(userClaim, new Receipt("Taxi", 50.0));
        userView.addReceiptToClaim(userClaim, new Receipt("Hotel", 120.0));
        userView.addReceiptToClaim(userClaim, new Receipt("Plane Ticket", 300.0));
        double userReimbursement = userView.calculateReimbursement(userClaim, rates);

        // Simulate admin interactions
        adminView.editReceiptTypes(availableReceiptTypes, "Train");
        adminView.editReceiptTypes(availableReceiptTypes, "Bus");
        adminView.defineReimbursementLimits(userClaim, 500.0);

        // Start the web server and open the browser
        try {
            startWebServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    private static void startWebServer() throws IOException {
        int port = 8080;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        // Set up the context for serving static files
        HttpHandler staticHandler = exchange -> {
            URI requestUri = exchange.getRequestURI();
            String path = requestUri.getPath().equals("/") ? "/index.html" : requestUri.getPath();
            Path filePath = Paths.get("src/main/WebApp", path);

            if (Files.exists(filePath)) {
                byte[] fileContent = Files.readAllBytes(filePath);
                exchange.sendResponseHeaders(200, fileContent.length);
                exchange.getResponseBody().write(fileContent);
                exchange.getResponseBody().close();
            } else {
                String response = "File not found: " + path;
                exchange.sendResponseHeaders(404, response.getBytes().length);
                exchange.getResponseBody().write(response.getBytes());
                exchange.getResponseBody().close();
            }
        };

        server.createContext("/", staticHandler);

        // Start the server
        server.start();

        // Open the default web browser to the server's URL
        String serverUrl = "http://localhost:" + port;
        try {
            java.awt.Desktop.getDesktop().browse(new URI(serverUrl));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
