package cooki.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileServletCookie
 */
@WebServlet("/ProfileServletCookie")
public class ProfileServletCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServletCookie() {
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
          
        Cookie ck[]=request.getCookies();  
        if(ck!=null){  
         String name=ck[1].getValue();  
        if(!name.equals("")||name!=null){  
            out.print("<b>Welcome to Profile</b>");  
            out.print("<br>Welcome, "+name);  
        }  
        }else{  
            out.print("Please login first");  
            request.getRequestDispatcher("Login.jsp").include(request, response);  
        }  
        out.close();  
	}

}
