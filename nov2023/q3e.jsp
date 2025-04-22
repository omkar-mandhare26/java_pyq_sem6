<%@ page import="java.util.*" %>
<html>
<head><title>Prime Numbers</title></head>
<body>
    <form method="post">
        Enter N: <input type="text" name="n">
        <input type="submit" value="Display Prime Numbers">
    </form>

<%
    String nStr = request.getParameter("n");
    if (nStr != null) {
        int N = Integer.parseInt(nStr);
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= N-1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                out.print(i + " ");
            }
        }
    }
%>
</body>
</html>
