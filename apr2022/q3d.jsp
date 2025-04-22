<%@ page import="java.io.*" %>
<html>
<head><title>Voter Check</title></head>
<body>
    <form method="post">
        Enter Name: <input type="text" name="name"><br><br>
        Enter Age: <input type="text" name="age"><br><br>
        <input type="submit" value="Check Eligibility">
    </form>

<%
    String name = request.getParameter("name");
    String ageStr = request.getParameter("age");

    if (name != null && ageStr != null) {
        int age = Integer.parseInt(ageStr);
        if (age >= 18) {
            out.println("<h2>" + name + " is eligible to vote.</h2>");
        } else {
            out.println("<h2>" + name + " is NOT eligible to vote.</h2>");
        }
    }
%>
</body>
</html>
