package nov2023;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class q4e extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "root@123");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            out.println("<html><body>");
            out.println("<table border='1'>");
            out.println("<tr><th>Employee Number</th><th>Employee Name</th><th>Salary</th><th>Designation</th></tr>");

            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getInt("eno") + "</td>");
                out.println("<td>" + rs.getString("ename") + "</td>");
                out.println("<td>" + rs.getDouble("sal") + "</td>");
                out.println("<td>" + rs.getString("design") + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
            out.println("</body></html>");
            con.close();
        } catch (Exception e) {
            out.println("<h2>Error: " + e.getMessage() + "</h2>");
        }
    }
}
