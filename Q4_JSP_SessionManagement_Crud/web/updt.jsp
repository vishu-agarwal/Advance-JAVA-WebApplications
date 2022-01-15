<%-- 
    Document   : updt
    Created on : 9 Jan, 2022, 10:37:22 AM
    Author     : VISHAKHA
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
      Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaexample1?zeroDateTimeBehavior=convertToNull","root","");
            Statement st = cn.createStatement();
                String no = request.getParameter("txtid");
                    String name = request.getParameter("txtName");
                   String add = request.getParameter("txtAddress");

                   String user = request.getParameter("txtUser");
                   String pswd = request.getParameter("txtPswd");
                   int idn = Integer.parseInt(no);
                   
                   String sql1 = "update tblstudent set name = '"+name + "',address = '"+add+"',email = '"+user+"',password = '"+pswd+"' where id = "+idn;
                    out.println(sql1);
                    st.executeUpdate(sql1);
                      response.sendRedirect("display.jsp");
        
   %>

