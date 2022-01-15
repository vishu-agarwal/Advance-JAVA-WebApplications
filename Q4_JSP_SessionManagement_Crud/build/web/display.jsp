<%-- 
    Document   : display
    Created on : 8 Jan, 2022, 10:54:46 PM
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
            
            %>

<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Page</title>
        <script type="text/javascript">
//function del()
//{
//        if(confirm("Do You Want to Delete this Ingredient?"))
//        {
//       
//        }
//        else
//        {
//               return false;
//        }
//}
</script>
    </head>
    <body>
         <% 
//                int idno = Integer.parseInt(request.getParameter("idno"));
        //        if (idno != 0)
        //        {
        //            String del = request.getParameter("d");
        //          if ("yes".equals(d))   
        //          {
        //              String sql2 = "delete from tblstudent where id= "+idno;
        //              out.println(sql2);
        //              //st.executeUpdate(sql1);
        //          }
        //        }
        %>
        <h1>Display Page</h1>
        
        
          
              <table border="3" width="1">
                  <thead>
                      <tr>
                          <th>Name</th>
                          <th>Address</th>
                          <th>UserName</th>
                          <th>Password</th>
                          <th>Update</th>
                          <th>Delete</th>
                          <th></th>
                      </tr>
                  </thead>
                  <tbody>
                      <%
//     Class.forName("com.mysql.jdbc.Driver");
//            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaexample1?zeroDateTimeBehavior=convertToNull","root","");
//            Statement st = cn.createStatement();
            String sql1 = "select * from tblstudent ";
            out.println(sql1);
            ResultSet rs = st.executeQuery(sql1);
         
                 while (rs.next()) { %>
                      <tr>
                          <td><%= rs.getString(2) %></td>
                          <td><%= rs.getString(3) %></td>
                          <td><%= rs.getString(4) %></td>
                          <td><%= rs.getString(5) %></td>
                        <td> <a href = "Add_Update_Delete.jsp?idno=<%= rs.getString(1) %>">Update</a></td>
                          <td> <a href = "Add_Update_Delete.jsp?d=yes&idno=<%= rs.getString(1) %>">Delete</a></td>
<!--                          <td> <input type="submit" value="Update" name="btnupdt" /></td>
                          <td><input type="submit" value="Delete" name="btndlt" /></td>-->
                         
                          <td></td>
                      </tr>
                   <% } %>
                  </tbody>
              </table>

           </body>
</html>
