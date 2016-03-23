package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Online Voting System</title>\n");
      out.write("        <link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("           <div id=\"templatemo_content\">\n");
      out.write("    \n");
      out.write("    \t<div class=\"content_box\">\n");
      out.write("        \n");
      out.write("            <center> <marquee><h2><b>Welcome to Online Voting System</b></h2></marquee></center>\n");
      out.write("            \n");
      out.write("            <p> Election day is one of the most exciting days of the year. Our nation comes together to elect a leader who will represent us on the global stage for the next four years. We will elect a leader that will stand for our rights as citizens, students, employees and employers. We will elect a leader that will hopefully keep their promises. Sounds like a big decision, doesn't it?\n");
      out.write("\n");
      out.write("It is a big decision, and this election marks a pivotal point in our nation's history. Currently, there are two very distinct paths our country will choose from and it is more important than ever to cast a vote in this election.\n");
      out.write("            \n");
      out.write("      </p>\n");
      out.write("      <center><p><b><font color=\"red\" size=\"+1\"> 10 Reasons Why People Have To Do Vote</font></b></p></center>\n");
      out.write("           \n");
      out.write("          <div class=\"cleaner_h20\"></div>\n");
      out.write("          <table align=\"center\">\n");
      out.write("              <thead>\n");
      out.write("                  <tr>\n");
      out.write("                      <th valign=\"top\"> <img src=\"images/vote.png\" height=\"180px\" width=\"350px\" alt=\"image\" /></th>\n");
      out.write("                       <th valign=\"top\"></th>\n");
      out.write("                       <th valign=\"top\"></th>\n");
      out.write("                       <th valign=\"top\"></th>\n");
      out.write("                       <th valign=\"top\"></th>\n");
      out.write("                      <th valign=\"top\"><ul class=\"list_01\">\n");
      out.write("                   \t  <li>It's your right. </li>\n");
      out.write("                      <li>Your vote matters. </li>\n");
      out.write("                      <li>Shape the social agenda. </li>\n");
      out.write("                        <li>Economic policies will affect your future. </li>\n");
      out.write("                      <li>Help shape foreign policy. </li>\n");
      out.write("                      <li>Have your say on environmental issues. </li>\n");
      out.write("                   <li>You're part of an important voting bloc.</li>\n");
      out.write("                      <li>Politicians won't address student needs without student votes. </li>\n");
      out.write("                      <li>Demonstrate concern for the next generation.</li>\n");
      out.write("                       <li>Honor past sacrifices.</li>\n");
      out.write("                   </ul></th>\n");
      out.write("                  </tr>\n");
      out.write("              </thead>\n");
      out.write("              <tbody> <tr></tr></tbody>\n");
      out.write("          </table>\n");
      out.write("          \n");
      out.write("        \t<div class=\"cleaner\"></div>\n");
      out.write("        </div><div class=\"content_box_bottom\"></div>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    </div> <!-- end of content -->\n");
      out.write("    \n");
      out.write("    <div class=\"cleaner\"></div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
