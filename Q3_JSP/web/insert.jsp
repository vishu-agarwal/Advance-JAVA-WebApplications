<%-- 
    Document   : insert
    Created on : 8 Jan, 2022, 10:31:09 PM
    Author     : VISHAKHA
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

String a=request.getParameter("nm");
String b=request.getParameter("pwd");
String c=request.getParameter("adr");
String d=request.getParameter("unm");
                Class.forName("com.mysql.jdbc.Driver");

             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaexample1?zeroDateTimeBehavior=convertToNull","root","");
              Statement st = cn.createStatement();
               String sql1 = "insert into tblstudent values(0,'"+a + "','"+c+"','"+d+"','"+b+"')";
              out.println(sql1);
            Integer done = st.executeUpdate(sql1);
            if (done != 0)
            {
                out.println();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>success</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>SuccessFully Inserted</h1>");
              out.println("<hr></hr>");
            }
            else
            {
                out.println("<h1>Not Inserted</h1>");
            }
            
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
