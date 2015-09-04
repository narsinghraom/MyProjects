<%@page import="java.util.*"%>
<%@page import="bean.RegBean"%>
<%@page import="dao.DataBaseOperations" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateServlet" method="post"></form>
<h1 align="center">UpdateReg</h1>
<table align="center">
  <tr>
  <td>Eid</td>
  <td>
  <select type="droupdown" name="eid"> 
    <option value="Select">-Select-</option>
  <%
      ArrayList<RegBean> arrayobj =null;
      DataBaseOperations rb=new DataBaseOperations();
      arrayobj=rb.getEidDetail();
      Iterator it=arrayobj.iterator();
      while(it.hasNext())
      {
    	  RegBean regbean=(RegBean)it.next();
    	  %>
    	  <option value=<%=regbean.getEid() %>><%=regbean.getEid() %></option>
    <%	  
      }
  %>
  </select>
  </td>
  <td><input type="submit" value="select"></td>
  </tr>
  
    <%
    if(request.getParameter("eid")=="Select")
    {
    	out.print("yes");
    }
    else
    {
    
    }
      ArrayList<RegBean> arrayobj1 =null;
      DataBaseOperations rb1=new DataBaseOperations();
      arrayobj1=rb1.allDetails(request.getParameter("eid"));
      Iterator itr=arrayobj1.iterator();
      while(itr.hasNext())
      {
    	  RegBean regbean=(RegBean)itr.next();
    	  %>
     
  			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value=<%=regbean.getName() %> ></td>
				<td></td>
			</tr>
			<tr>
				<td>Dob</td>
				<td><input type="text" name="dob" value= <%=regbean.getDob() %>></td>
				<td></td>
			</tr>
			<tr>
				<td>BloodGroup</td>
				<td><input type="text" name="bloodgroup" value= <%=regbean.getBloodGroup() %>></td>
				<td></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value= <%=regbean.getEmail() %>></td>
				<td></td>
			</tr>
  
           <%
      }
   
       %>
  <tr>
  <td><input type="button" value="Update"></td>
   <td><input type="button" value="Cancel"></td>
   </tr>
   </table>


</body>
</html>