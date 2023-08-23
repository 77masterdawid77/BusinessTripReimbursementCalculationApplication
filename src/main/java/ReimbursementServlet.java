import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/reimbursement")
public class ReimbursementServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle GET request
        String action = request.getParameter("action");
        if ("getRate".equals(action)) {
            // Return the reimbursement rate
            double rate = 15.0; // Example: Initial rate of $15/day
            response.getWriter().write(Double.toString(rate));
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("Invalid action");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle POST request
        String action = request.getParameter("action");
        if ("updateRate".equals(action)) {
            String newRateStr = request.getParameter("newRate");
            if (newRateStr != null) {
                double newRate = Double.parseDouble(newRateStr);
                // Update the reimbursement rate
                // ... Your code to update the rate ...

                response.getWriter().write("Rate updated successfully");
            } else {
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                response.getWriter().write("Invalid new rate");
            }
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("Invalid action");
        }
    }
}
