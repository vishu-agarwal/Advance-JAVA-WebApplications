<%-- 
    Document   : JSP_Form
    Created on : 8 Jan, 2022, 10:28:00 PM
    Author     : VISHAKHA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <h1>Register Page</h1>
        <%
                if (request.getParameter("invalid") != null)
                {
                    out.println("<h3 style = 'color : red'>invalid username and password......</h3> ");
                }
        %>
          <form name="reg" action="reg.jsp" method="POST">
            <table border="1">
               
                 <tbody>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="txtName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><textarea name="txtAddress" rows="4" cols="10">
                            </textarea></td>
                    </tr>
                  
      
                    <tr>
                        <td>UserName</td>
                        <td><input type="text" name="txtUser" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="txtPswd" value="" /></td>
                    </tr>
                                        <tr>
                        <td></td>
                        <td>
                         <input type="submit" value="Submit" name = "submit"/>
                        <input type="reset" value="Clear" name = "reset"/>
                        </td>
                       
                    </tr>
                </tbody>

            </table>
        </form>
    </body>
</html>
