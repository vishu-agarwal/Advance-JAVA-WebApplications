<%-- 
    Document   : validate
    Created on : 8 Jan, 2022, 10:54:58 PM
    Author     : VISHAKHA
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
        // get value from index page
        String uname = request.getParameter("txtUser");
        String upass = request.getParameter("txtPswd");
        out.println(upass);
        out.println(uname);
        //check in database user exists or naot
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaexample1?zeroDateTimeBehavior=convertToNull","root","");
            Statement st = cn.createStatement();
            String sql1 = "select * from tblstudent where email = '"+uname+"'and password = '"+upass+"' ";
            out.println(sql1);
            ResultSet rs = st.executeQuery(sql1);
         // out.println(rs.next());
            if (rs.next())
                {
                        
                    session.setAttribute("s_user", uname);
                    session.setAttribute("s_pass", upass);
                  //  out.println(rs.next());
                    response.sendRedirect("memberArea.jsp");
                }
                else
                {
                    response.sendRedirect("login.jsp?invalid=1");
                }
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
