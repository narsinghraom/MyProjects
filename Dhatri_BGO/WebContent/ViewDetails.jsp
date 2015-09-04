
<%@page import="bean.RegBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="dao.DataBaseOperations"%>
<%@page import="com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ViewDetails</title>
</head>
<body>
<h1> here the details of members</h1>
<style>
table,th,td{
border: 1px solid black;
border-collapse: collapse;
}
th.td,h1{
padding:15px;
font-family: Footlight MT Light;
}

</style>
<%
ArrayList<RegBean> al1=new ArrayList<RegBean>();
DataBaseOperations db=new DataBaseOperations();
al1=db.getEidDetail();
Iterator it1=al1.iterator();

%>
<table style="width=100%">



<tr>
   <th>Eid</th>
   <th>Name</th>
   <th>Dob</th>
   <th>Email</th>
   <th>BloodGroup</th>
   <th>MoblieNo</th>
   <th>MoblieNo1</th>
 </tr>
   </tr>
  <%
while(it1.hasNext())
{
RegBean bean=(RegBean)it1.next();
    %>
<tr>
<td><%=bean.getEid() %> </td>
<td><%=bean.getDob() %> </td>
<td><%=bean.getEmail() %> </td>
<td><%=bean.getName() %> </td>
<td><%=bean.getBloodGroup() %> </td>
<td><%=bean.getMoblieNo() %> </td>
<td><%=bean.getMoblieNo1() %> </td>

    </tr>
    <% } %>
</table>
 

</body>
</html>