<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,java.util.*,databaseconnection.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Check Voter Id</title>
        <link href="templatemo_style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
      <jsp:include page="header.jsp" />
    <div id="templatemo_content">
    
    	<div class="content_box">
        
            <center> <marquee><h2><b>Welcome To Vote</b></h2></marquee></center>
           
            <div class="cleaner_h20"></div>
            <form name="form2" action="BallotPaper.jsp" method="POST">
                <%
Connection con=null;
PreparedStatement stmt = null;
ResultSet rs = null;
String voterId=request.getParameter("txtVoterId");
String voterName=null, ssno=null, address=null, mobno=null, email=null, idmark=null, city=null, state=null, country=null;
try {
con=databasecon.getconnection();
stmt = con.prepareStatement("select * from reg where VOTERID='"+voterId+"'");     
	   rs = stmt.executeQuery();
while (rs.next())  
{
	      voterId=rs.getString(1);
	      voterName=rs.getString(2);
	      ssno=rs.getString(3);
              address=rs.getString(4);
              mobno=rs.getString(5);
              email=rs.getString(6);
              idmark=rs.getString(7);
              city=rs.getString(11);
              state=rs.getString(12);
              country=rs.getString(13);
		  %>
         <font size="+1">
           <table width="100%" border="0">
  <tr>
    <td width="50%" rowspan="11">  <img src="images/img7.jpg" width="300" height="300" alt="img7"/></td>
  <input type="hidden" name="txtVoterId" value="<%=voterId%>" />
    <td width="50%"><p><p> Voter ID: <%=voterId%> </p></p></td>
  </tr>
  <tr>
    <td><p> <p>  Voter Name: <%=voterName%> </p></p></td>
  </tr>
  <tr>
    <td><p>  <p>  SSNo.: <%=ssno%> </p></p></td>
  </tr>
  <tr>
    <td> <p>  <p>  Address: <%=address%> </p></p></td>
  </tr>
  <tr>
    <td> <p>  <p>  City: <%=city%> </p></p></td>
  </tr>
  <tr>
    <td> <p>  <p>  State: <%=state%> </p></p></td>
  </tr>
  <tr>
    <td> <p>  <p>  Country: <%=country%> </p></p></td>
  </tr>
  <tr>
    <td> <p> <p> Mob. No.: <%=mobno%> </p></p></td>
  </tr>
  <tr>
    <td> <p> <p> Email: <%=email%> </p></p></td>
  </tr>
  <tr>
    <td> <p> <p> Aadhar Card No: <%=idmark%> </p></p></td>
  </tr>
  <tr>
    <td align="center" valign="middle"><p>
      <input type="submit" value="Next" class="myButton" name="txtSubmit" action="BallotPaper.jsp"/>
    </p>      </p></td>
  </tr>
</table>
         </font>

           <%
	   }
	  
	 }
	   catch(Exception e)
	   {
	     out.println(e.getMessage());
	   }	   
	    %>
            </form>
         <div class="cleaner_h20"></div>

<div class="cleaner"></div>
        </div><div class="content_box_bottom"></div>
      
    </div> <!-- end of content -->
    
    <div class="cleaner"></div>

<jsp:include page="footer.jsp" />
    </body>
</html>
