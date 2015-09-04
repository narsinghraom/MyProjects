<%@page import="java.util.Iterator"%>
<%@page import="dao.DataBaseOperations"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.*" %> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>

<script type="text/javascript">

</script>
<style>
#t,#r ,#d{
    border: 1px solid black;
    border-collapse: collapse;
}
#t,#d, h3 {
    padding: 5px;
    font-family: Footlight MT Light;
     margin:auto;
}
</style>
<script type="text/javascript">


</script>
<script type="text/javascript">
function oncancel()
{
	window.location="http://localhost:8079/Dhatri_BGO/Index.jsp";
	
}
</script>
</head>
<body>
   <form action="SearchResult.jsp" method="post" target="iframe_a">
   <div style="border:1px;padding:20px;font-size:20px">
   <p>
	<table align="center">
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
			
			<td>
			<input type="submit" name="ok" value="OK" ></td>
			<td><input type="button" name="cancel" value="Cancel" onclick="oncancel()"></td>
		
		</tr>
	
	</table>
	
</div>
</form>
<%-- <%-- <h3 align="center">List Of BloodGroup Members are:...</h3>


<%

ArrayList<RegBean> arraybean = null;
RegBean regbean;
      DataBaseOperations rb1=new DataBaseOperations();
      try
      {
    	  String bg=request.getParameter("bloodgroup");
      arraybean=rb1.getSearchBloodGroup(bg);
      }
      catch(Exception e)
      {
    	  System.out.println(e);
      }
      Iterator itr=arraybean.iterator();
      %> 
 <table id="t">
<tr id="r">
<th id="d">eid</th>
<th id="d">name</th>
<th id="d">dob</th>
<th id="d">email</th>
<th id="d">bloodgroup</th>
<th id="d">moblieno</th>
<th id="d">moblieno1</th>
</tr>


<%
     while(itr.hasNext())
      {
    	   regbean=(RegBean)itr.next();
%>
<tr>
<td><%=regbean.getEid() %></td>
<td><%=regbean.getName() %></td>
<td><%=regbean.getDob() %></td>
<td><%=regbean.getEmail() %></td>
<td><%=regbean.getMoblieNo() %></td>
<td><%=regbean.getMoblieNo1() %></td>

</table>
<%
      }
     
      %> --%>
     

</body>
</html>