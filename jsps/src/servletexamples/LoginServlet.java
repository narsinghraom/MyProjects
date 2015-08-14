package servletexamples;

import java.io.*;

import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("userName");  
	    String p=request.getParameter("userPass");  
	          
	    if(p.equals("servlet"))
	    {  
//	        RequestDispatcher rd=request.getRequestDispatcher("welcome");  
//	        rd.forward(request, response);  
	       // using cookies 
	    	ServletContext context=getServletContext(); 
	    	out.print("Hi " +context.getAttribute("first"));
	        Cookie ck=new Cookie("uname",n);//creating cookie object  
	        response.addCookie(ck);//adding cookie in the response  
	        out.println("Welcome Hi "+n); 
	        //creating submit button  
	        out.print("<form action='WelcomeServlet' method='post'>");  
	        out.print("<input type='submit' value='go'>");  
	        out.print("</form>");  
	    }  
	    else
	    {  
	        out.print("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
	        rd.include(request, response);  
	                      
	        }  
	    out.close();
	}

}
