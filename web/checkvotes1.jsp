<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,java.util.*,databaseconnection.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Check Votes</title>
         <link href="templatemo_style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
       <jsp:include page="header.jsp" />
    <div id="templatemo_content">
    
    	<div class="content_box">
        
            <center> <marquee><h2><b>Check Votes Here</b></h2></marquee></center>
           
            <div class="cleaner_h20"></div>
                <font size="+1">
    <table width="69%" border="0" align="center">       
<%
Connection con=null;
PreparedStatement stmt = null;
ResultSet rs = null;
int i=0;
String party=request.getParameter("ddlParty");
String city = request.getParameter("txtCity");
try {
con=databasecon.getconnection();
stmt = con.prepareStatement("Select * from votedtodb where city='"+city+"' and votedto='"+party+"'"); 
rs = stmt.executeQuery();
while(rs.next())
{
    i = i+1;
    int count= i;
}
    if(party.equals("BSP"))
    {
        %>
         <tr>
      <td width="42%" align="center" valign="middle">
         <%=i%>
    <td width="30%" align="center" valign="middle"><img src="images/Z.jpg" width="128" height="77"  alt=""/></td>
    <td width="28%" align="center" valign="middle">Bahujan Samaj Party</td>
  <input type="hidden" name="txtVote1" value="BSP" />
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
  </tr>
        <%
    }
    if(party.equals("BJP"))
    {
        %> 
        <tr>
    <td align="center" valign="middle"> 
        <%=i%>
    </td>
    <td align="center" valign="middle"><img src="images/a2.jpeg" width="128" height="77"  alt=""/></td>
    <td align="center" valign="middle">Bhartiya Janta Party</td>
     <input type="hidden" name="txtVote2" value="BJP" />
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
  </tr>
        
        <%
    }
    if(party.equals("Congress"))
    {
        %>
        <tr>
      <td align="center" valign="middle">
         <%=i%> 
      </td>
    <td align="center" valign="middle"><img src="images/c1.jpeg" width="128" height="77"  alt=""/></td>
    <td align="center" valign="middle">Indian National Congress</td>
     <input type="hidden" name="txtVote3" value="Congress" />
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
  </tr>
        <%
    }
    if(party.equals("AAP"))
    {
        %>
        <tr>
    <td align="center" valign="middle"> 
    <%=i%>
    </td>
    <td align="center" valign="middle"><img src="images/a3.jpeg" width="128" height="77"  alt=""/></td>
    <td align="center" valign="middle">Aam Aadmi Party</td>
             <input type="hidden" name="txtVote4" value="AAP" />
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
  </tr>
        <%
    }
    if(party.equals("SP"))
    {
        %>
        <tr>
    <td align="center" valign="middle"> 
    <%=i%>
    </td>
    <td align="center" valign="middle"><img src="images/a4.jpeg" width="128" height="77"  alt=""/></td>
    <td align="center" valign="middle">Samajvadi Party</td>
     <input type="hidden" name="txtVote5" value="SP" />
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
  </tr>
        <%
    }
    if(party.equals("Other"))
    {
        %>
          <tr>
      <td align="center" valign="middle">
          <%=i%>
      </td>
    <td align="center" valign="middle"><img src="images/otherslogo.png" width="128" height="77"  alt=""/></td>
    <td align="center" valign="middle">Nirdaliya (Other)</td>
     <input type="hidden" name="txtVote6" value="Other" />
  </tr> 
        <%
    }
 %>
               
  
 
  <%
	 }
	   catch(Exception e)
	   {
	     out.println(e.getMessage());
	   }
	   
	    %>
  </table>
              </font>
         <div class="cleaner_h20"></div>

<div class="cleaner"></div>
        </div><div class="content_box_bottom"></div>
  
    
    </div> <!-- end of content -->
    
    <div class="cleaner"></div>
<jsp:include page="footer.jsp" />
    </body>
</html>
