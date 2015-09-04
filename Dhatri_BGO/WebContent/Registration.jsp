<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>


<script>
     function validation()
     {
        var name=document.myform.name.value;//invoke the name from myform 
      
        var eid=document.myform.eid.value;//getting the eid  value from myform
       
        var dob=document.myform.dob.value;//getting the dob value from myform
     	
        var email = document.getElementById('emailid');//getting the email from the id in myform(form)
     	
        var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;//its for allow the name (a-z) or (A to Z)  and number (0-9)
     	
        var phone = document.getElementById('moblieno');//getting the moblienumber thought the id in myform(form)
        
        var filter1 = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/; ;//its for allow the numbers 0-9
        
        var phone1 = document.getElementById('moblieno1');//getting the moblienumber thought the id in myform(form)
        
        var filter2 = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/; ;//its for allow the numbers 0-9
      //  var moblieno=document.myform.moblieno.value;
       // var moblieno1=document.myform.moblieno1.value;
          
        if(name==null || name=="")//here the condition for a name 
 		{
 		alert("Name can't be empty");//alter message foe name
 		name.focus;//focus on name
 		return false;//return type
 		}
     	else if(eid.length<6)//eid variable length must be graterthan 6
     		{
     		alert("eid must be at least 6 characters long.");  //alter message
     		return false;//return type
     		}
     	else if(dob==null || dob=="")//condtion for date of birth 
     		{
     		alert("date of birth can't be empty");//alter message
     		return false;//return type
     		}
     	  if (!filter.test(email.value)) {//here the condition for email with the test method
     		    alert("Please provide a valid email address");//alter message
     		    email.focus;//focus for the email elements
     		    return false;
     		 }
     	else  if (!filter1.test(phone.value)) { //the condtion for the phone number with the test method
     	    alert('Please provide a valid phonenumber');//alter message for phone number
     	    phone.focus;//fouus for the phone number
     	    return false;//return type
     	 }
     	 /* if (!filter2.test(phone1.value)) {
      	   phone.focus;
      	    return false;//return type
      	 } */
     	 else if(moblieno.length<10)
 		{
     		alert("moblieno is mandataory");
 		return false;
 		} 
     }
     </script>

<script type="text/javascript"> 
     function isNumber(evt) {//Number validation 
         var iKeyCode = (evt.which) ? evt.which : evt.keyCode;
         if (iKeyCode != 46 && iKeyCode > 31 && (iKeyCode < 48 || iKeyCode > 57))
             return false;//return type

         return true;
     }    
     </script>

<script type="text/javascript">
      function lettersOnly(evt) {//name validation
             evt = (evt) ? evt : event;
             var charCode = (evt.charCode) ? evt.charCode : ((evt.keyCode) ? evt.keyCode :
                 (evt.which) ? evt.which : 0);
             if ((charCode > 31) && (charCode < 65 || charCode > 90) && (charCode < 97 || charCode > 122))
             {
                 return false;//return type
             }
             else
                 return true;//return type
         }

     </script>
     <script type="text/javascript">
      function onCancel() 
      {
		window.location="Index.jsp";
			
	}
     </script>

</head>
<body>
	<form name="myform" action="RegSer" method="post" id="register-form">
		<h1 align="center">Welcome to Dhatri</h1>
		<br>
		<table align="center">
		
			<tr>
				<td>Name</td>

				<td><input  type="text" name="name"
					onkeypress="return lettersOnly(event)"></td>

				<td></td>
			</tr>
			<tr>
				<td>Eid</td>
				<td><input type="text" name="eid"></td>
				<td></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><input type="date" name="dob"></td>
				<td></td>
			</tr>
			<tr>
				<td>EMAIL</td>
				<td><input type="text" name="email" id="emailid"></td>
				<td></td>
			</tr>
			<tr>
				<td>MOBLIENO</td>
				<td><input type="text" name="moblieno" id='moblieno'
					maxlength="10" onkeypress="return isNumber(evt)"></td>
				<td></td>
			</tr>

			<tr>
				<td>MOBLIENO1</td>
				<td><input type="text" name="moblieno1" maxlength="10"
					id='moblieno1' onkeypress="return isNumber(evt)" ></td>
				<td></td>
			</tr>
			<tr>
				<td>BLOOD GROUP</td>
				<td><select name="bloodgroup">
						<option value="o+ve">O+ve</option>

						<option value="o-ve">O-ve</option>
						<option value="a+ve">A+ve</option>
						<option value="a-ve">A-ve</option>
						<option value="b+ve">B+ve</option>
						<option value="b-ve">B-ve</option>
						<option value="ab+ve">AB+ve</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"
					onclick="return validation()" id="register-form"></td>
				<td><input id="" type="button" value="Cancel" onclick="onCancel()"></td>
				<td><input  type="reset" value="Reset"></td>
			</tr>
		</table>
<a id="demo" href="http://localhost:8079/dhatriinfo/Index.jsp">
</a>
	</form>
	

</body>
</html>