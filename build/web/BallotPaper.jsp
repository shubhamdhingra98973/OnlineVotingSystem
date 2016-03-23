<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,java.util.*,databaseconnection.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Voter Id</title>
        <link href="templatemo_style.css" rel="stylesheet" type="text/css" />
        
  <script>
    function validation(){
        var id=document.ulogin.txtVoterId1.value;
        var pass=document.ulogin.txtPassword.value;
        
        if(id==0){
            alert("Enter Voter Id");
            document.ulogin.txtVoterId1.focus();
            return false;
       }
        if(pass==0){
            alert("Enter password");
            document.ulogin.txtPassword.focus();
            return false;
        }
    }
</script>
    </head>
    <body>
     <jsp:include page="header.jsp" />
    <div id="templatemo_content">
    
    	<div class="content_box">
        
            <center> <marquee><h2><b>Welcome To Vote</b></h2></marquee></center>
            <div class="cleaner_h20"></div>
            <form name="ulogin" action="check.jsp" method="POST" onclick="validation()">
    <table width="46%" border="0" align="center"> 
                <%
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
		  
		  %>

  <tr>
    <td width="48%" align="center" valign="middle">Voter ID</td>
    <td width="52%" align="left" valign="middle"><input type="text" name="txtVoterId1" value="" /></td>
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="center" valign="middle">Password</td>
    <td align="left" valign="middle"><input type="password" name="txtPassword" value="" /></td>
  </tr>
  <tr>
    <td colspan="2" align="center" valign="middle">&nbsp;</td>
  </tr>
   <tr>
    <td colspan="2" align="center" valign="middle">
        <input type="submit" class="myButton" name="submit" id="submit" value="SignIn"></td>
  </tr>
  <tr>
    <td colspan="2" align="center" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="2" align="center" valign="middle"><img src="images/img1.jpg" width="418" height="239"  alt=""/></td>
  </tr>
  <%
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
	   
	    %>
            </table> 
            </form>     
         <div class="cleaner_h20"></div>

<div class="cleaner"></div>
        </div><div class="content_box_bottom"></div>
  
    
    </div> <!-- end of content -->
    
    <div class="cleaner"></div>
<jsp:include page="footer.jsp" />
    </body>
</html>
