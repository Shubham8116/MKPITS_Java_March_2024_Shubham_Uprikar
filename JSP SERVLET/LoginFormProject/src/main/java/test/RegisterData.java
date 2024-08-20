package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterData() {
        super();

    }
    
  //creating String object for the jdbc driver
    public final static String driver = "com.mysql.cj.jdbc.Driver";
    //creating String url for the database connection
    public final static String url = "jdbc:mysql://localhost:3306/newbankdatabase";
    //creating String username for the database connection
    public final static String username = "root";
    //creating String password for the database connection
    public final static String dbpassword = "Shubham123";
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	      response.setContentType("text/html");

	      
	      PrintWriter out = response.getWriter();
	     
	      String userid=request.getParameter("userid");
	      String name=request.getParameter("fullname");
	      String address=request.getParameter("address");
	      String city=request.getParameter("city");
	      int balance=Integer.parseInt(request.getParameter("balance"));
	      String password=request.getParameter("psw");
	      




			 //loading jdbc driver
	       try {
				Class.forName(driver);
			 
	       
	       Connection con = null;
	       
	       //establishing database connection
	      
				con = DriverManager.getConnection(url,username,dbpassword);
			
	       //establishing database connection
	       Connection connection=con;
	       
	       PreparedStatement preparedStatement= connection.prepareStatement("insert into accmaster values(?,?,?,?,?,?)");
	        //passing parameters to query using setInt and setString method
	        preparedStatement.setString(1,userid);
	        preparedStatement.setString(2,password);
	        preparedStatement.setString(3,name);
	        preparedStatement.setString(4,address);
	        preparedStatement.setString(5,city);
	        preparedStatement.setInt(6,balance);
	        //executing query
	        int value=preparedStatement.executeUpdate();
	        connection.close();
	        
	        if(value!=0)
	        {

	  	      out.println("<center><h1>Registration Successfull</h1>");
	  	      out.println("<h1>Please login again</h1>");
	  	      out.println("<h1><a href='index.html'>login</a></h2></center>");
	  	      
	        }
	        
	        else {
		  	      out.println("<center><h1>Error Occurred !</h1></center>");
			}
	       
	       
	       }
	       catch (ClassNotFoundException e) {
				
	    	   out.println(e);
			}
	       catch (SQLException e) {
				
	    	   out.println(e);
			}

	      
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
