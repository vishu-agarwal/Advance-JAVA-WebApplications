<%-- 
    Document   : reg
    Created on : 8 Jan, 2022, 10:30:49 PM
    Author     : VISHAKHA
--%>

<%@page import="java.sql.*"%>
<%--<%@page errorPage= "error.jsp" %>--%>
<%--<%@page import="java.sql.Connection"%>--%>
<%--<%@page import="java.sql.DriverManager"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
      String name = request.getParameter("txtName");
        String add = request.getParameter("txtAddress");
     
        String user = request.getParameter("txtUser");
        String pswd = request.getParameter("txtPswd");
        
       out.println("<h1>Name :: "+name+"</h1>");
            out.println("<h1>passwsord :: "+add+"</h1>");
            out.println("<h1>Name :: "+user+"</h1>");
            out.println("<h1>passwsord :: "+pswd+"</h1>");
            
    out.println("<h2><a href =insert.jsp?nm="+name+"&adr="+add+"&unm="+user+"&pwd="+pswd+">CONFIRM</a></h2>");
    %>
<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check login</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>-->