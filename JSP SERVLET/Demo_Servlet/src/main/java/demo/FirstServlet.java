package demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public FirstServlet() {
        super();
        
    }
    private String message;

    public void init() throws ServletException {
       // Do required initialization
       message = "This is the output from servlet response";
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		

	     
	      response.setContentType("text/html");

	      
	      PrintWriter out = response.getWriter();
	      
	      out.println("<center>"+"<h1>" + message + "</h1>"+"</center>");
	      
	      String na=request.getParameter("name");
	      String ad=request.getParameter("address");
	      String ct=request.getParameter("city");
	      
	      
	      out.println("<center>");
	      out.println("<table border='1' align='center'>");
	      out.println("<tr>");
	      out.println("<td> name </td>");
	      out.println("<td>"+na+"</td>");
	      out.println("</tr>");
	      out.println("<tr>");
	      out.println("<td> address </td>");
	      out.println("<td>"+ad+"</td>");
	      out.println("</tr>");
	      out.println("<tr>");
	      out.println("<td> city </td>");
	      out.println("<td>"+ct+"</td>");
	      out.println("</tr>");
	     
	      out.println("</table>");
	      out.println("</center>");
	      
	      
	} 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
