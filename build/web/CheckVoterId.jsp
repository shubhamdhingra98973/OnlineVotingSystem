<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <SCRIPT LANGUAGE="JavaScript">
function validation()
{
var a = document.form1.txtVoterId.value;
if(a=="")
{
alert("Please Enter Your Voter Id");
document.form1.txtVoterId.focus();
return false;
}
}

</SCRIPT>

        <title>Check Voter Id</title>
        <link href="templatemo_style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
     <jsp:include page="header.jsp" />
    <div id="templatemo_content">
    
    	<div class="content_box">
        
            <center> <marquee><h2><b>Check Your Voter ID Here...</b></h2></marquee></center>
           
          <div class="cleaner_h20"></div>
          <form name="form1" action="CheckVoterId1.jsp" onSubmit="validation()" method="post">
              <center> <b> Enter VoterID:</b> <input type="text" name="txtVoterId" value="" />
                  <input type="submit" value="Submit" name="submit" class="myButton" />
              </center> 
      </form>    
         <div class="cleaner_h20"></div>
          <center>  <img src="images/img2.jpg" width="300" height="200" alt="img2"/></center>

<div class="cleaner"></div>
        </div><div class="content_box_bottom"></div>
  
    
    </div> <!-- end of content -->
    
    <div class="cleaner"></div>
<jsp:include page="footer.jsp" />
    </body>
</html>
