package filter.example;

import java.io.IOException;  
import java.io.PrintWriter;  
  

import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;  
  @WebServlet("/servlet1")
public class HelloServlet extends HttpServlet {  
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
      
        out.print("<br>welcome to servlet<br>");  
          
    }  
  
}  