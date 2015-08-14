package servletexamples;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
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
	          
//	    String n=request.getParameter("userName");  
//	    out.println("Welcome "+n);  
	    out.println("Hi dis is servlet2");
	    Cookie ck[]=request.getCookies();  
	    out.print("Hello "+ck[1].getValue()); 
	    out.print("Hello "+ck[1].getName()); 
//	    for(int i=0;i<ck.length;i++){  
//	    	 out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
//	    	}  
	    out.close();
	}

}
