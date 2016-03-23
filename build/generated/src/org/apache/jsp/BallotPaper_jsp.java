package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import databaseconnection.*;

public final class BallotPaper_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Check Voter Id</title>\n");
      out.write("        <link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div id=\"templatemo_header_wrapper\">\n");
      out.write("    <div id=\"templatemo_header\">\n");
      out.write("    \t<div id=\"site_title\">\n");
      out.write("            <h1><a>\n");
      out.write("                <img src=\"images/templatemo_logo.png\" alt=\"Site Title\" />\n");
      out.write("                <span>\"Suffrage is the pivotal right.\" </span>\n");
      out.write("                </a></h1>\n");
      out.write("        </div>\n");
      out.write("        <p></p>\n");
      out.write("        <p></p>\n");
      out.write("        <p>By voting, we add our voice to the chorus that forms opinions and the basis for actions.</p>\n");
      out.write("        <p>“A man without a vote is a man without protection.” </p>\n");
      out.write("    \n");
      out.write("    </div> <!-- end of templatemo_header -->\n");
      out.write("\n");
      out.write("</div> <!-- end of templatemo_menu_wrapper -->\n");
      out.write("\n");
      out.write("<div id=\"templatemo_menu_wrapper\">\n");
      out.write("    <div id=\"templatemo_menu\">\n");
      out.write("        \n");
      out.write("         <ul>\n");
      out.write("           <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"admin.jsp\">Adminstrator</a></li>\n");
      out.write("                    <li><a href=\"CheckVoterId.jsp\">Check VoterID</a></li>\n");
      out.write("                   <li><a href=\"newregistration.jsp\">New Registration</a></li>\n");
      out.write("                     <li><a href=\"#\">Check Votes</a></li>\n");
      out.write("                    <li><a href=\"#\">Parties</a></li>\n");
      out.write("                </ul>    \t\n");
      out.write("     \n");
      out.write("    </div> <!-- end of templatemo_menu -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"templatemo_content\">\n");
      out.write("    \n");
      out.write("    \t<div class=\"content_box\">\n");
      out.write("        \n");
      out.write("            <center> <marquee><h2><b>Welcome To Vote</b></h2></marquee></center>\n");
      out.write("            <div class=\"cleaner_h20\"></div>\n");
      out.write("            <form name=\"form\" action=\"check.jsp\" method=\"POST\">\n");
      out.write("    <table width=\"46%\" border=\"0\" align=\"center\"> \n");
      out.write("                ");

Connection con=null;
PreparedStatement stmt = null;
ResultSet rs = null;
String voterId=request.getParameter("txtVoterId");
char voted='N';
try {
con=databasecon.getconnection();
stmt = con.prepareStatement("select * from VoterDB where VOTED='"+voted+"' and VOTERID='"+voterId+"'");     
	   rs = stmt.executeQuery();
if(rs.next())  
{
	   out.println("Has Not Voted Yet");
		  
		  
      out.write("\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"48%\" align=\"center\" valign=\"middle\">Voter ID</td>\n");
      out.write("    <td width=\"52%\" align=\"left\" valign=\"middle\"><input type=\"text\" name=\"txtVoterId1\" value=\"\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("    <td align=\"left\" valign=\"middle\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\" valign=\"middle\">Password</td>\n");
      out.write("    <td align=\"left\" valign=\"middle\"><input type=\"password\" name=\"txtPassword\" value=\"\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td colspan=\"2\" align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("   <tr>\n");
      out.write("    <td colspan=\"2\" align=\"center\" valign=\"middle\">\n");
      out.write("        <input type=\"submit\" class=\"myButton\" name=\"submit\" id=\"submit\" value=\"SignIn\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td colspan=\"2\" align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td colspan=\"2\" align=\"center\" valign=\"middle\"><img src=\"images/img1.jpg\" width=\"418\" height=\"239\"  alt=\"\"/></td>\n");
      out.write("  </tr>\n");
      out.write("  ");

  	   }
else
{
   out.println("Has Voted");
}
     
	 }
	   catch(Exception e)
	   {
	     out.println(e.getMessage());
	   }
	   
	    
      out.write("\n");
      out.write("            </table> \n");
      out.write("            </form>     \n");
      out.write("         <div class=\"cleaner_h20\"></div>\n");
      out.write("\n");
      out.write("<div class=\"cleaner\"></div>\n");
      out.write("        </div><div class=\"content_box_bottom\"></div>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    </div> <!-- end of content -->\n");
      out.write("    \n");
      out.write("    <div class=\"cleaner\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"templatemo_footer_wrapper\">\n");
      out.write("\n");
      out.write("    <div id=\"templatemo_footer\">\n");
      out.write("    \n");
      out.write("        <ul class=\"footer_menu\">\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"admin.jsp\">Adminstrator</a></li>\n");
      out.write("                    <li><a href=\"member.jsp\">Check VoterID</a></li>\n");
      out.write("                    <li><a href=\"newregistration.jsp\">New Registration</a></li>\n");
      out.write("                     <li><a href=\"#\">Check Votes</a></li>\n");
      out.write("                    <li><a href=\"#\">Parties</a></li>\n");
      out.write("            </ul>\n");
      out.write("                \n");
      out.write("                Copyright © 2015 <a href=\"#\">Your Company Name</a> | \n");
      out.write("               </div>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("<div align=center>Online Voting System</div>\n");
      out.write("    </body>\n");
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
