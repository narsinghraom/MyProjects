<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action=Login method="post">  
Name:<input type="text" name="userName"/><br/>  
Password:<input type="password" name="userPass"/><br/>  
<input type="submit" value="login"/>  
</form>  
<form action="MySearcher" method="post">  
<input type="text" name="name">  
<input type="submit" value="Google Search">  
</form>  
<%
  application.setAttribute("first", "Narsingh from dhatri ....");
  out.print(application.getAttribute("first"));
  %>
  <a href="servlet1">click here</a>
  
</body>
</html>