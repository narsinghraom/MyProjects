package cooki.login;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServletCookie
 */
@WebServlet("/LoginServletCookie")
public class LoginServletCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletCookie() {
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
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        request.getRequestDispatcher("link.html").include(request, response);  
	          
	        String name=request.getParameter("name");  
	        String password=request.getParameter("password");  
	          
	        if(password.equals("123")){  
	            out.print("You are successfully logged in!");  
	            out.print("<br>Welcome, "+name);  
	              
	            Cookie ck=new Cookie("name",name);  
	            response.addCookie(ck);  
	        }else{  
	            out.print("sorry, username or password error!");  
	            request.getRequestDispatcher("login.jsp").include(request, response);  
	        }  
	          
	        out.close();  
	}

}
