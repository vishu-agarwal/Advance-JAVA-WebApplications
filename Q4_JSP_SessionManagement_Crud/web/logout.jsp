<%-- 
    Document   : logout
    Created on : 8 Jan, 2022, 10:54:31 PM
    Author     : VISHAKHA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("login.jsp");
            %>
    </body>
</html>
