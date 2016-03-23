<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,java.util.*,databaseconnection.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Do Vote</title>
        <link href="templatemo_style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
       <jsp:include page="header.jsp" />
 <div id="templatemo_content">
    
    	<div class="content_box">
        
            <center> <marquee><h2><b>Welcome To Vote</b></h2></marquee></center>
            <div class="cleaner_h20"></div>
            <form action="BallotCheck.jsp" method="POST">
          
            <table width="69%" border="0" align="center">
<%
    try {
            
           //String uname=request.getParameter("username");
            String voterId=request.getParameter("txtVoterId");
            String pass=request.getParameter("password");
            String uword=request.getParameter("uword");
            
          Connection con= databasecon.getconnection();
          Statement st=con.createStatement();
          ResultSet rt=st.executeQuery("select * from reg where voterid='"+voterId+"'");
          while(rt.next()){
              String p=rt.getString("password");
              String uw=rt.getString("image_word");
             
              if(pass.equals(p))
              {
                  if(uword.equals(uw))
                  {
                    %> 
                    
                <input type="hidden" name="txtVoterId" value="<%=voterId%>" />   
  <tr>
      <td width="42%" align="center" valign="middle">
          <input class="myButton" type="submit" value="Vote" name="vote1" />
    <td width="30%" align="center" valign="middle"><img src="images/Z.jpg" width="128" height="77"  alt=""/></td>
    <td width="28%" align="center" valign="middle">Bahujan Samaj Party</td>
  <input type="hidden" name="txtVote1" value="BSP" />
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="center" valign="middle"> 
        <input class="myButton" type="submit" value="Vote" name="vote2" />
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
  <tr>
      <td align="center" valign="middle">
       <input class="myButton" type="submit" value="Vote" name="vote3"/>      
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
  <tr>
    <td align="center" valign="middle"> 
        <input class="myButton" type="submit" value="Vote" name="vote4" />
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
  <tr>
    <td align="center" valign="middle"> 
    <input class="myButton" type="submit" value="Vote" name="vote5"/>
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
  <tr>
      <td align="center" valign="middle">
          <input class="myButton" type="submit" value="Vote" name="vote6"/>
      </td>
    <td align="center" valign="middle"><img src="images/otherslogo.png" width="128" height="77"  alt=""/></td>
    <td align="center" valign="middle">Nirdaliya (Other)</td>
     <input type="hidden" name="txtVote6" value="Other" />
  </tr>  
  
                  <%
                  }
                  else
                  {
                      out.println("Incorrect Pattern");
                  }}
              else{
                  out.println("incorrect password");
              }
          }
        }
        catch(Exception e){
            out.println(e);
        } 
%>
  </table>
            </form>
        </div>
                     </div>
         
               <div class="cleaner"></div>



<jsp:include page="footer.jsp" />
    </body>
</html>
