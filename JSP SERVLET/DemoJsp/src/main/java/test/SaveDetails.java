package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SaveDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveDetails() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String rollno = request.getParameter("rollno");
	        String name = request.getParameter("name");
	        String address = request.getParameter("address");
	        String city = request.getParameter("city");

	        NamesDAO n = new NamesDAO(0, name, address, city); // Use correct constructor parameters
	        n.setRollno(Integer.parseInt(rollno));

	        // Save the data to the database
	        NamesDAO.saveDetails(n);

	        response.sendRedirect("Table.jsp");
	}

}
