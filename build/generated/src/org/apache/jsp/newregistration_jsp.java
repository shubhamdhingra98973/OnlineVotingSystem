package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import databaseconnection.*;

public final class newregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <title>Check Voter Id</title>\n");
      out.write("        <link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("         <script type=\"text/javascript\" src=\"md5.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"jcap.js\"></script>\n");
      out.write("    <script>\n");
      out.write("    function validation(){\n");
      out.write("        var id=document.ureg.txtId.value;\n");
      out.write("        var name=document.ureg.txtName.value;\n");
      out.write("        var ssno=document.ureg.txtSsno.value;\n");
      out.write("        var add=document.ureg.txtAddress.value;\n");
      out.write("        var city=document.ureg.txtCity.value;\n");
      out.write("        var state=document.ureg.txtState.value;\n");
      out.write("        var country=document.ureg.txtCountry.value;\n");
      out.write("        var mobile=document.ureg.txtMobileNo.value;\n");
      out.write("        var email=document.ureg.txtEmail.value;\n");
      out.write("        var idmark=document.ureg.txtIdMark.value;\n");
      out.write("        var pass=document.ureg.txtPassword.value;\n");
      out.write("        \n");
      out.write("        if(id==0){\n");
      out.write("            alert(\"Enter Vote Id\");\n");
      out.write("            document.ureg.txtId.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(name==0){\n");
      out.write("            alert(\"Enter Name\");\n");
      out.write("            document.ureg.txtName.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(ssno==0){\n");
      out.write("            alert(\"Enter Ssno\");\n");
      out.write("            document.ureg.txtSsno.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(add==0){\n");
      out.write("            alert(\"Enter Address\");\n");
      out.write("            document.ureg.txtAddress.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(city==0){\n");
      out.write("            alert(\"Enter City\");\n");
      out.write("            document.ureg.txtCity.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(state==0){\n");
      out.write("            alert(\"Enter State\");\n");
      out.write("            document.ureg.txtState.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(country==0){\n");
      out.write("            alert(\"Enter Country\");\n");
      out.write("            document.ureg.txtCountry.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(mobile==0){\n");
      out.write("            alert(\"Enter Mobile No.\");\n");
      out.write("            document.ureg.txtMobileNo.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(email==0){\n");
      out.write("            alert(\"Enter Email Id\");\n");
      out.write("            document.ureg.txtEmail.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("         if(idmark==0){\n");
      out.write("            alert(\"Enter Mobile No.\");\n");
      out.write("            document.ureg.txtIdMark.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(pass==0){\n");
      out.write("            alert(\"Enter Email Id\");\n");
      out.write("            document.ureg.txtPassword.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("</script>\n");
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
      out.write("           <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"admin.jsp\">Adminstrator</a></li>\n");
      out.write("                    <li><a href=\"CheckVoterId.jsp\">Check VoterID</a></li>\n");
      out.write("                    <li><a href=\"newregistration.jsp\">New Registration</a></li>\n");
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
      out.write("            <center> <marquee><h2><b>New Voter Registration</b></h2></marquee></center>\n");
      out.write("           \n");
      out.write("            <div class=\"cleaner_h20\"></div>\n");
      out.write("            <form name=\"ureg\" action=\"register.jsp\" method=\"POST\" onclick=\"validation()\">\n");
      out.write("         <font size=\"+1\">\n");
      out.write("          <table width=\"90%\" border=\"0\" align=\"center\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"35%\" rowspan=\"21\" align=\"center\" valign=\"middle\">\n");
      out.write("        <img src=\"images/rainbow_voting_image.jpg\" width=\"300\" height=\"280\"  alt=\"\"/></td>\n");
      out.write("    <td width=\"10%\" align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("    <td width=\"18%\" align=\"center\" valign=\"middle\">Voter ID</td>\n");
      out.write("    <td colspan=\"2\" align=\"left\" valign=\"middle\"> \n");
      out.write("        <input type=\"text\" name=\"txtId\" value=\"\" />\n");
      out.write("    </td>\n");
      out.write("  </tr><br>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("    <td align=\"center\" valign=\"middle\">Voter Name</td>\n");
      out.write("    <td colspan=\"2\" align=\"left\" valign=\"middle\">\n");
      out.write("         <input type=\"text\" name=\"txtName\" value=\"\" />\n");
      out.write("    </td>\n");
      out.write("  </tr><br>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("    <td align=\"center\" valign=\"middle\">SSNo.</td>\n");
      out.write("    <td colspan=\"2\" align=\"left\" valign=\"middle\">\n");
      out.write("         <input type=\"text\" name=\"txtSsno\" value=\"\" />\n");
      out.write("    </td>\n");
      out.write("  </tr><br>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("    <td align=\"center\" valign=\"middle\">Address</td>\n");
      out.write("    <td colspan=\"2\" align=\"left\" valign=\"middle\">\n");
      out.write("         <input type=\"text\" name=\"txtAddress\" value=\"\" />\n");
      out.write("    </td>\n");
      out.write("  </tr><br\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("    <td align=\"center\" valign=\"middle\">City</td>\n");
      out.write("    <td colspan=\"2\" align=\"left\" valign=\"middle\">\n");
      out.write("         <input type=\"text\" name=\"txtCity\" value=\"\" />\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("    <td align=\"center\" valign=\"middle\">State</td>\n");
      out.write("    <td colspan=\"2\" align=\"left\" valign=\"middle\">\n");
      out.write("         <input type=\"text\" name=\"txtState\" value=\"\" />\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("    <td align=\"center\" valign=\"middle\">Country</td>\n");
      out.write("    <td colspan=\"2\" align=\"left\" valign=\"middle\">\n");
      out.write("         <input type=\"text\" name=\"txtCountry\" value=\"\" />\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("    <td align=\"center\" valign=\"middle\">Mobile No.</td>\n");
      out.write("    <td colspan=\"2\" align=\"left\" valign=\"middle\">\n");
      out.write("         <input type=\"text\" name=\"txtMobileNo\" value=\"\" />\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("    <td align=\"center\" valign=\"middle\">E-Mail</td>\n");
      out.write("    <td colspan=\"2\" align=\"left\" valign=\"middle\"><input type=\"text\" name=\"txtEmail\" value=\"\" /></td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("    <td align=\"center\" valign=\"middle\">ID Mark</td>\n");
      out.write("    <td colspan=\"2\" align=\"left\" valign=\"middle\"><input type=\"text\" name=\"txtIdMark\" value=\"\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("    <td align=\"center\" valign=\"middle\">Password</td>\n");
      out.write("    <td colspan=\"2\" align=\"left\" valign=\"middle\"><input type=\"password\" name=\"txtPassword\" value=\"\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td colspan=\"4\" align=\"center\" valign=\"middle\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("         <center>\n");
      out.write("  <fieldset>\n");
      out.write("    <p>Enter code and select respected image:</p> <br>\n");
      out.write("\n");
      out.write("        <input type=\"hidden\" id=\"txt\" value=\"\" name=\"txt\"/>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\"> sjcap();</script><br></br>\n");
      out.write("    </fieldset>\n");
      out.write("             <br>\n");
      out.write("         <input type=\"submit\" onclick=\"return jcap3();\" value=\"SUBMIT\" class=\"myButton\"><br></br>                                                         \n");
      out.write("         <input type=\"reset\" value=\"RESET\" class=\"myButton\"> \n");
      out.write("         </center>\n");
      out.write("         </font>\n");
      out.write("            </form>\n");
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
      out.write("\n");
      out.write("<div id=\"templatemo_footer_wrapper\">\n");
      out.write("\n");
      out.write("    <div id=\"templatemo_footer\">\n");
      out.write("    \n");
      out.write("        <ul class=\"footer_menu\">\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
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
