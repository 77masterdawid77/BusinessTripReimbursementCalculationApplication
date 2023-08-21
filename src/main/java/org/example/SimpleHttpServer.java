package org.example;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

    public class SimpleHttpServer {
        public static void main(String[] args) throws IOException {
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
            server.createContext("/api/server", new UserHandler());
            server.setExecutor(null);
            server.start();
        }

        static class UserHandler implements HttpHandler {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                List<User> users = new ArrayList<>();
                users.add(new User(new User.Builder("user1", "pass1", false)));
                users.add(new User(new User.Builder("admin1", "pass1", true)));

                String response = "Available Users: \n\n" + users.get(0).getName() + "\n" + users.get(1).getName();

                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        }
    }
