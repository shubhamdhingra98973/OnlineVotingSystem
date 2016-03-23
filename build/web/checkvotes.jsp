<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,java.util.*,databaseconnection.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Votes</title>
         <link href="templatemo_style.css" rel="stylesheet" type="text/css" />
    </head>
     <script>
    function validation(){
        var country=document.ulogin.txtCountry.value;
        var state=document.ulogin.txtState.value;
        var city=document.ulogin.txtCity.value;
       
        if(country==0){
            alert("Enter Country");
            document.ulogin.txtCountry.focus();
            return false;
       }
        if(state==0){
            alert("Enter State");
            document.ulogin.txtState.focus();
            return false;
        }
         if(city==0){
            alert("Enter City");
            document.ulogin.txtCity.focus();
            return false;
        }
    }
</script>
    <body>
     <jsp:include page="header.jsp" />
    <div id="templatemo_content">
    
    	<div class="content_box">
        
            <center> <marquee><h2><b>Check Votes Here</b></h2></marquee></center>
           
            <div class="cleaner_h20"></div>
            <form name="ulogin" action="checkvotes1.jsp" method="POST" onclick="validation()" >
                <font size="+1">
         
        <table width="36%" border="0" align="center">
   <tr>
    <td width="50%" align="center" valign="middle"></td>
    <td width="50%" align="left" valign="middle">
    </td>
  </tr>
  <tr>
    <td width="50%" align="center" valign="middle">Enter Country</td>
    <td width="50%" align="left" valign="middle">
        <input type="text" name="txtCountry" value="" />
    </td>
  </tr>
   <tr>
    <td width="50%" align="center" valign="middle"></td>
    <td width="50%" align="left" valign="middle">
    </td>
  </tr>
  <tr>
    <td align="center" valign="middle">Enter State</td>
    <td align="left" valign="middle"><input type="text" name="txtState" value="" /></td>
  </tr>
   <tr>
    <td width="50%" align="center" valign="middle"></td>
    <td width="50%" align="left" valign="middle">
    </td>
  </tr>
  <tr>
    <td align="center" valign="middle">Enter City</td>
    <td align="left" valign="middle">
        <input type="text" name="txtCity" value="" />
    </td>
  </tr>
   <tr>
    <td width="50%" align="center" valign="middle"></td>
    <td width="50%" align="left" valign="middle">
    </td>
  </tr>
  <tr>
    <td align="center" valign="middle">Select Party</td>
    <td align="left" valign="middle">
        <select name="ddlParty">
            <option selected value="BSP">BSP</option>
            <option value="BJP">BJP</option>
            <option value="Congress">Congress</option>
            <option value="AAP">AAP</option>
            <option value="SP">SP</option>
            <option value="Other">Other</option>
        </select>
    </td>
  </tr>
   <tr>
    <td width="50%" align="center" valign="middle"></td>
    <td width="50%" align="left" valign="middle">
    </td>
  </tr>
  <tr>
    <td align="center" valign="middle"></td>
    <td align="right" valign="middle">
        <input type="submit" value="Submit" class="myButton"/>
    </td>
  </tr>
            </table>
              </font>
            </form>
         <div class="cleaner_h20"></div>

<div class="cleaner"></div>
        </div><div class="content_box_bottom"></div>
  
    
    </div> <!-- end of content -->
    
    <div class="cleaner"></div>
<jsp:include page="footer.jsp" />
    </body>
</html>
