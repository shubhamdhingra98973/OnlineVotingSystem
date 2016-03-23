<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,java.util.*,databaseconnection.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Check Voter Id</title>
        <link href="templatemo_style.css" rel="stylesheet" type="text/css" />
         <script type="text/javascript" src="md5.js"></script>
        <script type="text/javascript" src="jcap.js"></script>
    <script>
    function validation(){
        var id=document.ureg.txtId.value;
        var name=document.ureg.txtName.value;
        var ssno=document.ureg.txtSsno.value;
        var add=document.ureg.txtAddress.value;
        var city=document.ureg.txtCity.value;
        var state=document.ureg.txtState.value;
        var country=document.ureg.txtCountry.value;
        var mobile=document.ureg.txtMobileNo.value;
        var email=document.ureg.txtEmail.value;
        var idmark=document.ureg.txtIdMark.value;
        var pass=document.ureg.txtPassword.value;
        
        if(id==0){
            document.ureg.txtId.focus();
            return false;
        }
        if(name==0){
            document.ureg.txtName.focus();
            return false;
        }
        if(ssno==0){
            document.ureg.txtSsno.focus();
            return false;
        }
        if(add==0){
            document.ureg.txtAddress.focus();
            return false;
        }
        if(city==0){
            document.ureg.txtCity.focus();
            return false;
        }
        if(state==0){
            document.ureg.txtState.focus();
            return false;
        }
        if(country==0){
            document.ureg.txtCountry.focus();
            return false;
        }
        if(mobile==0){
            document.ureg.txtMobileNo.focus();
            return false;
        }
        if(email==0){
            document.ureg.txtEmail.focus();
            return false;
        }
         if(idmark==0){
            document.ureg.txtIdMark.focus();
            return false;
        }
        if(pass==0){
            document.ureg.txtPassword.focus();
            return false;
        }
        
    }
</script>
    </head>
    <body>
     <jsp:include page="header.jsp" />
    <div id="templatemo_content">
    
    	<div class="content_box">
        
            <center> <marquee><h2><b>New Voter Registration</b></h2></marquee></center>
           
            <div class="cleaner_h20"></div>
            <form name="ureg" action="register.jsp" method="POST" onclick="validation()">
         <font size="+1">
          <table width="90%" border="0" align="center">
              <center>  <img src="images/vote.png" width="350" height="80" alt="vote"/></center>

  <tr>
    <td width="35%" rowspan="21" align="center" valign="middle">
        <img src="images/rainbow_voting_image.jpg" width="300" height="280"  alt=""/></td>
    <td width="10%" align="center" valign="middle">&nbsp;</td>
    <td width="18%" align="center" valign="middle">Voter ID</td>
    <td colspan="2" align="left" valign="middle"> 
        <input type="text" name="txtId" value="" />
    </td>
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">Voter Name</td>
    <td colspan="2" align="left" valign="middle">
         <input type="text" name="txtName" value="" />
    </td>
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">SSNo.</td>
    <td colspan="2" align="left" valign="middle">
         <input type="text" name="txtSsno" value="" />
    </td>
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">Address</td>
    <td colspan="2" align="left" valign="middle">
         <input type="text" name="txtAddress" value="" />
    </td>
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">City</td>
    <td colspan="2" align="left" valign="middle">
         <input type="text" name="txtCity" value="" />
    </td>
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">State</td>
    <td colspan="2" align="left" valign="middle">
         <input type="text" name="txtState" value="" />
    </td>
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">Country</td>
    <td colspan="2" align="left" valign="middle">
         <input type="text" name="txtCountry" value="" />
    </td>
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">Mobile No.</td>
    <td colspan="2" align="left" valign="middle">
         <input type="text" name="txtMobileNo" value="" />
    </td>
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">E-Mail</td>
    <td colspan="2" align="left" valign="middle"><input type="text" name="txtEmail" value="" /></td>
  </tr>

  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">Aadhar Card No</td>
    <td colspan="2" align="left" valign="middle"><input type="text" name="txtIdMark" value="" /></td>
  </tr>
  <tr>
    <td align="center" valign="middle">&nbsp;</td>
    <td align="center" valign="middle">Password</td>
    <td colspan="2" align="left" valign="middle"><input type="password" name="txtPassword" value="" /></td>
  </tr>
  <tr>
    <td colspan="4" align="center" valign="middle">&nbsp;</td>
  </tr>
</table>
         <center>
  <fieldset>
    <p>Enter code and select respected image:</p> <br>

        <input type="hidden" id="txt" value="" name="txt"/>
        
        <script type="text/javascript"> sjcap();</script><br></br>
    </fieldset>
             <br>
         <input type="submit" onclick="return jcap3();" value="SUBMIT" class="myButton"><br></br>                                                         
         <input type="reset" value="RESET" class="myButton"> 
         </center>
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
