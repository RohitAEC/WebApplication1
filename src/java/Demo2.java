/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rocky
 */
public class Demo2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
 /*       try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Demo2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Demo2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
*/
 
 
     try  
           
                {
                    Class.forName("com.mysql.jdbc.Driver"); // MySQL database  connection
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_evoting?zeroDateTimeBehavior=convertToNull","root","");
                    Statement stmt=con.createStatement();
                    String s1="select ename,city from elections";
//String q1="insert into user_id values('"+fnm+"','"+fanm+"','"+mnm+"','+dob+','"+state+"','"+address+"','+pin+','"+pstn+"','"+email+"','+mob+','"+image+"')";
                    ResultSet rs =stmt.executeQuery(s1);
                    RequestDispatcher dp = request.getRequestDispatcher("index2.jsp");
                    String str1 = "";
                   while(rs.next())
                    {
                        str1+="<tr>\n" +
"                        <td></td>\n" +
"                        <td></td>\n" +
"                    </tr>";
                        //System.out.print("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2)+"<td></tr>");
                    
                    }
                    request.setAttribute("data1", str1);
                    dp.forward(request, response);
                    con.close();
                    
                }
             catch(Exception e)
                 
             {
                 System.out.println(e);
                    
                }
    } 
    
}
