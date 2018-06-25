package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");

response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
if(session.getAttribute("voter_id")==null || session.getAttribute("voter_id")=="")
{
    response.sendRedirect("login.jsp");
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("      <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>E-Voting System</title>\n");
      out.write("\t<!-- BOOTSTRAP STYLES-->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- FONTAWESOME STYLES-->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- MORRIS CHART STYLES-->\n");
      out.write("    <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CUSTOM STYLES-->\n");
      out.write("    <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- GOOGLE FONTS-->\n");
      out.write("   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("     ");

try {
/* Create string of connection url within specified format with machine
name, port number and database name. Here machine name id localhost and 
database name is student. */
String connectionURL = "jdbc:mysql://localhost:3306/db_evoting?zeroDateTimeBehavior=convertToNull";
// declare a connection by using Connection interface
Connection connection = null;
/* declare object of Statement interface that is used for executing sql 
statements. */
Statement statement = null;
Statement statement2 = null;
Statement statement7 = null;
Statement statement8 = null;
Statement statement9 = null;
// declare a resultset that uses as a table for output data from tha table.
ResultSet rs = null;
ResultSet rs2 = null;
ResultSet rs3 = null;
ResultSet rs4 = null;
ResultSet rs5 = null;
// Load JBBC driver "com.mysql.jdbc.Driver"
Class.forName("com.mysql.jdbc.Driver").newInstance();
/* Create a connection by using getConnection() method that takes parameters 
of string type connection url, user name and password to connect to database.*/
connection = DriverManager.getConnection(connectionURL, "root", "");
/* createStatement() is used for create statement object that is used for 
sending sql statements to the specified database. */
statement = connection.createStatement();
// sql query to retrieve values from the secified table.
int tmp_cand=0;
                                   int tmp_party=0;
                                   int tmp_vote=0;
                                   //int tmp_par = 0;
    
      out.write("\n");
      out.write("    ");

    String QueryString3 = "SELECT * from tbl_voters where id="+session.getAttribute("voter_id");
    rs3 = statement.executeQuery(QueryString3);
    

    
    
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">E-Voting System</a> \n");
      out.write("            </div>\n");
      out.write("  <div style=\"color: white;\n");
      out.write("padding: 15px 50px 5px 50px;\n");
      out.write("float: right;\n");
      out.write("font-size: 16px;\">\n");
      out.write("      ");

          String district = "";
          String state = "";
          int region_id=0;
          while(rs3.next())
          {
              region_id = rs3.getInt("region_id");
              break;
          }
          
          // get state & district from region table
          //statement = connection.createStatement();
          String QueryString5 = "SELECT * from tbl_region where id="+region_id;
          rs5 = statement.executeQuery(QueryString5);
          while(rs5.next())
          {
              district = rs5.getString("district");
              state = rs5.getString("state");
          }
          
      
      out.write("\n");
      out.write("      <a href=\"");
      out.print(request.getContextPath());
      out.write("/userlogout\" class=\"btn btn-danger square-btn-adjust\">Logout</a> </div>\n");
      out.write("        </nav>   \n");
      out.write("           <!-- /. NAV TOP  -->\n");
      out.write("                 <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\t\t\t\t<li class=\"text-center\">\n");
      out.write("                    <img src=\"assets/img/find_user.png\" class=\"user-image img-responsive\"/>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("                        <a  class=\"active-user\" href=\"myprofile.jsp\"><i class=\"fa fa-user fa-3x\"></i> My Profile</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a  class=\"active-menu\"  href=\"index.jsp\"><i class=\"fa fa-table fa-3x\"></i> Dashboard</a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </nav>  \n");
      out.write("        <!-- /. NAV SIDE  -->\n");
      out.write("        <div id=\"page-wrapper\" >\n");
      out.write("        \n");
      out.write("            <h3 class=\"h3\"> Running Vote : </h3>\n");
      out.write("            <table class=\"table table-bordered table-striped table-hover\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Election name</th>\n");
      out.write("                        <th>State</th>\n");
      out.write("                        <th>District</th>\n");
      out.write("                        <th>Last Date</th>\n");
      out.write("                        <th>Status</th>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    \n");
      out.write("                     ");

                         statement = connection.createStatement();
                         
String QueryString = "SELECT * from elections where status=0 and (district='"+district+"' and state='"+state+"') or (district='' and state='"+state+"') order by ldate";
rs = statement.executeQuery(QueryString);
int regg=0;
int c=0;
int rs_cid1 = 0;
            while (rs.next()) {
                c = 0;
         statement = connection.createStatement();
                         
String sqll = "SELECT count(*) from tbl_candidatefromregion where election_id="+rs.getInt("id")+" and region_id="+region_id;
ResultSet rss = statement.executeQuery(sqll);

while(rss.next())
{
    regg = rss.getInt(1);
}
if(regg > 0)
{

      out.write("              \n");
      out.write("\n");
      out.write("\n");
      out.write("                  ");

                         try{
                             
                         
                         statement2 = connection.createStatement();
                        String QueryString4 = "SELECT count(*) from tbl_vote where voter_id="+session.getAttribute("voter_id")+" and election_id="+rs.getString(1);
                        rs4 = statement2.executeQuery(QueryString4);

            while (rs4.next()) {
                if(Integer.parseInt(rs4.getString(1))>0)
                    c = 1;
                
            }
            rs4.close();
            statement2.close();
                        }
                         catch(Exception e){
                            out.print("Error");
                        }

      out.write("\n");
      out.write("                     <tr>\n");
      out.write("                        <td >");
      out.print(rs.getString("ename"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("state"));
      out.write("</td>\n");
      out.write("                        <td>");

                            if(rs.getString("district")=="" || rs.getString("district").isEmpty())
                                out.print("All");
                             else
                                out.print(rs.getString("district"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("ldate"));
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            ");

                                if(c > 0)
                                {
                                
      out.write("\n");
      out.write("                            <span class=\"badge badge-primary\" >Thanks for Voting</span>\n");
      out.write("                        ");

                                }else{
                        
      out.write("\n");
      out.write("                        <span class=\"badge badge-primary\" ><a href=\"vote_page.jsp?eid=");
      out.print(rs.getString(1));
      out.write("&rid=");
      out.print(region_id);
      out.write("\" class=\"btn btn-success\">Click here to Vote</a></span>\n");
      out.write("                        \n");
      out.write("                        ");

                                }
                        
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("           ");
 }
}
           
      out.write("         \n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("        <h3 class=\"h3\"> Recent Results : </h3>\n");
      out.write("            <table class=\"table table-bordered table-striped table-hover\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"col-md-1\">Election name</th>\n");
      out.write("                        <th class=\"col-md-2\">Last Date</th>\n");
      out.write("                        <th class=\"col-md-4\">Result</th>\n");
      out.write("                        <th class=\"col-md-5\">Overall</th>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    \n");
      out.write("                        <!-----------------------  Result by region---------------------------->    \n");
      out.write("                     ");

String QueryString2 = "SELECT * from elections where status=1 and (district='"+district+"' and state='"+state+"') or (district='' and state='"+state+"') order by ldate desc";
rs2 = statement.executeQuery(QueryString2);

            while (rs2.next()) {
                
            
            statement = connection.createStatement();
            String query_vote2 = "SELECT candidate_id FROM `tbl_vote` WHERE voter_id="+session.getAttribute("voter_id");
            ResultSet rs_vote2 = statement.executeQuery(query_vote2);
           
            int candi=0;
             String rid = "";
                while(rs_vote2.next()){
                    candi = rs_vote2.getInt("candidate_id");
                }


                                    statement = connection.createStatement();
                                    String query_region = "SELECT region_id from tbl_candidatefromregion where candidate_id="+candi;
                                    ResultSet rs_region = statement.executeQuery(query_region);
                                    int party = 0;
                                    while(rs_region.next()){
                                        rid += "region_id="+rs_region.getInt("region_id")+" or ";
                                        //party = rs_region.getInt("party_id");
                                    }
                                
                                    rid = rid.substring(0, rid.length()-4);
                                


      out.write("\n");
      out.write("\n");
      out.write("                     <tr>\n");
      out.write("                        <td >");
      out.print(rs2.getString("ename"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs2.getString("ldate"));
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                        <td>\n");
      out.write("                        <!-----------------------  Result by region---------------------------->    \n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                ");

                             int cc=0;
                             int ccc=0;
                             int cid=0;
                             int voteCandiate=0;
                            
                            int total = 0;
statement = connection.createStatement();
            String query_vote = "SELECT candidate_id,COUNT(*),party_id FROM `tbl_vote` WHERE "+rid+" and election_id="+rs2.getInt("id")+" GROUP by candidate_id";
            ResultSet rs_vote = statement.executeQuery(query_vote);
           
                             while(rs_vote.next())
                            {
                                voteCandiate=0;
                                if(cc==0){
                                   // cid=rs_vote.getInt("candidate_id");
        
                                
                            statement = connection.createStatement();
                            String query_totVote = "SELECT count(*) FROM `tbl_vote` where election_id="+rs2.getInt("id")+" and "+rid;
                            ResultSet rs_totVote = statement.executeQuery(query_totVote);

                                while(rs_totVote.next())
                                    total = rs_totVote.getInt(1);
                               }
                               
                               //rs_totVote.close();
                               ccc=1;
                               
                               voteCandiate = rs_vote.getInt(2);
                               double vc = voteCandiate;
                               double votePercent = (vc/total)*100;
                                
      out.write("\n");
      out.write("                       <div class=\"progress\">\n");
      out.write("  <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"");
      out.print(votePercent);
      out.write("\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: ");
      out.print(votePercent);
      out.write("%\">\n");
      out.write("    <span class=\"sr-only\">40% Complete (success)</span>\n");
      out.write("    ");

   ////////////////// get party name////////////////////////////////////////
                          
                            
                            statement = connection.createStatement();
                            String query_pname2 = "SELECT name from tbl_party where id="+rs_vote.getInt("party_id");
                            ResultSet rs_pname2 = statement.executeQuery(query_pname2);
                            while(rs_pname2.next()){
                                    out.print(rs_pname2.getString("name"));
                            }
                                out.print(" ("+rs_vote.getInt(2)+" Votes)");
                            
    
      out.write("\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("                           </div>\n");
      out.write("                           ");
 
                               
                           }
                           
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                           <td>\n");
      out.write("                               ");

                                
                                   
                            statement = connection.createStatement();
                            String sql_totvote = "SELECT count(*) FROM `tbl_vote` WHERE election_id="+rs2.getInt("id");
                            ResultSet rs_totvote = statement.executeQuery(sql_totvote);
                            int totVote = 0;
                            while(rs_totvote.next())
                            {
                                totVote = rs_totvote.getInt(1);
                            }
                            
                            statement7 = connection.createStatement();
                            String sql_vote = "SELECT party_id,count(*) FROM `tbl_vote` WHERE election_id="+rs2.getInt("id")+" group by party_id";
                            ResultSet rs_vote1 = statement7.executeQuery(sql_vote);
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                \n");
      out.write("                            ");

                            int winner = 0;
                            String party_name="";
                            String winner_party = "";
                            while(rs_vote1.next())
                            {
                               double vp = rs_vote1.getInt(2);
                               double votePercent2 = (vp/totVote)*100;
                                
      out.write("\n");
      out.write("                                \n");
      out.write("                       <div class=\"progress\">\n");
      out.write("  <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"");
      out.print(votePercent2);
      out.write("\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: ");
      out.print(votePercent2);
      out.write("%\">\n");
      out.write("    <span class=\"sr-only\">40% Complete (success)</span>\n");
      out.write("    \n");
      out.write("                            ");

                            statement = connection.createStatement();
                            String query_pname3 = "SELECT name from tbl_party where id="+rs_vote1.getInt("party_id");
                            ResultSet rs_pname3 = statement.executeQuery(query_pname3);
                            while(rs_pname3.next()){
                                    party_name = rs_pname3.getString("name");
                            }
                            out.print(party_name);
                            if(rs_vote1.getInt(2)>winner)
                            {
                                winner = rs_vote1.getInt(2);
                                winner_party = party_name;
                            }
                                out.print(" ("+rs_vote1.getInt(2)+" Votes)");
                            
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>                          \n");
      out.write("  \n");
      out.write("                                ");

                            }
                               out.print("Winner : "+winner_party);
                               
      out.write("\n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("      \n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                     </tr>\n");
      out.write("           ");
 } 
           
           
      out.write("      \n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- /. PAGE INNER  -->\n");
      out.write("            </div>\n");
      out.write("         <!-- /. PAGE WRAPPER  -->\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  ");

// close all the connections.

statement.close();
connection.close();
} catch (Exception ex) {

      out.write('\n');

    out.println(ex);
out.println("Unable to connect to database.");
}
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <!-- /. WRAPPER  -->\n");
      out.write("    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\n");
      out.write("    <!-- JQUERY SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- METISMENU SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("     <!-- MORRIS CHART SCRIPTS -->\n");
      out.write("     <script src=\"assets/js/morris/raphael-2.1.0.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/morris/morris.js\"></script>\n");
      out.write("      <!-- CUSTOM SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
