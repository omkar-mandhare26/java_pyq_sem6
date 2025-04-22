package apr2022;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class q4d_addNumbers extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int n1 = Integer.parseInt(request.getParameter("num1"));
        int n2 = Integer.parseInt(request.getParameter("num2"));
        int sum = n1 + n2;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2 style='color:blue;'>Addition = " + sum + "</h2>");
        out.println("</body></html>");
    }
}
