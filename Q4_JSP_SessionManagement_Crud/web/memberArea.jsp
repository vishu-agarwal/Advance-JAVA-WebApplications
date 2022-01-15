<%-- 
    Document   : memberArea
    Created on : 8 Jan, 2022, 10:55:10 PM
    Author     : VISHAKHA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
        String suser = (String) session.getAttribute("s_user");
        if (suser == null)
        {
            //out.println("session is null");
            response.sendRedirect("login.jsp");
        }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Member Page</title>
    </head>
    <body>
        <h1> Welcome </h1>
        <%=session.getAttribute("s_user") %>
        <a href = "display.jsp">DisplayData</a>
        <a href = "logout.jsp">Logout</a>
    </body>
</html>
