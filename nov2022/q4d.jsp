<html>
<head><title>Greet</title></head>
<body>
    <form method="post">
        Enter Name: <input type="text" name="name"><br><br>
        <input type="submit" value="Greet">
    </form>

<%
    String name = request.getParameter("name");
    
    out.println("<h2>Hello " + name + " </h2>");
%>
</body>
</html>
