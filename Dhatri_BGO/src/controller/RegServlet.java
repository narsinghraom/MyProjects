package controller;
//package of  java.io
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataBaseOperations;
import bean.RegBean;
/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegSer")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	//constructor
    public RegServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              response.setContentType("text/html");//setting content type
              PrintWriter out=response.getWriter();//get the stream to write the data
      		  out.print("I enter");
             String Name=request.getParameter("name");//get the parameter from bean package of RegBean class
             String Eid=request.getParameter("eid");
             String Dob=request.getParameter("dob");
             String Email=request.getParameter("email");
             String BloodGroup=request.getParameter("bloodgroup");
             long MoblieNo=Long.parseLong(request.getParameter("moblieno"));
             String SMoblieNo1=request.getParameter("moblieno1");
             long MoblieNo1;
             if(SMoblieNo1.length()==0)
             {
            	 MoblieNo1=0;
             }
             else
             {
            	  MoblieNo1=Long.parseLong(SMoblieNo1);
             }
             RegBean regbean=new RegBean();//creating the RegBean object
             regbean.setName(Name);//reference object we have get the variables
             regbean.setEid(Eid);
             regbean.setDob(Dob);
             regbean.setEmail(Email);
             regbean.setBloodGroup(BloodGroup);
             regbean.setMoblieNo(MoblieNo);
             regbean.setMoblieNo1(MoblieNo1);
             DataBaseOperations db=new DataBaseOperations();//creating the object of dao package of DataBaseOperation class
             System.out.println("this is db");
             try
             {
             db.insertReg(regbean);//reference the object of DataBaseOperation inserting the regbean object
             }catch(SQLException se)
             {
            	 System.out.println(se);
             }
            
		
	}

}
