package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataBaseOperations;
import bean.RegBean;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/searchSer")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		try
		{
		// TODO Auto-generated method stub
		response.setContentType("text/html");//
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<body>");
   
        out.println("<table>");
    
        out.println("<tr>");
    
        out.println("<th>EmployeeID </th>");
   
        out.println("<th>EmployeeName</th>");
    
        out.println("<th>DOB</th>");
    
        out.println("<th>EMail</th>");
     
        out.println("<th>MoblieNo</th>");
    
        out.println("<th>MoblieNo1</th>");
     
        out.println("</tr>");
        String BloodGroup=request.getParameter("bloodgroup");
        RegBean regbean=new RegBean();
        regbean.setBloodGroup(BloodGroup);
        DataBaseOperations db=new DataBaseOperations();//creating the object of dao package of DataBaseOperation class
        ArrayList<RegBean> array=null;
        
            ServletContext context=getServletContext();
            context.getAttribute(BloodGroup);
             array=db.getSearchBloodGroup(BloodGroup);
                Iterator itr=array.iterator();
           
              
            
           while(itr.hasNext())
        		   {
        	   regbean=(RegBean)itr.next(); 
        	   out.println("<style> border: 1px solid black ; border-collapse: collapse;padding: 5px; font-family: Footlight MT Light;  margin:auto;</style>");
        	   
        	   out.println("<tr>");
               out.println("<td>"+regbean.getEid()+"</td>");
               out.println("<td>"+regbean.getName()+"</td>");
               out.println("<td>"+regbean.getDob()+"</td>");
               out.println("<td>"+regbean.getEmail()+"</td>");
               out.println("<td>"+regbean.getMoblieNo()+"</td>");
               out.println("<td>"+regbean.getMoblieNo1()+"</td>");
               out.println("</tr>");
               
                              
               
               
        	  
           }
          
           out.println("</table>");
           out.println("</body>");
           out.println("</html>");
		}
        

		catch(Exception e)
		{
			System.out.println(e);
		}
	
	
	}
}
