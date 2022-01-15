<%-- 
    Document   : Add_Update_Delete
    Created on : 8 Jan, 2022, 10:55:48 PM
    Author     : VISHAKHA
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        String suser = (String) session.getAttribute("s_user");
        if (suser == null)
        {
            //out.println("session is null");
            response.sendRedirect("login.jsp");
        }
%>
     <%
     Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaexample1?zeroDateTimeBehavior=convertToNull","root","");
            Statement st = cn.createStatement();
            String abc = request.getParameter("idno");
            //out.print(abc);
            int idno = Integer.parseInt(abc);
          //  out.println(idno);
         
            if (idno != 0)
                {
                    String id = request.getParameter("d");
                  if ("yes".equals(id))   
                  {
                      String sql2 = "delete from tblstudent where id= "+idno;
                      out.println(sql2);
                      st.executeUpdate(sql2);
                      response.sendRedirect("display.jsp");
                  }
                  else
                  {
                      String sql2 = "select * from tblstudent where id= "+idno;
                      out.println(sql2);
                      //st.executeUpdate(sql2);
                       ResultSet rs = st.executeQuery(sql2);
         
               
                      %>
                     <!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Update !</h1>
        <form action="updt.jsp" method="POST">
       
        <%
          while (rs.next()) { %>
                      <tr>
                          <td><input type="hidden" name="txtid" value="<%= rs.getString(1) %>" /></td>
                          <td>Name :<input type="text" name="txtName" value="<%= rs.getString(2) %>" /></td>
                          <td>Address : <input type="text" name="txtAddress" value="<%= rs.getString(3) %>" /></td>
                          <td>Email : <input type="text" name="txtUser" value="<%= rs.getString(4) %>" /></td>
                          <td>Password : <input type="text" name="txtPswd" value="<%= rs.getString(5) %>" /></td>
                       
                          <td><input type="submit" value="Update" name = "btnupdt"/></td>
                      </tr>
                   <% }
         
                      
                  }
                }
else
{
out.print("id is null ");
}
            %>
 </form>
    </body>
    
</html>

