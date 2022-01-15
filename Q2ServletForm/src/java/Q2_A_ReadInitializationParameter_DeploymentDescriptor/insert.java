/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2_A_ReadInitializationParameter_DeploymentDescriptor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VISHAKHA
 */
public class insert extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
         /*
            
            page1:

[a href="NewServlet?id=name&password=1234"/]
page2:

String a=request.getParameter("id");
String b=request.getParameter("password");
            
            */
         String a=request.getParameter("nm");
String b=request.getParameter("pwd");
String c=request.getParameter("adr");
String d=request.getParameter("unm");
//                Class.forName("com.mysql.jdbc.Driver");
out.println(getInitParameter("url"));
out.println(getInitParameter("unm"));

               String dburl = getServletConfig().getInitParameter("url");
               out.println(dburl);
               String unm = getServletContext().getInitParameter("uname");
               out.println(unm);
//             Connection cn = DriverManager.getConnection(dburl,unm,"");
//              Statement st = cn.createStatement();
               String sql1 = "insert into tblstudent values(0,'"+a + "','"+c+"','"+d+"','"+b+"')";
              out.println(sql1);
         //   st.executeUpdate(sql1);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>success</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>SuccessFully Inserted</h1>");
              out.println("<hr></hr>");
//              ServletConfig config = getServletConfig();// no need to write this line
//            ServletContext ctx = config.getServletContext();// no need to write this line
//            String dev = ctx.getInitParameter("developed");
//
//String dev = getServletContext().getInitParameter("developed");
//             out.println("<h4>Developed By::  " + dev + " </h4>");
//            out.println("</body>");
//            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
