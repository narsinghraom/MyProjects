
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="java.util.Iterator"%>
<%@page import="dao.DataBaseOperations"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

</head>
<body>
<table id="t">
<tr id="r">
<th id="d">EmployeeEid</th>
<th id="d">EmployeeName</th>
<th id="d">DOB</th>
<th id="d">EMail</th>
<th id="d">BloodGroup</th>
<th id="d">MoblieNo.</th>
<th id="d">ALTERNATE MoblieNo.</th>
</tr>




<% 

String BloodGroup=request.getParameter("bloodgroup");
        RegBean regbean=new RegBean();
        regbean.setBloodGroup(BloodGroup);
        DataBaseOperations db=new DataBaseOperations();//creating the object of dao package of DataBaseOperation class
        ArrayList<RegBean> array=null;
        
           
            
             array=db.getSearchBloodGroup(BloodGroup);
                Iterator itr=array.iterator();
           
              
            
           while(itr.hasNext())
        		   {
        	   regbean=(RegBean)itr.next(); 
        	   %>
        	   
        	   <tr id="r">
        	   <td id="d"><%=regbean.getEid()%></td>
        	   <td id="d"><%=regbean.getName()%></td>
        	   <td id="d"><%=regbean.getDob()%></td>
        	   <td id="d"><%=regbean.getEmail()%></td>
        	   <td id="d"><%=regbean.getBloodGroup()%></td>
        	   <td id="d"><%=regbean.getMoblieNo()%></td>
        	   <td id="d"><%=regbean.getMoblieNo1()%></td>
        	   </tr>
        	  
        	   
        	   <%
        		   }
          
        	
        	   %>
        	  
 </table>
</body>
</html>