<%-- 
    Document   : login
    Created on : 8 Jan, 2022, 10:54:19 PM
    Author     : VISHAKHA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <%
                if (request.getParameter("invalid") != null)
                {
                    out.println("<h3 style = 'color : red'>invalid username and password......</h3> ");
                }
        %>
          <form name="chklogin" action="validate.jsp" method="POST">
            <table border="1">
               
                <tbody>
                 
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
                         <input type="submit" value="submit" name = "submit"/>
                        <input type="reset" value="Reset" name = "reset"/>
                        </td>
                       
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
