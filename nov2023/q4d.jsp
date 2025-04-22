<%@ page import="java.util.*" %>
<html>
<head><title>Factorial Calculator</title></head>
<body>
    <form method="post">
        Enter Number: <input type="text" name="num">
        <input type="submit" value="Calculate Factorial">
    </form>

<%
    String numStr = request.getParameter("num");
    if (numStr != null) {
        int num = Integer.parseInt(numStr);
        long factorial = 1;
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        out.println("<h2>Factorial of " + num + " is: " + factorial + "</h2>");
    }
%>
</body>
</html>
