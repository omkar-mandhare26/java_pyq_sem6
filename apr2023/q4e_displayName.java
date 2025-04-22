package apr2023;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class q4e_displayName {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        out.println("<html><body>");
        out.println("<h2>Hello, " + name + "!</h2>");
        out.println("</body></html>");
    }
}
